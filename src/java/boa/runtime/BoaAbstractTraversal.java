/*
 * Copyright 2014, Hridesh Rajan, Robert Dyer, 
 *                 and Iowa State University of Science and Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package boa.runtime;

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

import boa.functions.BoaAstIntrinsics;

import boa.types.Ast.*;
import boa.types.Ast.Expression.*;
import boa.types.Graph.*;
import boa.graphs.cfg.*;
import boa.types.Code.CodeRepository;
import boa.types.Code.Revision;
import boa.types.Diff.ChangedFile;
import boa.types.Shared.Person;
import boa.types.Toplevel.Project;

/**
 * Boa abstract AST visitor.
 * 
 * The <code>traverse()</code> methods first call <code>preTraverse()</code> for the node.
 * If <code>preTraverse()</code> returns <code>true</code>, then each of that node's children are visited and then <code>postTraverse()</code> is called.
 * 
 * By default, all <code>preTraverse()</code> methods call {@link #defaultPreTraverse()} and return <code>true</code>.
 * By default, all <code>postTraverse()</code> methods call {@link #defaultPostTraverse()}.
 * 
 * @author rdyer
 */

public abstract class BoaAbstractTraversal<T1> {
	public java.util.HashMap<Integer,T1> outputMapObj;
	public java.util.HashMap<Integer,T1> prevOutputMapObj;
	public int noOfIterations = 0;

	public T1 getValue(final CFGNode node) throws Exception {
		//if(outputMapObj.get(node.getId())!=null)
		//	return (T1) outputMapObj.get(node.getId()).getClass().getMethod("clone").invoke(outputMapObj.get(node.getId()));
		//return null;
		//return ((T1)outputMapObj.get(node.getId())).getClass().getMethod("clone").invoke(((T1)outputMapObj.get(node.getId())));
		return (T1)outputMapObj.get(node.getId());
	}
	public void clear() {
		if(outputMapObj!=null)
			outputMapObj.clear();
		if(prevOutputMapObj!=null)
			prevOutputMapObj.clear();
	}
	public int getNoOfIterations() {
		return this.noOfIterations;
	}
	/**
	 * Initializes any visitor-specific data before starting a visit.
	 * 
	 * @return itself, to allow method chaining
	 */
	public BoaAbstractTraversal initialize() {
		return this;
	}

	/**
	 * Provides a default action for pre-visiting nodes.
	 * Any <code>preTraverse()</code> method that is not overridden calls this method.
	 * 
	 * @return always returns true
	 */
	protected boolean defaultPreTraverse() throws Exception {
		return true;
	}

	protected boolean preTraverse(final CFG cfg) throws Exception {
		return defaultPreTraverse();
	}

	protected boolean preTraverse(final Variable node) throws Exception {
		return defaultPreTraverse();
	}
	protected boolean preTraverse(final Statement node) throws Exception {
		return defaultPreTraverse();
	}
	protected boolean preTraverse(final Expression node) throws Exception {
		return defaultPreTraverse();
	}
	protected boolean preTraverse(final ExpressionKind node) throws Exception {
		return defaultPreTraverse();
	}
	protected boolean preTraverse(final ExpressionKind node,final String str) throws Exception {
		return defaultPreTraverse();
	}
	

	/**
	 * Provides a default action for post-visiting nodes.
	 * Any <code>postTraverse()</code> method that is not overridden calls this method.
	 */
	protected void defaultPostTraverse() throws Exception { }

	protected void postTraverse(final CFG cfg) throws Exception {
		defaultPostTraverse();
	}
	protected void postTraverse(final CFGNode node) throws Exception {
		defaultPostTraverse();
	}
	protected void postTraverse(final Variable node) throws Exception {
		defaultPostTraverse();
	}
	protected void postTraverse(final Statement node) throws Exception {
		defaultPostTraverse();
	}
	protected void postTraverse(final Expression node) throws Exception {
		defaultPostTraverse();
	}
	protected void postTraverse(final ExpressionKind node) throws Exception {
		defaultPostTraverse();
	}

	public final void traverse(final CFG cfg, final Traversal.TraversalKind kind, final String str) throws Exception {
		traverse(cfg, kind);
	}

	public final void traverse(final boa.graphs.cfg.CFG cfg,final Traversal.TraversalKind kind, final BoaAbstractFixP fixp) throws Exception {
		if(outputMapObj==null) {
				outputMapObj = new java.util.HashMap<Integer,T1>();
		}
		boolean fixp_flag;
		do {
			prevOutputMapObj = new java.util.HashMap<Integer,T1>(outputMapObj);
			traverse(cfg, kind);
			noOfIterations++;
			fixp_flag=true;
			java.util.HashSet<CFGNode> nl=cfg.getNodes();
			for(CFGNode node : nl) {
				boolean curFlag=outputMapObj.containsKey(node.getId());
				boolean prevFlag=prevOutputMapObj.containsKey(node.getId());
				if(curFlag) {
					if(outputMapObj.containsKey(node.getId()) && prevOutputMapObj.containsKey(node.getId())) { 
						fixp_flag=fixp_flag && fixp.invoke((T1)outputMapObj.get(node.getId()),(T1)prevOutputMapObj.get(node.getId()));
					} else {
						fixp_flag = false; break;
					}
				}
			}			
		}while(!fixp_flag);
	}

	public final void traverse(final boa.graphs.cfg.CFG cfg,final Traversal.TraversalKind kind) throws Exception {
		if (preTraverse(cfg)) {			
			if(outputMapObj==null) {
				outputMapObj = new java.util.HashMap<Integer,T1>();
			}
			java.util.HashMap<Integer,String> nodeVisitStatus=new java.util.HashMap<Integer,String>();
			CFGNode[] nl = cfg.sortNodes();
			//java.util.ArrayList<CFGNode> nl=new java.util.ArrayList<CFGNode>(java.util.Arrays.asList(cfg.sortNodes()));
			for(int i=0;i<nl.length;i++) {
				nodeVisitStatus.put(nl[i].getId(),"unvisited");
			}
			Queue<CFGNode> q=new LinkedList<CFGNode>();
			switch(kind.getNumber()) {
				case 1:
					if(nl.length!=0) {
						nodeVisitStatus.put(nl.length-1,"visited");
						CFGNode node = nl[nl.length-1];
						traverse(node);
						q.add(node);
						while(!q.isEmpty()) {
							node=q.peek();
							for(CFGNode pred : node.getInNodes()) {
								if(nodeVisitStatus.get(pred.getId()).equals("unvisited")) {
									traverse(pred);
									nodeVisitStatus.put(pred.getId(),"visited");
									q.add(pred);
								}
							}
							q.remove();
						}
					}
					break;
				case 2:
					if(nl.length!=0) {
						nodeVisitStatus.put(0,"visited");
						CFGNode node = nl[0];
						traverse(node);
						q.add(node);
						while(!q.isEmpty()) {
							node=q.peek();
							for(CFGNode succ : node.getOutNodes()) {
								if(nodeVisitStatus.get(succ.getId()).equals("unvisited")) {
									traverse(succ);
									nodeVisitStatus.put(succ.getId(),"visited");
									q.add(succ);
								}
							}
							q.remove();
						}
					}
					break;
				case 3:
					for(CFGNode cfgnode:nl) {
						traverse(cfgnode);
						if(cfgnode.getStmt()!=null) {
							traverse(cfgnode.getStmt());
						}
						if(cfgnode.getExpr()!=null) {
							traverse(cfgnode.getExpr());
						}
					}
					break;
				case 4:
					for(CFGNode cfgnode:nl) {
						traverse(cfgnode);
					}
					break;
				default:break;
			}		
		}
	}

	public void traverse(final CFGNode node) throws Exception {
	}

	public final void traverse(final Variable node) throws Exception {
		if (preTraverse(node)) {
			postTraverse(node);
		}
	}

	public final void traverse(final Statement node) throws Exception {
		if (preTraverse(node)) {
			postTraverse(node);
		}
	}

	public final void traverse(final Expression node) throws Exception {
		if (preTraverse(node)) {
			postTraverse(node);
		}
	}

	public final void traverse(final ExpressionKind node) throws Exception {
		if (preTraverse(node)) {
			postTraverse(node);
		}
	}

	public final void traverse(final ExpressionKind node,String type) throws Exception {
		if (preTraverse(node,type)) {
			postTraverse(node);
		}
	}
}
