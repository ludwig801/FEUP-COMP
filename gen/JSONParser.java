// Generated from C:/Users/Aleister/IdeaProjects/FEUP-COMP/src/LexerParserRules\JSON.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAMELIT=1, GROUPLIT=2, GROUPSLIT=3, NODELIT=4, LINKLIT=5, SOURCELIT=6, 
		TARGETLIT=7, VALUELIT=8, INT=9, DOUBLE=10, STRING=11, NAME=12, OPBR=13, 
		CLBR=14, OPSQBR=15, CLSQBR=16, COMMA=17, COLON=18, QUOTATION=19, EQUAL=20, 
		WS=21;
	public static final int
		RULE_start = 0, RULE_json = 1, RULE_nodeSection = 2, RULE_linkSection = 3, 
		RULE_firstSection = 4, RULE_extraSection = 5, RULE_section = 6, RULE_nodelist = 7, 
		RULE_linklist = 8, RULE_node = 9, RULE_nodeAttrList = 10, RULE_link = 11, 
		RULE_linkNodeTS = 12, RULE_linkAttrList = 13, RULE_nodeAttr = 14, RULE_nodeAttrValue = 15, 
		RULE_linkAttr = 16, RULE_linkAttrValue = 17, RULE_groupSection = 18, RULE_groupOptionList = 19, 
		RULE_groupOption = 20, RULE_groupAttributeList = 21, RULE_groupAttr = 22, 
		RULE_groupAttrValue = 23;
	public static final String[] ruleNames = {
		"start", "json", "nodeSection", "linkSection", "firstSection", "extraSection", 
		"section", "nodelist", "linklist", "node", "nodeAttrList", "link", "linkNodeTS", 
		"linkAttrList", "nodeAttr", "nodeAttrValue", "linkAttr", "linkAttrValue", 
		"groupSection", "groupOptionList", "groupOption", "groupAttributeList", 
		"groupAttr", "groupAttrValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'name'", "'group'", "'groups'", "'nodes'", "'links'", "'source'", 
		"'target'", "'value'", null, null, null, null, "'{'", "'}'", "'['", "']'", 
		"','", "':'", "'\"'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NAMELIT", "GROUPLIT", "GROUPSLIT", "NODELIT", "LINKLIT", "SOURCELIT", 
		"TARGETLIT", "VALUELIT", "INT", "DOUBLE", "STRING", "NAME", "OPBR", "CLBR", 
		"OPSQBR", "CLSQBR", "COMMA", "COLON", "QUOTATION", "EQUAL", "WS"
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JSON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JSONParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			json();
			setState(49); 
			match(EOF);
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

	public static class JsonContext extends ParserRuleContext {
		public TerminalNode OPBR() { return getToken(JSONParser.OPBR, 0); }
		public FirstSectionContext firstSection() {
			return getRuleContext(FirstSectionContext.class,0);
		}
		public TerminalNode CLBR() { return getToken(JSONParser.CLBR, 0); }
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			match(OPBR);
			setState(52); 
			firstSection();
			setState(53); 
			match(CLBR);
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

	public static class NodeSectionContext extends ParserRuleContext {
		public List<TerminalNode> QUOTATION() { return getTokens(JSONParser.QUOTATION); }
		public TerminalNode QUOTATION(int i) {
			return getToken(JSONParser.QUOTATION, i);
		}
		public TerminalNode NODELIT() { return getToken(JSONParser.NODELIT, 0); }
		public TerminalNode COLON() { return getToken(JSONParser.COLON, 0); }
		public TerminalNode OPSQBR() { return getToken(JSONParser.OPSQBR, 0); }
		public NodelistContext nodelist() {
			return getRuleContext(NodelistContext.class,0);
		}
		public TerminalNode CLSQBR() { return getToken(JSONParser.CLSQBR, 0); }
		public NodeSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterNodeSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitNodeSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitNodeSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeSectionContext nodeSection() throws RecognitionException {
		NodeSectionContext _localctx = new NodeSectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nodeSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			match(QUOTATION);
			setState(56); 
			match(NODELIT);
			setState(57); 
			match(QUOTATION);
			setState(58); 
			match(COLON);
			setState(59); 
			match(OPSQBR);
			setState(60); 
			nodelist();
			setState(61); 
			match(CLSQBR);
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

	public static class LinkSectionContext extends ParserRuleContext {
		public List<TerminalNode> QUOTATION() { return getTokens(JSONParser.QUOTATION); }
		public TerminalNode QUOTATION(int i) {
			return getToken(JSONParser.QUOTATION, i);
		}
		public TerminalNode LINKLIT() { return getToken(JSONParser.LINKLIT, 0); }
		public TerminalNode COLON() { return getToken(JSONParser.COLON, 0); }
		public TerminalNode OPSQBR() { return getToken(JSONParser.OPSQBR, 0); }
		public LinklistContext linklist() {
			return getRuleContext(LinklistContext.class,0);
		}
		public TerminalNode CLSQBR() { return getToken(JSONParser.CLSQBR, 0); }
		public LinkSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterLinkSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitLinkSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitLinkSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkSectionContext linkSection() throws RecognitionException {
		LinkSectionContext _localctx = new LinkSectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_linkSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			match(QUOTATION);
			setState(64); 
			match(LINKLIT);
			setState(65); 
			match(QUOTATION);
			setState(66); 
			match(COLON);
			setState(67); 
			match(OPSQBR);
			setState(68); 
			linklist();
			setState(69); 
			match(CLSQBR);
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

	public static class FirstSectionContext extends ParserRuleContext {
		public NodeSectionContext nodeSection() {
			return getRuleContext(NodeSectionContext.class,0);
		}
		public ExtraSectionContext extraSection() {
			return getRuleContext(ExtraSectionContext.class,0);
		}
		public LinkSectionContext linkSection() {
			return getRuleContext(LinkSectionContext.class,0);
		}
		public GroupSectionContext groupSection() {
			return getRuleContext(GroupSectionContext.class,0);
		}
		public FirstSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterFirstSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitFirstSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitFirstSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstSectionContext firstSection() throws RecognitionException {
		FirstSectionContext _localctx = new FirstSectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_firstSection);
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); 
				nodeSection();
				setState(72); 
				extraSection();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); 
				linkSection();
				setState(75); 
				extraSection();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); 
				groupSection();
				setState(78); 
				extraSection();
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

	public static class ExtraSectionContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public ExtraSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterExtraSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitExtraSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitExtraSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraSectionContext extraSection() throws RecognitionException {
		ExtraSectionContext _localctx = new ExtraSectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_extraSection);
		try {
			setState(85);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); 
				match(COMMA);
				setState(83); 
				section();
				}
				break;
			case CLBR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SectionContext extends ParserRuleContext {
		public NodeSectionContext nodeSection() {
			return getRuleContext(NodeSectionContext.class,0);
		}
		public ExtraSectionContext extraSection() {
			return getRuleContext(ExtraSectionContext.class,0);
		}
		public LinkSectionContext linkSection() {
			return getRuleContext(LinkSectionContext.class,0);
		}
		public GroupSectionContext groupSection() {
			return getRuleContext(GroupSectionContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_section);
		try {
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); 
				nodeSection();
				setState(88); 
				extraSection();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90); 
				linkSection();
				setState(91); 
				extraSection();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93); 
				groupSection();
				setState(94); 
				extraSection();
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

	public static class NodelistContext extends ParserRuleContext {
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public NodelistContext nodelist() {
			return getRuleContext(NodelistContext.class,0);
		}
		public NodelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterNodelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitNodelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitNodelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodelistContext nodelist() throws RecognitionException {
		NodelistContext _localctx = new NodelistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nodelist);
		try {
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); 
				node();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); 
				node();
				setState(100); 
				match(COMMA);
				setState(101); 
				nodelist();
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

	public static class LinklistContext extends ParserRuleContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public LinklistContext linklist() {
			return getRuleContext(LinklistContext.class,0);
		}
		public LinklistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linklist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterLinklist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitLinklist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitLinklist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinklistContext linklist() throws RecognitionException {
		LinklistContext _localctx = new LinklistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_linklist);
		try {
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); 
				link();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); 
				link();
				setState(107); 
				match(COMMA);
				setState(108); 
				linklist();
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

	public static class NodeContext extends ParserRuleContext {
		public Token name;
		public Token group;
		public TerminalNode OPBR() { return getToken(JSONParser.OPBR, 0); }
		public List<TerminalNode> QUOTATION() { return getTokens(JSONParser.QUOTATION); }
		public TerminalNode QUOTATION(int i) {
			return getToken(JSONParser.QUOTATION, i);
		}
		public TerminalNode NAMELIT() { return getToken(JSONParser.NAMELIT, 0); }
		public List<TerminalNode> COLON() { return getTokens(JSONParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JSONParser.COLON, i);
		}
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public TerminalNode GROUPLIT() { return getToken(JSONParser.GROUPLIT, 0); }
		public NodeAttrListContext nodeAttrList() {
			return getRuleContext(NodeAttrListContext.class,0);
		}
		public TerminalNode CLBR() { return getToken(JSONParser.CLBR, 0); }
		public TerminalNode NAME() { return getToken(JSONParser.NAME, 0); }
		public TerminalNode INT() { return getToken(JSONParser.INT, 0); }
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			match(OPBR);
			setState(113); 
			match(QUOTATION);
			setState(114); 
			match(NAMELIT);
			setState(115); 
			match(QUOTATION);
			setState(116); 
			match(COLON);
			setState(117); 
			match(QUOTATION);
			setState(118); 
			((NodeContext)_localctx).name = match(NAME);
			setState(119); 
			match(QUOTATION);
			setState(120); 
			match(COMMA);
			setState(121); 
			match(QUOTATION);
			setState(122); 
			match(GROUPLIT);
			setState(123); 
			match(QUOTATION);
			setState(124); 
			match(COLON);
			setState(125); 
			((NodeContext)_localctx).group = match(INT);
			setState(126); 
			nodeAttrList();
			setState(127); 
			match(CLBR);
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

	public static class NodeAttrListContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public NodeAttrContext nodeAttr() {
			return getRuleContext(NodeAttrContext.class,0);
		}
		public NodeAttrListContext nodeAttrList() {
			return getRuleContext(NodeAttrListContext.class,0);
		}
		public NodeAttrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeAttrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterNodeAttrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitNodeAttrList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitNodeAttrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeAttrListContext nodeAttrList() throws RecognitionException {
		NodeAttrListContext _localctx = new NodeAttrListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nodeAttrList);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); 
				match(COMMA);
				setState(130); 
				nodeAttr();
				setState(131); 
				nodeAttrList();
				}
				break;
			case CLBR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LinkContext extends ParserRuleContext {
		public LinkNodeTSContext source;
		public LinkNodeTSContext target;
		public Token value;
		public TerminalNode OPBR() { return getToken(JSONParser.OPBR, 0); }
		public List<TerminalNode> QUOTATION() { return getTokens(JSONParser.QUOTATION); }
		public TerminalNode QUOTATION(int i) {
			return getToken(JSONParser.QUOTATION, i);
		}
		public TerminalNode SOURCELIT() { return getToken(JSONParser.SOURCELIT, 0); }
		public List<TerminalNode> COLON() { return getTokens(JSONParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JSONParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JSONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JSONParser.COMMA, i);
		}
		public TerminalNode TARGETLIT() { return getToken(JSONParser.TARGETLIT, 0); }
		public TerminalNode VALUELIT() { return getToken(JSONParser.VALUELIT, 0); }
		public LinkAttrListContext linkAttrList() {
			return getRuleContext(LinkAttrListContext.class,0);
		}
		public TerminalNode CLBR() { return getToken(JSONParser.CLBR, 0); }
		public List<LinkNodeTSContext> linkNodeTS() {
			return getRuleContexts(LinkNodeTSContext.class);
		}
		public LinkNodeTSContext linkNodeTS(int i) {
			return getRuleContext(LinkNodeTSContext.class,i);
		}
		public TerminalNode INT() { return getToken(JSONParser.INT, 0); }
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); 
			match(OPBR);
			setState(137); 
			match(QUOTATION);
			setState(138); 
			match(SOURCELIT);
			setState(139); 
			match(QUOTATION);
			setState(140); 
			match(COLON);
			setState(141); 
			((LinkContext)_localctx).source = linkNodeTS();
			setState(142); 
			match(COMMA);
			setState(143); 
			match(QUOTATION);
			setState(144); 
			match(TARGETLIT);
			setState(145); 
			match(QUOTATION);
			setState(146); 
			match(COLON);
			setState(147); 
			((LinkContext)_localctx).target = linkNodeTS();
			setState(148); 
			match(COMMA);
			setState(149); 
			match(QUOTATION);
			setState(150); 
			match(VALUELIT);
			setState(151); 
			match(QUOTATION);
			setState(152); 
			match(COLON);
			setState(153); 
			((LinkContext)_localctx).value = match(INT);
			setState(154); 
			linkAttrList();
			setState(155); 
			match(CLBR);
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

	public static class LinkNodeTSContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JSONParser.INT, 0); }
		public TerminalNode NAME() { return getToken(JSONParser.NAME, 0); }
		public LinkNodeTSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkNodeTS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterLinkNodeTS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitLinkNodeTS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitLinkNodeTS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkNodeTSContext linkNodeTS() throws RecognitionException {
		LinkNodeTSContext _localctx = new LinkNodeTSContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_linkNodeTS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class LinkAttrListContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public LinkAttrContext linkAttr() {
			return getRuleContext(LinkAttrContext.class,0);
		}
		public LinkAttrListContext linkAttrList() {
			return getRuleContext(LinkAttrListContext.class,0);
		}
		public LinkAttrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkAttrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterLinkAttrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitLinkAttrList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitLinkAttrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkAttrListContext linkAttrList() throws RecognitionException {
		LinkAttrListContext _localctx = new LinkAttrListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_linkAttrList);
		try {
			setState(164);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); 
				match(COMMA);
				setState(160); 
				linkAttr();
				setState(161); 
				linkAttrList();
				}
				break;
			case CLBR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NodeAttrContext extends ParserRuleContext {
		public Token name;
		public NodeAttrValueContext value;
		public TerminalNode EQUAL() { return getToken(JSONParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public NodeAttrValueContext nodeAttrValue() {
			return getRuleContext(NodeAttrValueContext.class,0);
		}
		public NodeAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterNodeAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitNodeAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitNodeAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeAttrContext nodeAttr() throws RecognitionException {
		NodeAttrContext _localctx = new NodeAttrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nodeAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); 
			((NodeAttrContext)_localctx).name = match(STRING);
			setState(167); 
			match(EQUAL);
			setState(168); 
			((NodeAttrContext)_localctx).value = nodeAttrValue();
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

	public static class NodeAttrValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(JSONParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(JSONParser.INT, 0); }
		public NodeAttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeAttrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterNodeAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitNodeAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitNodeAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeAttrValueContext nodeAttrValue() throws RecognitionException {
		NodeAttrValueContext _localctx = new NodeAttrValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nodeAttrValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class LinkAttrContext extends ParserRuleContext {
		public Token name;
		public LinkAttrValueContext value;
		public TerminalNode EQUAL() { return getToken(JSONParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public LinkAttrValueContext linkAttrValue() {
			return getRuleContext(LinkAttrValueContext.class,0);
		}
		public LinkAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterLinkAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitLinkAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitLinkAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkAttrContext linkAttr() throws RecognitionException {
		LinkAttrContext _localctx = new LinkAttrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_linkAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); 
			((LinkAttrContext)_localctx).name = match(STRING);
			setState(173); 
			match(EQUAL);
			setState(174); 
			((LinkAttrContext)_localctx).value = linkAttrValue();
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

	public static class LinkAttrValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(JSONParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(JSONParser.INT, 0); }
		public LinkAttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkAttrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterLinkAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitLinkAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitLinkAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkAttrValueContext linkAttrValue() throws RecognitionException {
		LinkAttrValueContext _localctx = new LinkAttrValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_linkAttrValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class GroupSectionContext extends ParserRuleContext {
		public List<TerminalNode> QUOTATION() { return getTokens(JSONParser.QUOTATION); }
		public TerminalNode QUOTATION(int i) {
			return getToken(JSONParser.QUOTATION, i);
		}
		public TerminalNode GROUPSLIT() { return getToken(JSONParser.GROUPSLIT, 0); }
		public TerminalNode COLON() { return getToken(JSONParser.COLON, 0); }
		public TerminalNode OPSQBR() { return getToken(JSONParser.OPSQBR, 0); }
		public GroupOptionListContext groupOptionList() {
			return getRuleContext(GroupOptionListContext.class,0);
		}
		public TerminalNode CLSQBR() { return getToken(JSONParser.CLSQBR, 0); }
		public GroupSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterGroupSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitGroupSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitGroupSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupSectionContext groupSection() throws RecognitionException {
		GroupSectionContext _localctx = new GroupSectionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_groupSection);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case QUOTATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(178); 
				match(QUOTATION);
				setState(179); 
				match(GROUPSLIT);
				setState(180); 
				match(QUOTATION);
				setState(181); 
				match(COLON);
				setState(182); 
				match(OPSQBR);
				setState(183); 
				groupOptionList();
				setState(184); 
				match(CLSQBR);
				}
				break;
			case CLBR:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GroupOptionListContext extends ParserRuleContext {
		public GroupOptionContext groupOption() {
			return getRuleContext(GroupOptionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public GroupOptionListContext groupOptionList() {
			return getRuleContext(GroupOptionListContext.class,0);
		}
		public GroupOptionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupOptionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterGroupOptionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitGroupOptionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitGroupOptionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupOptionListContext groupOptionList() throws RecognitionException {
		GroupOptionListContext _localctx = new GroupOptionListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_groupOptionList);
		try {
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); 
				groupOption();
				setState(190); 
				match(COMMA);
				setState(191); 
				groupOptionList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); 
				groupOption();
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

	public static class GroupOptionContext extends ParserRuleContext {
		public Token group;
		public TerminalNode OPBR() { return getToken(JSONParser.OPBR, 0); }
		public List<TerminalNode> QUOTATION() { return getTokens(JSONParser.QUOTATION); }
		public TerminalNode QUOTATION(int i) {
			return getToken(JSONParser.QUOTATION, i);
		}
		public TerminalNode GROUPLIT() { return getToken(JSONParser.GROUPLIT, 0); }
		public TerminalNode COLON() { return getToken(JSONParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public GroupAttrContext groupAttr() {
			return getRuleContext(GroupAttrContext.class,0);
		}
		public GroupAttributeListContext groupAttributeList() {
			return getRuleContext(GroupAttributeListContext.class,0);
		}
		public TerminalNode CLBR() { return getToken(JSONParser.CLBR, 0); }
		public TerminalNode INT() { return getToken(JSONParser.INT, 0); }
		public GroupOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterGroupOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitGroupOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitGroupOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupOptionContext groupOption() throws RecognitionException {
		GroupOptionContext _localctx = new GroupOptionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_groupOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); 
			match(OPBR);
			setState(197); 
			match(QUOTATION);
			setState(198); 
			match(GROUPLIT);
			setState(199); 
			match(QUOTATION);
			setState(200); 
			match(COLON);
			setState(201); 
			((GroupOptionContext)_localctx).group = match(INT);
			setState(202); 
			match(COMMA);
			setState(203); 
			groupAttr();
			setState(204); 
			groupAttributeList();
			setState(205); 
			match(CLBR);
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

	public static class GroupAttributeListContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public GroupAttrContext groupAttr() {
			return getRuleContext(GroupAttrContext.class,0);
		}
		public GroupAttributeListContext groupAttributeList() {
			return getRuleContext(GroupAttributeListContext.class,0);
		}
		public GroupAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterGroupAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitGroupAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitGroupAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupAttributeListContext groupAttributeList() throws RecognitionException {
		GroupAttributeListContext _localctx = new GroupAttributeListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_groupAttributeList);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(207); 
				match(COMMA);
				setState(208); 
				groupAttr();
				setState(209); 
				groupAttributeList();
				}
				break;
			case CLBR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GroupAttrContext extends ParserRuleContext {
		public Token name;
		public GroupAttrValueContext value;
		public TerminalNode EQUAL() { return getToken(JSONParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public GroupAttrValueContext groupAttrValue() {
			return getRuleContext(GroupAttrValueContext.class,0);
		}
		public GroupAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterGroupAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitGroupAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitGroupAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupAttrContext groupAttr() throws RecognitionException {
		GroupAttrContext _localctx = new GroupAttrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_groupAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); 
			((GroupAttrContext)_localctx).name = match(STRING);
			setState(215); 
			match(EQUAL);
			setState(216); 
			((GroupAttrContext)_localctx).value = groupAttrValue();
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

	public static class GroupAttrValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(JSONParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(JSONParser.INT, 0); }
		public GroupAttrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupAttrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterGroupAttrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitGroupAttrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONVisitor ) return ((JSONVisitor<? extends T>)visitor).visitGroupAttrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupAttrValueContext groupAttrValue() throws RecognitionException {
		GroupAttrValueContext _localctx = new GroupAttrValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_groupAttrValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u00df\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6\3"+
		"\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bc\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\3\n\3\n\3\n\5\nq\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00a7\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00be"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u00c5\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00d7\n\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\2\4\4\2\13\13\16\16\3\2\13\r\u00d2\2\62\3\2\2"+
		"\2\4\65\3\2\2\2\69\3\2\2\2\bA\3\2\2\2\nR\3\2\2\2\fW\3\2\2\2\16b\3\2\2"+
		"\2\20i\3\2\2\2\22p\3\2\2\2\24r\3\2\2\2\26\u0088\3\2\2\2\30\u008a\3\2\2"+
		"\2\32\u009f\3\2\2\2\34\u00a6\3\2\2\2\36\u00a8\3\2\2\2 \u00ac\3\2\2\2\""+
		"\u00ae\3\2\2\2$\u00b2\3\2\2\2&\u00bd\3\2\2\2(\u00c4\3\2\2\2*\u00c6\3\2"+
		"\2\2,\u00d6\3\2\2\2.\u00d8\3\2\2\2\60\u00dc\3\2\2\2\62\63\5\4\3\2\63\64"+
		"\7\2\2\3\64\3\3\2\2\2\65\66\7\17\2\2\66\67\5\n\6\2\678\7\20\2\28\5\3\2"+
		"\2\29:\7\25\2\2:;\7\6\2\2;<\7\25\2\2<=\7\24\2\2=>\7\21\2\2>?\5\20\t\2"+
		"?@\7\22\2\2@\7\3\2\2\2AB\7\25\2\2BC\7\7\2\2CD\7\25\2\2DE\7\24\2\2EF\7"+
		"\21\2\2FG\5\22\n\2GH\7\22\2\2H\t\3\2\2\2IJ\5\6\4\2JK\5\f\7\2KS\3\2\2\2"+
		"LM\5\b\5\2MN\5\f\7\2NS\3\2\2\2OP\5&\24\2PQ\5\f\7\2QS\3\2\2\2RI\3\2\2\2"+
		"RL\3\2\2\2RO\3\2\2\2S\13\3\2\2\2TU\7\23\2\2UX\5\16\b\2VX\3\2\2\2WT\3\2"+
		"\2\2WV\3\2\2\2X\r\3\2\2\2YZ\5\6\4\2Z[\5\f\7\2[c\3\2\2\2\\]\5\b\5\2]^\5"+
		"\f\7\2^c\3\2\2\2_`\5&\24\2`a\5\f\7\2ac\3\2\2\2bY\3\2\2\2b\\\3\2\2\2b_"+
		"\3\2\2\2c\17\3\2\2\2dj\5\24\13\2ef\5\24\13\2fg\7\23\2\2gh\5\20\t\2hj\3"+
		"\2\2\2id\3\2\2\2ie\3\2\2\2j\21\3\2\2\2kq\5\30\r\2lm\5\30\r\2mn\7\23\2"+
		"\2no\5\22\n\2oq\3\2\2\2pk\3\2\2\2pl\3\2\2\2q\23\3\2\2\2rs\7\17\2\2st\7"+
		"\25\2\2tu\7\3\2\2uv\7\25\2\2vw\7\24\2\2wx\7\25\2\2xy\7\16\2\2yz\7\25\2"+
		"\2z{\7\23\2\2{|\7\25\2\2|}\7\4\2\2}~\7\25\2\2~\177\7\24\2\2\177\u0080"+
		"\7\13\2\2\u0080\u0081\5\26\f\2\u0081\u0082\7\20\2\2\u0082\25\3\2\2\2\u0083"+
		"\u0084\7\23\2\2\u0084\u0085\5\36\20\2\u0085\u0086\5\26\f\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\27\3\2\2\2\u008a\u008b\7\17\2\2\u008b\u008c\7\25\2\2\u008c\u008d\7\b"+
		"\2\2\u008d\u008e\7\25\2\2\u008e\u008f\7\24\2\2\u008f\u0090\5\32\16\2\u0090"+
		"\u0091\7\23\2\2\u0091\u0092\7\25\2\2\u0092\u0093\7\t\2\2\u0093\u0094\7"+
		"\25\2\2\u0094\u0095\7\24\2\2\u0095\u0096\5\32\16\2\u0096\u0097\7\23\2"+
		"\2\u0097\u0098\7\25\2\2\u0098\u0099\7\n\2\2\u0099\u009a\7\25\2\2\u009a"+
		"\u009b\7\24\2\2\u009b\u009c\7\13\2\2\u009c\u009d\5\34\17\2\u009d\u009e"+
		"\7\20\2\2\u009e\31\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\33\3\2\2\2\u00a1"+
		"\u00a2\7\23\2\2\u00a2\u00a3\5\"\22\2\u00a3\u00a4\5\34\17\2\u00a4\u00a7"+
		"\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\35\3\2\2\2\u00a8\u00a9\7\r\2\2\u00a9\u00aa\7\26\2\2\u00aa\u00ab\5 \21"+
		"\2\u00ab\37\3\2\2\2\u00ac\u00ad\t\3\2\2\u00ad!\3\2\2\2\u00ae\u00af\7\r"+
		"\2\2\u00af\u00b0\7\26\2\2\u00b0\u00b1\5$\23\2\u00b1#\3\2\2\2\u00b2\u00b3"+
		"\t\3\2\2\u00b3%\3\2\2\2\u00b4\u00b5\7\25\2\2\u00b5\u00b6\7\5\2\2\u00b6"+
		"\u00b7\7\25\2\2\u00b7\u00b8\7\24\2\2\u00b8\u00b9\7\21\2\2\u00b9\u00ba"+
		"\5(\25\2\u00ba\u00bb\7\22\2\2\u00bb\u00be\3\2\2\2\u00bc\u00be\3\2\2\2"+
		"\u00bd\u00b4\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\'\3\2\2\2\u00bf\u00c0\5"+
		"*\26\2\u00c0\u00c1\7\23\2\2\u00c1\u00c2\5(\25\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c5\5*\26\2\u00c4\u00bf\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5)\3\2\2\2"+
		"\u00c6\u00c7\7\17\2\2\u00c7\u00c8\7\25\2\2\u00c8\u00c9\7\4\2\2\u00c9\u00ca"+
		"\7\25\2\2\u00ca\u00cb\7\24\2\2\u00cb\u00cc\7\13\2\2\u00cc\u00cd\7\23\2"+
		"\2\u00cd\u00ce\5.\30\2\u00ce\u00cf\5,\27\2\u00cf\u00d0\7\20\2\2\u00d0"+
		"+\3\2\2\2\u00d1\u00d2\7\23\2\2\u00d2\u00d3\5.\30\2\u00d3\u00d4\5,\27\2"+
		"\u00d4\u00d7\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7-\3\2\2\2\u00d8\u00d9\7\r\2\2\u00d9\u00da\7\26\2\2\u00da"+
		"\u00db\5\60\31\2\u00db/\3\2\2\2\u00dc\u00dd\t\3\2\2\u00dd\61\3\2\2\2\f"+
		"RWbip\u0088\u00a6\u00bd\u00c4\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}