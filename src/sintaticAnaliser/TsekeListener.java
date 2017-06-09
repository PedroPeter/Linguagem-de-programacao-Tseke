// Generated from C:\Users\samsara\Documents\NetBeansProjects\Tseke\src\sintaticAnaliser\Tseke.g4 by ANTLR 4.1
package sintaticAnaliser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TsekeParser}.
 */
public interface TsekeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TsekeParser#conteudo}.
	 * @param ctx the parse tree
	 */
	void enterConteudo(@NotNull TsekeParser.ConteudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#conteudo}.
	 * @param ctx the parse tree
	 */
	void exitConteudo(@NotNull TsekeParser.ConteudoContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#soma}.
	 * @param ctx the parse tree
	 */
	void enterSoma(@NotNull TsekeParser.SomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#soma}.
	 * @param ctx the parse tree
	 */
	void exitSoma(@NotNull TsekeParser.SomaContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#divisao}.
	 * @param ctx the parse tree
	 */
	void enterDivisao(@NotNull TsekeParser.DivisaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#divisao}.
	 * @param ctx the parse tree
	 */
	void exitDivisao(@NotNull TsekeParser.DivisaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(@NotNull TsekeParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(@NotNull TsekeParser.CondicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#operacoesArt}.
	 * @param ctx the parse tree
	 */
	void enterOperacoesArt(@NotNull TsekeParser.OperacoesArtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#operacoesArt}.
	 * @param ctx the parse tree
	 */
	void exitOperacoesArt(@NotNull TsekeParser.OperacoesArtContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#inicializacao}.
	 * @param ctx the parse tree
	 */
	void enterInicializacao(@NotNull TsekeParser.InicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#inicializacao}.
	 * @param ctx the parse tree
	 */
	void exitInicializacao(@NotNull TsekeParser.InicializacaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(@NotNull TsekeParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(@NotNull TsekeParser.ExpressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull TsekeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull TsekeParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(@NotNull TsekeParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(@NotNull TsekeParser.DeclaracaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#impressao}.
	 * @param ctx the parse tree
	 */
	void enterImpressao(@NotNull TsekeParser.ImpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#impressao}.
	 * @param ctx the parse tree
	 */
	void exitImpressao(@NotNull TsekeParser.ImpressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#declar_inic}.
	 * @param ctx the parse tree
	 */
	void enterDeclar_inic(@NotNull TsekeParser.Declar_inicContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#declar_inic}.
	 * @param ctx the parse tree
	 */
	void exitDeclar_inic(@NotNull TsekeParser.Declar_inicContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#decisao}.
	 * @param ctx the parse tree
	 */
	void enterDecisao(@NotNull TsekeParser.DecisaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#decisao}.
	 * @param ctx the parse tree
	 */
	void exitDecisao(@NotNull TsekeParser.DecisaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(@NotNull TsekeParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(@NotNull TsekeParser.Op_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#op_logico}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico(@NotNull TsekeParser.Op_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#op_logico}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico(@NotNull TsekeParser.Op_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#subtracao}.
	 * @param ctx the parse tree
	 */
	void enterSubtracao(@NotNull TsekeParser.SubtracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#subtracao}.
	 * @param ctx the parse tree
	 */
	void exitSubtracao(@NotNull TsekeParser.SubtracaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link TsekeParser#multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacao(@NotNull TsekeParser.MultiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TsekeParser#multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacao(@NotNull TsekeParser.MultiplicacaoContext ctx);
}