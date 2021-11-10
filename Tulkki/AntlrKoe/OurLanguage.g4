/**
 * Define a grammar for a programming language
 */
grammar OurLanguage;
program  : 'PROGRAM' ID '(' paramList ')' '{' code '}';
paramList: (ID (',' ID)+ );
code: (statement)+;
statement: 'IF' '(' condition ')' '{' code '}' ('ELSE' '{' code '}')
		| ID ':=' value ';'
		| 'FOR' '(' value ')' '{' code '}'
		| 'RETURN' ('(' value ')')
		;

condition: value '=' value
		| value '<' value
		| value '>' value
		;
		
value: ; //TODO

ID : [a-z]+ ; 

WS : [ \t\r\n]+ -> skip ; 

COMMENT : '//' * '//' -> skip ;
