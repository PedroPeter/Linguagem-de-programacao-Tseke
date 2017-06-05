// Generated from C:\Users\samsara\Documents\NetBeansProjects\Tseke\src\Tseke.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TsekeParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, PUBLIC=2, PRIVATE=3, PROTECTED=4, CLASS=5, PACKAGE=6, IMPORT=7, 
		MODIFICADOR_ACESSO=8, PRINT=9, ATRIBUICAO=10, IGUAL=11, MAIOR=12, MENOR=13, 
		MAIOR_IGUAL=14, MENOR_IGUAL=15, DIFERENTE=16, NOT=17, OR=18, AND=19, IF=20, 
		ELSE=21, MENOS=22, SOMA=23, SUBTRACAO=24, DIVISAO=25, MULTIPLICACAO=26, 
		TIPO=27, NUM=28, INTEIRO=29, FLOAT=30, STRING=31, ABRIR_CHAVETA=32, FECHAR_CHAVETA=33, 
		ABRIR_PARENTESES=34, FECHAR_PARENTESES=35, PONTO_VIRGULA=36, VIRGULA=37, 
		BRANCO=38;
	public static final String[] tokenNames = {
		"<INVALID>", "ID", "'publico'", "'privado'", "'protegido'", "'classe'", 
		"'pacote'", "'importacao'", "MODIFICADOR_ACESSO", "'sistema.imprimir'", 
		"'='", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'!'", "'|'", "'&&'", 
		"'se'", "'senao'", "MENOS", "'+'", "SUBTRACAO", "'/'", "'*'", "'inteiro|byte|float'", 
		"NUM", "INTEIRO", "FLOAT", "STRING", "'{'", "'}'", "'('", "')'", "';'", 
		"','", "BRANCO"
	};
	public static final int
		RULE_program = 0, RULE_conteudo = 1, RULE_declaracao = 2, RULE_inicializacao = 3, 
		RULE_decisao = 4, RULE_impressao = 5, RULE_operacoesArt = 6, RULE_soma = 7, 
		RULE_subtracao = 8, RULE_divisao = 9, RULE_multiplicacao = 10, RULE_condicao = 11, 
		RULE_expressao = 12, RULE_op_relacional = 13, RULE_op_logico = 14;
	public static final String[] ruleNames = {
		"program", "conteudo", "declaracao", "inicializacao", "decisao", "impressao", 
		"operacoesArt", "soma", "subtracao", "divisao", "multiplicacao", "condicao", 
		"expressao", "op_relacional", "op_logico"
	};

	@Override
	public String getGrammarFileName() { return "Tseke.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public TsekeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TsekeParser.ID, 0); }
		public List<ConteudoContext> conteudo() {
			return getRuleContexts(ConteudoContext.class);
		}
		public TerminalNode PUBLIC() { return getToken(TsekeParser.PUBLIC, 0); }
		public TerminalNode FECHAR_CHAVETA() { return getToken(TsekeParser.FECHAR_CHAVETA, 0); }
		public TerminalNode CLASS() { return getToken(TsekeParser.CLASS, 0); }
		public TerminalNode ABRIR_CHAVETA() { return getToken(TsekeParser.ABRIR_CHAVETA, 0); }
		public ConteudoContext conteudo(int i) {
			return getRuleContext(ConteudoContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(PUBLIC);
			setState(31); match(CLASS);
			setState(32); match(ID);
			setState(33); match(ABRIR_CHAVETA);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << PRINT) | (1L << IF) | (1L << TIPO))) != 0)) {
				{
				{
				setState(34); conteudo();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40); match(FECHAR_CHAVETA);
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

	public static class ConteudoContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(TsekeParser.PRINT, 0); }
		public InicializacaoContext inicializacao() {
			return getRuleContext(InicializacaoContext.class,0);
		}
		public DecisaoContext decisao() {
			return getRuleContext(DecisaoContext.class,0);
		}
		public ImpressaoContext impressao() {
			return getRuleContext(ImpressaoContext.class,0);
		}
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public OperacoesArtContext operacoesArt() {
			return getRuleContext(OperacoesArtContext.class,0);
		}
		public ConteudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conteudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterConteudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitConteudo(this);
		}
	}

	public final ConteudoContext conteudo() throws RecognitionException {
		ConteudoContext _localctx = new ConteudoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_conteudo);
		try {
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); declaracao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43); inicializacao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44); decisao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45); impressao();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46); operacoesArt();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47); match(PRINT);
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TsekeParser.ID, 0); }
		public TerminalNode TIPO() { return getToken(TsekeParser.TIPO, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TsekeParser.PONTO_VIRGULA, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(TIPO);
			setState(51); match(ID);
			setState(52); match(PONTO_VIRGULA);
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

	public static class InicializacaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TsekeParser.ID, 0); }
		public TerminalNode NUM() { return getToken(TsekeParser.NUM, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TsekeParser.PONTO_VIRGULA, 0); }
		public TerminalNode IGUAL() { return getToken(TsekeParser.IGUAL, 0); }
		public InicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterInicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitInicializacao(this);
		}
	}

	public final InicializacaoContext inicializacao() throws RecognitionException {
		InicializacaoContext _localctx = new InicializacaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inicializacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(ID);
			setState(55); match(IGUAL);
			setState(56); match(NUM);
			setState(57); match(PONTO_VIRGULA);
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

	public static class DecisaoContext extends ParserRuleContext {
		public TerminalNode FECHAR_CHAVETA(int i) {
			return getToken(TsekeParser.FECHAR_CHAVETA, i);
		}
		public TerminalNode ELSE() { return getToken(TsekeParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(TsekeParser.IF, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode ABRIR_PARENTESES() { return getToken(TsekeParser.ABRIR_PARENTESES, 0); }
		public TerminalNode ABRIR_CHAVETA(int i) {
			return getToken(TsekeParser.ABRIR_CHAVETA, i);
		}
		public TerminalNode FECHAR_PARENTESES() { return getToken(TsekeParser.FECHAR_PARENTESES, 0); }
		public List<ConteudoContext> conteudo() {
			return getRuleContexts(ConteudoContext.class);
		}
		public List<TerminalNode> FECHAR_CHAVETA() { return getTokens(TsekeParser.FECHAR_CHAVETA); }
		public List<TerminalNode> ABRIR_CHAVETA() { return getTokens(TsekeParser.ABRIR_CHAVETA); }
		public ConteudoContext conteudo(int i) {
			return getRuleContext(ConteudoContext.class,i);
		}
		public DecisaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decisao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterDecisao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitDecisao(this);
		}
	}

	public final DecisaoContext decisao() throws RecognitionException {
		DecisaoContext _localctx = new DecisaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decisao);
		try {
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); match(IF);
				setState(60); match(ABRIR_PARENTESES);
				setState(61); condicao();
				setState(62); match(FECHAR_PARENTESES);
				setState(63); match(ABRIR_CHAVETA);
				setState(64); conteudo();
				setState(65); match(FECHAR_CHAVETA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); match(IF);
				setState(68); match(ABRIR_PARENTESES);
				setState(69); condicao();
				setState(70); match(FECHAR_PARENTESES);
				setState(71); match(ABRIR_CHAVETA);
				setState(72); conteudo();
				setState(73); match(FECHAR_CHAVETA);
				setState(74); match(ELSE);
				setState(75); match(ABRIR_CHAVETA);
				setState(76); conteudo();
				setState(77); match(FECHAR_CHAVETA);
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

	public static class ImpressaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TsekeParser.ID, 0); }
		public TerminalNode PRINT() { return getToken(TsekeParser.PRINT, 0); }
		public TerminalNode NUM() { return getToken(TsekeParser.NUM, 0); }
		public TerminalNode ABRIR_PARENTESES() { return getToken(TsekeParser.ABRIR_PARENTESES, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TsekeParser.PONTO_VIRGULA, 0); }
		public TerminalNode FECHAR_PARENTESES() { return getToken(TsekeParser.FECHAR_PARENTESES, 0); }
		public TerminalNode STRING() { return getToken(TsekeParser.STRING, 0); }
		public ImpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterImpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitImpressao(this);
		}
	}

	public final ImpressaoContext impressao() throws RecognitionException {
		ImpressaoContext _localctx = new ImpressaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_impressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(PRINT);
			setState(82); match(ABRIR_PARENTESES);
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(84); match(FECHAR_PARENTESES);
			setState(85); match(PONTO_VIRGULA);
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

	public static class OperacoesArtContext extends ParserRuleContext {
		public MultiplicacaoContext multiplicacao() {
			return getRuleContext(MultiplicacaoContext.class,0);
		}
		public SomaContext soma() {
			return getRuleContext(SomaContext.class,0);
		}
		public DivisaoContext divisao() {
			return getRuleContext(DivisaoContext.class,0);
		}
		public SubtracaoContext subtracao() {
			return getRuleContext(SubtracaoContext.class,0);
		}
		public OperacoesArtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacoesArt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterOperacoesArt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitOperacoesArt(this);
		}
	}

	public final OperacoesArtContext operacoesArt() throws RecognitionException {
		OperacoesArtContext _localctx = new OperacoesArtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operacoesArt);
		try {
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); soma();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88); subtracao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89); divisao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90); multiplicacao();
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

	public static class SomaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TsekeParser.ID); }
		public TerminalNode SOMA() { return getToken(TsekeParser.SOMA, 0); }
		public TerminalNode ID(int i) {
			return getToken(TsekeParser.ID, i);
		}
		public SomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitSoma(this);
		}
	}

	public final SomaContext soma() throws RecognitionException {
		SomaContext _localctx = new SomaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_soma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(ID);
			setState(94); match(SOMA);
			setState(95); match(ID);
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

	public static class SubtracaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TsekeParser.ID); }
		public TerminalNode MENOS() { return getToken(TsekeParser.MENOS, 0); }
		public TerminalNode ID(int i) {
			return getToken(TsekeParser.ID, i);
		}
		public SubtracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterSubtracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitSubtracao(this);
		}
	}

	public final SubtracaoContext subtracao() throws RecognitionException {
		SubtracaoContext _localctx = new SubtracaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subtracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(ID);
			setState(98); match(MENOS);
			setState(99); match(ID);
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

	public static class DivisaoContext extends ParserRuleContext {
		public TerminalNode DIVISAO() { return getToken(TsekeParser.DIVISAO, 0); }
		public List<TerminalNode> ID() { return getTokens(TsekeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TsekeParser.ID, i);
		}
		public DivisaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divisao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterDivisao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitDivisao(this);
		}
	}

	public final DivisaoContext divisao() throws RecognitionException {
		DivisaoContext _localctx = new DivisaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_divisao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(ID);
			setState(102); match(DIVISAO);
			setState(103); match(ID);
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

	public static class MultiplicacaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TsekeParser.ID); }
		public TerminalNode MULTIPLICACAO() { return getToken(TsekeParser.MULTIPLICACAO, 0); }
		public TerminalNode ID(int i) {
			return getToken(TsekeParser.ID, i);
		}
		public MultiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterMultiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitMultiplicacao(this);
		}
	}

	public final MultiplicacaoContext multiplicacao() throws RecognitionException {
		MultiplicacaoContext _localctx = new MultiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multiplicacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(ID);
			setState(106); match(MULTIPLICACAO);
			setState(107); match(ID);
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

	public static class CondicaoContext extends ParserRuleContext {
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public Op_logicoContext op_logico() {
			return getRuleContext(Op_logicoContext.class,0);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicao);
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); expressao();
				setState(112);
				switch (_input.LA(1)) {
				case OR:
				case AND:
					{
					setState(110); op_logico();
					}
					break;
				case MAIOR:
				case MENOR:
				case MAIOR_IGUAL:
				case MENOR_IGUAL:
				case DIFERENTE:
					{
					setState(111); op_relacional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114); expressao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); expressao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(TsekeParser.NOT, 0); }
		public MultiplicacaoContext multiplicacao() {
			return getRuleContext(MultiplicacaoContext.class,0);
		}
		public TerminalNode ID() { return getToken(TsekeParser.ID, 0); }
		public SomaContext soma() {
			return getRuleContext(SomaContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode NUM() { return getToken(TsekeParser.NUM, 0); }
		public DivisaoContext divisao() {
			return getRuleContext(DivisaoContext.class,0);
		}
		public SubtracaoContext subtracao() {
			return getRuleContext(SubtracaoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressao);
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); match(NOT);
				setState(121); expressao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); soma();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123); subtracao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124); multiplicacao();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125); divisao();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126); match(NUM);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(127); match(ID);
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode MAIOR_IGUAL() { return getToken(TsekeParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(TsekeParser.MENOR_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(TsekeParser.MENOR, 0); }
		public TerminalNode DIFERENTE() { return getToken(TsekeParser.DIFERENTE, 0); }
		public TerminalNode MAIOR() { return getToken(TsekeParser.MAIOR, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIOR) | (1L << MENOR) | (1L << MAIOR_IGUAL) | (1L << MENOR_IGUAL) | (1L << DIFERENTE))) != 0)) ) {
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

	public static class Op_logicoContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(TsekeParser.AND, 0); }
		public TerminalNode OR() { return getToken(TsekeParser.OR, 0); }
		public Op_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterOp_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitOp_logico(this);
		}
	}

	public final Op_logicoContext op_logico() throws RecognitionException {
		Op_logicoContext _localctx = new Op_logicoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3(\u0089\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\5\b^\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\rs\n\r\3\r\3\r\3\r\3\r\5"+
		"\ry\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0083\n\16\3\17\3"+
		"\17\3\20\3\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\5\2"+
		"\3\3\36\36!!\3\2\16\22\3\2\24\25\u008c\2 \3\2\2\2\4\62\3\2\2\2\6\64\3"+
		"\2\2\2\b8\3\2\2\2\nQ\3\2\2\2\fS\3\2\2\2\16]\3\2\2\2\20_\3\2\2\2\22c\3"+
		"\2\2\2\24g\3\2\2\2\26k\3\2\2\2\30x\3\2\2\2\32\u0082\3\2\2\2\34\u0084\3"+
		"\2\2\2\36\u0086\3\2\2\2 !\7\4\2\2!\"\7\7\2\2\"#\7\3\2\2#\'\7\"\2\2$&\5"+
		"\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2"+
		"*+\7#\2\2+\3\3\2\2\2,\63\5\6\4\2-\63\5\b\5\2.\63\5\n\6\2/\63\5\f\7\2\60"+
		"\63\5\16\b\2\61\63\7\13\2\2\62,\3\2\2\2\62-\3\2\2\2\62.\3\2\2\2\62/\3"+
		"\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2\2\64\65\7\35\2\2\65\66\7"+
		"\3\2\2\66\67\7&\2\2\67\7\3\2\2\289\7\3\2\29:\7\r\2\2:;\7\36\2\2;<\7&\2"+
		"\2<\t\3\2\2\2=>\7\26\2\2>?\7$\2\2?@\5\30\r\2@A\7%\2\2AB\7\"\2\2BC\5\4"+
		"\3\2CD\7#\2\2DR\3\2\2\2EF\7\26\2\2FG\7$\2\2GH\5\30\r\2HI\7%\2\2IJ\7\""+
		"\2\2JK\5\4\3\2KL\7#\2\2LM\7\27\2\2MN\7\"\2\2NO\5\4\3\2OP\7#\2\2PR\3\2"+
		"\2\2Q=\3\2\2\2QE\3\2\2\2R\13\3\2\2\2ST\7\13\2\2TU\7$\2\2UV\t\2\2\2VW\7"+
		"%\2\2WX\7&\2\2X\r\3\2\2\2Y^\5\20\t\2Z^\5\22\n\2[^\5\24\13\2\\^\5\26\f"+
		"\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\17\3\2\2\2_`\7\3\2\2`a\7"+
		"\31\2\2ab\7\3\2\2b\21\3\2\2\2cd\7\3\2\2de\7\30\2\2ef\7\3\2\2f\23\3\2\2"+
		"\2gh\7\3\2\2hi\7\33\2\2ij\7\3\2\2j\25\3\2\2\2kl\7\3\2\2lm\7\34\2\2mn\7"+
		"\3\2\2n\27\3\2\2\2or\5\32\16\2ps\5\36\20\2qs\5\34\17\2rp\3\2\2\2rq\3\2"+
		"\2\2st\3\2\2\2tu\5\32\16\2uy\3\2\2\2vy\5\32\16\2wy\3\2\2\2xo\3\2\2\2x"+
		"v\3\2\2\2xw\3\2\2\2y\31\3\2\2\2z{\7\23\2\2{\u0083\5\32\16\2|\u0083\5\20"+
		"\t\2}\u0083\5\22\n\2~\u0083\5\26\f\2\177\u0083\5\24\13\2\u0080\u0083\7"+
		"\36\2\2\u0081\u0083\7\3\2\2\u0082z\3\2\2\2\u0082|\3\2\2\2\u0082}\3\2\2"+
		"\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3"+
		"\2\2\2\u0083\33\3\2\2\2\u0084\u0085\t\3\2\2\u0085\35\3\2\2\2\u0086\u0087"+
		"\t\4\2\2\u0087\37\3\2\2\2\t\'\62Q]rx\u0082";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}