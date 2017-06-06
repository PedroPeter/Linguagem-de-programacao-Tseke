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
			setState(30); match(PUBLIC);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(31); match(BRANCO);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37); match(CLASS);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(38); match(BRANCO);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44); match(ID);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(45); match(BRANCO);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51); match(ABRIR_CHAVETA);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(52); match(BRANCO);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << IF) | (1L << TIPO) | (1L << ID))) != 0)) {
				{
				{
				setState(58); conteudo();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(64); match(BRANCO);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70); match(FECHAR_CHAVETA);
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
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); declaracao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); inicializacao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); decisao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75); impressao();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76); operacoesArt();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77); match(PRINT);
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
			setState(80); match(TIPO);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81); match(BRANCO);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BRANCO );
			setState(86); match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(87); match(BRANCO);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(PONTO_VIRGULA);
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
		public List<TerminalNode> BRANCO() { return getTokens(TsekeParser.BRANCO); }
		public TerminalNode ATRIBUICAO() { return getToken(TsekeParser.ATRIBUICAO, 0); }
		public TerminalNode NUM() { return getToken(TsekeParser.NUM, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TsekeParser.PONTO_VIRGULA, 0); }
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
			setState(95); match(ID);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(96); match(BRANCO);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102); match(ATRIBUICAO);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(103); match(BRANCO);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); match(NUM);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(110); match(BRANCO);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116); match(PONTO_VIRGULA);
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
		enterRule(_localctx, 8, RULE_decisao);
		int _la;
		try {
			int _alt;
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); match(IF);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(119); match(BRANCO);
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125); match(ABRIR_PARENTESES);
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(126); match(BRANCO);
						}
						} 
					}
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(132); condicao();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(133); match(BRANCO);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139); match(FECHAR_PARENTESES);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(140); match(BRANCO);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146); match(ABRIR_CHAVETA);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(147); match(BRANCO);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153); conteudo();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(154); match(BRANCO);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160); match(FECHAR_CHAVETA);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162); match(IF);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(163); match(BRANCO);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169); match(ABRIR_PARENTESES);
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(170); match(BRANCO);
						}
						} 
					}
					setState(175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(176); condicao();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(177); match(BRANCO);
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183); match(FECHAR_PARENTESES);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(184); match(BRANCO);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190); match(ABRIR_CHAVETA);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(191); match(BRANCO);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197); conteudo();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(198); match(BRANCO);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204); match(FECHAR_CHAVETA);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(205); match(BRANCO);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211); match(ELSE);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(212); match(BRANCO);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218); match(ABRIR_CHAVETA);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(219); match(BRANCO);
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225); conteudo();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(226); match(BRANCO);
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232); match(FECHAR_CHAVETA);
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
			setState(236); match(PRINT);
			setState(237); match(ABRIR_PARENTESES);
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << STRING) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(239); match(FECHAR_PARENTESES);
			setState(240); match(PONTO_VIRGULA);
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
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); soma();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); subtracao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244); divisao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245); multiplicacao();
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
		enterRule(_localctx, 14, RULE_soma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(ID);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(249); match(BRANCO);
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255); match(SOMA);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(256); match(BRANCO);
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262); match(ID);
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
		enterRule(_localctx, 16, RULE_subtracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(ID);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(265); match(BRANCO);
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271); match(MENOS);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(272); match(BRANCO);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278); match(ID);
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
		enterRule(_localctx, 18, RULE_divisao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(ID);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(281); match(BRANCO);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287); match(DIVISAO);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCO) {
				{
				{
				setState(288); match(BRANCO);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294); match(ID);
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
		enterRule(_localctx, 20, RULE_multiplicacao);
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
			setState(303); match(MULTIPLICACAO);
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
		enterRule(_localctx, 22, RULE_condicao);
		int _la;
		try {
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312); expressao();
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
				setState(321);
				switch (_input.LA(1)) {
				case OR:
				case AND:
					{
					setState(319); op_logico();
					}
					break;
				case MAIOR:
				case MENOR:
				case MAIOR_IGUAL:
				case MENOR_IGUAL:
				case DIFERENTE:
					{
					setState(320); op_relacional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BRANCO) {
					{
					{
					setState(323); match(BRANCO);
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(329); expressao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331); expressao();
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
			setState(343);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335); match(NOT);
				setState(336); expressao();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337); soma();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338); subtracao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339); multiplicacao();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(340); divisao();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(341); match(NUM);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(342); match(ID);
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
			setState(345);
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
			setState(347);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3(\u0160\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\7\2\61\n\2\f\2\16"+
		"\2\64\13\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\7\2>\n\2\f\2\16\2A\13\2"+
		"\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n\3"+
		"\3\4\3\4\6\4U\n\4\r\4\16\4V\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3\4\3"+
		"\5\3\5\7\5d\n\5\f\5\16\5g\13\5\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\3\5\3\5"+
		"\7\5r\n\5\f\5\16\5u\13\5\3\5\3\5\3\6\3\6\7\6{\n\6\f\6\16\6~\13\6\3\6\3"+
		"\6\7\6\u0082\n\6\f\6\16\6\u0085\13\6\3\6\3\6\7\6\u0089\n\6\f\6\16\6\u008c"+
		"\13\6\3\6\3\6\7\6\u0090\n\6\f\6\16\6\u0093\13\6\3\6\3\6\7\6\u0097\n\6"+
		"\f\6\16\6\u009a\13\6\3\6\3\6\7\6\u009e\n\6\f\6\16\6\u00a1\13\6\3\6\3\6"+
		"\3\6\3\6\7\6\u00a7\n\6\f\6\16\6\u00aa\13\6\3\6\3\6\7\6\u00ae\n\6\f\6\16"+
		"\6\u00b1\13\6\3\6\3\6\7\6\u00b5\n\6\f\6\16\6\u00b8\13\6\3\6\3\6\7\6\u00bc"+
		"\n\6\f\6\16\6\u00bf\13\6\3\6\3\6\7\6\u00c3\n\6\f\6\16\6\u00c6\13\6\3\6"+
		"\3\6\7\6\u00ca\n\6\f\6\16\6\u00cd\13\6\3\6\3\6\7\6\u00d1\n\6\f\6\16\6"+
		"\u00d4\13\6\3\6\3\6\7\6\u00d8\n\6\f\6\16\6\u00db\13\6\3\6\3\6\7\6\u00df"+
		"\n\6\f\6\16\6\u00e2\13\6\3\6\3\6\7\6\u00e6\n\6\f\6\16\6\u00e9\13\6\3\6"+
		"\3\6\5\6\u00ed\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00f9\n"+
		"\b\3\t\3\t\7\t\u00fd\n\t\f\t\16\t\u0100\13\t\3\t\3\t\7\t\u0104\n\t\f\t"+
		"\16\t\u0107\13\t\3\t\3\t\3\n\3\n\7\n\u010d\n\n\f\n\16\n\u0110\13\n\3\n"+
		"\3\n\7\n\u0114\n\n\f\n\16\n\u0117\13\n\3\n\3\n\3\13\3\13\7\13\u011d\n"+
		"\13\f\13\16\13\u0120\13\13\3\13\3\13\7\13\u0124\n\13\f\13\16\13\u0127"+
		"\13\13\3\13\3\13\3\f\3\f\7\f\u012d\n\f\f\f\16\f\u0130\13\f\3\f\3\f\7\f"+
		"\u0134\n\f\f\f\16\f\u0137\13\f\3\f\3\f\3\r\3\r\7\r\u013d\n\r\f\r\16\r"+
		"\u0140\13\r\3\r\3\r\5\r\u0144\n\r\3\r\7\r\u0147\n\r\f\r\16\r\u014a\13"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0150\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u015a\n\16\3\17\3\17\3\20\3\20\3\20\2\21\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36\2\5\5\2\35\35  ((\3\2\r\21\3\2\23\24\u0187\2 \3\2\2"+
		"\2\4P\3\2\2\2\6R\3\2\2\2\ba\3\2\2\2\n\u00ec\3\2\2\2\f\u00ee\3\2\2\2\16"+
		"\u00f8\3\2\2\2\20\u00fa\3\2\2\2\22\u010a\3\2\2\2\24\u011a\3\2\2\2\26\u012a"+
		"\3\2\2\2\30\u014f\3\2\2\2\32\u0159\3\2\2\2\34\u015b\3\2\2\2\36\u015d\3"+
		"\2\2\2 $\7\3\2\2!#\7\'\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%"+
		"\'\3\2\2\2&$\3\2\2\2\'+\7\6\2\2(*\7\'\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2"+
		"\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2.\62\7(\2\2/\61\7\'\2\2\60/\3\2\2\2\61"+
		"\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65"+
		"9\7!\2\2\668\7\'\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:?\3"+
		"\2\2\2;9\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3"+
		"\2\2\2A?\3\2\2\2BD\7\'\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3"+
		"\2\2\2GE\3\2\2\2HI\7\"\2\2I\3\3\2\2\2JQ\5\6\4\2KQ\5\b\5\2LQ\5\n\6\2MQ"+
		"\5\f\7\2NQ\5\16\b\2OQ\7\n\2\2PJ\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2"+
		"PN\3\2\2\2PO\3\2\2\2Q\5\3\2\2\2RT\7\34\2\2SU\7\'\2\2TS\3\2\2\2UV\3\2\2"+
		"\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2X\\\7(\2\2Y[\7\'\2\2ZY\3\2\2\2[^\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7%\2\2`\7\3\2\2\2ae\7"+
		"(\2\2bd\7\'\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3"+
		"\2\2\2hl\7\13\2\2ik\7\'\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo"+
		"\3\2\2\2nl\3\2\2\2os\7\35\2\2pr\7\'\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7%\2\2w\t\3\2\2\2x|\7\25\2\2y{\7\'\2"+
		"\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177"+
		"\u0083\7#\2\2\u0080\u0082\7\'\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2"+
		"\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u008a\5\30\r\2\u0087\u0089\7\'\2\2\u0088\u0087\3"+
		"\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0091\7$\2\2\u008e\u0090\7\'"+
		"\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098\7!"+
		"\2\2\u0095\u0097\7\'\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009f\5\4\3\2\u009c\u009e\7\'\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00ed\3\2\2\2\u00a4"+
		"\u00a8\7\25\2\2\u00a5\u00a7\7\'\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00af\7#\2\2\u00ac\u00ae\7\'\2\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b6\5\30\r\2\u00b3\u00b5\7"+
		"\'\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bd\7$"+
		"\2\2\u00ba\u00bc\7\'\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c4\7!\2\2\u00c1\u00c3\7\'\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00cb\5\4\3\2\u00c8\u00ca\7\'\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d2\7\"\2\2\u00cf"+
		"\u00d1\7\'\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d9\7\26\2\2\u00d6\u00d8\7\'\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00e0\7!\2\2\u00dd\u00df\7\'\2\2\u00de\u00dd\3\2"+
		"\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e7\5\4\3\2\u00e4\u00e6\7\'"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\""+
		"\2\2\u00eb\u00ed\3\2\2\2\u00ecx\3\2\2\2\u00ec\u00a4\3\2\2\2\u00ed\13\3"+
		"\2\2\2\u00ee\u00ef\7\n\2\2\u00ef\u00f0\7#\2\2\u00f0\u00f1\t\2\2\2\u00f1"+
		"\u00f2\7$\2\2\u00f2\u00f3\7%\2\2\u00f3\r\3\2\2\2\u00f4\u00f9\5\20\t\2"+
		"\u00f5\u00f9\5\22\n\2\u00f6\u00f9\5\24\13\2\u00f7\u00f9\5\26\f\2\u00f8"+
		"\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9\17\3\2\2\2\u00fa\u00fe\7(\2\2\u00fb\u00fd\7\'\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0105\7\30\2\2\u0102\u0104\7"+
		"\'\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7("+
		"\2\2\u0109\21\3\2\2\2\u010a\u010e\7(\2\2\u010b\u010d\7\'\2\2\u010c\u010b"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0115\7\27\2\2\u0112\u0114\7"+
		"\'\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7("+
		"\2\2\u0119\23\3\2\2\2\u011a\u011e\7(\2\2\u011b\u011d\7\'\2\2\u011c\u011b"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0125\7\32\2\2\u0122\u0124\7"+
		"\'\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7("+
		"\2\2\u0129\25\3\2\2\2\u012a\u012e\7(\2\2\u012b\u012d\7\'\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0135\7\33\2\2\u0132\u0134\7"+
		"\'\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7("+
		"\2\2\u0139\27\3\2\2\2\u013a\u013e\5\32\16\2\u013b\u013d\7\'\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0143\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0144\5\36\20\2\u0142"+
		"\u0144\5\34\17\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144\u0148\3"+
		"\2\2\2\u0145\u0147\7\'\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u014c\5\32\16\2\u014c\u0150\3\2\2\2\u014d\u0150\5\32\16\2\u014e"+
		"\u0150\3\2\2\2\u014f\u013a\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2"+
		"\2\2\u0150\31\3\2\2\2\u0151\u0152\7\22\2\2\u0152\u015a\5\32\16\2\u0153"+
		"\u015a\5\20\t\2\u0154\u015a\5\22\n\2\u0155\u015a\5\26\f\2\u0156\u015a"+
		"\5\24\13\2\u0157\u015a\7\35\2\2\u0158\u015a\7(\2\2\u0159\u0151\3\2\2\2"+
		"\u0159\u0153\3\2\2\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u0156"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\33\3\2\2\2\u015b"+
		"\u015c\t\3\2\2\u015c\35\3\2\2\2\u015d\u015e\t\4\2\2\u015e\37\3\2\2\2-"+
		"$+\629?EPV\\els|\u0083\u008a\u0091\u0098\u009f\u00a8\u00af\u00b6\u00bd"+
		"\u00c4\u00cb\u00d2\u00d9\u00e0\u00e7\u00ec\u00f8\u00fe\u0105\u010e\u0115"+
		"\u011e\u0125\u012e\u0135\u013e\u0143\u0148\u014f\u0159";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}