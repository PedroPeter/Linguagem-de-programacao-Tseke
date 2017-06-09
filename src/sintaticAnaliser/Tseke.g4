grammar Tseke;

program: PUBLIC BRANCO* CLASS BRANCO* ID BRANCO* ABRIR_CHAVETA BRANCO* conteudo* BRANCO* FECHAR_CHAVETA;
conteudo: declaracao|inicializacao|declar_inic|decisao|impressao|operacoesArt|PRINT|BRANCO;
declaracao: TIPO BRANCO+ ID BRANCO* PONTO_VIRGULA;                                                  
inicializacao: ID BRANCO* ATRIBUICAO BRANCO* (NUM|ID|STRING) BRANCO* PONTO_VIRGULA;
declar_inic: TIPO BRANCO+ ID BRANCO* ATRIBUICAO BRANCO* (NUM|ID|STRING) BRANCO* PONTO_VIRGULA; 


decisao: IF BRANCO* ABRIR_PARENTESES BRANCO* condicao BRANCO* FECHAR_PARENTESES BRANCO* ABRIR_CHAVETA  BRANCO* conteudo* BRANCO* FECHAR_CHAVETA|
         IF BRANCO* ABRIR_PARENTESES BRANCO* condicao BRANCO* FECHAR_PARENTESES BRANCO* ABRIR_CHAVETA BRANCO* conteudo* BRANCO* FECHAR_CHAVETA
         BRANCO* ELSE BRANCO* ABRIR_CHAVETA BRANCO* conteudo* BRANCO* FECHAR_CHAVETA;

impressao:PRINT ABRIR_PARENTESES (NUM|STRING|ID) FECHAR_PARENTESES PONTO_VIRGULA;
operacoesArt: soma|subtracao|divisao|multiplicacao;
soma:ID BRANCO* SOMA BRANCO* ID;                                                             
subtracao:ID BRANCO* MENOS BRANCO* ID;                                                        
divisao:ID BRANCO* DIVISAO BRANCO* ID;                                                          
multiplicacao:ID BRANCO* MULTIPLICACAO BRANCO* ID;                                                     

condicao: expressao BRANCO* (op_logico|op_relacional) BRANCO* expressao|expressao|; 
expressao: NOT expressao|soma|subtracao|multiplicacao|divisao|NUM|ID;
op_relacional: MAIOR|MENOR|MAIOR_IGUAL|MENOR_IGUAL|DIFERENTE;
op_logico: AND|OR;
        
//MODIFICADORES DE ACESSO
PUBLIC: 'publico';
PRIVATE: 'privado';
PROTECTED:  'protegido';
CLASS :  'classe';
PACKAGE:  'pacote';
IMPORT : 'importacao';
MODIFICADOR_ACESSO :PUBLIC|PRIVATE|PROTECTED;

//INSTRUCOES
PRINT: 'sistema.imprimir';

//OPERADORES
ATRIBUICAO: '=';

//OPERADORES RELACIONAIS
IGUAL: '==';
MAIOR: '>';
MENOR: '<';
MAIOR_IGUAL: '>=';
MENOR_IGUAL: '<=';
DIFERENTE: '!=';

//OPERADORES LOGICOS
NOT: '!';
OR: '|';
AND: '&&';

//TOKENS DE ESTRUTURA DE DECISAO
IF: 'se';
ELSE: 'senao';

//OPERADORES ARITMETICOS
MENOS : '-';
SOMA : '+'; 
SUBTRACAO : '-';
DIVISAO : '/';
MULTIPLICACAO : '*';

//TIPO DE DADOS
TIPO : 'inteiro'|'byte'|'float'|'String';
NUM: INTEIRO|FLOAT;
INTEIRO : [0]|[1-9][0-9]*;
FLOAT :  [-+]?[0-9]+'.'{1}[0-9]+([eE][-+]?[0-9]+)?;
STRING: '"'.*?'"';

//TOKENS ESTRUTURAIS
ABRIR_CHAVETA : '{';
FECHAR_CHAVETA :  '}';
ABRIR_PARENTESES :  '(';
FECHAR_PARENTESES :  ')';
PONTO_VIRGULA : ';';
VIRGULA :  ',';
BRANCO : [\n| |\t|\r];

//IDENTIFICADOR
ID :  [_|a-z|A-Z][a-z|A-Z|0-9|_]*;