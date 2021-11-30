grammar Wandlab;

program: sequence* operation EOF
    ;

sequence: operation'-'
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

function: LBRACKET (sequence* operation)? RBRACKET
    ;

subop: TICK
    (GAMMA PIPE ARGUMENT
    | TAU PIPE ARGUMENT
    | PHI
    | CHI)
    ;

ARGUMENT : (STRING | POINTER | NUMBER) ;
STRING : QUOTE (TEXT | NUMBER)* QUOTE ;
POINTER : ARROW NUMBER ;

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

PIPE : '|' ;
TICK : '^' ;
QUOTE : '"' ;
ARROW : '->' ;
LBRACKET : '[' ;
RBRACKET : ']' ;

TEXT: [a-zA-Z ]+ ;
NUMBER : [0-9]+ ;

WS : [ \t\r\n] -> skip ;