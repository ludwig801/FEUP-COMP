// Generated from C:/Users/Aleister/IdeaProjects/FEUP-COMP/src/LexerParserRules\JSON.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull JSONParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(@NotNull JSONParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#nodeSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeSection(@NotNull JSONParser.NodeSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#linkSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkSection(@NotNull JSONParser.LinkSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#firstSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstSection(@NotNull JSONParser.FirstSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#extraSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtraSection(@NotNull JSONParser.ExtraSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(@NotNull JSONParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#nodelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodelist(@NotNull JSONParser.NodelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#linklist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinklist(@NotNull JSONParser.LinklistContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(@NotNull JSONParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#nodeAttrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeAttrList(@NotNull JSONParser.NodeAttrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(@NotNull JSONParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#linkNodeTS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkNodeTS(@NotNull JSONParser.LinkNodeTSContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#linkAttrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkAttrList(@NotNull JSONParser.LinkAttrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#nodeAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeAttr(@NotNull JSONParser.NodeAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#nodeAttrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeAttrValue(@NotNull JSONParser.NodeAttrValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#linkAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkAttr(@NotNull JSONParser.LinkAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#linkAttrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkAttrValue(@NotNull JSONParser.LinkAttrValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#groupSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupSection(@NotNull JSONParser.GroupSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#groupOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupOptionList(@NotNull JSONParser.GroupOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#groupOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupOption(@NotNull JSONParser.GroupOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#groupAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupAttributeList(@NotNull JSONParser.GroupAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#groupAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupAttr(@NotNull JSONParser.GroupAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#groupAttrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupAttrValue(@NotNull JSONParser.GroupAttrValueContext ctx);
}