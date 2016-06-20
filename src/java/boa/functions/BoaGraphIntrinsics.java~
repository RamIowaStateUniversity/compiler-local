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
package boa.functions;


import boa.graphs.cfg.*;
import boa.types.Ast.Method;
import boa.types.Ast.Statement.StatementKind;
import boa.types.Ast.Expression.ExpressionKind;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import boa.runtime.*;
import boa.types.Graph.*;

/**
 * Boa functions for working with control flow graphs.
 * 
 * @author ganeshau
 * @author rramu
 *
 */
public class BoaGraphIntrinsics {

	public static HashMap<String,String> hashmap=new HashMap<String,String>();

	@FunctionSpec(name = "getcfg", returnType = "CFG", formalParameters = { "Method" })
	public static boa.types.Control.CFG getcfg(final Method method) {
		hashmap.clear();
		CFG cfg = new CFG(method);
		cfg.astToCFG();	
		return cfg.newBuilder().build();
	}
/*	
	@FunctionSpec(name = "getcfg1", returnType = "int", formalParameters = { "Method" })
	public static int getcfg1(final Method method) {
		hashmap.clear();
		CFG cfg = new CFG(method);
		cfg.astToCFG();	
		boa.types.Control.CFG new_cfg = cfg.newBuilder().build();
		boa.runtime.BoaAbstractFixP fixp = new boa.runtime.BoaAbstractFixP()
				{
					public boolean invoke1(final HashSet<String> ___curr, final HashSet<String> ___prev) throws Exception {
							if (boa.functions.BoaGraphIntrinsics.difference(___curr, ___prev) == 0l)
							{
								return true;
							}
							return false;

					}

					@Override
					public boolean invoke(Object ___curr, Object ___prev) throws Exception{
							return invoke1((HashSet<String>)___curr, (HashSet<String>)___prev);
					}
				};

		boa.runtime.BoaAbstractTraversal live = new boa.runtime.BoaAbstractTraversal<HashSet<String>>()
				{
					@Override
					public void traverse(final boa.types.Control.CFGNode node) throws Exception {
							HashSet<String> aa=new HashSet<String>();
							aa.add(String.valueOf(Math.random()));
							aa.add(String.valueOf(Math.random()));
							//if(ii!=3) {
								outputMapObj.put(node.getId(), aa);
							//}
							//ii++;
					}

				};
		try {
			live.traverse(new_cfg,Traversal.TraversalKind.BACKWARD,fixp);
		}
		catch(Exception e) {
		}
		return 1;
	}
*/
	@FunctionSpec(name = "getOutEdges", returnType = "array of string", formalParameters = { "Method" })
	public static String[] getOutEdges(final Method method) {
		hashmap.clear();
		CFG cfg = new CFG(method);
		cfg.astToCFG();	
		cfg.newBuilder().build();
		HashSet<String> result= new HashSet<String>();
		for(CFGNode node : cfg.getNodes()) {
			result.add(String.valueOf(node.outEdges.size()));
		}
		String[] resultArr = new String[result.size()];
		resultArr = result.toArray(resultArr);
		return resultArr;
	}

	@FunctionSpec(name = "getedges", returnType = "string", formalParameters = { "CFG" })
	public static String getedges(final boa.types.Control.CFG cfg) {
		java.util.List<boa.types.Control.CFGEdge> edges=cfg.getEdgesList();
		String result="";
		for(int i=0;i<edges.size();i++) {
			if(edges.get(i).getLabel().getNumber()!=1) {
				result+="1";
			}
			else {
				result+="0";
			}
		}
		return result;
	}

	@FunctionSpec(name = "getUnique", returnType = "int", formalParameters = { "set of array of string" })
	public static long getUnique(final HashSet<String[]> unis) {
		boolean flag;
		HashSet<ArrayList<String>> results=new HashSet<ArrayList<String>>();
		
		for(String[] uni : unis) {
			ArrayList<String> uni_list = new ArrayList<String>(Arrays.asList(uni));
			flag = true;
			for(ArrayList<String> result : results) {
				if(uni_list.size()==result.size()) {
					if(uni_list.containsAll(result)) {
						flag=false;	
					}
				}
			}
			if(flag==true) {
				results.add(uni_list);
			}
		}
		return results.size();
	}

	public static float getnodecost(final Method method) {
		float cost=0.0f;
		CFG cfg = new CFG(method);
		cfg.astToCFG();
		
		CFGNode[] mynodes = cfg.sortNodes(cfg);		
		for(CFGNode node:mynodes) {
			cost+=getExprStmtCost(node);
		}
		return cost;
	}

	public static float getedgecost(final Method method) {
		float cost=0.0f;
		CFG cfg = new CFG(method);
		cfg.astToCFG();
		HashMap<String,Float> edgecost=new HashMap<String,Float>();
		edgecost.put("OTHEROTHERDEFAULT",2.2f);
		edgecost.put("OTHEROTHERTRUE",3.2f);
		edgecost.put("OTHEROTHERFALSE",5.2f);
		edgecost.put("OTHEROTHERBACKEDGE",7.2f);
		edgecost.put("OTHEROTHEREXITEDGE",11.2f);
		edgecost.put("OTHERMETHODDEFAULT",13.2f);
		edgecost.put("OTHERMETHODTRUE",17.2f);
		edgecost.put("OTHERMETHODFALSE",19.2f);
		edgecost.put("OTHERMETHODBACKEDGE",23.2f);
		edgecost.put("OTHERMETHODEXITEDGE",29.2f);
		edgecost.put("OTHERCONTROLDEFAULT",31.2f);
		edgecost.put("OTHERCONTROLTRUE",37.2f);
		edgecost.put("OTHERCONTROLFALSE",41.2f);
		edgecost.put("OTHERCONTROLBACKEDGE",43.2f);
		edgecost.put("OTHERCONTROLEXITEDGE",47.2f);
		edgecost.put("METHODOTHERDEFAULT",53.2f);
		edgecost.put("METHODOTHERTRUE",59.2f);
		edgecost.put("METHODOTHERFALSE",61.2f);
		edgecost.put("METHODOTHERBACKEDGE",67.2f);
		edgecost.put("METHODOTHEREXITEDGE",71.2f);
		edgecost.put("METHODMETHODDEFAULT",73.2f);
		edgecost.put("METHODMETHODTRUE",79.2f);
		edgecost.put("METHODMETHODFALSE",83.2f);
		edgecost.put("METHODMETHODBACKEDGE",89.2f);
		edgecost.put("METHODMETHODEXITEDGE",91.2f);
		edgecost.put("METHODCONTROLDEFAULT",97.2f);
		edgecost.put("METHODCONTROLTRUE",101.2f);
		edgecost.put("METHODCONTROLFALSE",103.2f);
		edgecost.put("METHODCONTROLBACKEDGE",107.2f);
		edgecost.put("METHODCONTROLEXITEDGE",109.2f);
		edgecost.put("CONTROLOTHERDEFAULT",113.2f);
		edgecost.put("CONTROLOTHERTRUE",127.2f);
		edgecost.put("CONTROLOTHERFALSE",131.2f);
		edgecost.put("CONTROLOTHERBACKEDGE",137.2f);
		edgecost.put("CONTROLOTHEREXITEDGE",139.2f);
		edgecost.put("CONTROLMETHODDEFAULT",149.2f);
		edgecost.put("CONTROLMETHODTRUE",151.2f);
		edgecost.put("CONTROLMETHODFALSE",157.2f);
		edgecost.put("CONTROLMETHODBACKEDGE",163.2f);
		edgecost.put("CONTROLMETHODEXITEDGE",167.2f);
		edgecost.put("CONTROLCONTROLDEFAULT",173.2f);
		edgecost.put("CONTROLCONTROLTRUE",179.2f);
		edgecost.put("CONTROLCONTROLFALSE",181.2f);
		edgecost.put("CONTROLCONTROLBACKEDGE",191.2f);
		edgecost.put("CONTROLCONTROLEXITEDGE",193.2f);
		boa.types.Control.CFG cfgproto=cfg.newBuilder().build();
		int edgeSize=(int)java.lang.Math.sqrt(cfgproto.getEdgesList().size());
		
		for(int j=0;j<edgeSize;j++) {
			if(!cfgproto.getNodes(j).getKind().toString().equals("ENTRY")) {
				for(int i=j*edgeSize;i<(j*edgeSize)+edgeSize;i++) {
					if(!cfgproto.getNodes(i%edgeSize).getKind().toString().equals("ENTRY")) {	
						if(cfgproto.getEdgesList().get(i).getLabel().getNumber()!=1) {
							String str=cfgproto.getNodes(j).getKind().toString()+cfgproto.getNodes(i%edgeSize).getKind().toString()+cfgproto.getEdgesList().get(i).getLabel();
							cost+=edgecost.get(str);
						}
					}	
				}
			}
		}
		return cost;
	}

	public static float getExprStmtCost(final CFGNode node) {
		if(node.getExpr()!=null) {
			return getExprCost(node.getExpr());
		}
		if(node.getStmt()!=null) {
			return getStmtCost(node.getStmt());
		}	
		return 0.0f;	
	}

	public static float getExprCost(final boa.types.Ast.Expression expr) {
		float cost=0.0f;
		cost+=expr.getKind().getNumber();
		//System.out.println("expr kind "+expr.getKind().getNumber());
		for(boa.types.Ast.Expression exprs:expr.getMethodArgsList()) {		
			cost+=getExprCost(exprs)+0.2f;
		}		
		for(boa.types.Ast.Expression exprs:expr.getExpressionsList()) {
			cost+=getExprCost(exprs)+0.2f;
		}
		return cost;
	}

	public static float getStmtCost(final boa.types.Ast.Statement stmt) {
		float cost=0.0f;
		//System.out.println("stmt kind "+stmt.getKind().getNumber());
		cost+=stmt.getKind().getNumber();
		if(stmt.getExpression()!=null) {
			cost+=getExprCost(stmt.getExpression())+0.2f;
		}
		for(boa.types.Ast.Expression exprs:stmt.getInitializationsList()) {
			cost+=getExprCost(exprs)+0.2f;
		}
		if(stmt.getCondition()!=null) {
			cost+=getExprCost(stmt.getCondition())+0.2f;
		}
		for(boa.types.Ast.Expression exprs:stmt.getUpdatesList()) {
			cost+=getExprCost(exprs)+0.2f;
		}
		for(boa.types.Ast.Statement stmts:stmt.getStatementsList()) {
			cost+=getStmtCost(stmts)+0.2f;
		}
		return cost;
	}

	@FunctionSpec(name = "getcfgstring", returnType = "string", formalParameters = { "Method" })
	public static String getcfgstring(final Method method) {
		CFG cfg = new CFG(method);
		cfg.astToCFG();
		
		CFGNode[] mynodes = cfg.sortNodes(cfg);
		String result="Method Name : "+method.getName()+"\nNo of Nodes : "+mynodes.length+"\n";	
		for(CFGNode node:mynodes) {
			result+=node.newBuilder().build().toString()+"\n";
		}
		
		for (CFGNode node : mynodes) {
			for (CFGEdge edge : node.getOutEdges()) {
				CFGNode anoNode = edge.getDest();
				if (!anoNode.getInEdges().contains(edge)) {
					System.err.println("ERRORERRORERRORERRORERRORERROR");
					System.err.println(node.getId() + "-" + anoNode.getId());
				}
				result+="node " + node.getId() + " --> node "
						+ anoNode.getId() + "\r\n";
			}
		}

		return result;
	}

	@FunctionSpec(name = "getdetails", returnType = "string", formalParameters = { "Method" })
	public static String getdetails(final Method method) {
		CFG cur_cfg = new CFG(method);
		cur_cfg.astToCFG();
		boa.types.Control.CFG cfg = cur_cfg.newBuilder().build();
		java.util.List<boa.types.Control.CFGEdge> edges=cfg.getEdgesList();
		java.util.HashMap<Integer,String> nodeVisitStatus=new java.util.HashMap<Integer,String>();
		int edgeSize=(int)java.lang.Math.sqrt(edges.size());
		for(int i=0;i<edgeSize;i++) {
			nodeVisitStatus.put(i,"unvisited");
		}
		Queue<Integer> q=new LinkedList<Integer>();
		java.util.List<boa.types.Control.CFGNode> nl=sortNodes(cfg.getNodesList());
		if(nl.size()!=0) {
						nodeVisitStatus.put(0,"visited");
						q.add(0);
						while(!q.isEmpty()) {
							int index=q.peek();
							System.out.println(index);
							for(int i=index*edgeSize;i<(index*edgeSize)+edgeSize;i++) {
								if(edges.get(i).getLabel().getNumber()!=1 && nodeVisitStatus.get(i%edgeSize).equals("unvisited")) {
								if(index==29) {
									System.out.println("---"+edges.get(i).getLabel().getNumber());
								}
									nodeVisitStatus.put(i%edgeSize,"visited");
									q.add(i%edgeSize);		
								}
							}
							q.remove();
						}
		}
		return "";
	}

	public static final java.util.List<boa.types.Control.CFGNode> sortNodes(final java.util.List<boa.types.Control.CFGNode> nodeList) {
		java.util.List<boa.types.Control.CFGNode> nl=new java.util.ArrayList<boa.types.Control.CFGNode>();
		for(boa.types.Control.CFGNode cn:nodeList) {
			int flag=0;
			if(nl.size()>0) {
				for(int i=0;i<nl.size();i++) {
					if(nl.get(i).getId()>cn.getId()) {
						nl.add(i, cn);
						flag=1;	
						break;			
					}
				}
				if(flag==0) {
				nl.add(cn);
				}
				flag=0;
			}
			else {
				nl.add(cn);			
			}
		}
		return nl;
	}

	@FunctionSpec(name = "getPreds", returnType = "array of CFGNode", formalParameters = { "CFG","CFGNode" })
	public static boa.types.Control.CFGNode[] getPreds(final boa.types.Control.CFG cfg,final boa.types.Control.CFGNode node) {
		//System.out.println("parents of "+node.getId());
		java.util.List<boa.types.Control.CFGEdge> edges=cfg.getEdgesList();
		int edgeSize=(int)java.lang.Math.sqrt(edges.size());
		//int index=node.getId()*edgeSize;
		ArrayList<boa.types.Control.CFGNode> parents=new ArrayList<boa.types.Control.CFGNode>();
		for(int i=0;i<edges.size();i+=edgeSize) {
			//System.out.println("debug "+(i+node.getId()));
			if(edges.get(i+node.getId()).getLabel().getNumber()!=1) {
				//System.out.println(i/edgeSize);
				for(boa.types.Control.CFGNode cfgnode:cfg.getNodesList()) {
					if(cfgnode.getId()==i/edgeSize) {
						parents.add(cfgnode);
						break;
					}
				}
			}
		}
		//System.out.println(parents);
		return parents.toArray(new boa.types.Control.CFGNode[parents.size()]);
	}

	@FunctionSpec(name = "getSuccs", returnType = "array of CFGNode", formalParameters = { "CFG","CFGNode" })
	public static boa.types.Control.CFGNode[] getSuccs(final boa.types.Control.CFG cfg,final boa.types.Control.CFGNode node) {
		//System.out.println("parents of "+node.getId());
		java.util.List<boa.types.Control.CFGEdge> edges=cfg.getEdgesList();
		int edgeSize=(int)java.lang.Math.sqrt(edges.size());
		//int index=node.getId()*edgeSize;
		ArrayList<boa.types.Control.CFGNode> children=new ArrayList<boa.types.Control.CFGNode>();
		for(int i=node.getId()*edgeSize;i<(node.getId()*edgeSize)+edgeSize;i++) {
			//System.out.println("debug "+(i+node.getId()));
			if(edges.get(i).getLabel().getNumber()!=1) {
				//System.out.println(i/edgeSize);
				for(boa.types.Control.CFGNode cfgnode:cfg.getNodesList()) {
					if(cfgnode.getId()==i%edgeSize) {
						children.add(cfgnode);
						break;
					}
				}
			}
		}
		//System.out.println(parents);
		return children.toArray(new boa.types.Control.CFGNode[children.size()]);
	}
	
	public static void traverse(CFGNode node) {		
		System.out.println("liveness "+hashmap);
		System.out.println(node.newBuilder().build());
		liveness(node);
		for (CFGEdge edge : node.getOutEdges()) {
			CFGNode anoNode = edge.getDest();
			if (!anoNode.getInEdges().contains(edge)) {
				System.err.println("ERRORERRORERRORERRORERRORERROR");
				System.err.println(node.getId() + "-" + anoNode.getId());
			}
			//System.out.println("node " + node.getId() + " --> node "+ anoNode.getId() + "\r\n");
			traverse(anoNode);
		}
	}

	public static void liveness(CFGNode node) {
		if(node.getExpr()!=null) {
			for(boa.types.Ast.Variable variable: node.getExpr().getVariableDeclsList()) {
				hashmap.put(variable.getName(),"Node id : "+node.getId());
				//System.out.println("Variable declared : "+variable.getName()+" in node");
			}
			if(node.getExpr().getKind().toString().equals("ASSIGN")) {
				for(boa.types.Ast.Expression exprs:node.getExpr().getExpressionsList()) {
					if(exprs.getKind().toString().equals("VARACCESS")) {
						hashmap.put(exprs.getVariable(),"Node id : "+node.getId());
					}
				}			
			}
		}
	}
/*	@FunctionSpec(name = "isseteq", returnType = "bool", formalParameters = { "set of int","set of int" })
	public static boolean isseteq(final Set<Long> set1,final Set<Long> set2) {
		int flag=0;
		if(set1.size()==set2.size()) {
			for(Long i : set2) {
    				if(!(set1.contains(i))) {
					flag=1;
				}
			}
			if(flag==0) {
				return true;
			}
		}
		return false;
	}

	@FunctionSpec(name = "union", returnType = "set of int", formalParameters = { "set of int","set of int" })
	public static HashSet<Long> union(final HashSet<Long> set1,final HashSet<Long> set2) {
		for(Long i : set2) {
    			set1.add(i);
		}
		return set1;
	}
*/
	@FunctionSpec(name = "union", returnType = "set of string", formalParameters = { "set of string","set of string" })
	public static HashSet<String> union(final HashSet<String> set1,final HashSet<String> set2) {
		HashSet<String> result_set=new HashSet<String>();
		for(String i : set1) {
    			result_set.add(i);
		}
		for(String i : set2) {
    			result_set.add(i);
		}
		return result_set;
	}

	@FunctionSpec(name = "intersection", returnType = "set of string", formalParameters = { "set of string","set of string" })
	public static HashSet<String> intersection(final HashSet<String> set1,final HashSet<String> set2) {
		HashSet<String> result_set=new HashSet<String>();		
		for(String i : set2) {
    			if(set1.contains(i)) {
				result_set.add(i);
			}
		}
		return result_set;
	}
/*
	@FunctionSpec(name = "setdifference", returnType = "set of int", formalParameters = { "set of int","set of int" })
	public static HashSet<Long> setdifference(final HashSet<Long> set1,final HashSet<Long> set2) {
		for(Long i : set2) {
    			set1.remove(i);
		}
		return set1;
	}
*/

	@FunctionSpec(name = "setdifference", returnType = "set of string", formalParameters = { "set of string","set of string" })
	public static HashSet<String> setdifference(final HashSet<String> set1,final HashSet<String> set2) {
		HashSet<String> result_set1=new HashSet<String>(set1);
		HashSet<String> result_set2=new HashSet<String>(set2);
		for(String i : result_set2) {
    			result_set1.remove(i);
		}
		return result_set1;
	}

	@FunctionSpec(name = "difference", returnType = "int", formalParameters = { "set of string","set of string" })
	public static int difference(final HashSet<String> set1,final HashSet<String> set2) {
		if(set1.size()==set2.size()) {
			if(set1.containsAll(set2)) {
				return 0;
			}		
		}
		return 1;
	}

	@FunctionSpec(name = "getsize", returnType = "int", formalParameters = { "Method" })
	public static int getsize(final Method method) {
		CFG cfg = new CFG(method);
		cfg.astToCFG();
		return cfg.getNodes().size();
	}
	
	@FunctionSpec(name = "getstatement", returnType = "Statement", formalParameters = { "CFGNode" })
	public static boa.types.Ast.Statement getstatement(final boa.types.Control.CFGNode node) {
		return node.getStatement();
	}

	@FunctionSpec(name = "getexpression", returnType = "Expression", formalParameters = { "CFGNode" })
	public static boa.types.Ast.Expression getexpression(final boa.types.Control.CFGNode node) {
		return node.getExpression();
	}

	@FunctionSpec(name = "getstmtkind", returnType = "string", formalParameters = { "StatementKind" })
	public static String getstmtkind(final StatementKind kind) {
		return kind.toString();
	}

	@FunctionSpec(name = "getexprkind", returnType = "string", formalParameters = { "ExpressionKind" })
	public static String getexprkind(final ExpressionKind kind) {
		return kind.toString();
	}

	@FunctionSpec(name = "getnodekind", returnType = "string", formalParameters = { "CFGNodeType" })
	public static String getnodekind(final boa.types.Control.CFGNode.CFGNodeType kind) {
		return kind.toString();
	}

	@FunctionSpec(name = "getvariabledefined", returnType = "set of string", formalParameters = { "CFGNode" })
	public static HashSet<String> getvariabledefined(final boa.types.Control.CFGNode node) {
		HashSet<String> vardef= new HashSet<String>();
		if(node.getExpression()!=null) {
			if(node.getExpression().getKind().toString().equals("VARDECL") || node.getExpression().getKind().toString().equals("ASSIGN")) {
			vardef.add(String.valueOf(node.getId()));
			}		
		}
		return vardef;
	}

	@FunctionSpec(name = "getvariablekilled", returnType = "set of string", formalParameters = {"CFG", "CFGNode" })
	public static HashSet<String> getvariablekilled(final boa.types.Control.CFG cfg,final boa.types.Control.CFGNode node) {
		HashSet<String> varkilled= new HashSet<String>();
		String vardef="";
		if(node.getExpression()!=null) {
			if(node.getExpression().getKind().toString().equals("VARDECL")) {
				vardef=node.getExpression().getVariableDeclsList().get(0).getName();
			}
			else if(node.getExpression().getKind().toString().equals("ASSIGN")) {
				vardef=node.getExpression().getExpressionsList().get(0).getVariable();
			}
			else {
				return varkilled;
			}
			for(boa.types.Control.CFGNode tnode:cfg.getNodesList()) {
				if(tnode.getExpression()!=null && tnode.getId()!=node.getId()) {
					if(tnode.getExpression().getKind().toString().equals("VARDECL")) {
						if(tnode.getExpression().getVariableDeclsList().get(0).getName().equals(vardef)) {
							varkilled.add(String.valueOf(tnode.getId()));
						}			
					}
					else if(tnode.getExpression().getKind().toString().equals("ASSIGN")) {
						if(tnode.getExpression().getExpressionsList().get(0).getVariable().equals(vardef)) {
							varkilled.add(String.valueOf(tnode.getId()));
						}					
					}
				}
			}		
		}
		
		return varkilled;
	}

	@FunctionSpec(name = "getvariabledef", returnType = "set of string", formalParameters = { "CFGNode" })
	public static HashSet<String> getvariabledef(final boa.types.Control.CFGNode node) {
		HashSet<String> vardef= new HashSet<String>();
		if(node.getExpression()!=null) {
			if(node.getExpression().getKind().toString().equals("VARDECL")) {
				vardef.add(node.getExpression().getVariableDeclsList().get(0).getName());			
			}
			if(node.getExpression().getKind().toString().equals("ASSIGN")) {
				vardef.add(node.getExpression().getExpressionsList().get(0).getVariable());
			}		
		}
		return vardef;
	}

	@FunctionSpec(name = "getvariableused", returnType = "set of string", formalParameters = { "CFGNode" })
	public static HashSet<String> getvariableused(final boa.types.Control.CFGNode node) {
		HashSet<String> varused=new HashSet<String>();
		if(node.getExpression()!=null) {
			traverseExpr(varused,node.getExpression());
		}
		return varused;
	}

	public static void traverseExpr(HashSet<String> varused, final boa.types.Ast.Expression expr) {		
		if(expr.getVariable()!=null) {
			varused.add(expr.getVariable());			
		}
		for(boa.types.Ast.Expression exprs:expr.getExpressionsList()) {
			traverseExpr(varused, exprs);
		}
		for(boa.types.Ast.Variable vardecls:expr.getVariableDeclsList()) {
			traverseVarDecls(varused, vardecls);
		}
		for(boa.types.Ast.Expression methodexpr:expr.getMethodArgsList()) {
			traverseExpr(varused, methodexpr);
		}
	}

	public static void traverseVarDecls(HashSet<String> varused, final boa.types.Ast.Variable vardecls) {		
		if(vardecls.getInitializer()!=null) {
			traverseExpr(varused, vardecls.getInitializer());			
		}
	}
}
