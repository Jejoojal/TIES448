/**
 * Define a grammar for a programming language
 */
grammar OurLanguage;
program  : 'PROGRAM' ID '(' paramList ')' '{' code '}';
paramList: ((ID (',' ID)*)? );
code: (statement)+;
statement: 'IF' '(' condition ')' '{' code '}' ('ELSE' '{' code '}')	#ifstmt
		| ID ':=' value ';'												#idstmt
		| 'FOR' '(' value ')' '{' code '}'								#forstmt
		| 'RETURN' ('(' value ')')? ';'					#returnstmt
		;

condition: value '=' value	#eqcon	
		| value '<' value	#lescon
		| value '>' value	#greatcon
		;
		
value:    simpleValue				#noarith
		| value op=('-'|'+') value	#add
		;
		
simpleValue : simpleValue op=('/'|'*') simpleValue	#mul
			| '(' value ')'	#paren
			| simplestValue	#const
 			;
 			
simplestValue : INT		#intt
 			| DOUBLE	#doublet
			| ID		#idt
			;

INT : [-]?([0-9] | [1-9][0-9]*);
DOUBLE : [-]?([0-9] | [1-9][0-9]*)'.'[0-9]+;

ID : [a-z]+[a-zA-Z]* ; 

WS : [ \t\r\n]+ -> skip ; 

COMMENT : '//' (.)*? '//' -> skip ;