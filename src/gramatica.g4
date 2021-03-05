grammar gramatica;

start  :
        //PROGRAM ID LLAVE_ABIERTA
        sentence*
        //LLAVE_CERRADA
        ;

sentence: declaracion | asignacion | operacionAritmetica | asignacionOperacionAritmetica;

declaracion: VAR ID PTO_COMA;
asignacion: VAR|ID ASIGNAR (INT|DOUBLE)PTO_COMA; //<--Toca corregir este
asignacionOperacionAritmetica: VAR|ID ASIGNAR operacionAritmetica PTO_COMA;
operacionAritmetica: (INT|DOUBLE|ID) | operacionAritmetica(SUM | RESTA | MULTI | DIV) operacionAritmetica;



/////////PALABRAS RESERVADAS
VAR:'var';
PRINTLN:'println';
IF: 'if';
ELSE_IF: 'else if';
ELSE: 'else';
//////////////////////////////



/////////TIPOS DE DATOS
INT    :  [0-9]+;
DOUBLE : [0-9]+ '.' [0-9]+;
//////////////////////////////



/////////OPERADORES LÓGICOS
AND: '&&';
OR: '||';
NOT: '!';
//////////////////////////////



/////////OPERADORES DE COMPARACIÓN
MAYORQ: '>';
MENORQ: '<';
MAYORIQ: '>=';
MENORIQ: '<=';
IGUAL: '==';
DIF: '!=';
//////////////////////////////

/////////OPERADORES ARITMÉTICOS
SUM: '+';
RESTA: '-';
MULTI: '*';
DIV: '/';
//////////////////////////////


/////////OTROS
ASIGNAR: '=';
LLAVE_ABIERTA: '{';
LLAVE_CERRADA: '}';
PAR_ABIERTA: '(';
PAR_CERRADA: ')';
PTO_COMA: ';';
ID : [a-zA-Z_][a-zA-Z0-9_]*;
WS : [ \t\r\n]+ -> skip;
//////////////////////////////

