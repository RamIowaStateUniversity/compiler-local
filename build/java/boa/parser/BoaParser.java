// Generated from Boa.g by ANTLR 4.5
package boa.parser;

import java.util.ArrayList;

import boa.compiler.ast.*;
import boa.compiler.ast.expressions.*;
import boa.compiler.ast.literals.*;
import boa.compiler.ast.statements.*;
import boa.compiler.ast.types.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BoaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OF=1, IF=2, DO=3, MAP=4, STACK=5, SET=6, FOR=7, FOREACH=8, IFALL=9, EXISTS=10, 
		NOT=11, TYPE=12, ELSE=13, CASE=14, OUTPUT=15, FORMAT=16, WHILE=17, BREAK=18, 
		ARRAY=19, STATIC=20, SWITCH=21, RETURN=22, WEIGHT=23, DEFAULT=24, CONTINUE=25, 
		FUNCTION=26, FIXP=27, VISITOR=28, TRAVERSAL=29, BEFORE=30, AFTER=31, STOP=32, 
		SEMICOLON=33, COLON=34, COMMA=35, DOT=36, LBRACE=37, RBRACE=38, LPAREN=39, 
		RPAREN=40, LBRACKET=41, RBRACKET=42, OR=43, ONEOR=44, TWOOR=45, AND=46, 
		ONEAND=47, TWOAND=48, INCR=49, DECR=50, EQEQ=51, NEQ=52, LT=53, LTEQ=54, 
		GT=55, GTEQ=56, PLUS=57, MINUS=58, XOR=59, STAR=60, DIV=61, MOD=62, RSHIFT=63, 
		NEG=64, INV=65, WILDCARD=66, QUESTION=67, DOLLAR=68, EQUALS=69, EMIT=70, 
		RIGHT_ARROW=71, IntegerLiteral=72, FloatingPointLiteral=73, CharacterLiteral=74, 
		RegexLiteral=75, StringLiteral=76, TimeLiteral=77, Identifier=78, WS=79, 
		LINE_COMMENT=80;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_programStatement = 2, RULE_declaration = 3, 
		RULE_typeDeclaration = 4, RULE_staticVariableDeclaration = 5, RULE_variableDeclaration = 6, 
		RULE_type = 7, RULE_component = 8, RULE_arrayType = 9, RULE_tupleType = 10, 
		RULE_member = 11, RULE_mapType = 12, RULE_stackType = 13, RULE_setType = 14, 
		RULE_outputType = 15, RULE_functionType = 16, RULE_fixpType = 17, RULE_visitorType = 18, 
		RULE_traversalType = 19, RULE_statement = 20, RULE_emptyStatement = 21, 
		RULE_assignmentStatement = 22, RULE_block = 23, RULE_breakStatement = 24, 
		RULE_continueStatement = 25, RULE_doStatement = 26, RULE_emitStatement = 27, 
		RULE_forStatement = 28, RULE_forExpression = 29, RULE_forVariableDeclaration = 30, 
		RULE_forExpressionStatement = 31, RULE_expressionStatement = 32, RULE_ifStatement = 33, 
		RULE_returnStatement = 34, RULE_switchStatement = 35, RULE_switchCase = 36, 
		RULE_foreachStatement = 37, RULE_existsStatement = 38, RULE_ifallStatement = 39, 
		RULE_whileStatement = 40, RULE_visitStatement = 41, RULE_traverseStatement = 42, 
		RULE_fixpStatement = 43, RULE_stopStatement = 44, RULE_expression = 45, 
		RULE_expressionList = 46, RULE_conjunction = 47, RULE_comparison = 48, 
		RULE_simpleExpression = 49, RULE_term = 50, RULE_factor = 51, RULE_selector = 52, 
		RULE_index = 53, RULE_call = 54, RULE_operand = 55, RULE_unaryFactor = 56, 
		RULE_parenExpression = 57, RULE_functionExpression = 58, RULE_fixpExpression = 59, 
		RULE_visitorExpression = 60, RULE_traversalExpression = 61, RULE_composite = 62, 
		RULE_pair = 63, RULE_identifier = 64, RULE_integerLiteral = 65, RULE_floatingPointLiteral = 66, 
		RULE_characterLiteral = 67, RULE_stringLiteral = 68, RULE_timeLiteral = 69;
	public static final String[] ruleNames = {
		"start", "program", "programStatement", "declaration", "typeDeclaration", 
		"staticVariableDeclaration", "variableDeclaration", "type", "component", 
		"arrayType", "tupleType", "member", "mapType", "stackType", "setType", 
		"outputType", "functionType", "fixpType", "visitorType", "traversalType", 
		"statement", "emptyStatement", "assignmentStatement", "block", "breakStatement", 
		"continueStatement", "doStatement", "emitStatement", "forStatement", "forExpression", 
		"forVariableDeclaration", "forExpressionStatement", "expressionStatement", 
		"ifStatement", "returnStatement", "switchStatement", "switchCase", "foreachStatement", 
		"existsStatement", "ifallStatement", "whileStatement", "visitStatement", 
		"traverseStatement", "fixpStatement", "stopStatement", "expression", "expressionList", 
		"conjunction", "comparison", "simpleExpression", "term", "factor", "selector", 
		"index", "call", "operand", "unaryFactor", "parenExpression", "functionExpression", 
		"fixpExpression", "visitorExpression", "traversalExpression", "composite", 
		"pair", "identifier", "integerLiteral", "floatingPointLiteral", "characterLiteral", 
		"stringLiteral", "timeLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'of'", "'if'", "'do'", "'map'", "'stack'", "'set'", "'for'", "'foreach'", 
		"'ifall'", "'exists'", "'not'", "'type'", "'else'", "'case'", "'output'", 
		"'format'", "'while'", "'break'", "'array'", "'static'", "'switch'", "'return'", 
		"'weight'", "'default'", "'continue'", "'function'", "'fixp'", "'visitor'", 
		"'traversal'", "'before'", "'after'", "'stop'", "';'", "':'", "','", "'.'", 
		"'{'", "'}'", "'('", "')'", "'['", "']'", "'or'", "'|'", "'||'", "'and'", 
		"'&'", "'&&'", "'++'", "'--'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
		"'+'", "'-'", "'^'", "'*'", "'/'", "'%'", "'>>'", "'~'", "'!'", "'_'", 
		"'?'", "'$'", "'='", "'<<'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OF", "IF", "DO", "MAP", "STACK", "SET", "FOR", "FOREACH", "IFALL", 
		"EXISTS", "NOT", "TYPE", "ELSE", "CASE", "OUTPUT", "FORMAT", "WHILE", 
		"BREAK", "ARRAY", "STATIC", "SWITCH", "RETURN", "WEIGHT", "DEFAULT", "CONTINUE", 
		"FUNCTION", "FIXP", "VISITOR", "TRAVERSAL", "BEFORE", "AFTER", "STOP", 
		"SEMICOLON", "COLON", "COMMA", "DOT", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
		"LBRACKET", "RBRACKET", "OR", "ONEOR", "TWOOR", "AND", "ONEAND", "TWOAND", 
		"INCR", "DECR", "EQEQ", "NEQ", "LT", "LTEQ", "GT", "GTEQ", "PLUS", "MINUS", 
		"XOR", "STAR", "DIV", "MOD", "RSHIFT", "NEG", "INV", "WILDCARD", "QUESTION", 
		"DOLLAR", "EQUALS", "EMIT", "RIGHT_ARROW", "IntegerLiteral", "FloatingPointLiteral", 
		"CharacterLiteral", "RegexLiteral", "StringLiteral", "TimeLiteral", "Identifier", 
		"WS", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Boa.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	protected int getStartLine() {
		return getCurrentToken().getLine();
	}
	protected int getStartColumn() {
		return getCurrentToken().getCharPositionInLine();
	}
	protected int getEndLine() {
		Token t = _input.LT(-1);
		if (t == null) t = getCurrentToken();
		return t.getLine();
	}
	protected int getEndColumn() {
		Token t = _input.LT(-1);
		if (t == null) t = getCurrentToken();
		return t.getCharPositionInLine() + t.getText().length() - 1;
	}
	protected void isSemicolon() {
		if (!getCurrentToken().getText().equals(";")) {
			notifyErrorListeners("error: ';' expected");
			return;
		}
		setState(getState() + 1);
		match(SEMICOLON);
	}

	public BoaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Start ast;
		public int l;
		public int c;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(BoaParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		 ((StartContext)_localctx).l =  getStartLine(); ((StartContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((StartContext)_localctx).p = program();
			setState(141);
			match(EOF);
			 ((StartContext)_localctx).ast =  new Start(((StartContext)_localctx).p.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public int l;
		public int c;
		public ProgramStatementContext s;
		public List<ProgramStatementContext> programStatement() {
			return getRuleContexts(ProgramStatementContext.class);
		}
		public ProgramStatementContext programStatement(int i) {
			return getRuleContext(ProgramStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);

				((ProgramContext)_localctx).l =  getStartLine(); ((ProgramContext)_localctx).c =  getStartColumn();
				((ProgramContext)_localctx).ast =  new Program();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				((ProgramContext)_localctx).s = programStatement();
				 _localctx.ast.addStatement(((ProgramContext)_localctx).s.ast); 
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << IF) | (1L << DO) | (1L << MAP) | (1L << STACK) | (1L << SET) | (1L << FOR) | (1L << FOREACH) | (1L << IFALL) | (1L << EXISTS) | (1L << NOT) | (1L << TYPE) | (1L << ELSE) | (1L << CASE) | (1L << OUTPUT) | (1L << FORMAT) | (1L << WHILE) | (1L << BREAK) | (1L << ARRAY) | (1L << STATIC) | (1L << SWITCH) | (1L << RETURN) | (1L << WEIGHT) | (1L << DEFAULT) | (1L << CONTINUE) | (1L << FUNCTION) | (1L << FIXP) | (1L << VISITOR) | (1L << TRAVERSAL) | (1L << BEFORE) | (1L << AFTER) | (1L << STOP) | (1L << SEMICOLON) | (1L << LBRACE) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NEG - 64)) | (1L << (INV - 64)) | (1L << (DOLLAR - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (RegexLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (TimeLiteral - 64)) | (1L << (Identifier - 64)))) != 0) );
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramStatementContext extends ParserRuleContext {
		public Statement ast;
		public DeclarationContext d;
		public StatementContext s;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ProgramStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterProgramStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitProgramStatement(this);
		}
	}

	public final ProgramStatementContext programStatement() throws RecognitionException {
		ProgramStatementContext _localctx = new ProgramStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programStatement);
		try {
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((ProgramStatementContext)_localctx).d = declaration();
				 ((ProgramStatementContext)_localctx).ast =  ((ProgramStatementContext)_localctx).d.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				((ProgramStatementContext)_localctx).s = statement();
				 ((ProgramStatementContext)_localctx).ast =  ((ProgramStatementContext)_localctx).s.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Statement ast;
		public TypeDeclarationContext t;
		public StaticVariableDeclarationContext s;
		public VariableDeclarationContext v;
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public StaticVariableDeclarationContext staticVariableDeclaration() {
			return getRuleContext(StaticVariableDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				((DeclarationContext)_localctx).t = typeDeclaration();
				 ((DeclarationContext)_localctx).ast =  ((DeclarationContext)_localctx).t.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				((DeclarationContext)_localctx).s = staticVariableDeclaration();
				 ((DeclarationContext)_localctx).ast =  ((DeclarationContext)_localctx).s.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				((DeclarationContext)_localctx).v = variableDeclaration();
				 ((DeclarationContext)_localctx).ast =  ((DeclarationContext)_localctx).v.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TypeDecl ast;
		public int l;
		public int c;
		public IdentifierContext id;
		public TypeContext t;
		public TerminalNode TYPE() { return getToken(BoaParser.TYPE, 0); }
		public TerminalNode EQUALS() { return getToken(BoaParser.EQUALS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDeclaration);
		 ((TypeDeclarationContext)_localctx).l =  getStartLine(); ((TypeDeclarationContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(TYPE);
			setState(171);
			((TypeDeclarationContext)_localctx).id = identifier();
			setState(172);
			match(EQUALS);
			setState(173);
			((TypeDeclarationContext)_localctx).t = type();
			 isSemicolon(); ((TypeDeclarationContext)_localctx).ast =  new TypeDecl(((TypeDeclarationContext)_localctx).id.ast, ((TypeDeclarationContext)_localctx).t.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticVariableDeclarationContext extends ParserRuleContext {
		public VarDeclStatement ast;
		public int l;
		public int c;
		public VariableDeclarationContext v;
		public TerminalNode STATIC() { return getToken(BoaParser.STATIC, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public StaticVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterStaticVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitStaticVariableDeclaration(this);
		}
	}

	public final StaticVariableDeclarationContext staticVariableDeclaration() throws RecognitionException {
		StaticVariableDeclarationContext _localctx = new StaticVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_staticVariableDeclaration);
		 ((StaticVariableDeclarationContext)_localctx).l =  getStartLine(); ((StaticVariableDeclarationContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(STATIC);
			setState(177);
			((StaticVariableDeclarationContext)_localctx).v = variableDeclaration();
			 ((StaticVariableDeclarationContext)_localctx).ast =  ((StaticVariableDeclarationContext)_localctx).v.ast; _localctx.ast.setStatic(true); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VarDeclStatement ast;
		public int l;
		public int c;
		public ForVariableDeclarationContext v;
		public ForVariableDeclarationContext forVariableDeclaration() {
			return getRuleContext(ForVariableDeclarationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclaration);
		 ((VariableDeclarationContext)_localctx).l =  getStartLine(); ((VariableDeclarationContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((VariableDeclarationContext)_localctx).v = forVariableDeclaration();
			 isSemicolon(); ((VariableDeclarationContext)_localctx).ast =  ((VariableDeclarationContext)_localctx).v.ast; 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public AbstractType ast;
		public ArrayTypeContext a;
		public MapTypeContext m;
		public TupleTypeContext t;
		public OutputTypeContext o;
		public FunctionTypeContext f;
		public FixpTypeContext fixp;
		public VisitorTypeContext v;
		public TraversalTypeContext tr;
		public StackTypeContext s;
		public SetTypeContext set;
		public IdentifierContext id;
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public OutputTypeContext outputType() {
			return getRuleContext(OutputTypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public FixpTypeContext fixpType() {
			return getRuleContext(FixpTypeContext.class,0);
		}
		public VisitorTypeContext visitorType() {
			return getRuleContext(VisitorTypeContext.class,0);
		}
		public TraversalTypeContext traversalType() {
			return getRuleContext(TraversalTypeContext.class,0);
		}
		public StackTypeContext stackType() {
			return getRuleContext(StackTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((TypeContext)_localctx).a = arrayType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).a.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				((TypeContext)_localctx).m = mapType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).m.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				((TypeContext)_localctx).t = tupleType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).t.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				((TypeContext)_localctx).o = outputType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).o.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				((TypeContext)_localctx).f = functionType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).f.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				((TypeContext)_localctx).fixp = fixpType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).fixp.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(201);
				((TypeContext)_localctx).v = visitorType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).v.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				((TypeContext)_localctx).tr = traversalType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).tr.ast; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(207);
				((TypeContext)_localctx).s = stackType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).s.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(210);
				((TypeContext)_localctx).set = setType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).set.ast; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(213);
				((TypeContext)_localctx).id = identifier();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).id.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentContext extends ParserRuleContext {
		public Component ast;
		public int l;
		public int c;
		public IdentifierContext id;
		public TypeContext t;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BoaParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_component);

				((ComponentContext)_localctx).l =  getStartLine(); ((ComponentContext)_localctx).c =  getStartColumn();
				((ComponentContext)_localctx).ast =  new Component();
			
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(218);
				((ComponentContext)_localctx).id = identifier();
				setState(219);
				match(COLON);
				 _localctx.ast.setIdentifier(((ComponentContext)_localctx).id.ast); 
				}
				break;
			}
			setState(224);
			((ComponentContext)_localctx).t = type();
			 _localctx.ast.setType(((ComponentContext)_localctx).t.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayType ast;
		public int l;
		public int c;
		public ComponentContext m;
		public TerminalNode ARRAY() { return getToken(BoaParser.ARRAY, 0); }
		public TerminalNode OF() { return getToken(BoaParser.OF, 0); }
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayType);
		 ((ArrayTypeContext)_localctx).l =  getStartLine(); ((ArrayTypeContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ARRAY);
			setState(228);
			match(OF);
			setState(229);
			((ArrayTypeContext)_localctx).m = component();
			 ((ArrayTypeContext)_localctx).ast =  new ArrayType(((ArrayTypeContext)_localctx).m.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeContext extends ParserRuleContext {
		public TupleType ast;
		public int l;
		public int c;
		public MemberContext m;
		public TerminalNode LBRACE() { return getToken(BoaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BoaParser.RBRACE, 0); }
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BoaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BoaParser.COMMA, i);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitTupleType(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tupleType);

				((TupleTypeContext)_localctx).l =  getStartLine(); ((TupleTypeContext)_localctx).c =  getStartColumn();
				((TupleTypeContext)_localctx).ast =  new TupleType();
			
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(LBRACE);
			setState(247);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << IF) | (1L << DO) | (1L << MAP) | (1L << STACK) | (1L << SET) | (1L << FOR) | (1L << FOREACH) | (1L << IFALL) | (1L << EXISTS) | (1L << NOT) | (1L << TYPE) | (1L << ELSE) | (1L << CASE) | (1L << OUTPUT) | (1L << FORMAT) | (1L << WHILE) | (1L << BREAK) | (1L << ARRAY) | (1L << STATIC) | (1L << SWITCH) | (1L << RETURN) | (1L << WEIGHT) | (1L << DEFAULT) | (1L << CONTINUE) | (1L << FUNCTION) | (1L << FIXP) | (1L << VISITOR) | (1L << TRAVERSAL) | (1L << BEFORE) | (1L << AFTER) | (1L << STOP) | (1L << LBRACE))) != 0) || _la==Identifier) {
				{
				setState(233);
				((TupleTypeContext)_localctx).m = member();
				 _localctx.ast.addMember(((TupleTypeContext)_localctx).m.ast); 
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(235);
						match(COMMA);
						setState(236);
						((TupleTypeContext)_localctx).m = member();
						 _localctx.ast.addMember(((TupleTypeContext)_localctx).m.ast); 
						}
						} 
					}
					setState(243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(245);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(244);
					match(COMMA);
					}
				}

				}
			}

			setState(249);
			match(RBRACE);
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public Component ast;
		public TypeDeclarationContext t;
		public StaticVariableDeclarationContext s;
		public ComponentContext c;
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public StaticVariableDeclarationContext staticVariableDeclaration() {
			return getRuleContext(StaticVariableDeclarationContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitMember(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_member);
		try {
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				((MemberContext)_localctx).t = typeDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				((MemberContext)_localctx).s = staticVariableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				((MemberContext)_localctx).c = component();
				 ((MemberContext)_localctx).ast =  ((MemberContext)_localctx).c.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapTypeContext extends ParserRuleContext {
		public MapType ast;
		public int l;
		public int c;
		public ComponentContext key;
		public ComponentContext value;
		public TerminalNode MAP() { return getToken(BoaParser.MAP, 0); }
		public TerminalNode LBRACKET() { return getToken(BoaParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BoaParser.RBRACKET, 0); }
		public TerminalNode OF() { return getToken(BoaParser.OF, 0); }
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitMapType(this);
		}
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mapType);
		 ((MapTypeContext)_localctx).l =  getStartLine(); ((MapTypeContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(MAP);
			setState(259);
			match(LBRACKET);
			setState(260);
			((MapTypeContext)_localctx).key = component();
			setState(261);
			match(RBRACKET);
			setState(262);
			match(OF);
			setState(263);
			((MapTypeContext)_localctx).value = component();
			 ((MapTypeContext)_localctx).ast =  new MapType(((MapTypeContext)_localctx).key.ast, ((MapTypeContext)_localctx).value.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StackTypeContext extends ParserRuleContext {
		public StackType ast;
		public int l;
		public int c;
		public ComponentContext m;
		public TerminalNode STACK() { return getToken(BoaParser.STACK, 0); }
		public TerminalNode OF() { return getToken(BoaParser.OF, 0); }
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public StackTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterStackType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitStackType(this);
		}
	}

	public final StackTypeContext stackType() throws RecognitionException {
		StackTypeContext _localctx = new StackTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stackType);
		 ((StackTypeContext)_localctx).l =  getStartLine(); ((StackTypeContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(STACK);
			setState(267);
			match(OF);
			setState(268);
			((StackTypeContext)_localctx).m = component();
			 ((StackTypeContext)_localctx).ast =  new StackType(((StackTypeContext)_localctx).m.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTypeContext extends ParserRuleContext {
		public SetType ast;
		public int l;
		public int c;
		public ComponentContext m;
		public TerminalNode SET() { return getToken(BoaParser.SET, 0); }
		public TerminalNode OF() { return getToken(BoaParser.OF, 0); }
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitSetType(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_setType);
		 ((SetTypeContext)_localctx).l =  getStartLine(); ((SetTypeContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(SET);
			setState(272);
			match(OF);
			setState(273);
			((SetTypeContext)_localctx).m = component();
			 ((SetTypeContext)_localctx).ast =  new SetType(((SetTypeContext)_localctx).m.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputTypeContext extends ParserRuleContext {
		public OutputType ast;
		public int l;
		public int c;
		public Token tk;
		public IdentifierContext id;
		public ExpressionListContext el;
		public ComponentContext m;
		public TerminalNode OUTPUT() { return getToken(BoaParser.OUTPUT, 0); }
		public TerminalNode OF() { return getToken(BoaParser.OF, 0); }
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public TerminalNode SET() { return getToken(BoaParser.SET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(BoaParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(BoaParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(BoaParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(BoaParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(BoaParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(BoaParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(BoaParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(BoaParser.RBRACKET, i);
		}
		public TerminalNode WEIGHT() { return getToken(BoaParser.WEIGHT, 0); }
		public TerminalNode FORMAT() { return getToken(BoaParser.FORMAT, 0); }
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public OutputTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterOutputType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitOutputType(this);
		}
	}

	public final OutputTypeContext outputType() throws RecognitionException {
		OutputTypeContext _localctx = new OutputTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_outputType);
		 ((OutputTypeContext)_localctx).l =  getStartLine(); ((OutputTypeContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(OUTPUT);
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(277);
				((OutputTypeContext)_localctx).tk = match(SET);
				 ((OutputTypeContext)_localctx).ast =  new OutputType(new Identifier((((OutputTypeContext)_localctx).tk!=null?((OutputTypeContext)_localctx).tk.getText():null))); 
				}
				break;
			case 2:
				{
				setState(279);
				((OutputTypeContext)_localctx).id = identifier();
				 ((OutputTypeContext)_localctx).ast =  new OutputType(((OutputTypeContext)_localctx).id.ast); 
				}
				break;
			}
			setState(289);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(284);
				match(LPAREN);
				setState(285);
				((OutputTypeContext)_localctx).el = expressionList();
				setState(286);
				match(RPAREN);
				 _localctx.ast.setArgs(((OutputTypeContext)_localctx).el.list); 
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(291);
				match(LBRACKET);
				setState(292);
				((OutputTypeContext)_localctx).m = component();
				setState(293);
				match(RBRACKET);
				 _localctx.ast.addIndice(((OutputTypeContext)_localctx).m.ast); 
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(OF);
			setState(302);
			((OutputTypeContext)_localctx).m = component();
			 _localctx.ast.setType(((OutputTypeContext)_localctx).m.ast); 
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(304);
				match(WEIGHT);
				setState(305);
				((OutputTypeContext)_localctx).m = component();
				 _localctx.ast.setWeight(((OutputTypeContext)_localctx).m.ast); 
				}
				break;
			}
			setState(315);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(310);
				match(FORMAT);
				setState(311);
				match(LPAREN);
				setState(312);
				((OutputTypeContext)_localctx).el = expressionList();
				setState(313);
				match(RPAREN);
				}
				break;
			}
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionType ast;
		public int l;
		public int c;
		public IdentifierContext id;
		public TypeContext t;
		public TerminalNode FUNCTION() { return getToken(BoaParser.FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(BoaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BoaParser.RPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(BoaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(BoaParser.COLON, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BoaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BoaParser.COMMA, i);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionType);

				((FunctionTypeContext)_localctx).l =  getStartLine(); ((FunctionTypeContext)_localctx).c =  getStartColumn();
				((FunctionTypeContext)_localctx).ast =  new FunctionType();
			
		int _la;
		try {
			setState(379);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(FUNCTION);
				setState(318);
				match(LPAREN);
				setState(334);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << IF) | (1L << DO) | (1L << MAP) | (1L << STACK) | (1L << SET) | (1L << FOR) | (1L << FOREACH) | (1L << IFALL) | (1L << EXISTS) | (1L << NOT) | (1L << TYPE) | (1L << ELSE) | (1L << CASE) | (1L << OUTPUT) | (1L << FORMAT) | (1L << WHILE) | (1L << BREAK) | (1L << ARRAY) | (1L << STATIC) | (1L << SWITCH) | (1L << RETURN) | (1L << WEIGHT) | (1L << DEFAULT) | (1L << CONTINUE) | (1L << FUNCTION) | (1L << FIXP) | (1L << VISITOR) | (1L << TRAVERSAL) | (1L << BEFORE) | (1L << AFTER) | (1L << STOP))) != 0) || _la==Identifier) {
					{
					setState(319);
					((FunctionTypeContext)_localctx).id = identifier();
					setState(320);
					match(COLON);
					setState(321);
					((FunctionTypeContext)_localctx).t = type();
					 _localctx.ast.addArg(new Component(((FunctionTypeContext)_localctx).id.ast, ((FunctionTypeContext)_localctx).t.ast)); 
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(323);
						match(COMMA);
						setState(324);
						((FunctionTypeContext)_localctx).id = identifier();
						setState(325);
						match(COLON);
						setState(326);
						((FunctionTypeContext)_localctx).t = type();
						 _localctx.ast.addArg(new Component(((FunctionTypeContext)_localctx).id.ast, ((FunctionTypeContext)_localctx).t.ast)); 
						}
						}
						setState(333);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(336);
				match(RPAREN);
				setState(341);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(337);
					match(COLON);
					setState(338);
					((FunctionTypeContext)_localctx).t = type();
					 _localctx.ast.setType(((FunctionTypeContext)_localctx).t.ast); 
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(FUNCTION);
				setState(344);
				match(LPAREN);
				setState(370);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << IF) | (1L << DO) | (1L << MAP) | (1L << STACK) | (1L << SET) | (1L << FOR) | (1L << FOREACH) | (1L << IFALL) | (1L << EXISTS) | (1L << NOT) | (1L << TYPE) | (1L << ELSE) | (1L << CASE) | (1L << OUTPUT) | (1L << FORMAT) | (1L << WHILE) | (1L << BREAK) | (1L << ARRAY) | (1L << STATIC) | (1L << SWITCH) | (1L << RETURN) | (1L << WEIGHT) | (1L << DEFAULT) | (1L << CONTINUE) | (1L << FUNCTION) | (1L << FIXP) | (1L << VISITOR) | (1L << TRAVERSAL) | (1L << BEFORE) | (1L << AFTER) | (1L << STOP))) != 0) || _la==Identifier) {
					{
					setState(353);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(345);
						((FunctionTypeContext)_localctx).id = identifier();
						setState(346);
						match(COLON);
						setState(347);
						((FunctionTypeContext)_localctx).t = type();
						 _localctx.ast.addArg(new Component(((FunctionTypeContext)_localctx).id.ast, ((FunctionTypeContext)_localctx).t.ast)); 
						}
						break;
					case 2:
						{
						setState(350);
						identifier();
						 notifyErrorListeners("function arguments require an identifier and type"); 
						}
						break;
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						setState(365);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(355);
							match(COMMA);
							setState(356);
							((FunctionTypeContext)_localctx).id = identifier();
							setState(357);
							match(COLON);
							setState(358);
							((FunctionTypeContext)_localctx).t = type();
							 _localctx.ast.addArg(new Component(((FunctionTypeContext)_localctx).id.ast, ((FunctionTypeContext)_localctx).t.ast)); 
							}
							break;
						case 2:
							{
							setState(361);
							match(COMMA);
							setState(362);
							identifier();
							 notifyErrorListeners("function arguments require an identifier and type"); 
							}
							break;
						}
						}
						setState(369);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(372);
				match(RPAREN);
				setState(377);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(373);
					match(COLON);
					setState(374);
					((FunctionTypeContext)_localctx).t = type();
					 _localctx.ast.setType(((FunctionTypeContext)_localctx).t.ast); 
					}
					break;
				}
				}
				break;
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixpTypeContext extends ParserRuleContext {
		public FixPType ast;
		public int l;
		public int c;
		public Token t;
		public TerminalNode FIXP() { return getToken(BoaParser.FIXP, 0); }
		public FixpTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixpType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterFixpType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitFixpType(this);
		}
	}

	public final FixpTypeContext fixpType() throws RecognitionException {
		FixpTypeContext _localctx = new FixpTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fixpType);
		 ((FixpTypeContext)_localctx).l =  getStartLine(); ((FixpTypeContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			((FixpTypeContext)_localctx).t = match(FIXP);
			 ((FixpTypeContext)_localctx).ast =  new FixPType(); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisitorTypeContext extends ParserRuleContext {
		public VisitorType ast;
		public int l;
		public int c;
		public Token t;
		public TerminalNode VISITOR() { return getToken(BoaParser.VISITOR, 0); }
		public VisitorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visitorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterVisitorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitVisitorType(this);
		}
	}

	public final VisitorTypeContext visitorType() throws RecognitionException {
		VisitorTypeContext _localctx = new VisitorTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_visitorType);
		 ((VisitorTypeContext)_localctx).l =  getStartLine(); ((VisitorTypeContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			((VisitorTypeContext)_localctx).t = match(VISITOR);
			 ((VisitorTypeContext)_localctx).ast =  new VisitorType(); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraversalTypeContext extends ParserRuleContext {
		public TraversalType ast;
		public int l;
		public int c;
		public Token t;
		public TerminalNode TRAVERSAL() { return getToken(BoaParser.TRAVERSAL, 0); }
		public TraversalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traversalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterTraversalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitTraversalType(this);
		}
	}

	public final TraversalTypeContext traversalType() throws RecognitionException {
		TraversalTypeContext _localctx = new TraversalTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_traversalType);
		 ((TraversalTypeContext)_localctx).l =  getStartLine(); ((TraversalTypeContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			((TraversalTypeContext)_localctx).t = match(TRAVERSAL);
			 ((TraversalTypeContext)_localctx).ast =  new TraversalType(); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public BlockContext b;
		public AssignmentStatementContext as;
		public BreakStatementContext br;
		public ContinueStatementContext cnt;
		public StopStatementContext stp;
		public DoStatementContext ds;
		public ForStatementContext fors;
		public IfStatementContext ifs;
		public ReturnStatementContext ret;
		public SwitchStatementContext sw;
		public ForeachStatementContext each;
		public ExistsStatementContext exist;
		public IfallStatementContext all;
		public WhileStatementContext whiles;
		public EmptyStatementContext empty;
		public EmitStatementContext emit;
		public ExpressionStatementContext es;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public StopStatementContext stopStatement() {
			return getRuleContext(StopStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public ExistsStatementContext existsStatement() {
			return getRuleContext(ExistsStatementContext.class,0);
		}
		public IfallStatementContext ifallStatement() {
			return getRuleContext(IfallStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		try {
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				((StatementContext)_localctx).b = block();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).b.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				((StatementContext)_localctx).as = assignmentStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).as.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				((StatementContext)_localctx).br = breakStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).br.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				((StatementContext)_localctx).cnt = continueStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).cnt.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				((StatementContext)_localctx).stp = stopStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).stp.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(405);
				((StatementContext)_localctx).ds = doStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ds.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(408);
				((StatementContext)_localctx).fors = forStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).fors.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(411);
				((StatementContext)_localctx).ifs = ifStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ifs.ast; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(414);
				((StatementContext)_localctx).ret = returnStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).ret.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(417);
				((StatementContext)_localctx).sw = switchStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).sw.ast; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(420);
				((StatementContext)_localctx).each = foreachStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).each.ast; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(423);
				((StatementContext)_localctx).exist = existsStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).exist.ast; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(426);
				((StatementContext)_localctx).all = ifallStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).all.ast; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(429);
				((StatementContext)_localctx).whiles = whileStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).whiles.ast; 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(432);
				((StatementContext)_localctx).empty = emptyStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).empty.ast; 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(435);
				((StatementContext)_localctx).emit = emitStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).emit.ast; 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(438);
				((StatementContext)_localctx).es = expressionStatement();
				 ((StatementContext)_localctx).ast =  ((StatementContext)_localctx).es.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public Block ast;
		public int l;
		public int c;
		public TerminalNode SEMICOLON() { return getToken(BoaParser.SEMICOLON, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_emptyStatement);
		 ((EmptyStatementContext)_localctx).l =  getStartLine(); ((EmptyStatementContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(SEMICOLON);
			 ((EmptyStatementContext)_localctx).ast =  new Block(); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentStatement ast;
		public int l;
		public int c;
		public FactorContext f;
		public ExpressionContext e;
		public TerminalNode EQUALS() { return getToken(BoaParser.EQUALS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentStatement);
		 ((AssignmentStatementContext)_localctx).l =  getStartLine(); ((AssignmentStatementContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			((AssignmentStatementContext)_localctx).f = factor();
			setState(447);
			match(EQUALS);
			setState(448);
			((AssignmentStatementContext)_localctx).e = expression();
			 isSemicolon(); ((AssignmentStatementContext)_localctx).ast =  new AssignmentStatement(((AssignmentStatementContext)_localctx).f.ast, ((AssignmentStatementContext)_localctx).e.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Block ast;
		public int l;
		public int c;
		public ProgramStatementContext s;
		public TerminalNode LBRACE() { return getToken(BoaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BoaParser.RBRACE, 0); }
		public List<ProgramStatementContext> programStatement() {
			return getRuleContexts(ProgramStatementContext.class);
		}
		public ProgramStatementContext programStatement(int i) {
			return getRuleContext(ProgramStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_block);

				((BlockContext)_localctx).l =  getStartLine(); ((BlockContext)_localctx).c =  getStartColumn();
				((BlockContext)_localctx).ast =  new Block();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(LBRACE);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << IF) | (1L << DO) | (1L << MAP) | (1L << STACK) | (1L << SET) | (1L << FOR) | (1L << FOREACH) | (1L << IFALL) | (1L << EXISTS) | (1L << NOT) | (1L << TYPE) | (1L << ELSE) | (1L << CASE) | (1L << OUTPUT) | (1L << FORMAT) | (1L << WHILE) | (1L << BREAK) | (1L << ARRAY) | (1L << STATIC) | (1L << SWITCH) | (1L << RETURN) | (1L << WEIGHT) | (1L << DEFAULT) | (1L << CONTINUE) | (1L << FUNCTION) | (1L << FIXP) | (1L << VISITOR) | (1L << TRAVERSAL) | (1L << BEFORE) | (1L << AFTER) | (1L << STOP) | (1L << SEMICOLON) | (1L << LBRACE) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NEG - 64)) | (1L << (INV - 64)) | (1L << (DOLLAR - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (RegexLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (TimeLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				{
				setState(452);
				((BlockContext)_localctx).s = programStatement();
				 _localctx.ast.addStatement(((BlockContext)_localctx).s.ast); 
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
			match(RBRACE);
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public BreakStatement ast;
		public int l;
		public int c;
		public TerminalNode BREAK() { return getToken(BoaParser.BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_breakStatement);
		 ((BreakStatementContext)_localctx).l =  getStartLine(); ((BreakStatementContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(BREAK);
			 isSemicolon(); ((BreakStatementContext)_localctx).ast =  new BreakStatement(); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public ContinueStatement ast;
		public int l;
		public int c;
		public TerminalNode CONTINUE() { return getToken(BoaParser.CONTINUE, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_continueStatement);
		 ((ContinueStatementContext)_localctx).l =  getStartLine(); ((ContinueStatementContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(CONTINUE);
			 isSemicolon(); ((ContinueStatementContext)_localctx).ast =  new ContinueStatement(); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public DoStatement ast;
		public int l;
		public int c;
		public StatementContext s;
		public ExpressionContext e;
		public TerminalNode DO() { return getToken(BoaParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(BoaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(BoaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BoaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_doStatement);
		 ((DoStatementContext)_localctx).l =  getStartLine(); ((DoStatementContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(DO);
			setState(469);
			((DoStatementContext)_localctx).s = statement();
			setState(470);
			match(WHILE);
			setState(471);
			match(LPAREN);
			setState(472);
			((DoStatementContext)_localctx).e = expression();
			setState(473);
			match(RPAREN);
			 isSemicolon(); ((DoStatementContext)_localctx).ast =  new DoStatement(((DoStatementContext)_localctx).e.ast, ((DoStatementContext)_localctx).s.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmitStatementContext extends ParserRuleContext {
		public EmitStatement ast;
		public int l;
		public int c;
		public IdentifierContext id;
		public ExpressionContext e;
		public ExpressionContext w;
		public TerminalNode EMIT() { return getToken(BoaParser.EMIT, 0); }
		public TerminalNode WEIGHT() { return getToken(BoaParser.WEIGHT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(BoaParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(BoaParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(BoaParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(BoaParser.RBRACKET, i);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitEmitStatement(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_emitStatement);
		 ((EmitStatementContext)_localctx).l =  getStartLine(); ((EmitStatementContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			setState(516);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				((EmitStatementContext)_localctx).id = identifier();
				 ((EmitStatementContext)_localctx).ast =  new EmitStatement(((EmitStatementContext)_localctx).id.ast); 
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(478);
					match(LBRACKET);
					setState(479);
					((EmitStatementContext)_localctx).e = expression();
					setState(480);
					match(RBRACKET);
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(487);
				match(EMIT);
				 notifyErrorListeners("error: expected 'expression ' before keyword 'weight'"); 
				setState(489);
				match(WEIGHT);
				setState(490);
				((EmitStatementContext)_localctx).w = expression();
				 isSemicolon(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				((EmitStatementContext)_localctx).id = identifier();
				 ((EmitStatementContext)_localctx).ast =  new EmitStatement(((EmitStatementContext)_localctx).id.ast); 
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(495);
					match(LBRACKET);
					setState(496);
					((EmitStatementContext)_localctx).e = expression();
					setState(497);
					match(RBRACKET);
					 _localctx.ast.addIndice(((EmitStatementContext)_localctx).e.ast); 
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(505);
				match(EMIT);
				setState(506);
				((EmitStatementContext)_localctx).e = expression();
				 _localctx.ast.setValue(((EmitStatementContext)_localctx).e.ast); 
				setState(512);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(508);
					match(WEIGHT);
					setState(509);
					((EmitStatementContext)_localctx).w = expression();
					 _localctx.ast.setWeight(((EmitStatementContext)_localctx).w.ast); 
					}
					break;
				}
				 isSemicolon(); 
				}
				break;
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public ForStatement ast;
		public int l;
		public int c;
		public ForExpressionContext f;
		public ExpressionContext e;
		public ProgramStatementContext s;
		public TerminalNode FOR() { return getToken(BoaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(BoaParser.LPAREN, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(BoaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(BoaParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(BoaParser.RPAREN, 0); }
		public ProgramStatementContext programStatement() {
			return getRuleContext(ProgramStatementContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forStatement);

				((ForStatementContext)_localctx).l =  getStartLine(); ((ForStatementContext)_localctx).c =  getStartColumn();
				((ForStatementContext)_localctx).ast =  new ForStatement();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(FOR);
			setState(519);
			match(LPAREN);
			setState(523);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << IF) | (1L << DO) | (1L << MAP) | (1L << STACK) | (1L << SET) | (1L << FOR) | (1L << FOREACH) | (1L << IFALL) | (1L << EXISTS) | (1L << NOT) | (1L << TYPE) | (1L << ELSE) | (1L << CASE) | (1L << OUTPUT) | (1L << FORMAT) | (1L << WHILE) | (1L << BREAK) | (1L << ARRAY) | (1L << STATIC) | (1L << SWITCH) | (1L << RETURN) | (1L << WEIGHT) | (1L << DEFAULT) | (1L << CONTINUE) | (1L << FUNCTION) | (1L << FIXP) | (1L << VISITOR) | (1L << TRAVERSAL) | (1L << BEFORE) | (1L << AFTER) | (1L << STOP) | (1L << LBRACE) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NEG - 64)) | (1L << (INV - 64)) | (1L << (DOLLAR - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (RegexLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (TimeLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(520);
				((ForStatementContext)_localctx).f = forExpression();
				 _localctx.ast.setInit(((ForStatementContext)_localctx).f.ast); 
				}
			}

			setState(525);
			match(SEMICOLON);
			setState(529);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << IF) | (1L << DO) | (1L << MAP) | (1L << STACK) | (1L << SET) | (1L << FOR) | (1L << FOREACH) | (1L << IFALL) | (1L << EXISTS) | (1L << NOT) | (1L << TYPE) | (1L << ELSE) | (1L << CASE) | (1L << OUTPUT) | (1L << FORMAT) | (1L << WHILE) | (1L << BREAK) | (1L << ARRAY) | (1L << STATIC) | (1L << SWITCH) | (1L << RETURN) | (1L << WEIGHT) | (1L << DEFAULT) | (1L << CONTINUE) | (1L << FUNCTION) | (1L << FIXP) | (1L << VISITOR) | (1L << TRAVERSAL) | (1L << BEFORE) | (1L << AFTER) | (1L << STOP) | (1L << LBRACE) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NEG - 64)) | (1L << (INV - 64)) | (1L << (DOLLAR - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (RegexLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (TimeLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(526);
				((ForStatementContext)_localctx).e = expression();
				 _localctx.ast.setCondition(((ForStatementContext)_localctx).e.ast); 
				}
			}

			setState(531);
			match(SEMICOLON);
			setState(535);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << IF) | (1L << DO) | (1L << MAP) | (1L << STACK) | (1L << SET) | (1L << FOR) | (1L << FOREACH) | (1L << IFALL) | (1L << EXISTS) | (1L << NOT) | (1L << TYPE) | (1L << ELSE) | (1L << CASE) | (1L << OUTPUT) | (1L << FORMAT) | (1L << WHILE) | (1L << BREAK) | (1L << ARRAY) | (1L << STATIC) | (1L << SWITCH) | (1L << RETURN) | (1L << WEIGHT) | (1L << DEFAULT) | (1L << CONTINUE) | (1L << FUNCTION) | (1L << FIXP) | (1L << VISITOR) | (1L << TRAVERSAL) | (1L << BEFORE) | (1L << AFTER) | (1L << STOP) | (1L << LBRACE) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NEG - 64)) | (1L << (INV - 64)) | (1L << (DOLLAR - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (RegexLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (TimeLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(532);
				((ForStatementContext)_localctx).f = forExpression();
				 _localctx.ast.setUpdate(((ForStatementContext)_localctx).f.ast); 
				}
			}

			setState(537);
			match(RPAREN);
			setState(538);
			((ForStatementContext)_localctx).s = programStatement();
			 _localctx.ast.setBody(((ForStatementContext)_localctx).s.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public Statement ast;
		public ForVariableDeclarationContext v;
		public ForExpressionStatementContext e;
		public ForVariableDeclarationContext forVariableDeclaration() {
			return getRuleContext(ForVariableDeclarationContext.class,0);
		}
		public ForExpressionStatementContext forExpressionStatement() {
			return getRuleContext(ForExpressionStatementContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitForExpression(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forExpression);
		try {
			setState(547);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				((ForExpressionContext)_localctx).v = forVariableDeclaration();
				 ((ForExpressionContext)_localctx).ast =  ((ForExpressionContext)_localctx).v.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				((ForExpressionContext)_localctx).e = forExpressionStatement();
				 ((ForExpressionContext)_localctx).ast =  ((ForExpressionContext)_localctx).e.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForVariableDeclarationContext extends ParserRuleContext {
		public VarDeclStatement ast;
		public int l;
		public int c;
		public IdentifierContext id;
		public TypeContext t;
		public OutputTypeContext ot;
		public ExpressionContext e;
		public TerminalNode COLON() { return getToken(BoaParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(BoaParser.EQUALS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public OutputTypeContext outputType() {
			return getRuleContext(OutputTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterForVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitForVariableDeclaration(this);
		}
	}

	public final ForVariableDeclarationContext forVariableDeclaration() throws RecognitionException {
		ForVariableDeclarationContext _localctx = new ForVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forVariableDeclaration);
		 ((ForVariableDeclarationContext)_localctx).l =  getStartLine(); ((ForVariableDeclarationContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			((ForVariableDeclarationContext)_localctx).id = identifier();
			setState(550);
			match(COLON);
			 ((ForVariableDeclarationContext)_localctx).ast =  new VarDeclStatement(((ForVariableDeclarationContext)_localctx).id.ast); 
			setState(555);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(552);
				((ForVariableDeclarationContext)_localctx).t = type();
				 _localctx.ast.setType(((ForVariableDeclarationContext)_localctx).t.ast); 
				}
				break;
			}
			setState(567);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(557);
				match(EQUALS);
				setState(565);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					 notifyErrorListeners("error: output variable declarations should not include '='"); 
					setState(559);
					((ForVariableDeclarationContext)_localctx).ot = outputType();
					 _localctx.ast.setType(((ForVariableDeclarationContext)_localctx).ot.ast); 
					}
					break;
				case 2:
					{
					setState(562);
					((ForVariableDeclarationContext)_localctx).e = expression();
					 _localctx.ast.setInitializer(((ForVariableDeclarationContext)_localctx).e.ast); 
					}
					break;
				}
				}
				break;
			}
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionStatementContext extends ParserRuleContext {
		public Statement ast;
		public int l;
		public int c;
		public ExpressionContext e;
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCR() { return getToken(BoaParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(BoaParser.DECR, 0); }
		public ForExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterForExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitForExpressionStatement(this);
		}
	}

	public final ForExpressionStatementContext forExpressionStatement() throws RecognitionException {
		ForExpressionStatementContext _localctx = new ForExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forExpressionStatement);
		 ((ForExpressionStatementContext)_localctx).l =  getStartLine(); ((ForExpressionStatementContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			setState(576);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				((ForExpressionStatementContext)_localctx).e = expression();
				setState(570);
				((ForExpressionStatementContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCR || _la==DECR) ) {
					((ForExpressionStatementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				 ((ForExpressionStatementContext)_localctx).ast =  new PostfixStatement(((ForExpressionStatementContext)_localctx).e.ast, (((ForExpressionStatementContext)_localctx).op!=null?((ForExpressionStatementContext)_localctx).op.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				((ForExpressionStatementContext)_localctx).e = expression();
				 ((ForExpressionStatementContext)_localctx).ast =  new ExprStatement(((ForExpressionStatementContext)_localctx).e.ast); 
				}
				break;
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public Statement ast;
		public int l;
		public int c;
		public ForExpressionStatementContext e;
		public ForExpressionStatementContext forExpressionStatement() {
			return getRuleContext(ForExpressionStatementContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressionStatement);
		 ((ExpressionStatementContext)_localctx).l =  getStartLine(); ((ExpressionStatementContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			((ExpressionStatementContext)_localctx).e = forExpressionStatement();
			 isSemicolon(); ((ExpressionStatementContext)_localctx).ast =  ((ExpressionStatementContext)_localctx).e.ast; 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatement ast;
		public int l;
		public int c;
		public ExpressionContext e;
		public ProgramStatementContext s;
		public ProgramStatementContext els;
		public TerminalNode IF() { return getToken(BoaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(BoaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BoaParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ProgramStatementContext> programStatement() {
			return getRuleContexts(ProgramStatementContext.class);
		}
		public ProgramStatementContext programStatement(int i) {
			return getRuleContext(ProgramStatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BoaParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifStatement);
		 ((IfStatementContext)_localctx).l =  getStartLine(); ((IfStatementContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(IF);
			setState(582);
			match(LPAREN);
			setState(583);
			((IfStatementContext)_localctx).e = expression();
			setState(584);
			match(RPAREN);
			setState(585);
			((IfStatementContext)_localctx).s = programStatement();
			 ((IfStatementContext)_localctx).ast =  new IfStatement(((IfStatementContext)_localctx).e.ast, ((IfStatementContext)_localctx).s.ast); 
			setState(591);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(587);
				match(ELSE);
				setState(588);
				((IfStatementContext)_localctx).els = programStatement();
				 _localctx.ast.setElse(((IfStatementContext)_localctx).els.ast); 
				}
				break;
			}
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatement ast;
		public int l;
		public int c;
		public ExpressionContext e;
		public TerminalNode RETURN() { return getToken(BoaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_returnStatement);
		 ((ReturnStatementContext)_localctx).l =  getStartLine(); ((ReturnStatementContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(RETURN);
			 ((ReturnStatementContext)_localctx).ast =  new ReturnStatement(); 
			setState(598);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(595);
				((ReturnStatementContext)_localctx).e = expression();
				 _localctx.ast.setExpr(((ReturnStatementContext)_localctx).e.ast); 
				}
				break;
			}
			 isSemicolon(); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchStatement ast;
		public Block b;
		public int l;
		public int c;
		public ExpressionContext e;
		public SwitchCaseContext sc;
		public ProgramStatementContext s;
		public TerminalNode SWITCH() { return getToken(BoaParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(BoaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BoaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(BoaParser.LBRACE, 0); }
		public TerminalNode DEFAULT() { return getToken(BoaParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(BoaParser.COLON, 0); }
		public TerminalNode RBRACE() { return getToken(BoaParser.RBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public List<ProgramStatementContext> programStatement() {
			return getRuleContexts(ProgramStatementContext.class);
		}
		public ProgramStatementContext programStatement(int i) {
			return getRuleContext(ProgramStatementContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_switchStatement);
		 ((SwitchStatementContext)_localctx).b =  new Block(); ((SwitchStatementContext)_localctx).l =  getStartLine(); ((SwitchStatementContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(SWITCH);
			setState(603);
			match(LPAREN);
			setState(604);
			((SwitchStatementContext)_localctx).e = expression();
			setState(605);
			match(RPAREN);
			 ((SwitchStatementContext)_localctx).ast =  new SwitchStatement(((SwitchStatementContext)_localctx).e.ast); 
			setState(607);
			match(LBRACE);
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(608);
				((SwitchStatementContext)_localctx).sc = switchCase();
				 _localctx.ast.addCase(((SwitchStatementContext)_localctx).sc.ast); 
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(616);
			match(DEFAULT);
			setState(617);
			match(COLON);
			setState(621); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(618);
				((SwitchStatementContext)_localctx).s = programStatement();
				 _localctx.b.addStatement(((SwitchStatementContext)_localctx).s.ast); 
				}
				}
				setState(623); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << IF) | (1L << DO) | (1L << MAP) | (1L << STACK) | (1L << SET) | (1L << FOR) | (1L << FOREACH) | (1L << IFALL) | (1L << EXISTS) | (1L << NOT) | (1L << TYPE) | (1L << ELSE) | (1L << CASE) | (1L << OUTPUT) | (1L << FORMAT) | (1L << WHILE) | (1L << BREAK) | (1L << ARRAY) | (1L << STATIC) | (1L << SWITCH) | (1L << RETURN) | (1L << WEIGHT) | (1L << DEFAULT) | (1L << CONTINUE) | (1L << FUNCTION) | (1L << FIXP) | (1L << VISITOR) | (1L << TRAVERSAL) | (1L << BEFORE) | (1L << AFTER) | (1L << STOP) | (1L << SEMICOLON) | (1L << LBRACE) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NEG - 64)) | (1L << (INV - 64)) | (1L << (DOLLAR - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (RegexLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (TimeLiteral - 64)) | (1L << (Identifier - 64)))) != 0) );
			setState(625);
			match(RBRACE);
			 _localctx.ast.setDefault(new SwitchCase(true, _localctx.b)); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseContext extends ParserRuleContext {
		public SwitchCase ast;
		public Block b;
		public int l;
		public int c;
		public ExpressionListContext el;
		public ProgramStatementContext s;
		public TerminalNode CASE() { return getToken(BoaParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(BoaParser.COLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<ProgramStatementContext> programStatement() {
			return getRuleContexts(ProgramStatementContext.class);
		}
		public ProgramStatementContext programStatement(int i) {
			return getRuleContext(ProgramStatementContext.class,i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitSwitchCase(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_switchCase);
		 ((SwitchCaseContext)_localctx).b =  new Block(); ((SwitchCaseContext)_localctx).l =  getStartLine(); ((SwitchCaseContext)_localctx).c =  getStartColumn(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(CASE);
			setState(629);
			((SwitchCaseContext)_localctx).el = expressionList();
			 ((SwitchCaseContext)_localctx).ast =  new SwitchCase(false, _localctx.b, ((SwitchCaseContext)_localctx).el.list); 
			setState(631);
			match(COLON);
			setState(635); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(632);
					((SwitchCaseContext)_localctx).s = programStatement();
					 _localctx.b.addStatement(((SwitchCaseContext)_localctx).s.ast); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(637); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public ForeachStatement ast;
		public int l;
		public int c;
		public IdentifierContext id;
		public TypeContext t;
		public ExpressionContext e;
		public ProgramStatementContext s;
		public TerminalNode FOREACH() { return getToken(BoaParser.FOREACH, 0); }
		public TerminalNode LPAREN() { return getToken(BoaParser.LPAREN, 0); }
		public TerminalNode COLON() { return getToken(BoaParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(BoaParser.SEMICOLON, 0); }
		public TerminalNode RPAREN() { return getToken(BoaParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProgramStatementContext programStatement() {
			return getRuleContext(ProgramStatementContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(BoaParser.EQUALS, 0); }
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitForeachStatement(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_foreachStatement);
		 ((ForeachStatementContext)_localctx).l =  getStartLine(); ((ForeachStatementContext)_localctx).c =  getStartColumn(); 
		try {
			setState(661);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(FOREACH);
				setState(640);
				match(LPAREN);
				setState(641);
				((ForeachStatementContext)_localctx).id = identifier();
				setState(642);
				match(COLON);
				setState(643);
				((ForeachStatementContext)_localctx).t = type();
				setState(644);
				match(SEMICOLON);
				setState(645);
				((ForeachStatementContext)_localctx).e = expression();
				setState(646);
				match(RPAREN);
				setState(647);
				((ForeachStatementContext)_localctx).s = programStatement();
				 ((ForeachStatementContext)_localctx).ast =  new ForeachStatement(new Component(((ForeachStatementContext)_localctx).id.ast, ((ForeachStatementContext)_localctx).t.ast), ((ForeachStatementContext)_localctx).e.ast, ((ForeachStatementContext)_localctx).s.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(FOREACH);
				setState(651);
				match(LPAREN);
				setState(652);
				((ForeachStatementContext)_localctx).id = identifier();
				setState(653);
				match(COLON);
				setState(654);
				((ForeachStatementContext)_localctx).t = type();
				setState(655);
				match(EQUALS);
				setState(656);
				((ForeachStatementContext)_localctx).e = expression();
				setState(657);
				match(RPAREN);
				setState(658);
				((ForeachStatementContext)_localctx).s = programStatement();
				 ((ForeachStatementContext)_localctx).ast =  new ForeachStatement(new Component(((ForeachStatementContext)_localctx).id.ast, ((ForeachStatementContext)_localctx).t.ast), ((ForeachStatementContext)_localctx).e.ast, ((ForeachStatementContext)_localctx).s.ast); _localctx.ast.setIsEnhancedForEach(true);
				}
				break;
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistsStatementContext extends ParserRuleContext {
		public ExistsStatement ast;
		public int l;
		public int c;
		public IdentifierContext id;
		public TypeContext t;
		public ExpressionContext e;
		public ProgramStatementContext s;
		public TerminalNode EXISTS() { return getToken(BoaParser.EXISTS, 0); }
		public TerminalNode LPAREN() { return getToken(BoaParser.LPAREN, 0); }
		public TerminalNode COLON() { return getToken(BoaParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(BoaParser.SEMICOLON, 0); }
		public TerminalNode RPAREN() { return getToken(BoaParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProgramStatementContext programStatement() {
			return getRuleContext(ProgramStatementContext.class,0);
		}
		public ExistsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterExistsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitExistsStatement(this);
		}
	}

	public final ExistsStatementContext existsStatement() throws RecognitionException {
		ExistsStatementContext _localctx = new ExistsStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_existsStatement);
		 ((ExistsStatementContext)_localctx).l =  getStartLine(); ((ExistsStatementContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(EXISTS);
			setState(664);
			match(LPAREN);
			setState(665);
			((ExistsStatementContext)_localctx).id = identifier();
			setState(666);
			match(COLON);
			setState(667);
			((ExistsStatementContext)_localctx).t = type();
			setState(668);
			match(SEMICOLON);
			setState(669);
			((ExistsStatementContext)_localctx).e = expression();
			setState(670);
			match(RPAREN);
			setState(671);
			((ExistsStatementContext)_localctx).s = programStatement();
			 ((ExistsStatementContext)_localctx).ast =  new ExistsStatement(new Component(((ExistsStatementContext)_localctx).id.ast, ((ExistsStatementContext)_localctx).t.ast), ((ExistsStatementContext)_localctx).e.ast, ((ExistsStatementContext)_localctx).s.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfallStatementContext extends ParserRuleContext {
		public IfAllStatement ast;
		public int l;
		public int c;
		public IdentifierContext id;
		public TypeContext t;
		public ExpressionContext e;
		public ProgramStatementContext s;
		public TerminalNode IFALL() { return getToken(BoaParser.IFALL, 0); }
		public TerminalNode LPAREN() { return getToken(BoaParser.LPAREN, 0); }
		public TerminalNode COLON() { return getToken(BoaParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(BoaParser.SEMICOLON, 0); }
		public TerminalNode RPAREN() { return getToken(BoaParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProgramStatementContext programStatement() {
			return getRuleContext(ProgramStatementContext.class,0);
		}
		public IfallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterIfallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitIfallStatement(this);
		}
	}

	public final IfallStatementContext ifallStatement() throws RecognitionException {
		IfallStatementContext _localctx = new IfallStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ifallStatement);
		 ((IfallStatementContext)_localctx).l =  getStartLine(); ((IfallStatementContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(IFALL);
			setState(675);
			match(LPAREN);
			setState(676);
			((IfallStatementContext)_localctx).id = identifier();
			setState(677);
			match(COLON);
			setState(678);
			((IfallStatementContext)_localctx).t = type();
			setState(679);
			match(SEMICOLON);
			setState(680);
			((IfallStatementContext)_localctx).e = expression();
			setState(681);
			match(RPAREN);
			setState(682);
			((IfallStatementContext)_localctx).s = programStatement();
			 ((IfallStatementContext)_localctx).ast =  new IfAllStatement(new Component(((IfallStatementContext)_localctx).id.ast, ((IfallStatementContext)_localctx).t.ast), ((IfallStatementContext)_localctx).e.ast, ((IfallStatementContext)_localctx).s.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatement ast;
		public int l;
		public int c;
		public ExpressionContext e;
		public ProgramStatementContext s;
		public TerminalNode WHILE() { return getToken(BoaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(BoaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BoaParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProgramStatementContext programStatement() {
			return getRuleContext(ProgramStatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_whileStatement);
		 ((WhileStatementContext)_localctx).l =  getStartLine(); ((WhileStatementContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(WHILE);
			setState(686);
			match(LPAREN);
			setState(687);
			((WhileStatementContext)_localctx).e = expression();
			setState(688);
			match(RPAREN);
			setState(689);
			((WhileStatementContext)_localctx).s = programStatement();
			 ((WhileStatementContext)_localctx).ast =  new WhileStatement(((WhileStatementContext)_localctx).e.ast, ((WhileStatementContext)_localctx).s.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisitStatementContext extends ParserRuleContext {
		public VisitStatement ast;
		public int l;
		public int c;
		public Token b;
		public IdentifierContext id;
		public IdentifierContext t;
		public ProgramStatementContext s;
		public TerminalNode RIGHT_ARROW() { return getToken(BoaParser.RIGHT_ARROW, 0); }
		public TerminalNode AFTER() { return getToken(BoaParser.AFTER, 0); }
		public TerminalNode WILDCARD() { return getToken(BoaParser.WILDCARD, 0); }
		public TerminalNode COLON() { return getToken(BoaParser.COLON, 0); }
		public TerminalNode BEFORE() { return getToken(BoaParser.BEFORE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ProgramStatementContext programStatement() {
			return getRuleContext(ProgramStatementContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BoaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BoaParser.COMMA, i);
		}
		public VisitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterVisitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitVisitStatement(this);
		}
	}

	public final VisitStatementContext visitStatement() throws RecognitionException {
		VisitStatementContext _localctx = new VisitStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_visitStatement);
		 ((VisitStatementContext)_localctx).l =  getStartLine(); ((VisitStatementContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(692);
				((VisitStatementContext)_localctx).b = match(BEFORE);
				}
				break;
			case 2:
				{
				setState(693);
				match(AFTER);
				}
				break;
			case 3:
				{
				 notifyErrorListeners("error: visit statements must start with 'before' or 'after'"); 
				}
				break;
			}
			 ((VisitStatementContext)_localctx).ast =  new VisitStatement(((VisitStatementContext)_localctx).b != null); 
			setState(716);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(698);
				match(WILDCARD);
				 _localctx.ast.setWildcard(true); 
				}
				break;
			case 2:
				{
				setState(700);
				((VisitStatementContext)_localctx).id = identifier();
				setState(701);
				match(COLON);
				setState(702);
				((VisitStatementContext)_localctx).t = identifier();
				 _localctx.ast.setComponent(new Component(((VisitStatementContext)_localctx).id.ast, ((VisitStatementContext)_localctx).t.ast)); 
				}
				break;
			case 3:
				{
				setState(705);
				((VisitStatementContext)_localctx).id = identifier();
				 _localctx.ast.addId(((VisitStatementContext)_localctx).id.ast); 
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(707);
					match(COMMA);
					setState(708);
					((VisitStatementContext)_localctx).id = identifier();
					 _localctx.ast.addId(((VisitStatementContext)_localctx).id.ast); 
					}
					}
					setState(715);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(718);
			match(RIGHT_ARROW);
			{
			setState(719);
			((VisitStatementContext)_localctx).s = programStatement();
			 _localctx.ast.setBody(((VisitStatementContext)_localctx).s.ast); 
			}
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraverseStatementContext extends ParserRuleContext {
		public TraverseStatement ast;
		public int l;
		public int c;
		public IdentifierContext id;
		public IdentifierContext t;
		public TypeContext rt;
		public ProgramStatementContext s;
		public TerminalNode LPAREN() { return getToken(BoaParser.LPAREN, 0); }
		public List<TerminalNode> COLON() { return getTokens(BoaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(BoaParser.COLON, i);
		}
		public TerminalNode RPAREN() { return getToken(BoaParser.RPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ProgramStatementContext programStatement() {
			return getRuleContext(ProgramStatementContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TraverseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traverseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterTraverseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitTraverseStatement(this);
		}
	}

	public final TraverseStatementContext traverseStatement() throws RecognitionException {
		TraverseStatementContext _localctx = new TraverseStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_traverseStatement);
		 ((TraverseStatementContext)_localctx).l =  getStartLine(); ((TraverseStatementContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(722);
			match(LPAREN);
			setState(723);
			((TraverseStatementContext)_localctx).id = identifier();
			setState(724);
			match(COLON);
			setState(725);
			((TraverseStatementContext)_localctx).t = identifier();
			setState(726);
			match(RPAREN);
			 ((TraverseStatementContext)_localctx).ast =  new TraverseStatement(true,false); _localctx.ast.setComponent(new Component(((TraverseStatementContext)_localctx).id.ast, ((TraverseStatementContext)_localctx).t.ast));
			setState(732);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(728);
				match(COLON);
				setState(729);
				((TraverseStatementContext)_localctx).rt = type();
				_localctx.ast.setReturnType(((TraverseStatementContext)_localctx).rt.ast);
				}
			}

			{
			setState(734);
			((TraverseStatementContext)_localctx).s = programStatement();
			 _localctx.ast.setBody(((TraverseStatementContext)_localctx).s.ast); 
			}
			}
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixpStatementContext extends ParserRuleContext {
		public FixPStatement ast;
		public int l;
		public int c;
		public IdentifierContext id1;
		public IdentifierContext id2;
		public IdentifierContext t;
		public TypeContext rt;
		public ProgramStatementContext s;
		public TerminalNode LPAREN() { return getToken(BoaParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(BoaParser.COMMA, 0); }
		public List<TerminalNode> COLON() { return getTokens(BoaParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(BoaParser.COLON, i);
		}
		public TerminalNode RPAREN() { return getToken(BoaParser.RPAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ProgramStatementContext programStatement() {
			return getRuleContext(ProgramStatementContext.class,0);
		}
		public FixpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterFixpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitFixpStatement(this);
		}
	}

	public final FixpStatementContext fixpStatement() throws RecognitionException {
		FixpStatementContext _localctx = new FixpStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fixpStatement);
		 ((FixpStatementContext)_localctx).l =  getStartLine(); ((FixpStatementContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(737);
			match(LPAREN);
			setState(738);
			((FixpStatementContext)_localctx).id1 = identifier();
			setState(739);
			match(COMMA);
			setState(740);
			((FixpStatementContext)_localctx).id2 = identifier();
			setState(741);
			match(COLON);
			setState(742);
			((FixpStatementContext)_localctx).t = identifier();
			setState(743);
			match(RPAREN);
			 ((FixpStatementContext)_localctx).ast =  new FixPStatement(); _localctx.ast.setParam1(new Component(((FixpStatementContext)_localctx).id1.ast, ((FixpStatementContext)_localctx).t.ast));_localctx.ast.setParam2(new Component(((FixpStatementContext)_localctx).id2.ast, ((FixpStatementContext)_localctx).t.ast));
			{
			setState(745);
			match(COLON);
			setState(746);
			((FixpStatementContext)_localctx).rt = type();
			_localctx.ast.setReturnType(((FixpStatementContext)_localctx).rt.ast);
			}
			{
			setState(749);
			((FixpStatementContext)_localctx).s = programStatement();
			 _localctx.ast.setBody(((FixpStatementContext)_localctx).s.ast); 
			}
			}
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StopStatementContext extends ParserRuleContext {
		public StopStatement ast;
		public int l;
		public int c;
		public TerminalNode STOP() { return getToken(BoaParser.STOP, 0); }
		public StopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterStopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitStopStatement(this);
		}
	}

	public final StopStatementContext stopStatement() throws RecognitionException {
		StopStatementContext _localctx = new StopStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_stopStatement);
		 ((StopStatementContext)_localctx).l =  getStartLine(); ((StopStatementContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(STOP);
			 isSemicolon(); ((StopStatementContext)_localctx).ast =  new StopStatement(); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public int l;
		public int c;
		public ConjunctionContext j;
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<TerminalNode> TWOOR() { return getTokens(BoaParser.TWOOR); }
		public TerminalNode TWOOR(int i) {
			return getToken(BoaParser.TWOOR, i);
		}
		public List<TerminalNode> OR() { return getTokens(BoaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(BoaParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expression);
		 ((ExpressionContext)_localctx).l =  getStartLine(); ((ExpressionContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			((ExpressionContext)_localctx).j = conjunction();
			 ((ExpressionContext)_localctx).ast =  new Expression(((ExpressionContext)_localctx).j.ast); 
			setState(763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(757);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==TWOOR) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(758);
					((ExpressionContext)_localctx).j = conjunction();
					 _localctx.ast.addRhs(((ExpressionContext)_localctx).j.ast); 
					}
					} 
				}
				setState(765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public ArrayList<Expression> list;
		public ExpressionContext e;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BoaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BoaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expressionList);
		 ((ExpressionListContext)_localctx).list =  new ArrayList<Expression>(); 
		int _la;
		try {
			setState(792);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				((ExpressionListContext)_localctx).e = expression();
				 _localctx.list.add(((ExpressionListContext)_localctx).e.ast); 
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(768);
					match(COMMA);
					setState(769);
					((ExpressionListContext)_localctx).e = expression();
					 _localctx.list.add(((ExpressionListContext)_localctx).e.ast); 
					}
					}
					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(777);
				((ExpressionListContext)_localctx).e = expression();
				 _localctx.list.add(((ExpressionListContext)_localctx).e.ast); 
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << IF) | (1L << DO) | (1L << MAP) | (1L << STACK) | (1L << SET) | (1L << FOR) | (1L << FOREACH) | (1L << IFALL) | (1L << EXISTS) | (1L << NOT) | (1L << TYPE) | (1L << ELSE) | (1L << CASE) | (1L << OUTPUT) | (1L << FORMAT) | (1L << WHILE) | (1L << BREAK) | (1L << ARRAY) | (1L << STATIC) | (1L << SWITCH) | (1L << RETURN) | (1L << WEIGHT) | (1L << DEFAULT) | (1L << CONTINUE) | (1L << FUNCTION) | (1L << FIXP) | (1L << VISITOR) | (1L << TRAVERSAL) | (1L << BEFORE) | (1L << AFTER) | (1L << STOP) | (1L << COMMA) | (1L << LBRACE) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NEG - 64)) | (1L << (INV - 64)) | (1L << (DOLLAR - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (RegexLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (TimeLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(787);
					switch (_input.LA(1)) {
					case OF:
					case IF:
					case DO:
					case MAP:
					case STACK:
					case SET:
					case FOR:
					case FOREACH:
					case IFALL:
					case EXISTS:
					case NOT:
					case TYPE:
					case ELSE:
					case CASE:
					case OUTPUT:
					case FORMAT:
					case WHILE:
					case BREAK:
					case ARRAY:
					case STATIC:
					case SWITCH:
					case RETURN:
					case WEIGHT:
					case DEFAULT:
					case CONTINUE:
					case FUNCTION:
					case FIXP:
					case VISITOR:
					case TRAVERSAL:
					case BEFORE:
					case AFTER:
					case STOP:
					case LBRACE:
					case LPAREN:
					case PLUS:
					case MINUS:
					case NEG:
					case INV:
					case DOLLAR:
					case IntegerLiteral:
					case FloatingPointLiteral:
					case CharacterLiteral:
					case RegexLiteral:
					case StringLiteral:
					case TimeLiteral:
					case Identifier:
						{
						 notifyErrorListeners("error: ',' expected"); 
						setState(780);
						((ExpressionListContext)_localctx).e = expression();
						 _localctx.list.add(((ExpressionListContext)_localctx).e.ast); 
						}
						break;
					case COMMA:
						{
						setState(783);
						match(COMMA);
						setState(784);
						((ExpressionListContext)_localctx).e = expression();
						 _localctx.list.add(((ExpressionListContext)_localctx).e.ast); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(791);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionContext extends ParserRuleContext {
		public Conjunction ast;
		public int l;
		public int c;
		public ComparisonContext m;
		public Token op;
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> TWOAND() { return getTokens(BoaParser.TWOAND); }
		public TerminalNode TWOAND(int i) {
			return getToken(BoaParser.TWOAND, i);
		}
		public List<TerminalNode> AND() { return getTokens(BoaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(BoaParser.AND, i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitConjunction(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_conjunction);
		 ((ConjunctionContext)_localctx).l =  getStartLine(); ((ConjunctionContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			((ConjunctionContext)_localctx).m = comparison();
			 ((ConjunctionContext)_localctx).ast =  new Conjunction(((ConjunctionContext)_localctx).m.ast); 
			setState(803);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(796);
					((ConjunctionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==TWOAND) ) {
						((ConjunctionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					 _localctx.ast.addOp((((ConjunctionContext)_localctx).op!=null?((ConjunctionContext)_localctx).op.getText():null)); 
					setState(798);
					((ConjunctionContext)_localctx).m = comparison();
					 _localctx.ast.addRhs(((ConjunctionContext)_localctx).m.ast); 
					}
					} 
				}
				setState(805);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public Comparison ast;
		public int l;
		public int c;
		public SimpleExpressionContext e;
		public Token op;
		public SimpleExpressionContext e2;
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode EQEQ() { return getToken(BoaParser.EQEQ, 0); }
		public TerminalNode NEQ() { return getToken(BoaParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(BoaParser.LT, 0); }
		public TerminalNode LTEQ() { return getToken(BoaParser.LTEQ, 0); }
		public TerminalNode GT() { return getToken(BoaParser.GT, 0); }
		public TerminalNode GTEQ() { return getToken(BoaParser.GTEQ, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_comparison);
		 ((ComparisonContext)_localctx).l =  getStartLine(); ((ComparisonContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			setState(814);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				((ComparisonContext)_localctx).e = simpleExpression();
				setState(807);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQEQ) | (1L << NEQ) | (1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ))) != 0)) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(808);
				((ComparisonContext)_localctx).e2 = simpleExpression();
				 ((ComparisonContext)_localctx).ast =  new Comparison(((ComparisonContext)_localctx).e.ast, (((ComparisonContext)_localctx).op!=null?((ComparisonContext)_localctx).op.getText():null), ((ComparisonContext)_localctx).e2.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				((ComparisonContext)_localctx).e = simpleExpression();
				 ((ComparisonContext)_localctx).ast =  new Comparison(((ComparisonContext)_localctx).e.ast); 
				}
				break;
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public SimpleExpr ast;
		public int l;
		public int c;
		public TermContext t;
		public Token op;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(BoaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BoaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(BoaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(BoaParser.MINUS, i);
		}
		public List<TerminalNode> ONEOR() { return getTokens(BoaParser.ONEOR); }
		public TerminalNode ONEOR(int i) {
			return getToken(BoaParser.ONEOR, i);
		}
		public List<TerminalNode> XOR() { return getTokens(BoaParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(BoaParser.XOR, i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_simpleExpression);
		 ((SimpleExpressionContext)_localctx).l =  getStartLine(); ((SimpleExpressionContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			((SimpleExpressionContext)_localctx).t = term();
			 ((SimpleExpressionContext)_localctx).ast =  new SimpleExpr(((SimpleExpressionContext)_localctx).t.ast); 
			setState(825);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(818);
					((SimpleExpressionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ONEOR) | (1L << PLUS) | (1L << MINUS) | (1L << XOR))) != 0)) ) {
						((SimpleExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					 _localctx.ast.addOp((((SimpleExpressionContext)_localctx).op!=null?((SimpleExpressionContext)_localctx).op.getText():null)); 
					setState(820);
					((SimpleExpressionContext)_localctx).t = term();
					 _localctx.ast.addRhs(((SimpleExpressionContext)_localctx).t.ast); 
					}
					} 
				}
				setState(827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Term ast;
		public int l;
		public int c;
		public FactorContext f;
		public Token op;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(BoaParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(BoaParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(BoaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(BoaParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(BoaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(BoaParser.MOD, i);
		}
		public List<TerminalNode> EMIT() { return getTokens(BoaParser.EMIT); }
		public TerminalNode EMIT(int i) {
			return getToken(BoaParser.EMIT, i);
		}
		public List<TerminalNode> RSHIFT() { return getTokens(BoaParser.RSHIFT); }
		public TerminalNode RSHIFT(int i) {
			return getToken(BoaParser.RSHIFT, i);
		}
		public List<TerminalNode> ONEAND() { return getTokens(BoaParser.ONEAND); }
		public TerminalNode ONEAND(int i) {
			return getToken(BoaParser.ONEAND, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_term);
		 ((TermContext)_localctx).l =  getStartLine(); ((TermContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			((TermContext)_localctx).f = factor();
			 ((TermContext)_localctx).ast =  new Term(((TermContext)_localctx).f.ast); 
			setState(837);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(830);
					((TermContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (ONEAND - 47)) | (1L << (STAR - 47)) | (1L << (DIV - 47)) | (1L << (MOD - 47)) | (1L << (RSHIFT - 47)) | (1L << (EMIT - 47)))) != 0)) ) {
						((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					 _localctx.ast.addOp((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getText():null)); 
					setState(832);
					((TermContext)_localctx).f = factor();
					 _localctx.ast.addRhs(((TermContext)_localctx).f.ast); 
					}
					} 
				}
				setState(839);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Factor ast;
		public int l;
		public int c;
		public OperandContext op;
		public SelectorContext s;
		public IndexContext i;
		public CallContext m;
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_factor);
		 ((FactorContext)_localctx).l =  getStartLine(); ((FactorContext)_localctx).c =  getStartColumn(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			((FactorContext)_localctx).op = operand();
			 ((FactorContext)_localctx).ast =  new Factor(((FactorContext)_localctx).op.ast); 
			setState(853);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(851);
					switch (_input.LA(1)) {
					case DOT:
						{
						setState(842);
						((FactorContext)_localctx).s = selector();
						 _localctx.ast.addOp(((FactorContext)_localctx).s.ast); 
						}
						break;
					case LBRACKET:
						{
						setState(845);
						((FactorContext)_localctx).i = index();
						 _localctx.ast.addOp(((FactorContext)_localctx).i.ast); 
						}
						break;
					case LPAREN:
						{
						setState(848);
						((FactorContext)_localctx).m = call();
						 _localctx.ast.addOp(((FactorContext)_localctx).m.ast); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(855);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public Selector ast;
		public int l;
		public int c;
		public IdentifierContext id;
		public TerminalNode DOT() { return getToken(BoaParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_selector);
		 ((SelectorContext)_localctx).l =  getStartLine(); ((SelectorContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(DOT);
			setState(857);
			((SelectorContext)_localctx).id = identifier();
			 ((SelectorContext)_localctx).ast =  new Selector(((SelectorContext)_localctx).id.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public Index ast;
		public int l;
		public int c;
		public ExpressionContext s;
		public ExpressionContext end;
		public TerminalNode LBRACKET() { return getToken(BoaParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BoaParser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(BoaParser.COLON, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_index);
		 ((IndexContext)_localctx).l =  getStartLine(); ((IndexContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(LBRACKET);
			setState(861);
			((IndexContext)_localctx).s = expression();
			 ((IndexContext)_localctx).ast =  new Index(((IndexContext)_localctx).s.ast); 
			setState(867);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(863);
				match(COLON);
				setState(864);
				((IndexContext)_localctx).end = expression();
				 _localctx.ast.setEnd(((IndexContext)_localctx).end.ast); 
				}
			}

			setState(869);
			match(RBRACKET);
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public Call ast;
		public int l;
		public int c;
		public ExpressionListContext el;
		public TerminalNode LPAREN() { return getToken(BoaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BoaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_call);
		 ((CallContext)_localctx).l =  getStartLine(); ((CallContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(LPAREN);
			 ((CallContext)_localctx).ast =  new Call(); 
			setState(876);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << IF) | (1L << DO) | (1L << MAP) | (1L << STACK) | (1L << SET) | (1L << FOR) | (1L << FOREACH) | (1L << IFALL) | (1L << EXISTS) | (1L << NOT) | (1L << TYPE) | (1L << ELSE) | (1L << CASE) | (1L << OUTPUT) | (1L << FORMAT) | (1L << WHILE) | (1L << BREAK) | (1L << ARRAY) | (1L << STATIC) | (1L << SWITCH) | (1L << RETURN) | (1L << WEIGHT) | (1L << DEFAULT) | (1L << CONTINUE) | (1L << FUNCTION) | (1L << FIXP) | (1L << VISITOR) | (1L << TRAVERSAL) | (1L << BEFORE) | (1L << AFTER) | (1L << STOP) | (1L << LBRACE) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NEG - 64)) | (1L << (INV - 64)) | (1L << (DOLLAR - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (RegexLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (TimeLiteral - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(873);
				((CallContext)_localctx).el = expressionList();
				 _localctx.ast.setArgs(((CallContext)_localctx).el.list); 
				}
			}

			setState(878);
			match(RPAREN);
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public Operand ast;
		public StringLiteralContext s;
		public CharacterLiteralContext c;
		public TimeLiteralContext t;
		public IntegerLiteralContext i;
		public FloatingPointLiteralContext fp;
		public CompositeContext comp;
		public FunctionExpressionContext fe;
		public FixpExpressionContext fixpe;
		public VisitorExpressionContext v;
		public TraversalExpressionContext tr;
		public UnaryFactorContext uf;
		public ParenExpressionContext pe;
		public IdentifierContext id;
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public CharacterLiteralContext characterLiteral() {
			return getRuleContext(CharacterLiteralContext.class,0);
		}
		public TimeLiteralContext timeLiteral() {
			return getRuleContext(TimeLiteralContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatingPointLiteralContext floatingPointLiteral() {
			return getRuleContext(FloatingPointLiteralContext.class,0);
		}
		public CompositeContext composite() {
			return getRuleContext(CompositeContext.class,0);
		}
		public FunctionExpressionContext functionExpression() {
			return getRuleContext(FunctionExpressionContext.class,0);
		}
		public FixpExpressionContext fixpExpression() {
			return getRuleContext(FixpExpressionContext.class,0);
		}
		public VisitorExpressionContext visitorExpression() {
			return getRuleContext(VisitorExpressionContext.class,0);
		}
		public TraversalExpressionContext traversalExpression() {
			return getRuleContext(TraversalExpressionContext.class,0);
		}
		public UnaryFactorContext unaryFactor() {
			return getRuleContext(UnaryFactorContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(BoaParser.DOLLAR, 0); }
		public ParenExpressionContext parenExpression() {
			return getRuleContext(ParenExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_operand);
		try {
			setState(920);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				((OperandContext)_localctx).s = stringLiteral();
				 ((OperandContext)_localctx).ast =  ((OperandContext)_localctx).s.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				((OperandContext)_localctx).c = characterLiteral();
				 ((OperandContext)_localctx).ast =  ((OperandContext)_localctx).c.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(886);
				((OperandContext)_localctx).t = timeLiteral();
				 ((OperandContext)_localctx).ast =  ((OperandContext)_localctx).t.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(889);
				((OperandContext)_localctx).i = integerLiteral();
				 ((OperandContext)_localctx).ast =  ((OperandContext)_localctx).i.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(892);
				((OperandContext)_localctx).fp = floatingPointLiteral();
				 ((OperandContext)_localctx).ast =  ((OperandContext)_localctx).fp.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(895);
				((OperandContext)_localctx).comp = composite();
				 ((OperandContext)_localctx).ast =  ((OperandContext)_localctx).comp.ast; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(898);
				((OperandContext)_localctx).fe = functionExpression();
				 ((OperandContext)_localctx).ast =  ((OperandContext)_localctx).fe.ast; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(901);
				((OperandContext)_localctx).fixpe = fixpExpression();
				 ((OperandContext)_localctx).ast =  ((OperandContext)_localctx).fixpe.ast; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(904);
				((OperandContext)_localctx).v = visitorExpression();
				 ((OperandContext)_localctx).ast =  ((OperandContext)_localctx).v.ast; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(907);
				((OperandContext)_localctx).tr = traversalExpression();
				 ((OperandContext)_localctx).ast =  ((OperandContext)_localctx).tr.ast; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(910);
				((OperandContext)_localctx).uf = unaryFactor();
				 ((OperandContext)_localctx).ast =  ((OperandContext)_localctx).uf.ast; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(913);
				match(DOLLAR);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(914);
				((OperandContext)_localctx).pe = parenExpression();
				 ((OperandContext)_localctx).ast =  ((OperandContext)_localctx).pe.ast; 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(917);
				((OperandContext)_localctx).id = identifier();
				 ((OperandContext)_localctx).ast =  ((OperandContext)_localctx).id.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryFactorContext extends ParserRuleContext {
		public UnaryFactor ast;
		public int l;
		public int c;
		public Token op;
		public FactorContext f;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BoaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BoaParser.MINUS, 0); }
		public TerminalNode NEG() { return getToken(BoaParser.NEG, 0); }
		public TerminalNode INV() { return getToken(BoaParser.INV, 0); }
		public TerminalNode NOT() { return getToken(BoaParser.NOT, 0); }
		public UnaryFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterUnaryFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitUnaryFactor(this);
		}
	}

	public final UnaryFactorContext unaryFactor() throws RecognitionException {
		UnaryFactorContext _localctx = new UnaryFactorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unaryFactor);
		 ((UnaryFactorContext)_localctx).l =  getStartLine(); ((UnaryFactorContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			((UnaryFactorContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (NOT - 11)) | (1L << (PLUS - 11)) | (1L << (MINUS - 11)) | (1L << (NEG - 11)) | (1L << (INV - 11)))) != 0)) ) {
				((UnaryFactorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(923);
			((UnaryFactorContext)_localctx).f = factor();
			 ((UnaryFactorContext)_localctx).ast =  new UnaryFactor((((UnaryFactorContext)_localctx).op!=null?((UnaryFactorContext)_localctx).op.getText():null), ((UnaryFactorContext)_localctx).f.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenExpressionContext extends ParserRuleContext {
		public ParenExpression ast;
		public int l;
		public int c;
		public ExpressionContext e;
		public TerminalNode LPAREN() { return getToken(BoaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BoaParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitParenExpression(this);
		}
	}

	public final ParenExpressionContext parenExpression() throws RecognitionException {
		ParenExpressionContext _localctx = new ParenExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parenExpression);
		 ((ParenExpressionContext)_localctx).l =  getStartLine(); ((ParenExpressionContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(LPAREN);
			setState(927);
			((ParenExpressionContext)_localctx).e = expression();
			setState(928);
			match(RPAREN);
			 ((ParenExpressionContext)_localctx).ast =  new ParenExpression(((ParenExpressionContext)_localctx).e.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionExpressionContext extends ParserRuleContext {
		public FunctionExpression ast;
		public int l;
		public int c;
		public FunctionTypeContext t;
		public BlockContext b;
		public IdentifierContext id;
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitFunctionExpression(this);
		}
	}

	public final FunctionExpressionContext functionExpression() throws RecognitionException {
		FunctionExpressionContext _localctx = new FunctionExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_functionExpression);
		 ((FunctionExpressionContext)_localctx).l =  getStartLine(); ((FunctionExpressionContext)_localctx).c =  getStartColumn(); 
		try {
			setState(939);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				((FunctionExpressionContext)_localctx).t = functionType();
				setState(932);
				((FunctionExpressionContext)_localctx).b = block();
				 ((FunctionExpressionContext)_localctx).ast =  new FunctionExpression(((FunctionExpressionContext)_localctx).t.ast, ((FunctionExpressionContext)_localctx).b.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				((FunctionExpressionContext)_localctx).id = identifier();
				setState(936);
				((FunctionExpressionContext)_localctx).b = block();
				 ((FunctionExpressionContext)_localctx).ast =  new FunctionExpression(((FunctionExpressionContext)_localctx).id.ast, ((FunctionExpressionContext)_localctx).b.ast); 
				}
				break;
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixpExpressionContext extends ParserRuleContext {
		public FixPExpression ast;
		public Block b;
		public int l;
		public int c;
		public FixpTypeContext t;
		public FixpStatementContext s;
		public FixpTypeContext fixpType() {
			return getRuleContext(FixpTypeContext.class,0);
		}
		public ProgramStatementContext programStatement() {
			return getRuleContext(ProgramStatementContext.class,0);
		}
		public FixpStatementContext fixpStatement() {
			return getRuleContext(FixpStatementContext.class,0);
		}
		public FixpExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixpExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterFixpExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitFixpExpression(this);
		}
	}

	public final FixpExpressionContext fixpExpression() throws RecognitionException {
		FixpExpressionContext _localctx = new FixpExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_fixpExpression);
		 ((FixpExpressionContext)_localctx).b =  new Block(); ((FixpExpressionContext)_localctx).l =  getStartLine(); ((FixpExpressionContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			((FixpExpressionContext)_localctx).t = fixpType();
			setState(947);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(942);
				((FixpExpressionContext)_localctx).s = fixpStatement();
				_localctx.b.addStatement(((FixpExpressionContext)_localctx).s.ast);
				}
				break;
			case 2:
				{
				 notifyErrorListeners("error: only 'before' and 'after' traverse statements allowed inside traversal bodies"); 
				setState(946);
				programStatement();
				}
				break;
			}
			 ((FixpExpressionContext)_localctx).ast =  new FixPExpression(((FixpExpressionContext)_localctx).t.ast, _localctx.b); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisitorExpressionContext extends ParserRuleContext {
		public VisitorExpression ast;
		public Block b;
		public int l;
		public int c;
		public VisitorTypeContext t;
		public VisitStatementContext s;
		public TerminalNode LBRACE() { return getToken(BoaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BoaParser.RBRACE, 0); }
		public VisitorTypeContext visitorType() {
			return getRuleContext(VisitorTypeContext.class,0);
		}
		public List<ProgramStatementContext> programStatement() {
			return getRuleContexts(ProgramStatementContext.class);
		}
		public ProgramStatementContext programStatement(int i) {
			return getRuleContext(ProgramStatementContext.class,i);
		}
		public List<VisitStatementContext> visitStatement() {
			return getRuleContexts(VisitStatementContext.class);
		}
		public VisitStatementContext visitStatement(int i) {
			return getRuleContext(VisitStatementContext.class,i);
		}
		public VisitorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visitorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterVisitorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitVisitorExpression(this);
		}
	}

	public final VisitorExpressionContext visitorExpression() throws RecognitionException {
		VisitorExpressionContext _localctx = new VisitorExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_visitorExpression);
		 ((VisitorExpressionContext)_localctx).b =  new Block(); ((VisitorExpressionContext)_localctx).l =  getStartLine(); ((VisitorExpressionContext)_localctx).c =  getStartColumn(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			((VisitorExpressionContext)_localctx).t = visitorType();
			setState(952);
			match(LBRACE);
			setState(958); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(958);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(953);
					((VisitorExpressionContext)_localctx).s = visitStatement();
					 _localctx.b.addStatement(((VisitorExpressionContext)_localctx).s.ast); 
					}
					break;
				case 2:
					{
					 notifyErrorListeners("error: only 'before' and 'after' visit statements allowed inside visitor bodies"); 
					setState(957);
					programStatement();
					}
					break;
				}
				}
				setState(960); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OF) | (1L << IF) | (1L << DO) | (1L << MAP) | (1L << STACK) | (1L << SET) | (1L << FOR) | (1L << FOREACH) | (1L << IFALL) | (1L << EXISTS) | (1L << NOT) | (1L << TYPE) | (1L << ELSE) | (1L << CASE) | (1L << OUTPUT) | (1L << FORMAT) | (1L << WHILE) | (1L << BREAK) | (1L << ARRAY) | (1L << STATIC) | (1L << SWITCH) | (1L << RETURN) | (1L << WEIGHT) | (1L << DEFAULT) | (1L << CONTINUE) | (1L << FUNCTION) | (1L << FIXP) | (1L << VISITOR) | (1L << TRAVERSAL) | (1L << BEFORE) | (1L << AFTER) | (1L << STOP) | (1L << SEMICOLON) | (1L << LBRACE) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NEG - 64)) | (1L << (INV - 64)) | (1L << (WILDCARD - 64)) | (1L << (DOLLAR - 64)) | (1L << (IntegerLiteral - 64)) | (1L << (FloatingPointLiteral - 64)) | (1L << (CharacterLiteral - 64)) | (1L << (RegexLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (TimeLiteral - 64)) | (1L << (Identifier - 64)))) != 0) );
			setState(962);
			match(RBRACE);
			 ((VisitorExpressionContext)_localctx).ast =  new VisitorExpression(((VisitorExpressionContext)_localctx).t.ast, _localctx.b); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TraversalExpressionContext extends ParserRuleContext {
		public TraversalExpression ast;
		public Block b;
		public int l;
		public int c;
		public TraversalTypeContext t;
		public TraverseStatementContext s;
		public TraversalTypeContext traversalType() {
			return getRuleContext(TraversalTypeContext.class,0);
		}
		public ProgramStatementContext programStatement() {
			return getRuleContext(ProgramStatementContext.class,0);
		}
		public TraverseStatementContext traverseStatement() {
			return getRuleContext(TraverseStatementContext.class,0);
		}
		public TraversalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traversalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterTraversalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitTraversalExpression(this);
		}
	}

	public final TraversalExpressionContext traversalExpression() throws RecognitionException {
		TraversalExpressionContext _localctx = new TraversalExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_traversalExpression);
		 ((TraversalExpressionContext)_localctx).b =  new Block(); ((TraversalExpressionContext)_localctx).l =  getStartLine(); ((TraversalExpressionContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			((TraversalExpressionContext)_localctx).t = traversalType();
			setState(971);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(966);
				((TraversalExpressionContext)_localctx).s = traverseStatement();
				_localctx.b.addStatement(((TraversalExpressionContext)_localctx).s.ast);
				}
				break;
			case 2:
				{
				 notifyErrorListeners("error: only 'before' and 'after' traverse statements allowed inside traversal bodies"); 
				setState(970);
				programStatement();
				}
				break;
			}
			 if(((TraversalExpressionContext)_localctx).s.ast.getReturnType()!=null) {((TraversalExpressionContext)_localctx).t.ast.setIndex(new Component(((TraversalExpressionContext)_localctx).s.ast.getReturnType()));} ((TraversalExpressionContext)_localctx).ast =  new TraversalExpression(((TraversalExpressionContext)_localctx).t.ast, _localctx.b); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompositeContext extends ParserRuleContext {
		public Composite ast;
		public int l;
		public int c;
		public ExpressionListContext el;
		public PairContext p;
		public TerminalNode LBRACE() { return getToken(BoaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BoaParser.RBRACE, 0); }
		public TerminalNode COLON() { return getToken(BoaParser.COLON, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BoaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BoaParser.COMMA, i);
		}
		public CompositeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterComposite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitComposite(this);
		}
	}

	public final CompositeContext composite() throws RecognitionException {
		CompositeContext _localctx = new CompositeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_composite);

				((CompositeContext)_localctx).l =  getStartLine(); ((CompositeContext)_localctx).c =  getStartColumn();
				((CompositeContext)_localctx).ast =  new Composite();
			
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(LBRACE);
			setState(993);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(976);
				((CompositeContext)_localctx).el = expressionList();
				 ((CompositeContext)_localctx).ast =  new Composite(((CompositeContext)_localctx).el.list); 
				}
				break;
			case 2:
				{
				 ((CompositeContext)_localctx).ast =  new Composite(); 
				setState(980);
				((CompositeContext)_localctx).p = pair();
				 _localctx.ast.addPair(((CompositeContext)_localctx).p.ast); 
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(982);
					match(COMMA);
					setState(983);
					((CompositeContext)_localctx).p = pair();
					 _localctx.ast.addPair(((CompositeContext)_localctx).p.ast); 
					}
					}
					setState(990);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(991);
				match(COLON);
				 ((CompositeContext)_localctx).ast =  new Composite(true); 
				}
				break;
			}
			setState(995);
			match(RBRACE);
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public boa.compiler.ast.Pair ast;
		public int l;
		public int c;
		public ExpressionContext lhs;
		public ExpressionContext rhs;
		public TerminalNode COLON() { return getToken(BoaParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_pair);
		 ((PairContext)_localctx).l =  getStartLine(); ((PairContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			((PairContext)_localctx).lhs = expression();
			setState(998);
			match(COLON);
			setState(999);
			((PairContext)_localctx).rhs = expression();
			 ((PairContext)_localctx).ast =  new boa.compiler.ast.Pair(((PairContext)_localctx).lhs.ast, ((PairContext)_localctx).rhs.ast); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier ast;
		public int l;
		public int c;
		public Token lit;
		public TerminalNode Identifier() { return getToken(BoaParser.Identifier, 0); }
		public TerminalNode FORMAT() { return getToken(BoaParser.FORMAT, 0); }
		public TerminalNode OF() { return getToken(BoaParser.OF, 0); }
		public TerminalNode IF() { return getToken(BoaParser.IF, 0); }
		public TerminalNode DO() { return getToken(BoaParser.DO, 0); }
		public TerminalNode MAP() { return getToken(BoaParser.MAP, 0); }
		public TerminalNode STACK() { return getToken(BoaParser.STACK, 0); }
		public TerminalNode SET() { return getToken(BoaParser.SET, 0); }
		public TerminalNode FOR() { return getToken(BoaParser.FOR, 0); }
		public TerminalNode FOREACH() { return getToken(BoaParser.FOREACH, 0); }
		public TerminalNode IFALL() { return getToken(BoaParser.IFALL, 0); }
		public TerminalNode EXISTS() { return getToken(BoaParser.EXISTS, 0); }
		public TerminalNode NOT() { return getToken(BoaParser.NOT, 0); }
		public TerminalNode TYPE() { return getToken(BoaParser.TYPE, 0); }
		public TerminalNode ELSE() { return getToken(BoaParser.ELSE, 0); }
		public TerminalNode CASE() { return getToken(BoaParser.CASE, 0); }
		public TerminalNode OUTPUT() { return getToken(BoaParser.OUTPUT, 0); }
		public TerminalNode WHILE() { return getToken(BoaParser.WHILE, 0); }
		public TerminalNode BREAK() { return getToken(BoaParser.BREAK, 0); }
		public TerminalNode ARRAY() { return getToken(BoaParser.ARRAY, 0); }
		public TerminalNode STATIC() { return getToken(BoaParser.STATIC, 0); }
		public TerminalNode SWITCH() { return getToken(BoaParser.SWITCH, 0); }
		public TerminalNode RETURN() { return getToken(BoaParser.RETURN, 0); }
		public TerminalNode WEIGHT() { return getToken(BoaParser.WEIGHT, 0); }
		public TerminalNode DEFAULT() { return getToken(BoaParser.DEFAULT, 0); }
		public TerminalNode CONTINUE() { return getToken(BoaParser.CONTINUE, 0); }
		public TerminalNode FUNCTION() { return getToken(BoaParser.FUNCTION, 0); }
		public TerminalNode FIXP() { return getToken(BoaParser.FIXP, 0); }
		public TerminalNode VISITOR() { return getToken(BoaParser.VISITOR, 0); }
		public TerminalNode TRAVERSAL() { return getToken(BoaParser.TRAVERSAL, 0); }
		public TerminalNode BEFORE() { return getToken(BoaParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(BoaParser.AFTER, 0); }
		public TerminalNode STOP() { return getToken(BoaParser.STOP, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_identifier);
		 ((IdentifierContext)_localctx).l =  getStartLine(); ((IdentifierContext)_localctx).c =  getStartColumn(); ((IdentifierContext)_localctx).ast =  new Identifier("<ERROR>"); 
		try {
			setState(1068);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				((IdentifierContext)_localctx).lit = match(Identifier);
				 ((IdentifierContext)_localctx).ast =  new Identifier((((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null)); 
				}
				break;
			case FORMAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
				((IdentifierContext)_localctx).lit = match(FORMAT);
				 ((IdentifierContext)_localctx).ast =  new Identifier((((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null)); 
				}
				break;
			case OF:
				enterOuterAlt(_localctx, 3);
				{
				setState(1006);
				((IdentifierContext)_localctx).lit = match(OF);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				((IdentifierContext)_localctx).lit = match(IF);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(1010);
				((IdentifierContext)_localctx).lit = match(DO);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1012);
				((IdentifierContext)_localctx).lit = match(MAP);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case STACK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1014);
				((IdentifierContext)_localctx).lit = match(STACK);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 8);
				{
				setState(1016);
				((IdentifierContext)_localctx).lit = match(SET);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(1018);
				((IdentifierContext)_localctx).lit = match(FOR);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 10);
				{
				setState(1020);
				((IdentifierContext)_localctx).lit = match(FOREACH);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case IFALL:
				enterOuterAlt(_localctx, 11);
				{
				setState(1022);
				((IdentifierContext)_localctx).lit = match(IFALL);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case EXISTS:
				enterOuterAlt(_localctx, 12);
				{
				setState(1024);
				((IdentifierContext)_localctx).lit = match(EXISTS);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 13);
				{
				setState(1026);
				((IdentifierContext)_localctx).lit = match(NOT);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 14);
				{
				setState(1028);
				((IdentifierContext)_localctx).lit = match(TYPE);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 15);
				{
				setState(1030);
				((IdentifierContext)_localctx).lit = match(ELSE);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 16);
				{
				setState(1032);
				((IdentifierContext)_localctx).lit = match(CASE);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 17);
				{
				setState(1034);
				((IdentifierContext)_localctx).lit = match(OUTPUT);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 18);
				{
				setState(1036);
				((IdentifierContext)_localctx).lit = match(WHILE);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 19);
				{
				setState(1038);
				((IdentifierContext)_localctx).lit = match(BREAK);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 20);
				{
				setState(1040);
				((IdentifierContext)_localctx).lit = match(ARRAY);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 21);
				{
				setState(1042);
				((IdentifierContext)_localctx).lit = match(STATIC);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 22);
				{
				setState(1044);
				((IdentifierContext)_localctx).lit = match(SWITCH);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 23);
				{
				setState(1046);
				((IdentifierContext)_localctx).lit = match(RETURN);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case WEIGHT:
				enterOuterAlt(_localctx, 24);
				{
				setState(1048);
				((IdentifierContext)_localctx).lit = match(WEIGHT);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 25);
				{
				setState(1050);
				((IdentifierContext)_localctx).lit = match(DEFAULT);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 26);
				{
				setState(1052);
				((IdentifierContext)_localctx).lit = match(CONTINUE);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 27);
				{
				setState(1054);
				((IdentifierContext)_localctx).lit = match(FUNCTION);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case FIXP:
				enterOuterAlt(_localctx, 28);
				{
				setState(1056);
				((IdentifierContext)_localctx).lit = match(FIXP);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case VISITOR:
				enterOuterAlt(_localctx, 29);
				{
				setState(1058);
				((IdentifierContext)_localctx).lit = match(VISITOR);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case TRAVERSAL:
				enterOuterAlt(_localctx, 30);
				{
				setState(1060);
				((IdentifierContext)_localctx).lit = match(TRAVERSAL);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case BEFORE:
				enterOuterAlt(_localctx, 31);
				{
				setState(1062);
				((IdentifierContext)_localctx).lit = match(BEFORE);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 32);
				{
				setState(1064);
				((IdentifierContext)_localctx).lit = match(AFTER);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			case STOP:
				enterOuterAlt(_localctx, 33);
				{
				setState(1066);
				((IdentifierContext)_localctx).lit = match(STOP);
				 notifyErrorListeners("keyword '" + (((IdentifierContext)_localctx).lit!=null?((IdentifierContext)_localctx).lit.getText():null) + "' can not be used as an identifier"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public IntegerLiteral ast;
		public int l;
		public int c;
		public Token lit;
		public TerminalNode IntegerLiteral() { return getToken(BoaParser.IntegerLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_integerLiteral);
		 ((IntegerLiteralContext)_localctx).l =  getStartLine(); ((IntegerLiteralContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			((IntegerLiteralContext)_localctx).lit = match(IntegerLiteral);
			 ((IntegerLiteralContext)_localctx).ast =  new IntegerLiteral((((IntegerLiteralContext)_localctx).lit!=null?((IntegerLiteralContext)_localctx).lit.getText():null)); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointLiteralContext extends ParserRuleContext {
		public FloatLiteral ast;
		public int l;
		public int c;
		public Token lit;
		public TerminalNode FloatingPointLiteral() { return getToken(BoaParser.FloatingPointLiteral, 0); }
		public FloatingPointLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterFloatingPointLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitFloatingPointLiteral(this);
		}
	}

	public final FloatingPointLiteralContext floatingPointLiteral() throws RecognitionException {
		FloatingPointLiteralContext _localctx = new FloatingPointLiteralContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_floatingPointLiteral);
		 ((FloatingPointLiteralContext)_localctx).l =  getStartLine(); ((FloatingPointLiteralContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1073);
			((FloatingPointLiteralContext)_localctx).lit = match(FloatingPointLiteral);
			 ((FloatingPointLiteralContext)_localctx).ast =  new FloatLiteral((((FloatingPointLiteralContext)_localctx).lit!=null?((FloatingPointLiteralContext)_localctx).lit.getText():null)); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterLiteralContext extends ParserRuleContext {
		public CharLiteral ast;
		public int l;
		public int c;
		public Token lit;
		public TerminalNode CharacterLiteral() { return getToken(BoaParser.CharacterLiteral, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitCharacterLiteral(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_characterLiteral);
		 ((CharacterLiteralContext)_localctx).l =  getStartLine(); ((CharacterLiteralContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			((CharacterLiteralContext)_localctx).lit = match(CharacterLiteral);
			 ((CharacterLiteralContext)_localctx).ast =  new CharLiteral((((CharacterLiteralContext)_localctx).lit!=null?((CharacterLiteralContext)_localctx).lit.getText():null)); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public StringLiteral ast;
		public int l;
		public int c;
		public Token lit;
		public TerminalNode StringLiteral() { return getToken(BoaParser.StringLiteral, 0); }
		public TerminalNode RegexLiteral() { return getToken(BoaParser.RegexLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_stringLiteral);
		 ((StringLiteralContext)_localctx).l =  getStartLine(); ((StringLiteralContext)_localctx).c =  getStartColumn(); 
		try {
			setState(1083);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1079);
				((StringLiteralContext)_localctx).lit = match(StringLiteral);
				 ((StringLiteralContext)_localctx).ast =  new StringLiteral(false, (((StringLiteralContext)_localctx).lit!=null?((StringLiteralContext)_localctx).lit.getText():null)); 
				}
				break;
			case RegexLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				((StringLiteralContext)_localctx).lit = match(RegexLiteral);
				 ((StringLiteralContext)_localctx).ast =  new StringLiteral(true, (((StringLiteralContext)_localctx).lit!=null?((StringLiteralContext)_localctx).lit.getText():null)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeLiteralContext extends ParserRuleContext {
		public TimeLiteral ast;
		public int l;
		public int c;
		public Token lit;
		public TerminalNode TimeLiteral() { return getToken(BoaParser.TimeLiteral, 0); }
		public TimeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).enterTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoaListener ) ((BoaListener)listener).exitTimeLiteral(this);
		}
	}

	public final TimeLiteralContext timeLiteral() throws RecognitionException {
		TimeLiteralContext _localctx = new TimeLiteralContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_timeLiteral);
		 ((TimeLiteralContext)_localctx).l =  getStartLine(); ((TimeLiteralContext)_localctx).c =  getStartColumn(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			((TimeLiteralContext)_localctx).lit = match(TimeLiteral);
			 ((TimeLiteralContext)_localctx).ast =  new TimeLiteral((((TimeLiteralContext)_localctx).lit!=null?((TimeLiteralContext)_localctx).lit.getText():null)); 
			}
			 _localctx.ast.setPositions(_localctx.l, _localctx.c, getEndLine(), getEndColumn()); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3R\u0443\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\6\3\u0096\n\3\r\3\16\3\u0097\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u00a0\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ab\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00db\n\t\3\n\3\n\3\n\3\n"+
		"\5\n\u00e1\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00f2\n\f\f\f\16\f\u00f5\13\f\3\f\5\f\u00f8\n\f\5\f\u00fa"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u0103\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u011d\n\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0124\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u012b\n\21\f\21\16\21\u012e"+
		"\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0137\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u013e\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u014c\n\22\f\22\16\22\u014f\13\22\5\22\u0151"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0158\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0164\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u0170\n\22\f\22\16\22\u0173\13\22\5\22\u0175"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u017c\n\22\5\22\u017e\n\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u01bc\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\7\31\u01ca\n\31\f\31\16\31\u01cd\13\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01e5\n\35\f\35\16\35\u01e8\13\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u01f7\n\35\f\35\16\35\u01fa\13\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0203\n\35\3\35\3\35\5\35\u0207\n\35\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u020e\n\36\3\36\3\36\3\36\3\36\5\36\u0214\n\36\3\36\3\36\3\36\3\36"+
		"\5\36\u021a\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0226\n\37\3 \3 \3 \3 \3 \3 \5 \u022e\n \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0238"+
		"\n \5 \u023a\n \3!\3!\3!\3!\3!\3!\3!\5!\u0243\n!\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\5#\u0252\n#\3$\3$\3$\3$\3$\5$\u0259\n$\3$\3$\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0266\n%\f%\16%\u0269\13%\3%\3%\3%\3%\3%\6"+
		"%\u0270\n%\r%\16%\u0271\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\6&\u027e\n&\r&\16"+
		"&\u027f\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0298\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\5"+
		"+\u02ba\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+\u02ca\n+\f+\16"+
		"+\u02cd\13+\5+\u02cf\n+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u02df"+
		"\n,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3/"+
		"\3/\3/\3/\3/\3/\7/\u02fc\n/\f/\16/\u02ff\13/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\7\60\u0307\n\60\f\60\16\60\u030a\13\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\7\60\u0316\n\60\f\60\16\60\u0319\13\60\5\60"+
		"\u031b\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0324\n\61\f\61\16"+
		"\61\u0327\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0331\n\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u033a\n\63\f\63\16\63\u033d\13"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0346\n\64\f\64\16\64\u0349"+
		"\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0356"+
		"\n\65\f\65\16\65\u0359\13\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\5\67\u0366\n\67\3\67\3\67\38\38\38\38\38\58\u036f\n8\38"+
		"\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u039b\n9\3:"+
		"\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\5<\u03ae\n<\3=\3=\3="+
		"\3=\3=\3=\5=\u03b6\n=\3=\3=\3>\3>\3>\3>\3>\3>\3>\6>\u03c1\n>\r>\16>\u03c2"+
		"\3>\3>\3>\3?\3?\3?\3?\3?\3?\5?\u03ce\n?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\7@\u03dd\n@\f@\16@\u03e0\13@\3@\3@\5@\u03e4\n@\3@\3@\3A\3A\3"+
		"A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5"+
		"B\u042f\nB\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3F\5F\u043e\nF\3G\3G\3"+
		"G\3G\2\2H\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\2\t\3\2\63\64\4\2--//\4\2\60\60\62\62\3\2\65:\4\2..;=\5\2\61\61"+
		">AHH\5\2\r\r;<BC\u048c\2\u008e\3\2\2\2\4\u0095\3\2\2\2\6\u009f\3\2\2\2"+
		"\b\u00aa\3\2\2\2\n\u00ac\3\2\2\2\f\u00b2\3\2\2\2\16\u00b6\3\2\2\2\20\u00da"+
		"\3\2\2\2\22\u00e0\3\2\2\2\24\u00e5\3\2\2\2\26\u00ea\3\2\2\2\30\u0102\3"+
		"\2\2\2\32\u0104\3\2\2\2\34\u010c\3\2\2\2\36\u0111\3\2\2\2 \u0116\3\2\2"+
		"\2\"\u017d\3\2\2\2$\u017f\3\2\2\2&\u0182\3\2\2\2(\u0185\3\2\2\2*\u01bb"+
		"\3\2\2\2,\u01bd\3\2\2\2.\u01c0\3\2\2\2\60\u01c5\3\2\2\2\62\u01d0\3\2\2"+
		"\2\64\u01d3\3\2\2\2\66\u01d6\3\2\2\28\u0206\3\2\2\2:\u0208\3\2\2\2<\u0225"+
		"\3\2\2\2>\u0227\3\2\2\2@\u0242\3\2\2\2B\u0244\3\2\2\2D\u0247\3\2\2\2F"+
		"\u0253\3\2\2\2H\u025c\3\2\2\2J\u0276\3\2\2\2L\u0297\3\2\2\2N\u0299\3\2"+
		"\2\2P\u02a4\3\2\2\2R\u02af\3\2\2\2T\u02b9\3\2\2\2V\u02d4\3\2\2\2X\u02e3"+
		"\3\2\2\2Z\u02f2\3\2\2\2\\\u02f5\3\2\2\2^\u031a\3\2\2\2`\u031c\3\2\2\2"+
		"b\u0330\3\2\2\2d\u0332\3\2\2\2f\u033e\3\2\2\2h\u034a\3\2\2\2j\u035a\3"+
		"\2\2\2l\u035e\3\2\2\2n\u0369\3\2\2\2p\u039a\3\2\2\2r\u039c\3\2\2\2t\u03a0"+
		"\3\2\2\2v\u03ad\3\2\2\2x\u03af\3\2\2\2z\u03b9\3\2\2\2|\u03c7\3\2\2\2~"+
		"\u03d1\3\2\2\2\u0080\u03e7\3\2\2\2\u0082\u042e\3\2\2\2\u0084\u0430\3\2"+
		"\2\2\u0086\u0433\3\2\2\2\u0088\u0436\3\2\2\2\u008a\u043d\3\2\2\2\u008c"+
		"\u043f\3\2\2\2\u008e\u008f\5\4\3\2\u008f\u0090\7\2\2\3\u0090\u0091\b\2"+
		"\1\2\u0091\3\3\2\2\2\u0092\u0093\5\6\4\2\u0093\u0094\b\3\1\2\u0094\u0096"+
		"\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\5\3\2\2\2\u0099\u009a\5\b\5\2\u009a\u009b\b\4\1\2"+
		"\u009b\u00a0\3\2\2\2\u009c\u009d\5*\26\2\u009d\u009e\b\4\1\2\u009e\u00a0"+
		"\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\7\3\2\2\2\u00a1"+
		"\u00a2\5\n\6\2\u00a2\u00a3\b\5\1\2\u00a3\u00ab\3\2\2\2\u00a4\u00a5\5\f"+
		"\7\2\u00a5\u00a6\b\5\1\2\u00a6\u00ab\3\2\2\2\u00a7\u00a8\5\16\b\2\u00a8"+
		"\u00a9\b\5\1\2\u00a9\u00ab\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a4\3\2"+
		"\2\2\u00aa\u00a7\3\2\2\2\u00ab\t\3\2\2\2\u00ac\u00ad\7\16\2\2\u00ad\u00ae"+
		"\5\u0082B\2\u00ae\u00af\7G\2\2\u00af\u00b0\5\20\t\2\u00b0\u00b1\b\6\1"+
		"\2\u00b1\13\3\2\2\2\u00b2\u00b3\7\26\2\2\u00b3\u00b4\5\16\b\2\u00b4\u00b5"+
		"\b\7\1\2\u00b5\r\3\2\2\2\u00b6\u00b7\5> \2\u00b7\u00b8\b\b\1\2\u00b8\17"+
		"\3\2\2\2\u00b9\u00ba\5\24\13\2\u00ba\u00bb\b\t\1\2\u00bb\u00db\3\2\2\2"+
		"\u00bc\u00bd\5\32\16\2\u00bd\u00be\b\t\1\2\u00be\u00db\3\2\2\2\u00bf\u00c0"+
		"\5\26\f\2\u00c0\u00c1\b\t\1\2\u00c1\u00db\3\2\2\2\u00c2\u00c3\5 \21\2"+
		"\u00c3\u00c4\b\t\1\2\u00c4\u00db\3\2\2\2\u00c5\u00c6\5\"\22\2\u00c6\u00c7"+
		"\b\t\1\2\u00c7\u00db\3\2\2\2\u00c8\u00c9\5$\23\2\u00c9\u00ca\b\t\1\2\u00ca"+
		"\u00db\3\2\2\2\u00cb\u00cc\5&\24\2\u00cc\u00cd\b\t\1\2\u00cd\u00db\3\2"+
		"\2\2\u00ce\u00cf\5(\25\2\u00cf\u00d0\b\t\1\2\u00d0\u00db\3\2\2\2\u00d1"+
		"\u00d2\5\34\17\2\u00d2\u00d3\b\t\1\2\u00d3\u00db\3\2\2\2\u00d4\u00d5\5"+
		"\36\20\2\u00d5\u00d6\b\t\1\2\u00d6\u00db\3\2\2\2\u00d7\u00d8\5\u0082B"+
		"\2\u00d8\u00d9\b\t\1\2\u00d9\u00db\3\2\2\2\u00da\u00b9\3\2\2\2\u00da\u00bc"+
		"\3\2\2\2\u00da\u00bf\3\2\2\2\u00da\u00c2\3\2\2\2\u00da\u00c5\3\2\2\2\u00da"+
		"\u00c8\3\2\2\2\u00da\u00cb\3\2\2\2\u00da\u00ce\3\2\2\2\u00da\u00d1\3\2"+
		"\2\2\u00da\u00d4\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\21\3\2\2\2\u00dc\u00dd"+
		"\5\u0082B\2\u00dd\u00de\7$\2\2\u00de\u00df\b\n\1\2\u00df\u00e1\3\2\2\2"+
		"\u00e0\u00dc\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3"+
		"\5\20\t\2\u00e3\u00e4\b\n\1\2\u00e4\23\3\2\2\2\u00e5\u00e6\7\25\2\2\u00e6"+
		"\u00e7\7\3\2\2\u00e7\u00e8\5\22\n\2\u00e8\u00e9\b\13\1\2\u00e9\25\3\2"+
		"\2\2\u00ea\u00f9\7\'\2\2\u00eb\u00ec\5\30\r\2\u00ec\u00f3\b\f\1\2\u00ed"+
		"\u00ee\7%\2\2\u00ee\u00ef\5\30\r\2\u00ef\u00f0\b\f\1\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ed\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\7%"+
		"\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00eb\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7("+
		"\2\2\u00fc\27\3\2\2\2\u00fd\u0103\5\n\6\2\u00fe\u0103\5\f\7\2\u00ff\u0100"+
		"\5\22\n\2\u0100\u0101\b\r\1\2\u0101\u0103\3\2\2\2\u0102\u00fd\3\2\2\2"+
		"\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\31\3\2\2\2\u0104\u0105"+
		"\7\6\2\2\u0105\u0106\7+\2\2\u0106\u0107\5\22\n\2\u0107\u0108\7,\2\2\u0108"+
		"\u0109\7\3\2\2\u0109\u010a\5\22\n\2\u010a\u010b\b\16\1\2\u010b\33\3\2"+
		"\2\2\u010c\u010d\7\7\2\2\u010d\u010e\7\3\2\2\u010e\u010f\5\22\n\2\u010f"+
		"\u0110\b\17\1\2\u0110\35\3\2\2\2\u0111\u0112\7\b\2\2\u0112\u0113\7\3\2"+
		"\2\u0113\u0114\5\22\n\2\u0114\u0115\b\20\1\2\u0115\37\3\2\2\2\u0116\u011c"+
		"\7\21\2\2\u0117\u0118\7\b\2\2\u0118\u011d\b\21\1\2\u0119\u011a\5\u0082"+
		"B\2\u011a\u011b\b\21\1\2\u011b\u011d\3\2\2\2\u011c\u0117\3\2\2\2\u011c"+
		"\u0119\3\2\2\2\u011d\u0123\3\2\2\2\u011e\u011f\7)\2\2\u011f\u0120\5^\60"+
		"\2\u0120\u0121\7*\2\2\u0121\u0122\b\21\1\2\u0122\u0124\3\2\2\2\u0123\u011e"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u012c\3\2\2\2\u0125\u0126\7+\2\2\u0126"+
		"\u0127\5\22\n\2\u0127\u0128\7,\2\2\u0128\u0129\b\21\1\2\u0129\u012b\3"+
		"\2\2\2\u012a\u0125\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\3"+
		"\2\2\u0130\u0131\5\22\n\2\u0131\u0136\b\21\1\2\u0132\u0133\7\31\2\2\u0133"+
		"\u0134\5\22\n\2\u0134\u0135\b\21\1\2\u0135\u0137\3\2\2\2\u0136\u0132\3"+
		"\2\2\2\u0136\u0137\3\2\2\2\u0137\u013d\3\2\2\2\u0138\u0139\7\22\2\2\u0139"+
		"\u013a\7)\2\2\u013a\u013b\5^\60\2\u013b\u013c\7*\2\2\u013c\u013e\3\2\2"+
		"\2\u013d\u0138\3\2\2\2\u013d\u013e\3\2\2\2\u013e!\3\2\2\2\u013f\u0140"+
		"\7\34\2\2\u0140\u0150\7)\2\2\u0141\u0142\5\u0082B\2\u0142\u0143\7$\2\2"+
		"\u0143\u0144\5\20\t\2\u0144\u014d\b\22\1\2\u0145\u0146\7%\2\2\u0146\u0147"+
		"\5\u0082B\2\u0147\u0148\7$\2\2\u0148\u0149\5\20\t\2\u0149\u014a\b\22\1"+
		"\2\u014a\u014c\3\2\2\2\u014b\u0145\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0141\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0157\7*"+
		"\2\2\u0153\u0154\7$\2\2\u0154\u0155\5\20\t\2\u0155\u0156\b\22\1\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0153\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u017e\3\2"+
		"\2\2\u0159\u015a\7\34\2\2\u015a\u0174\7)\2\2\u015b\u015c\5\u0082B\2\u015c"+
		"\u015d\7$\2\2\u015d\u015e\5\20\t\2\u015e\u015f\b\22\1\2\u015f\u0164\3"+
		"\2\2\2\u0160\u0161\5\u0082B\2\u0161\u0162\b\22\1\2\u0162\u0164\3\2\2\2"+
		"\u0163\u015b\3\2\2\2\u0163\u0160\3\2\2\2\u0164\u0171\3\2\2\2\u0165\u0166"+
		"\7%\2\2\u0166\u0167\5\u0082B\2\u0167\u0168\7$\2\2\u0168\u0169\5\20\t\2"+
		"\u0169\u016a\b\22\1\2\u016a\u0170\3\2\2\2\u016b\u016c\7%\2\2\u016c\u016d"+
		"\5\u0082B\2\u016d\u016e\b\22\1\2\u016e\u0170\3\2\2\2\u016f\u0165\3\2\2"+
		"\2\u016f\u016b\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0163\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017b\7*\2\2\u0177\u0178\7$\2"+
		"\2\u0178\u0179\5\20\t\2\u0179\u017a\b\22\1\2\u017a\u017c\3\2\2\2\u017b"+
		"\u0177\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u013f\3\2"+
		"\2\2\u017d\u0159\3\2\2\2\u017e#\3\2\2\2\u017f\u0180\7\35\2\2\u0180\u0181"+
		"\b\23\1\2\u0181%\3\2\2\2\u0182\u0183\7\36\2\2\u0183\u0184\b\24\1\2\u0184"+
		"\'\3\2\2\2\u0185\u0186\7\37\2\2\u0186\u0187\b\25\1\2\u0187)\3\2\2\2\u0188"+
		"\u0189\5\60\31\2\u0189\u018a\b\26\1\2\u018a\u01bc\3\2\2\2\u018b\u018c"+
		"\5.\30\2\u018c\u018d\b\26\1\2\u018d\u01bc\3\2\2\2\u018e\u018f\5\62\32"+
		"\2\u018f\u0190\b\26\1\2\u0190\u01bc\3\2\2\2\u0191\u0192\5\64\33\2\u0192"+
		"\u0193\b\26\1\2\u0193\u01bc\3\2\2\2\u0194\u0195\5Z.\2\u0195\u0196\b\26"+
		"\1\2\u0196\u01bc\3\2\2\2\u0197\u0198\5\66\34\2\u0198\u0199\b\26\1\2\u0199"+
		"\u01bc\3\2\2\2\u019a\u019b\5:\36\2\u019b\u019c\b\26\1\2\u019c\u01bc\3"+
		"\2\2\2\u019d\u019e\5D#\2\u019e\u019f\b\26\1\2\u019f\u01bc\3\2\2\2\u01a0"+
		"\u01a1\5F$\2\u01a1\u01a2\b\26\1\2\u01a2\u01bc\3\2\2\2\u01a3\u01a4\5H%"+
		"\2\u01a4\u01a5\b\26\1\2\u01a5\u01bc\3\2\2\2\u01a6\u01a7\5L\'\2\u01a7\u01a8"+
		"\b\26\1\2\u01a8\u01bc\3\2\2\2\u01a9\u01aa\5N(\2\u01aa\u01ab\b\26\1\2\u01ab"+
		"\u01bc\3\2\2\2\u01ac\u01ad\5P)\2\u01ad\u01ae\b\26\1\2\u01ae\u01bc\3\2"+
		"\2\2\u01af\u01b0\5R*\2\u01b0\u01b1\b\26\1\2\u01b1\u01bc\3\2\2\2\u01b2"+
		"\u01b3\5,\27\2\u01b3\u01b4\b\26\1\2\u01b4\u01bc\3\2\2\2\u01b5\u01b6\5"+
		"8\35\2\u01b6\u01b7\b\26\1\2\u01b7\u01bc\3\2\2\2\u01b8\u01b9\5B\"\2\u01b9"+
		"\u01ba\b\26\1\2\u01ba\u01bc\3\2\2\2\u01bb\u0188\3\2\2\2\u01bb\u018b\3"+
		"\2\2\2\u01bb\u018e\3\2\2\2\u01bb\u0191\3\2\2\2\u01bb\u0194\3\2\2\2\u01bb"+
		"\u0197\3\2\2\2\u01bb\u019a\3\2\2\2\u01bb\u019d\3\2\2\2\u01bb\u01a0\3\2"+
		"\2\2\u01bb\u01a3\3\2\2\2\u01bb\u01a6\3\2\2\2\u01bb\u01a9\3\2\2\2\u01bb"+
		"\u01ac\3\2\2\2\u01bb\u01af\3\2\2\2\u01bb\u01b2\3\2\2\2\u01bb\u01b5\3\2"+
		"\2\2\u01bb\u01b8\3\2\2\2\u01bc+\3\2\2\2\u01bd\u01be\7#\2\2\u01be\u01bf"+
		"\b\27\1\2\u01bf-\3\2\2\2\u01c0\u01c1\5h\65\2\u01c1\u01c2\7G\2\2\u01c2"+
		"\u01c3\5\\/\2\u01c3\u01c4\b\30\1\2\u01c4/\3\2\2\2\u01c5\u01cb\7\'\2\2"+
		"\u01c6\u01c7\5\6\4\2\u01c7\u01c8\b\31\1\2\u01c8\u01ca\3\2\2\2\u01c9\u01c6"+
		"\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf\7(\2\2\u01cf\61\3\2\2\2"+
		"\u01d0\u01d1\7\24\2\2\u01d1\u01d2\b\32\1\2\u01d2\63\3\2\2\2\u01d3\u01d4"+
		"\7\33\2\2\u01d4\u01d5\b\33\1\2\u01d5\65\3\2\2\2\u01d6\u01d7\7\5\2\2\u01d7"+
		"\u01d8\5*\26\2\u01d8\u01d9\7\23\2\2\u01d9\u01da\7)\2\2\u01da\u01db\5\\"+
		"/\2\u01db\u01dc\7*\2\2\u01dc\u01dd\b\34\1\2\u01dd\67\3\2\2\2\u01de\u01df"+
		"\5\u0082B\2\u01df\u01e6\b\35\1\2\u01e0\u01e1\7+\2\2\u01e1\u01e2\5\\/\2"+
		"\u01e2\u01e3\7,\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e5\u01e8"+
		"\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8"+
		"\u01e6\3\2\2\2\u01e9\u01ea\7H\2\2\u01ea\u01eb\b\35\1\2\u01eb\u01ec\7\31"+
		"\2\2\u01ec\u01ed\5\\/\2\u01ed\u01ee\b\35\1\2\u01ee\u0207\3\2\2\2\u01ef"+
		"\u01f0\5\u0082B\2\u01f0\u01f8\b\35\1\2\u01f1\u01f2\7+\2\2\u01f2\u01f3"+
		"\5\\/\2\u01f3\u01f4\7,\2\2\u01f4\u01f5\b\35\1\2\u01f5\u01f7\3\2\2\2\u01f6"+
		"\u01f1\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2"+
		"\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc\7H\2\2\u01fc"+
		"\u01fd\5\\/\2\u01fd\u0202\b\35\1\2\u01fe\u01ff\7\31\2\2\u01ff\u0200\5"+
		"\\/\2\u0200\u0201\b\35\1\2\u0201\u0203\3\2\2\2\u0202\u01fe\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\b\35\1\2\u0205\u0207\3"+
		"\2\2\2\u0206\u01de\3\2\2\2\u0206\u01ef\3\2\2\2\u02079\3\2\2\2\u0208\u0209"+
		"\7\t\2\2\u0209\u020d\7)\2\2\u020a\u020b\5<\37\2\u020b\u020c\b\36\1\2\u020c"+
		"\u020e\3\2\2\2\u020d\u020a\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020f\u0213\7#\2\2\u0210\u0211\5\\/\2\u0211\u0212\b\36\1\2\u0212"+
		"\u0214\3\2\2\2\u0213\u0210\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2"+
		"\2\2\u0215\u0219\7#\2\2\u0216\u0217\5<\37\2\u0217\u0218\b\36\1\2\u0218"+
		"\u021a\3\2\2\2\u0219\u0216\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2"+
		"\2\2\u021b\u021c\7*\2\2\u021c\u021d\5\6\4\2\u021d\u021e\b\36\1\2\u021e"+
		";\3\2\2\2\u021f\u0220\5> \2\u0220\u0221\b\37\1\2\u0221\u0226\3\2\2\2\u0222"+
		"\u0223\5@!\2\u0223\u0224\b\37\1\2\u0224\u0226\3\2\2\2\u0225\u021f\3\2"+
		"\2\2\u0225\u0222\3\2\2\2\u0226=\3\2\2\2\u0227\u0228\5\u0082B\2\u0228\u0229"+
		"\7$\2\2\u0229\u022d\b \1\2\u022a\u022b\5\20\t\2\u022b\u022c\b \1\2\u022c"+
		"\u022e\3\2\2\2\u022d\u022a\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0239\3\2"+
		"\2\2\u022f\u0237\7G\2\2\u0230\u0231\b \1\2\u0231\u0232\5 \21\2\u0232\u0233"+
		"\b \1\2\u0233\u0238\3\2\2\2\u0234\u0235\5\\/\2\u0235\u0236\b \1\2\u0236"+
		"\u0238\3\2\2\2\u0237\u0230\3\2\2\2\u0237\u0234\3\2\2\2\u0238\u023a\3\2"+
		"\2\2\u0239\u022f\3\2\2\2\u0239\u023a\3\2\2\2\u023a?\3\2\2\2\u023b\u023c"+
		"\5\\/\2\u023c\u023d\t\2\2\2\u023d\u023e\b!\1\2\u023e\u0243\3\2\2\2\u023f"+
		"\u0240\5\\/\2\u0240\u0241\b!\1\2\u0241\u0243\3\2\2\2\u0242\u023b\3\2\2"+
		"\2\u0242\u023f\3\2\2\2\u0243A\3\2\2\2\u0244\u0245\5@!\2\u0245\u0246\b"+
		"\"\1\2\u0246C\3\2\2\2\u0247\u0248\7\4\2\2\u0248\u0249\7)\2\2\u0249\u024a"+
		"\5\\/\2\u024a\u024b\7*\2\2\u024b\u024c\5\6\4\2\u024c\u0251\b#\1\2\u024d"+
		"\u024e\7\17\2\2\u024e\u024f\5\6\4\2\u024f\u0250\b#\1\2\u0250\u0252\3\2"+
		"\2\2\u0251\u024d\3\2\2\2\u0251\u0252\3\2\2\2\u0252E\3\2\2\2\u0253\u0254"+
		"\7\30\2\2\u0254\u0258\b$\1\2\u0255\u0256\5\\/\2\u0256\u0257\b$\1\2\u0257"+
		"\u0259\3\2\2\2\u0258\u0255\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2"+
		"\2\2\u025a\u025b\b$\1\2\u025bG\3\2\2\2\u025c\u025d\7\27\2\2\u025d\u025e"+
		"\7)\2\2\u025e\u025f\5\\/\2\u025f\u0260\7*\2\2\u0260\u0261\b%\1\2\u0261"+
		"\u0267\7\'\2\2\u0262\u0263\5J&\2\u0263\u0264\b%\1\2\u0264\u0266\3\2\2"+
		"\2\u0265\u0262\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268"+
		"\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026b\7\32\2\2"+
		"\u026b\u026f\7$\2\2\u026c\u026d\5\6\4\2\u026d\u026e\b%\1\2\u026e\u0270"+
		"\3\2\2\2\u026f\u026c\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\7(\2\2\u0274\u0275\b%\1"+
		"\2\u0275I\3\2\2\2\u0276\u0277\7\20\2\2\u0277\u0278\5^\60\2\u0278\u0279"+
		"\b&\1\2\u0279\u027d\7$\2\2\u027a\u027b\5\6\4\2\u027b\u027c\b&\1\2\u027c"+
		"\u027e\3\2\2\2\u027d\u027a\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u027d\3\2"+
		"\2\2\u027f\u0280\3\2\2\2\u0280K\3\2\2\2\u0281\u0282\7\n\2\2\u0282\u0283"+
		"\7)\2\2\u0283\u0284\5\u0082B\2\u0284\u0285\7$\2\2\u0285\u0286\5\20\t\2"+
		"\u0286\u0287\7#\2\2\u0287\u0288\5\\/\2\u0288\u0289\7*\2\2\u0289\u028a"+
		"\5\6\4\2\u028a\u028b\b\'\1\2\u028b\u0298\3\2\2\2\u028c\u028d\7\n\2\2\u028d"+
		"\u028e\7)\2\2\u028e\u028f\5\u0082B\2\u028f\u0290\7$\2\2\u0290\u0291\5"+
		"\20\t\2\u0291\u0292\7G\2\2\u0292\u0293\5\\/\2\u0293\u0294\7*\2\2\u0294"+
		"\u0295\5\6\4\2\u0295\u0296\b\'\1\2\u0296\u0298\3\2\2\2\u0297\u0281\3\2"+
		"\2\2\u0297\u028c\3\2\2\2\u0298M\3\2\2\2\u0299\u029a\7\f\2\2\u029a\u029b"+
		"\7)\2\2\u029b\u029c\5\u0082B\2\u029c\u029d\7$\2\2\u029d\u029e\5\20\t\2"+
		"\u029e\u029f\7#\2\2\u029f\u02a0\5\\/\2\u02a0\u02a1\7*\2\2\u02a1\u02a2"+
		"\5\6\4\2\u02a2\u02a3\b(\1\2\u02a3O\3\2\2\2\u02a4\u02a5\7\13\2\2\u02a5"+
		"\u02a6\7)\2\2\u02a6\u02a7\5\u0082B\2\u02a7\u02a8\7$\2\2\u02a8\u02a9\5"+
		"\20\t\2\u02a9\u02aa\7#\2\2\u02aa\u02ab\5\\/\2\u02ab\u02ac\7*\2\2\u02ac"+
		"\u02ad\5\6\4\2\u02ad\u02ae\b)\1\2\u02aeQ\3\2\2\2\u02af\u02b0\7\23\2\2"+
		"\u02b0\u02b1\7)\2\2\u02b1\u02b2\5\\/\2\u02b2\u02b3\7*\2\2\u02b3\u02b4"+
		"\5\6\4\2\u02b4\u02b5\b*\1\2\u02b5S\3\2\2\2\u02b6\u02ba\7 \2\2\u02b7\u02ba"+
		"\7!\2\2\u02b8\u02ba\b+\1\2\u02b9\u02b6\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9"+
		"\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02ce\b+\1\2\u02bc\u02bd\7D\2"+
		"\2\u02bd\u02cf\b+\1\2\u02be\u02bf\5\u0082B\2\u02bf\u02c0\7$\2\2\u02c0"+
		"\u02c1\5\u0082B\2\u02c1\u02c2\b+\1\2\u02c2\u02cf\3\2\2\2\u02c3\u02c4\5"+
		"\u0082B\2\u02c4\u02cb\b+\1\2\u02c5\u02c6\7%\2\2\u02c6\u02c7\5\u0082B\2"+
		"\u02c7\u02c8\b+\1\2\u02c8\u02ca\3\2\2\2\u02c9\u02c5\3\2\2\2\u02ca\u02cd"+
		"\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd"+
		"\u02cb\3\2\2\2\u02ce\u02bc\3\2\2\2\u02ce\u02be\3\2\2\2\u02ce\u02c3\3\2"+
		"\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\7I\2\2\u02d1\u02d2\5\6\4\2\u02d2"+
		"\u02d3\b+\1\2\u02d3U\3\2\2\2\u02d4\u02d5\7)\2\2\u02d5\u02d6\5\u0082B\2"+
		"\u02d6\u02d7\7$\2\2\u02d7\u02d8\5\u0082B\2\u02d8\u02d9\7*\2\2\u02d9\u02de"+
		"\b,\1\2\u02da\u02db\7$\2\2\u02db\u02dc\5\20\t\2\u02dc\u02dd\b,\1\2\u02dd"+
		"\u02df\3\2\2\2\u02de\u02da\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2"+
		"\2\2\u02e0\u02e1\5\6\4\2\u02e1\u02e2\b,\1\2\u02e2W\3\2\2\2\u02e3\u02e4"+
		"\7)\2\2\u02e4\u02e5\5\u0082B\2\u02e5\u02e6\7%\2\2\u02e6\u02e7\5\u0082"+
		"B\2\u02e7\u02e8\7$\2\2\u02e8\u02e9\5\u0082B\2\u02e9\u02ea\7*\2\2\u02ea"+
		"\u02eb\b-\1\2\u02eb\u02ec\7$\2\2\u02ec\u02ed\5\20\t\2\u02ed\u02ee\b-\1"+
		"\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\5\6\4\2\u02f0\u02f1\b-\1\2\u02f1Y\3"+
		"\2\2\2\u02f2\u02f3\7\"\2\2\u02f3\u02f4\b.\1\2\u02f4[\3\2\2\2\u02f5\u02f6"+
		"\5`\61\2\u02f6\u02fd\b/\1\2\u02f7\u02f8\t\3\2\2\u02f8\u02f9\5`\61\2\u02f9"+
		"\u02fa\b/\1\2\u02fa\u02fc\3\2\2\2\u02fb\u02f7\3\2\2\2\u02fc\u02ff\3\2"+
		"\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe]\3\2\2\2\u02ff\u02fd"+
		"\3\2\2\2\u0300\u0301\5\\/\2\u0301\u0308\b\60\1\2\u0302\u0303\7%\2\2\u0303"+
		"\u0304\5\\/\2\u0304\u0305\b\60\1\2\u0305\u0307\3\2\2\2\u0306\u0302\3\2"+
		"\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"\u031b\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030c\5\\/\2\u030c\u0317\b\60"+
		"\1\2\u030d\u030e\b\60\1\2\u030e\u030f\5\\/\2\u030f\u0310\b\60\1\2\u0310"+
		"\u0316\3\2\2\2\u0311\u0312\7%\2\2\u0312\u0313\5\\/\2\u0313\u0314\b\60"+
		"\1\2\u0314\u0316\3\2\2\2\u0315\u030d\3\2\2\2\u0315\u0311\3\2\2\2\u0316"+
		"\u0319\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031b\3\2"+
		"\2\2\u0319\u0317\3\2\2\2\u031a\u0300\3\2\2\2\u031a\u030b\3\2\2\2\u031b"+
		"_\3\2\2\2\u031c\u031d\5b\62\2\u031d\u0325\b\61\1\2\u031e\u031f\t\4\2\2"+
		"\u031f\u0320\b\61\1\2\u0320\u0321\5b\62\2\u0321\u0322\b\61\1\2\u0322\u0324"+
		"\3\2\2\2\u0323\u031e\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326a\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u0329\5d\63\2"+
		"\u0329\u032a\t\5\2\2\u032a\u032b\5d\63\2\u032b\u032c\b\62\1\2\u032c\u0331"+
		"\3\2\2\2\u032d\u032e\5d\63\2\u032e\u032f\b\62\1\2\u032f\u0331\3\2\2\2"+
		"\u0330\u0328\3\2\2\2\u0330\u032d\3\2\2\2\u0331c\3\2\2\2\u0332\u0333\5"+
		"f\64\2\u0333\u033b\b\63\1\2\u0334\u0335\t\6\2\2\u0335\u0336\b\63\1\2\u0336"+
		"\u0337\5f\64\2\u0337\u0338\b\63\1\2\u0338\u033a\3\2\2\2\u0339\u0334\3"+
		"\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c"+
		"e\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u033f\5h\65\2\u033f\u0347\b\64\1\2"+
		"\u0340\u0341\t\7\2\2\u0341\u0342\b\64\1\2\u0342\u0343\5h\65\2\u0343\u0344"+
		"\b\64\1\2\u0344\u0346\3\2\2\2\u0345\u0340\3\2\2\2\u0346\u0349\3\2\2\2"+
		"\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348g\3\2\2\2\u0349\u0347\3"+
		"\2\2\2\u034a\u034b\5p9\2\u034b\u0357\b\65\1\2\u034c\u034d\5j\66\2\u034d"+
		"\u034e\b\65\1\2\u034e\u0356\3\2\2\2\u034f\u0350\5l\67\2\u0350\u0351\b"+
		"\65\1\2\u0351\u0356\3\2\2\2\u0352\u0353\5n8\2\u0353\u0354\b\65\1\2\u0354"+
		"\u0356\3\2\2\2\u0355\u034c\3\2\2\2\u0355\u034f\3\2\2\2\u0355\u0352\3\2"+
		"\2\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358"+
		"i\3\2\2\2\u0359\u0357\3\2\2\2\u035a\u035b\7&\2\2\u035b\u035c\5\u0082B"+
		"\2\u035c\u035d\b\66\1\2\u035dk\3\2\2\2\u035e\u035f\7+\2\2\u035f\u0360"+
		"\5\\/\2\u0360\u0365\b\67\1\2\u0361\u0362\7$\2\2\u0362\u0363\5\\/\2\u0363"+
		"\u0364\b\67\1\2\u0364\u0366\3\2\2\2\u0365\u0361\3\2\2\2\u0365\u0366\3"+
		"\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\7,\2\2\u0368m\3\2\2\2\u0369\u036a"+
		"\7)\2\2\u036a\u036e\b8\1\2\u036b\u036c\5^\60\2\u036c\u036d\b8\1\2\u036d"+
		"\u036f\3\2\2\2\u036e\u036b\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2"+
		"\2\2\u0370\u0371\7*\2\2\u0371o\3\2\2\2\u0372\u0373\5\u008aF\2\u0373\u0374"+
		"\b9\1\2\u0374\u039b\3\2\2\2\u0375\u0376\5\u0088E\2\u0376\u0377\b9\1\2"+
		"\u0377\u039b\3\2\2\2\u0378\u0379\5\u008cG\2\u0379\u037a\b9\1\2\u037a\u039b"+
		"\3\2\2\2\u037b\u037c\5\u0084C\2\u037c\u037d\b9\1\2\u037d\u039b\3\2\2\2"+
		"\u037e\u037f\5\u0086D\2\u037f\u0380\b9\1\2\u0380\u039b\3\2\2\2\u0381\u0382"+
		"\5~@\2\u0382\u0383\b9\1\2\u0383\u039b\3\2\2\2\u0384\u0385\5v<\2\u0385"+
		"\u0386\b9\1\2\u0386\u039b\3\2\2\2\u0387\u0388\5x=\2\u0388\u0389\b9\1\2"+
		"\u0389\u039b\3\2\2\2\u038a\u038b\5z>\2\u038b\u038c\b9\1\2\u038c\u039b"+
		"\3\2\2\2\u038d\u038e\5|?\2\u038e\u038f\b9\1\2\u038f\u039b\3\2\2\2\u0390"+
		"\u0391\5r:\2\u0391\u0392\b9\1\2\u0392\u039b\3\2\2\2\u0393\u039b\7F\2\2"+
		"\u0394\u0395\5t;\2\u0395\u0396\b9\1\2\u0396\u039b\3\2\2\2\u0397\u0398"+
		"\5\u0082B\2\u0398\u0399\b9\1\2\u0399\u039b\3\2\2\2\u039a\u0372\3\2\2\2"+
		"\u039a\u0375\3\2\2\2\u039a\u0378\3\2\2\2\u039a\u037b\3\2\2\2\u039a\u037e"+
		"\3\2\2\2\u039a\u0381\3\2\2\2\u039a\u0384\3\2\2\2\u039a\u0387\3\2\2\2\u039a"+
		"\u038a\3\2\2\2\u039a\u038d\3\2\2\2\u039a\u0390\3\2\2\2\u039a\u0393\3\2"+
		"\2\2\u039a\u0394\3\2\2\2\u039a\u0397\3\2\2\2\u039bq\3\2\2\2\u039c\u039d"+
		"\t\b\2\2\u039d\u039e\5h\65\2\u039e\u039f\b:\1\2\u039fs\3\2\2\2\u03a0\u03a1"+
		"\7)\2\2\u03a1\u03a2\5\\/\2\u03a2\u03a3\7*\2\2\u03a3\u03a4\b;\1\2\u03a4"+
		"u\3\2\2\2\u03a5\u03a6\5\"\22\2\u03a6\u03a7\5\60\31\2\u03a7\u03a8\b<\1"+
		"\2\u03a8\u03ae\3\2\2\2\u03a9\u03aa\5\u0082B\2\u03aa\u03ab\5\60\31\2\u03ab"+
		"\u03ac\b<\1\2\u03ac\u03ae\3\2\2\2\u03ad\u03a5\3\2\2\2\u03ad\u03a9\3\2"+
		"\2\2\u03aew\3\2\2\2\u03af\u03b5\5$\23\2\u03b0\u03b1\5X-\2\u03b1\u03b2"+
		"\b=\1\2\u03b2\u03b6\3\2\2\2\u03b3\u03b4\b=\1\2\u03b4\u03b6\5\6\4\2\u03b5"+
		"\u03b0\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\b="+
		"\1\2\u03b8y\3\2\2\2\u03b9\u03ba\5&\24\2\u03ba\u03c0\7\'\2\2\u03bb\u03bc"+
		"\5T+\2\u03bc\u03bd\b>\1\2\u03bd\u03c1\3\2\2\2\u03be\u03bf\b>\1\2\u03bf"+
		"\u03c1\5\6\4\2\u03c0\u03bb\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c2\3\2"+
		"\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4"+
		"\u03c5\7(\2\2\u03c5\u03c6\b>\1\2\u03c6{\3\2\2\2\u03c7\u03cd\5(\25\2\u03c8"+
		"\u03c9\5V,\2\u03c9\u03ca\b?\1\2\u03ca\u03ce\3\2\2\2\u03cb\u03cc\b?\1\2"+
		"\u03cc\u03ce\5\6\4\2\u03cd\u03c8\3\2\2\2\u03cd\u03cb\3\2\2\2\u03ce\u03cf"+
		"\3\2\2\2\u03cf\u03d0\b?\1\2\u03d0}\3\2\2\2\u03d1\u03e3\7\'\2\2\u03d2\u03d3"+
		"\5^\60\2\u03d3\u03d4\b@\1\2\u03d4\u03e4\3\2\2\2\u03d5\u03d6\b@\1\2\u03d6"+
		"\u03d7\5\u0080A\2\u03d7\u03de\b@\1\2\u03d8\u03d9\7%\2\2\u03d9\u03da\5"+
		"\u0080A\2\u03da\u03db\b@\1\2\u03db\u03dd\3\2\2\2\u03dc\u03d8\3\2\2\2\u03dd"+
		"\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e4\3\2"+
		"\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e2\7$\2\2\u03e2\u03e4\b@\1\2\u03e3\u03d2"+
		"\3\2\2\2\u03e3\u03d5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"\u03e5\3\2\2\2\u03e5\u03e6\7(\2\2\u03e6\177\3\2\2\2\u03e7\u03e8\5\\/\2"+
		"\u03e8\u03e9\7$\2\2\u03e9\u03ea\5\\/\2\u03ea\u03eb\bA\1\2\u03eb\u0081"+
		"\3\2\2\2\u03ec\u03ed\7P\2\2\u03ed\u042f\bB\1\2\u03ee\u03ef\7\22\2\2\u03ef"+
		"\u042f\bB\1\2\u03f0\u03f1\7\3\2\2\u03f1\u042f\bB\1\2\u03f2\u03f3\7\4\2"+
		"\2\u03f3\u042f\bB\1\2\u03f4\u03f5\7\5\2\2\u03f5\u042f\bB\1\2\u03f6\u03f7"+
		"\7\6\2\2\u03f7\u042f\bB\1\2\u03f8\u03f9\7\7\2\2\u03f9\u042f\bB\1\2\u03fa"+
		"\u03fb\7\b\2\2\u03fb\u042f\bB\1\2\u03fc\u03fd\7\t\2\2\u03fd\u042f\bB\1"+
		"\2\u03fe\u03ff\7\n\2\2\u03ff\u042f\bB\1\2\u0400\u0401\7\13\2\2\u0401\u042f"+
		"\bB\1\2\u0402\u0403\7\f\2\2\u0403\u042f\bB\1\2\u0404\u0405\7\r\2\2\u0405"+
		"\u042f\bB\1\2\u0406\u0407\7\16\2\2\u0407\u042f\bB\1\2\u0408\u0409\7\17"+
		"\2\2\u0409\u042f\bB\1\2\u040a\u040b\7\20\2\2\u040b\u042f\bB\1\2\u040c"+
		"\u040d\7\21\2\2\u040d\u042f\bB\1\2\u040e\u040f\7\23\2\2\u040f\u042f\b"+
		"B\1\2\u0410\u0411\7\24\2\2\u0411\u042f\bB\1\2\u0412\u0413\7\25\2\2\u0413"+
		"\u042f\bB\1\2\u0414\u0415\7\26\2\2\u0415\u042f\bB\1\2\u0416\u0417\7\27"+
		"\2\2\u0417\u042f\bB\1\2\u0418\u0419\7\30\2\2\u0419\u042f\bB\1\2\u041a"+
		"\u041b\7\31\2\2\u041b\u042f\bB\1\2\u041c\u041d\7\32\2\2\u041d\u042f\b"+
		"B\1\2\u041e\u041f\7\33\2\2\u041f\u042f\bB\1\2\u0420\u0421\7\34\2\2\u0421"+
		"\u042f\bB\1\2\u0422\u0423\7\35\2\2\u0423\u042f\bB\1\2\u0424\u0425\7\36"+
		"\2\2\u0425\u042f\bB\1\2\u0426\u0427\7\37\2\2\u0427\u042f\bB\1\2\u0428"+
		"\u0429\7 \2\2\u0429\u042f\bB\1\2\u042a\u042b\7!\2\2\u042b\u042f\bB\1\2"+
		"\u042c\u042d\7\"\2\2\u042d\u042f\bB\1\2\u042e\u03ec\3\2\2\2\u042e\u03ee"+
		"\3\2\2\2\u042e\u03f0\3\2\2\2\u042e\u03f2\3\2\2\2\u042e\u03f4\3\2\2\2\u042e"+
		"\u03f6\3\2\2\2\u042e\u03f8\3\2\2\2\u042e\u03fa\3\2\2\2\u042e\u03fc\3\2"+
		"\2\2\u042e\u03fe\3\2\2\2\u042e\u0400\3\2\2\2\u042e\u0402\3\2\2\2\u042e"+
		"\u0404\3\2\2\2\u042e\u0406\3\2\2\2\u042e\u0408\3\2\2\2\u042e\u040a\3\2"+
		"\2\2\u042e\u040c\3\2\2\2\u042e\u040e\3\2\2\2\u042e\u0410\3\2\2\2\u042e"+
		"\u0412\3\2\2\2\u042e\u0414\3\2\2\2\u042e\u0416\3\2\2\2\u042e\u0418\3\2"+
		"\2\2\u042e\u041a\3\2\2\2\u042e\u041c\3\2\2\2\u042e\u041e\3\2\2\2\u042e"+
		"\u0420\3\2\2\2\u042e\u0422\3\2\2\2\u042e\u0424\3\2\2\2\u042e\u0426\3\2"+
		"\2\2\u042e\u0428\3\2\2\2\u042e\u042a\3\2\2\2\u042e\u042c\3\2\2\2\u042f"+
		"\u0083\3\2\2\2\u0430\u0431\7J\2\2\u0431\u0432\bC\1\2\u0432\u0085\3\2\2"+
		"\2\u0433\u0434\7K\2\2\u0434\u0435\bD\1\2\u0435\u0087\3\2\2\2\u0436\u0437"+
		"\7L\2\2\u0437\u0438\bE\1\2\u0438\u0089\3\2\2\2\u0439\u043a\7N\2\2\u043a"+
		"\u043e\bF\1\2\u043b\u043c\7M\2\2\u043c\u043e\bF\1\2\u043d\u0439\3\2\2"+
		"\2\u043d\u043b\3\2\2\2\u043e\u008b\3\2\2\2\u043f\u0440\7O\2\2\u0440\u0441"+
		"\bG\1\2\u0441\u008d\3\2\2\2H\u0097\u009f\u00aa\u00da\u00e0\u00f3\u00f7"+
		"\u00f9\u0102\u011c\u0123\u012c\u0136\u013d\u014d\u0150\u0157\u0163\u016f"+
		"\u0171\u0174\u017b\u017d\u01bb\u01cb\u01e6\u01f8\u0202\u0206\u020d\u0213"+
		"\u0219\u0225\u022d\u0237\u0239\u0242\u0251\u0258\u0267\u0271\u027f\u0297"+
		"\u02b9\u02cb\u02ce\u02de\u02fd\u0308\u0315\u0317\u031a\u0325\u0330\u033b"+
		"\u0347\u0355\u0357\u0365\u036e\u039a\u03ad\u03b5\u03c0\u03c2\u03cd\u03de"+
		"\u03e3\u042e\u043d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}