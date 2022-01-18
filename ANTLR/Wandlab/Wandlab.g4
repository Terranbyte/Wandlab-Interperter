grammar Wandlab;

program: preprocessor_command* (operation (DASH operation)*)* EOF
    ;

operation: op subop?
    ;

op: ALPHA
    | BETA
    | DELTA PIPE ARGUMENT
    | ZETA PIPE ARGUMENT PIPE ARGUMENT
    | ETA PIPE ARGUMENT PIPE ARGUMENT
    | LAMBDA function
    | MU PIPE ARGUMENT PIPE ARGUMENT
    | XI PIPE ARGUMENT PIPE ARGUMENT
    | OMICORN PIPE ARGUMENT
    | PI PIPE ARGUMENT PIPE ARGUMENT
    | SIGMA function
    | OMEGA PIPE ARGUMENT
    ;

function: LBRACKET operation (DASH operation)* RBRACKET
    ;

subop: TICK
    (GAMMA PIPE ARGUMENT
    | TAU PIPE ARGUMENT
    | PHI
    | CHI)
    ;

preprocessor_command : POUND PREPROCESSNAME COLON PREPROCESSARG (PIPE PREPROCESSARG)* SEMICOLON
    ;

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
LAMBDA : 'Lambda' ;
MU : 'Mu' ;
XI : 'Xi' ;
OMICORN : 'Omicorn' ;
PI : 'Pi' ;
SIGMA : 'Sigma' ;
OMEGA : 'Omega' ;

// Respells
GAMMA : 'Gamma' ;
TAU : 'Tau' ;
PHI : 'Phi' ;
CHI : 'Chi' ;

// Preprocessor
PREPROCESSNAME : [A-Z_]+ ;
PREPROCESSARG : (STRING | NUMBER) ;

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