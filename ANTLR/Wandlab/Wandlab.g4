grammar Wandlab;

program: preprocessor_command* (operation (DASH operation)*)* EOF
    ;

operation: op subop*
    ;

op: ALPHA
    | BETA
    | DELTA PIPE ARGUMENT
    | DELTA
    | ZETA PIPE ARGUMENT PIPE ARGUMENT
    | ETA PIPE ARGUMENT PIPE ARGUMENT
    | THETA
    | LAMBDA function
    | MU PIPE ARGUMENT PIPE ARGUMENT
    | XI PIPE ARGUMENT PIPE ARGUMENT
    | XI PIPE ARGUMENT
    | OMICRON PIPE ARGUMENT
    | PI PIPE ARGUMENT PIPE ARGUMENT
    | PI PIPE ARGUMENT
    | SIGMA function
    | OMEGA PIPE ARGUMENT
    | OMEGA
    ;

function: LBRACKET operation (DASH operation)* RBRACKET
    ;

subop: TICK
    (GAMMA PIPE ARGUMENT
    | TAU PIPE ARGUMENT
    | PHI
    | CHI PIPE ARGUMENT)
    ;

// Preprocessor
preprocessor_command : POUND PREPROCESSNAME COLON preprocessor_arg (PIPE preprocessor_arg)* SEMICOLON
    ;

preprocessor_arg : ARGUMENT ;
PREPROCESSNAME : [A-Z_]+ ;

ARGUMENT : STRING | POINTER | NUMBER ;
STRING : QUOTE .*? QUOTE ;
POINTER : ARROW+ NUMBER ;
NUMBER : [0-9]+ ;

COMMENT : SLASH .*? SLASH -> skip;

// Super spells
ALPHA : 'Alpha' ;
BETA : 'Beta' ;
DELTA : 'Delta' ;
ZETA : 'Zeta' ;
ETA : 'Eta' ;
THETA : 'Theta' ;
LAMBDA : 'Lambda' ;
MU : 'Mu' ;
XI : 'Xi' ;
OMICRON : 'Omicron' ;
PI : 'Pi' ;
SIGMA : 'Sigma' ;
OMEGA : 'Omega' ;

// Respells
GAMMA : 'Gamma' ;
TAU : 'Tau' ;
PHI : 'Phi' ;
CHI : 'Chi' ;

DASH : '-' ;
SLASH : '/' ;
POUND : '#' ;
COLON : ':' ;
SEMICOLON : ';' ;
PIPE : '|' ;
TICK : '^' ;
QUOTE : '"' ;
ARROW : '->' ;
LBRACKET : '[' ;
RBRACKET : ']' ;

WS : [ \t\r\n] -> skip ;