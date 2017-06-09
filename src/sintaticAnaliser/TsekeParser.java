// Generated from C:\Users\samsara\Documents\NetBeansProjects\Tseke\src\sintaticAnaliser\Tseke.g4 by ANTLR 4.1
package sintaticAnaliser;
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
		PUBLIC=1, PRIVATE=2, PROTECTED=3, CLASS=4, PACKAGE=5, IMPORT=6, MODIFICADOR_ACESSO=7, 
		PRINT=8, ATRIBUICAO=9, IGUAL=10, MAIOR=11, MENOR=12, MAIOR_IGUAL=13, MENOR_IGUAL=14, 
		DIFERENTE=15, NOT=16, OR=17, AND=18, IF=19, ELSE=20, MENOS=21, SOMA=22, 
		SUBTRACAO=23, DIVISAO=24, MULTIPLICACAO=25, TIPO=26, NUM=27, INTEIRO=28, 
		FLOAT=29, STRING=30, ABRIR_CHAVETA=31, FECHAR_CHAVETA=32, ABRIR_PARENTESES=33, 
		FECHAR_PARENTESES=34, PONTO_VIRGULA=35, VIRGULA=36, BRANCO=37, ID=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'publico'", "'privado'", "'protegido'", "'classe'", "'pacote'", 
		"'importacao'", "MODIFICADOR_ACESSO", "'sistema.imprimir'", "'='", "'=='", 
		"'>'", "'<'", "'>='", "'<='", "'!='", "'!'", "'|'", "'&&'", "'se'", "'senao'", 
		"MENOS", "'+'", "SUBTRACAO", "'/'", "'*'", "TIPO", "NUM", "INTEIRO", "FLOAT", 
		"STRING", "'{'", "'}'", "'('", "')'", "';'", "','", "BRANCO", "ID"
	};
	public static final int
		RULE_program = 0, RULE_conteudo = 1, RULE_declaracao = 2, RULE_inicializacao = 3, 
		RULE_declar_inic = 4, RULE_decisao = 5, RULE_impressao = 6, RULE_operacoesArt = 7, 
		RULE_soma = 8, RULE_subtracao = 9, RULE_divisao = 10, RULE_multiplicacao = 11, 
		RULE_condicao = 12, RULE_expressao = 13, RULE_op_relacional = 14, RULE_op_logico = 15;
	public static final String[] ruleNames = {
		"program", "conteudo", "declaracao", "inicializacao", "declar_inic", "decisao", 
		"impressao", "operacoesArt", "soma", "subtracao", "divisao", "multiplicacao", 
		"condicao", "expressao", "op_relacional", "op_logico"
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
		public List<TerminalNode> BRANCO() { return getTokens(TsekeParser.BRANCO); }
		public List<ConteudoContext> conteudo() {
			return getRuleContexts(ConteudoContext.class);
		}
		public TerminalNode PUBLIC() { return getToken(TsekeParser.PUBLIC, 0); }
		public TerminalNode FECHAR_CHAVETA() { return getToken(TsekeParser.FECHAR_CHAVETA, 0); }
		public TerminalNode CLASS() { return getToken(TsekeParser.CLASS, 0); }
		public TerminalNode BRANCO(int i) {
			return getToken(TsekeParser.BRANCO, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(PUBLIC);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(33); match(BRANCO);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39); match(CLASS);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(40); match(BRANCO);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46); match(ID);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(47); match(BRANCO);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53); match(ABRIR_CHAVETA);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(54); match(BRANCO);
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(60); conteudo();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(66); match(BRANCO);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72); match(FECHAR_CHAVETA);
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
		public TerminalNode BRANCO() { return getToken(TsekeParser.BRANCO, 0); }
		public TerminalNode PRINT() { return getToken(TsekeParser.PRINT, 0); }
		public InicializacaoContext inicializacao() {
			return getRuleContext(InicializacaoContext.class,0);
		}
		public Declar_inicContext declar_inic() {
			return getRuleContext(Declar_inicContext.class,0);
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
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); declaracao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); inicializacao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76); declar_inic();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77); decisao();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(78); impressao();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79); operacoesArt();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(80); match(PRINT);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(81); match(BRANCO);
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
		public List<TerminalNode> BRANCO() { return getTokens(TsekeParser.BRANCO); }
		public TerminalNode TIPO() { return getToken(TsekeParser.TIPO, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TsekeParser.PONTO_VIRGULA, 0); }
		public TerminalNode BRANCO(int i) {
			return getToken(TsekeParser.BRANCO, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(TIPO);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85); match(BRANCO);
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BRANCO );
			setState(90); match(ID);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(91); match(BRANCO);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97); match(PONTO_VIRGULA);
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
		public List<TerminalNode> ID() { return getTokens(TsekeParser.ID); }
		public List<TerminalNode> BRANCO() { return getTokens(TsekeParser.BRANCO); }
		public TerminalNode ATRIBUICAO() { return getToken(TsekeParser.ATRIBUICAO, 0); }
		public TerminalNode NUM() { return getToken(TsekeParser.NUM, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TsekeParser.PONTO_VIRGULA, 0); }
		public TerminalNode ID(int i) {
			return getToken(TsekeParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(TsekeParser.STRING, 0); }
		public TerminalNode BRANCO(int i) {
			return getToken(TsekeParser.BRANCO, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(ID);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(100); match(BRANCO);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106); match(ATRIBUICAO);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(107); match(BRANCO);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << STRING) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(114); match(BRANCO);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120); match(PONTO_VIRGULA);
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

	public static class Declar_inicContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TsekeParser.ID); }
		public List<TerminalNode> BRANCO() { return getTokens(TsekeParser.BRANCO); }
		public TerminalNode ATRIBUICAO() { return getToken(TsekeParser.ATRIBUICAO, 0); }
		public TerminalNode TIPO() { return getToken(TsekeParser.TIPO, 0); }
		public TerminalNode NUM() { return getToken(TsekeParser.NUM, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TsekeParser.PONTO_VIRGULA, 0); }
		public TerminalNode ID(int i) {
			return getToken(TsekeParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(TsekeParser.STRING, 0); }
		public TerminalNode BRANCO(int i) {
			return getToken(TsekeParser.BRANCO, i);
		}
		public Declar_inicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declar_inic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).enterDeclar_inic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TsekeListener ) ((TsekeListener)listener).exitDeclar_inic(this);
		}
	}

	public final Declar_inicContext declar_inic() throws RecognitionException {
		Declar_inicContext _localctx = new Declar_inicContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declar_inic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(TIPO);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123); match(BRANCO);
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BRANCO );
			setState(128); match(ID);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(129); match(BRANCO);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135); match(ATRIBUICAO);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(136); match(BRANCO);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << STRING) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(143); match(BRANCO);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149); match(PONTO_VIRGULA);
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
		public TerminalNode ELSE() { return getToken(TsekeParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(TsekeParser.IF, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode ABRIR_CHAVETA(int i) {
			return getToken(TsekeParser.ABRIR_CHAVETA, i);
		}
		public TerminalNode FECHAR_PARENTESES() { return getToken(TsekeParser.FECHAR_PARENTESES, 0); }
		public List<ConteudoContext> conteudo() {
			return getRuleContexts(ConteudoContext.class);
		}
		public List<TerminalNode> FECHAR_CHAVETA() { return getTokens(TsekeParser.FECHAR_CHAVETA); }
		public TerminalNode BRANCO(int i) {
			return getToken(TsekeParser.BRANCO, i);
		}
		public List<TerminalNode> ABRIR_CHAVETA() { return getTokens(TsekeParser.ABRIR_CHAVETA); }
		public TerminalNode FECHAR_CHAVETA(int i) {
			return getToken(TsekeParser.FECHAR_CHAVETA, i);
		}
		public List<TerminalNode> BRANCO() { return getTokens(TsekeParser.BRANCO); }
		public TerminalNode ABRIR_PARENTESES() { return getToken(TsekeParser.ABRIR_PARENTESES, 0); }
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
		enterRule(_localctx, 10, RULE_decisao);
		int _la;
		try {
			int _alt;
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151); match(IF);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(152); match(BRANCO);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158); match(ABRIR_PARENTESES);
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(159); match(BRANCO);
						}
						} 
					}
					setState(164);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(165); condicao();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(166); match(BRANCO);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172); match(FECHAR_PARENTESES);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(173); match(BRANCO);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179); match(ABRIR_CHAVETA);
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(180); match(BRANCO);
						}
						} 
					}
					setState(185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(186); conteudo();
						}
						} 
					}
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(192); match(BRANCO);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198); match(FECHAR_CHAVETA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200); match(IF);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(201); match(BRANCO);
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207); match(ABRIR_PARENTESES);
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(208); match(BRANCO);
						}
						} 
					}
					setState(213);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(214); condicao();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(215); match(BRANCO);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221); match(FECHAR_PARENTESES);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(222); match(BRANCO);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228); match(ABRIR_CHAVETA);
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(229); match(BRANCO);
						}
						} 
					}
					setState(234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(235); conteudo();
						}
						} 
					}
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(241); match(BRANCO);
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247); match(FECHAR_CHAVETA);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(248); match(BRANCO);
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254); match(ELSE);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(255); match(BRANCO);
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261); match(ABRIR_CHAVETA);
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(262); match(BRANCO);
						}
						} 
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(268); conteudo();
						}
						} 
					}
					setState(273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(274); match(BRANCO);
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(280); match(FECHAR_CHAVETA);
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
		enterRule(_localctx, 12, RULE_impressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(PRINT);
			setState(285); match(ABRIR_PARENTESES);
			setState(286);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << STRING) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(287); match(FECHAR_PARENTESES);
			setState(288); match(PONTO_VIRGULA);
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
		enterRule(_localctx, 14, RULE_operacoesArt);
		try {
			setState(294);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290); soma();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291); subtracao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292); divisao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(293); multiplicacao();
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
		public List<TerminalNode> BRANCO() { return getTokens(TsekeParser.BRANCO); }
		public TerminalNode SOMA() { return getToken(TsekeParser.SOMA, 0); }
		public TerminalNode ID(int i) {
			return getToken(TsekeParser.ID, i);
		}
		public TerminalNode BRANCO(int i) {
			return getToken(TsekeParser.BRANCO, i);
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
		enterRule(_localctx, 16, RULE_soma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(ID);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(297); match(BRANCO);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303); match(SOMA);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(304); match(BRANCO);
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310); match(ID);
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
		public List<TerminalNode> BRANCO() { return getTokens(TsekeParser.BRANCO); }
		public TerminalNode ID(int i) {
			return getToken(TsekeParser.ID, i);
		}
		public TerminalNode BRANCO(int i) {
			return getToken(TsekeParser.BRANCO, i);
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
		enterRule(_localctx, 18, RULE_subtracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); match(ID);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(313); match(BRANCO);
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319); match(MENOS);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(320); match(BRANCO);
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326); match(ID);
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
		public List<TerminalNode> BRANCO() { return getTokens(TsekeParser.BRANCO); }
		public TerminalNode ID(int i) {
			return getToken(TsekeParser.ID, i);
		}
		public TerminalNode BRANCO(int i) {
			return getToken(TsekeParser.BRANCO, i);
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
		enterRule(_localctx, 20, RULE_divisao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(ID);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(329); match(BRANCO);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335); match(DIVISAO);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(336); match(BRANCO);
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342); match(ID);
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
		public List<TerminalNode> BRANCO() { return getTokens(TsekeParser.BRANCO); }
		public TerminalNode MULTIPLICACAO() { return getToken(TsekeParser.MULTIPLICACAO, 0); }
		public TerminalNode ID(int i) {
			return getToken(TsekeParser.ID, i);
		}
		public TerminalNode BRANCO(int i) {
			return getToken(TsekeParser.BRANCO, i);
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
		enterRule(_localctx, 22, RULE_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); match(ID);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(345); match(BRANCO);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351); match(MULTIPLICACAO);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(352); match(BRANCO);
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358); match(ID);
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
		public List<TerminalNode> BRANCO() { return getTokens(TsekeParser.BRANCO); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public Op_logicoContext op_logico() {
			return getRuleContext(Op_logicoContext.class,0);
		}
		public TerminalNode BRANCO(int i) {
			return getToken(TsekeParser.BRANCO, i);
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
		enterRule(_localctx, 24, RULE_condicao);
		int _la;
		try {
			setState(381);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360); expressao();
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(361); match(BRANCO);
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(369);
				switch (_input.LA(1)) {
				case OR:
				case AND:
					{
					setState(367); op_logico();
					}
					break;
				case MAIOR:
				case MENOR:
				case MAIOR_IGUAL:
				case MENOR_IGUAL:
				case DIFERENTE:
					{
					setState(368); op_relacional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(371); match(BRANCO);
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(377); expressao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379); expressao();
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
		enterRule(_localctx, 26, RULE_expressao);
		try {
			setState(391);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(383); match(NOT);
				setState(384); expressao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385); soma();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386); subtracao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387); multiplicacao();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(388); divisao();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(389); match(NUM);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(390); match(ID);
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
		enterRule(_localctx, 28, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
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
		enterRule(_localctx, 30, RULE_op_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3(\u0190\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\7\2\63"+
		"\n\2\f\2\16\2\66\13\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\7\2@\n\2\f\2"+
		"\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3U\n\3\3\4\3\4\6\4Y\n\4\r\4\16\4Z\3\4\3\4\7\4_\n\4\f\4\16"+
		"\4b\13\4\3\4\3\4\3\5\3\5\7\5h\n\5\f\5\16\5k\13\5\3\5\3\5\7\5o\n\5\f\5"+
		"\16\5r\13\5\3\5\3\5\7\5v\n\5\f\5\16\5y\13\5\3\5\3\5\3\6\3\6\6\6\177\n"+
		"\6\r\6\16\6\u0080\3\6\3\6\7\6\u0085\n\6\f\6\16\6\u0088\13\6\3\6\3\6\7"+
		"\6\u008c\n\6\f\6\16\6\u008f\13\6\3\6\3\6\7\6\u0093\n\6\f\6\16\6\u0096"+
		"\13\6\3\6\3\6\3\7\3\7\7\7\u009c\n\7\f\7\16\7\u009f\13\7\3\7\3\7\7\7\u00a3"+
		"\n\7\f\7\16\7\u00a6\13\7\3\7\3\7\7\7\u00aa\n\7\f\7\16\7\u00ad\13\7\3\7"+
		"\3\7\7\7\u00b1\n\7\f\7\16\7\u00b4\13\7\3\7\3\7\7\7\u00b8\n\7\f\7\16\7"+
		"\u00bb\13\7\3\7\7\7\u00be\n\7\f\7\16\7\u00c1\13\7\3\7\7\7\u00c4\n\7\f"+
		"\7\16\7\u00c7\13\7\3\7\3\7\3\7\3\7\7\7\u00cd\n\7\f\7\16\7\u00d0\13\7\3"+
		"\7\3\7\7\7\u00d4\n\7\f\7\16\7\u00d7\13\7\3\7\3\7\7\7\u00db\n\7\f\7\16"+
		"\7\u00de\13\7\3\7\3\7\7\7\u00e2\n\7\f\7\16\7\u00e5\13\7\3\7\3\7\7\7\u00e9"+
		"\n\7\f\7\16\7\u00ec\13\7\3\7\7\7\u00ef\n\7\f\7\16\7\u00f2\13\7\3\7\7\7"+
		"\u00f5\n\7\f\7\16\7\u00f8\13\7\3\7\3\7\7\7\u00fc\n\7\f\7\16\7\u00ff\13"+
		"\7\3\7\3\7\7\7\u0103\n\7\f\7\16\7\u0106\13\7\3\7\3\7\7\7\u010a\n\7\f\7"+
		"\16\7\u010d\13\7\3\7\7\7\u0110\n\7\f\7\16\7\u0113\13\7\3\7\7\7\u0116\n"+
		"\7\f\7\16\7\u0119\13\7\3\7\3\7\5\7\u011d\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\5\t\u0129\n\t\3\n\3\n\7\n\u012d\n\n\f\n\16\n\u0130\13\n"+
		"\3\n\3\n\7\n\u0134\n\n\f\n\16\n\u0137\13\n\3\n\3\n\3\13\3\13\7\13\u013d"+
		"\n\13\f\13\16\13\u0140\13\13\3\13\3\13\7\13\u0144\n\13\f\13\16\13\u0147"+
		"\13\13\3\13\3\13\3\f\3\f\7\f\u014d\n\f\f\f\16\f\u0150\13\f\3\f\3\f\7\f"+
		"\u0154\n\f\f\f\16\f\u0157\13\f\3\f\3\f\3\r\3\r\7\r\u015d\n\r\f\r\16\r"+
		"\u0160\13\r\3\r\3\r\7\r\u0164\n\r\f\r\16\r\u0167\13\r\3\r\3\r\3\16\3\16"+
		"\7\16\u016d\n\16\f\16\16\16\u0170\13\16\3\16\3\16\5\16\u0174\n\16\3\16"+
		"\7\16\u0177\n\16\f\16\16\16\u017a\13\16\3\16\3\16\3\16\3\16\5\16\u0180"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u018a\n\17\3\20\3\20"+
		"\3\21\3\21\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\5\2\35"+
		"\35  ((\3\2\r\21\3\2\23\24\u01bf\2\"\3\2\2\2\4T\3\2\2\2\6V\3\2\2\2\be"+
		"\3\2\2\2\n|\3\2\2\2\f\u011c\3\2\2\2\16\u011e\3\2\2\2\20\u0128\3\2\2\2"+
		"\22\u012a\3\2\2\2\24\u013a\3\2\2\2\26\u014a\3\2\2\2\30\u015a\3\2\2\2\32"+
		"\u017f\3\2\2\2\34\u0189\3\2\2\2\36\u018b\3\2\2\2 \u018d\3\2\2\2\"&\7\3"+
		"\2\2#%\7\'\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(&\3"+
		"\2\2\2)-\7\6\2\2*,\7\'\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60"+
		"\3\2\2\2/-\3\2\2\2\60\64\7(\2\2\61\63\7\'\2\2\62\61\3\2\2\2\63\66\3\2"+
		"\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\67;\7!\2"+
		"\28:\7\'\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2\2"+
		"\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2"+
		"\2DF\7\'\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2"+
		"\2JK\7\"\2\2K\3\3\2\2\2LU\5\6\4\2MU\5\b\5\2NU\5\n\6\2OU\5\f\7\2PU\5\16"+
		"\b\2QU\5\20\t\2RU\7\n\2\2SU\7\'\2\2TL\3\2\2\2TM\3\2\2\2TN\3\2\2\2TO\3"+
		"\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\5\3\2\2\2VX\7\34\2\2W"+
		"Y\7\'\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\`\7(\2\2"+
		"]_\7\'\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2"+
		"cd\7%\2\2d\7\3\2\2\2ei\7(\2\2fh\7\'\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2"+
		"ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lp\7\13\2\2mo\7\'\2\2nm\3\2\2\2or\3\2\2"+
		"\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2sw\t\2\2\2tv\7\'\2\2ut\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7%\2\2{\t\3\2\2"+
		"\2|~\7\34\2\2}\177\7\'\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0086\7(\2\2\u0083\u0085"+
		"\7\'\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008d\7\13"+
		"\2\2\u008a\u008c\7\'\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u0090\u0094\t\2\2\2\u0091\u0093\7\'\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7%\2\2\u0098\13\3\2\2\2\u0099\u009d"+
		"\7\25\2\2\u009a\u009c\7\'\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a4\7#\2\2\u00a1\u00a3\7\'\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ab\5\32\16\2\u00a8\u00aa\7\'\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b2\7$\2\2\u00af"+
		"\u00b1\7\'\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b9\7!\2\2\u00b6\u00b8\7\'\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bf\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00be\5\4\3\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c5\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c4\7\'\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00c9\7\"\2\2\u00c9\u011d\3\2\2\2\u00ca\u00ce\7\25"+
		"\2\2\u00cb\u00cd\7\'\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d5\7#\2\2\u00d2\u00d4\7\'\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00dc\5\32\16\2\u00d9\u00db\7\'\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e3\7$\2\2\u00e0"+
		"\u00e2\7\'\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00ea\7!\2\2\u00e7\u00e9\7\'\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f0\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ef\5\4\3\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f6\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f5\7\'\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fd\7\"\2\2\u00fa\u00fc\7\'\2\2\u00fb\u00fa\3\2"+
		"\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0104\7\26\2\2\u0101\u0103\7"+
		"\'\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u010b\7!"+
		"\2\2\u0108\u010a\7\'\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0111\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010e\u0110\5\4\3\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0117\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0116\7\'\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u011b\7\"\2\2\u011b\u011d\3\2\2\2\u011c\u0099\3\2\2\2\u011c"+
		"\u00ca\3\2\2\2\u011d\r\3\2\2\2\u011e\u011f\7\n\2\2\u011f\u0120\7#\2\2"+
		"\u0120\u0121\t\2\2\2\u0121\u0122\7$\2\2\u0122\u0123\7%\2\2\u0123\17\3"+
		"\2\2\2\u0124\u0129\5\22\n\2\u0125\u0129\5\24\13\2\u0126\u0129\5\26\f\2"+
		"\u0127\u0129\5\30\r\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0127\3\2\2\2\u0129\21\3\2\2\2\u012a\u012e\7(\2\2\u012b"+
		"\u012d\7\'\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131"+
		"\u0135\7\30\2\2\u0132\u0134\7\'\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3"+
		"\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u0139\7(\2\2\u0139\23\3\2\2\2\u013a\u013e\7(\2\2"+
		"\u013b\u013d\7\'\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0145\7\27\2\2\u0142\u0144\7\'\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3"+
		"\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0148\u0149\7(\2\2\u0149\25\3\2\2\2\u014a\u014e\7(\2\2"+
		"\u014b\u014d\7\'\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0155\7\32\2\2\u0152\u0154\7\'\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3"+
		"\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u0159\7(\2\2\u0159\27\3\2\2\2\u015a\u015e\7(\2\2"+
		"\u015b\u015d\7\'\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0165\7\33\2\2\u0162\u0164\7\'\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3"+
		"\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u0169\7(\2\2\u0169\31\3\2\2\2\u016a\u016e\5\34\17"+
		"\2\u016b\u016d\7\'\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0173\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0174\5 \21\2\u0172\u0174\5\36\20\2\u0173\u0171\3\2\2\2\u0173\u0172\3"+
		"\2\2\2\u0174\u0178\3\2\2\2\u0175\u0177\7\'\2\2\u0176\u0175\3\2\2\2\u0177"+
		"\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017b\u017c\5\34\17\2\u017c\u0180\3\2\2\2\u017d"+
		"\u0180\5\34\17\2\u017e\u0180\3\2\2\2\u017f\u016a\3\2\2\2\u017f\u017d\3"+
		"\2\2\2\u017f\u017e\3\2\2\2\u0180\33\3\2\2\2\u0181\u0182\7\22\2\2\u0182"+
		"\u018a\5\34\17\2\u0183\u018a\5\22\n\2\u0184\u018a\5\24\13\2\u0185\u018a"+
		"\5\30\r\2\u0186\u018a\5\26\f\2\u0187\u018a\7\35\2\2\u0188\u018a\7(\2\2"+
		"\u0189\u0181\3\2\2\2\u0189\u0183\3\2\2\2\u0189\u0184\3\2\2\2\u0189\u0185"+
		"\3\2\2\2\u0189\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a"+
		"\35\3\2\2\2\u018b\u018c\t\3\2\2\u018c\37\3\2\2\2\u018d\u018e\t\4\2\2\u018e"+
		"!\3\2\2\2\64&-\64;AGTZ`ipw\u0080\u0086\u008d\u0094\u009d\u00a4\u00ab\u00b2"+
		"\u00b9\u00bf\u00c5\u00ce\u00d5\u00dc\u00e3\u00ea\u00f0\u00f6\u00fd\u0104"+
		"\u010b\u0111\u0117\u011c\u0128\u012e\u0135\u013e\u0145\u014e\u0155\u015e"+
		"\u0165\u016e\u0173\u0178\u017f\u0189";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}