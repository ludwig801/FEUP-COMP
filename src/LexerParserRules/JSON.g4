grammar JSON;

NAMELIT : 'name' ;
GROUPLIT : 'group' ;
GROUPSLIT : 'groups' ;
NODELIT : 'nodes' ;
LINKLIT : 'links' ;
SOURCELIT : 'source' ;
TARGETLIT : 'target' ;
VALUELIT : 'value' ;

INT : [0-9]+;
DOUBLE : INT'.'INT;
STRING : [a-z]+;
NAME : [a-zA-Z0-9]+;
OPBR : '{' ;
CLBR : '}' ; 
OPSQBR : '[' ; 
CLSQBR : ']' ;
COMMA : ',' ;
COLON : ':' ; 
QUOTATION : '"' ;
EQUAL : '=';

WS : [ \t\n\r]+ -> skip ;

start : json EOF
	  ;

json : OPBR firstSection CLBR
	 ;

nodeSection : QUOTATION NODELIT QUOTATION COLON OPSQBR nodelist CLSQBR
            ;

linkSection : QUOTATION LINKLIT QUOTATION COLON OPSQBR linklist CLSQBR
            ;

firstSection : nodeSection extraSection
             | linkSection extraSection
             | groupSection extraSection
             ;

extraSection : COMMA section
             | /*epsilon*/
             ;
section : nodeSection extraSection
        | linkSection extraSection
        | groupSection extraSection
        ;

nodelist : node
		 | node COMMA nodelist
		 ;

linklist: link
		| link COMMA linklist
		;

node : OPBR
		QUOTATION NAMELIT QUOTATION COLON QUOTATION name=NAME QUOTATION COMMA
	   	QUOTATION GROUPLIT QUOTATION COLON group=INT
	   	nodeAttrList
	   CLBR
	 ;

nodeAttrList : COMMA nodeAttr nodeAttrList
			 | /*epsilon*/
			 ;

link : OPBR QUOTATION SOURCELIT QUOTATION COLON source=linkNodeTS COMMA
			QUOTATION TARGETLIT QUOTATION COLON target=linkNodeTS COMMA
			QUOTATION VALUELIT QUOTATION COLON value=INT
			linkAttrList CLBR
	 ;

linkNodeTS : INT
           | NAME
           ;

linkAttrList : COMMA linkAttr linkAttrList
			 | /*epsilon*/
			 ;

nodeAttr : name=STRING EQUAL value=nodeAttrValue
		 ;

nodeAttrValue : STRING
              | DOUBLE
              | INT
              ;

linkAttr : name=STRING EQUAL value=linkAttrValue
		 ;

linkAttrValue : STRING
              | DOUBLE
              | INT
              ;

groupSection : QUOTATION GROUPSLIT QUOTATION COLON OPSQBR groupOptionList CLSQBR
			 | /*epsilon*/
			 ;

groupOptionList : groupOption COMMA groupOptionList
				| groupOption
				;

groupOption : OPBR QUOTATION GROUPLIT QUOTATION COLON group=INT COMMA groupAttr groupAttributeList CLBR
			;

groupAttributeList : COMMA groupAttr groupAttributeList
				   | /*epsilon*/
				   ;

groupAttr : name=STRING EQUAL value=groupAttrValue
		  ;

groupAttrValue : STRING
			   | DOUBLE
			   | INT
			   ;

