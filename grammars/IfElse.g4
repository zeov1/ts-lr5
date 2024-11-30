grammar IfElse;

// Lexer rules
IF          : 'if';
ELSE        : 'else';
IDENTIFIER  : [a-zA-Z_][a-zA-Z0-9_]*;
CONSTANT    : [0-9]+;
EQ          : '==';
NEQ         : '!=';
GE          : '>=';
LE          : '<=';
GT          : '>';
LT          : '<';
ASSIGN      : '=';
AND         : '&';
OR          : '|';
NOT         : '~';
ADD         : '+';
SUB         : '-';
MUL         : '*';
DIV         : '/';
WS          : [ \t]+ -> skip;           // Пропуск пробелов
LINE_COMMENT: '//' ~[\r\n]* -> skip;    // Пропуск комментариев
NEWLINE     : ('\n'|'\n\r') -> channel(HIDDEN);  // Скрыть символы новой строки

// Parser rules
program     : statements EOF;

statements  : statement*;

statement   : assignment | if_else;

assignment  : IDENTIFIER ASSIGN expression ';';

if_else     : IF '(' condition ')' '{' statements '}' ELSE '{' statements '}';

condition   : operand op = (EQ | NEQ | GT | LT | GE | LE) operand;

expression  : operand                                     # SimpleExplession
            | operand op=(AND|OR|ADD|SUB|MUL|DIV) operand # TwoOperandExpression
            | NOT operand                                 # BitwiseNot
            ;

operand     : (CONSTANT | IDENTIFIER)                               # Literal
            | IDENTIFIER ('[' index=(IDENTIFIER | CONSTANT) ']')?   # Array
            ;