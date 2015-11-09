// Generated from C:/Users/Aleister/IdeaProjects/FEUP-COMP/src/LexerParserRules\JSON.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull JSONParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull JSONParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(@NotNull JSONParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(@NotNull JSONParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#nodeSection}.
	 * @param ctx the parse tree
	 */
	void enterNodeSection(@NotNull JSONParser.NodeSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#nodeSection}.
	 * @param ctx the parse tree
	 */
	void exitNodeSection(@NotNull JSONParser.NodeSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#linkSection}.
	 * @param ctx the parse tree
	 */
	void enterLinkSection(@NotNull JSONParser.LinkSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#linkSection}.
	 * @param ctx the parse tree
	 */
	void exitLinkSection(@NotNull JSONParser.LinkSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#firstSection}.
	 * @param ctx the parse tree
	 */
	void enterFirstSection(@NotNull JSONParser.FirstSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#firstSection}.
	 * @param ctx the parse tree
	 */
	void exitFirstSection(@NotNull JSONParser.FirstSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#extraSection}.
	 * @param ctx the parse tree
	 */
	void enterExtraSection(@NotNull JSONParser.ExtraSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#extraSection}.
	 * @param ctx the parse tree
	 */
	void exitExtraSection(@NotNull JSONParser.ExtraSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(@NotNull JSONParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(@NotNull JSONParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#nodelist}.
	 * @param ctx the parse tree
	 */
	void enterNodelist(@NotNull JSONParser.NodelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#nodelist}.
	 * @param ctx the parse tree
	 */
	void exitNodelist(@NotNull JSONParser.NodelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#linklist}.
	 * @param ctx the parse tree
	 */
	void enterLinklist(@NotNull JSONParser.LinklistContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#linklist}.
	 * @param ctx the parse tree
	 */
	void exitLinklist(@NotNull JSONParser.LinklistContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(@NotNull JSONParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(@NotNull JSONParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#nodeAttrList}.
	 * @param ctx the parse tree
	 */
	void enterNodeAttrList(@NotNull JSONParser.NodeAttrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#nodeAttrList}.
	 * @param ctx the parse tree
	 */
	void exitNodeAttrList(@NotNull JSONParser.NodeAttrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(@NotNull JSONParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(@NotNull JSONParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#linkNodeTS}.
	 * @param ctx the parse tree
	 */
	void enterLinkNodeTS(@NotNull JSONParser.LinkNodeTSContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#linkNodeTS}.
	 * @param ctx the parse tree
	 */
	void exitLinkNodeTS(@NotNull JSONParser.LinkNodeTSContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#linkAttrList}.
	 * @param ctx the parse tree
	 */
	void enterLinkAttrList(@NotNull JSONParser.LinkAttrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#linkAttrList}.
	 * @param ctx the parse tree
	 */
	void exitLinkAttrList(@NotNull JSONParser.LinkAttrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#nodeAttr}.
	 * @param ctx the parse tree
	 */
	void enterNodeAttr(@NotNull JSONParser.NodeAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#nodeAttr}.
	 * @param ctx the parse tree
	 */
	void exitNodeAttr(@NotNull JSONParser.NodeAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#nodeAttrValue}.
	 * @param ctx the parse tree
	 */
	void enterNodeAttrValue(@NotNull JSONParser.NodeAttrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#nodeAttrValue}.
	 * @param ctx the parse tree
	 */
	void exitNodeAttrValue(@NotNull JSONParser.NodeAttrValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#linkAttr}.
	 * @param ctx the parse tree
	 */
	void enterLinkAttr(@NotNull JSONParser.LinkAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#linkAttr}.
	 * @param ctx the parse tree
	 */
	void exitLinkAttr(@NotNull JSONParser.LinkAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#linkAttrValue}.
	 * @param ctx the parse tree
	 */
	void enterLinkAttrValue(@NotNull JSONParser.LinkAttrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#linkAttrValue}.
	 * @param ctx the parse tree
	 */
	void exitLinkAttrValue(@NotNull JSONParser.LinkAttrValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#groupSection}.
	 * @param ctx the parse tree
	 */
	void enterGroupSection(@NotNull JSONParser.GroupSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#groupSection}.
	 * @param ctx the parse tree
	 */
	void exitGroupSection(@NotNull JSONParser.GroupSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#groupOptionList}.
	 * @param ctx the parse tree
	 */
	void enterGroupOptionList(@NotNull JSONParser.GroupOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#groupOptionList}.
	 * @param ctx the parse tree
	 */
	void exitGroupOptionList(@NotNull JSONParser.GroupOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#groupOption}.
	 * @param ctx the parse tree
	 */
	void enterGroupOption(@NotNull JSONParser.GroupOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#groupOption}.
	 * @param ctx the parse tree
	 */
	void exitGroupOption(@NotNull JSONParser.GroupOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#groupAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGroupAttributeList(@NotNull JSONParser.GroupAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#groupAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGroupAttributeList(@NotNull JSONParser.GroupAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#groupAttr}.
	 * @param ctx the parse tree
	 */
	void enterGroupAttr(@NotNull JSONParser.GroupAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#groupAttr}.
	 * @param ctx the parse tree
	 */
	void exitGroupAttr(@NotNull JSONParser.GroupAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#groupAttrValue}.
	 * @param ctx the parse tree
	 */
	void enterGroupAttrValue(@NotNull JSONParser.GroupAttrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#groupAttrValue}.
	 * @param ctx the parse tree
	 */
	void exitGroupAttrValue(@NotNull JSONParser.GroupAttrValueContext ctx);
}