grammar Tseke;

program: PUBLIC CLASS ID ABRIR_CHAVETA conteudo* FECHAR_CHAVETA;
conteudo: declaracao|inicializacao|decisao|impressao|operacoesArt|PRINT;
declaracao: TIPO ID PONTO_VIRGULA;                                                  
inicializacao: ID IGUAL NUM PONTO_VIRGULA; 

decisao: IF ABRIR_PARENTESES condicao FECHAR_PARENTESES ABRIR_CHAVETA conteudo FECHAR_CHAVETA|
         IF ABRIR_PARENTESES condicao FECHAR_PARENTESES ABRIR_CHAVETA conteudo FECHAR_CHAVETA
         ELSE ABRIR_CHAVETA conteudo FECHAR_CHAVETA;

impressao:PRINT ABRIR_PARENTESES (NUM|STRING|ID) FECHAR_PARENTESES PONTO_VIRGULA;
operacoesArt: soma|subtracao|divisao|multiplicacao;
soma:ID SOMA ID;                                                             
subtracao:ID MENOS ID;                                                        
divisao:ID DIVISAO ID;                                                          
multiplicacao:ID MULTIPLICACAO ID;                                                     

condicao: expressao (op_logico|op_relacional) expressao|expressao|; 
expressao: NOT expressao|soma|subtracao|multiplicacao|divisao|NUM|ID;
op_relacional: MAIOR|MENOR|MAIOR_IGUAL|MENOR_IGUAL|DIFERENTE;
op_logico: AND|OR;
        

//IDENTIFICADOR
ID :  [_|a-z|A-Z][a-z|A-Z|0-9|_]*;

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
TIPO : 'inteiro|byte|float';
NUM: INTEIRO|FLOAT;
INTEIRO : [0]|[1-9][0-9]*;
FLOAT :  [-+]?[0-9]+.{1}[0-9]+([eE][-+]?[0-9]+)?;
STRING: '"'.'"';

//TOKENS ESTRUTURAIS
ABRIR_CHAVETA : '{';
FECHAR_CHAVETA :  '}';
ABRIR_PARENTESES :  '(';
FECHAR_PARENTESES :  ')';
PONTO_VIRGULA : ';';
VIRGULA :  ',';
BRANCO : [\n| |\t|\r];