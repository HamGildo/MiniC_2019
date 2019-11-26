grammar MiniC;

program	: decl+			{System.out.println("201702087 Rule0");};
decl		: var_decl	{System.out.println("201702087 Rule1-1");}
		| fun_decl		{System.out.println("201702087 Rule1-2");};
var_decl	:  type_spec IDENT ';'              {System.out.println("201702087 Rule2-1");}
		| type_spec IDENT '=' LITERAL ';'	    {System.out.println("201702087 Rule2-2");}
		| type_spec IDENT '[' LITERAL ']' ';'	{System.out.println("201702087 Rule2-3");};
type_spec	: VOID			{System.out.println("201702087 Rule3-1");}
		| INT				{System.out.println("201702087 Rule3-2");};
fun_decl	: type_spec IDENT '(' params ')' compound_stmt {System.out.println("201702087 Rule4");};
params		: param (',' param)*	{System.out.println("201702087 Rule5-1");}
		| VOID				        {System.out.println("201702087 Rule5-2");}
		|				;
param		: type_spec IDENT		{System.out.println("201702087 Rule6-1");}
		| type_spec IDENT '[' ']'	{System.out.println("201702087 Rule6-2");};
stmt		: expr_stmt			{System.out.println("201702087 Rule7-1");}
		| compound_stmt			{System.out.println("201702087 Rule7-2");}
		| if_stmt			    {System.out.println("201702087 Rule7-3");}
		| while_stmt			{System.out.println("201702087 Rule7-4");}
		| return_stmt			{System.out.println("201702087 Rule7-5");};
expr_stmt	: expr ';'			{System.out.println("201702087 Rule8");};
while_stmt	: WHILE '(' expr ')' stmt	{System.out.println("201702087 Rule9");};
compound_stmt: '{' local_decl* stmt* '}'	{System.out.println("201702087 Rule10");};
local_decl	: type_spec IDENT ';'               {System.out.println("201702087 Rule11-1");}
		| type_spec IDENT '=' LITERAL ';'	    {System.out.println("201702087 Rule11-2");}
		| type_spec IDENT '[' LITERAL ']' ';'	{System.out.println("201702087 Rule11-3");};
if_stmt		: IF '(' expr ')' stmt		        {System.out.println("201702087 Rule12-1");}
		| IF '(' expr ')' stmt ELSE stmt 		{System.out.println("201702087 Rule12-2");};
return_stmt	: RETURN ';'			    {System.out.println("201702087 Rule13-1");}
		| RETURN expr ';'				{System.out.println("201702087 Rule13-2");};
expr	:  LITERAL				        {System.out.println("201702087 Rule14-1");}
	| '(' expr ')'				        {System.out.println("201702087 Rule14-2");}
	| IDENT				                {System.out.println("201702087 Rule14-3");}
	| IDENT '[' expr ']'			    {System.out.println("201702087 Rule14-4");}
	| IDENT '(' args ')'			    {System.out.println("201702087 Rule14-5");}
	| '-' expr				            {System.out.println("201702087 Rule14-6");}
	| '+' expr				            {System.out.println("201702087 Rule14-7");}
	| '--' expr				            {System.out.println("201702087 Rule14-8");}
	| '++' expr				            {System.out.println("201702087 Rule14-9");}
	| expr '*' expr				        {System.out.println("201702087 Rule14-10");}
	| expr '/' expr				        {System.out.println("201702087 Rule14-11");}
	| expr '%' expr				        {System.out.println("201702087 Rule14-12");}
	| expr '+' expr				        {System.out.println("201702087 Rule14-13");}
	| expr '-' expr				        {System.out.println("201702087 Rule14-14");}
	| expr EQ expr				        {System.out.println("201702087 Rule14-15");}
	| expr NE expr				        {System.out.println("201702087 Rule14-16");}
	| expr LE expr				        {System.out.println("201702087 Rule14-17");}
	| expr '<' expr				        {System.out.println("201702087 Rule14-18");}
	| expr GE expr				        {System.out.println("201702087 Rule14-19");}
	| expr '>' expr				        {System.out.println("201702087 Rule14-20");}
	| '!' expr					        {System.out.println("201702087 Rule14-21");}
	| expr AND expr				        {System.out.println("201702087 Rule14-22");}
	| expr OR expr				        {System.out.println("201702087 Rule14-23");}
	| IDENT '=' expr			        {System.out.println("201702087 Rule14-24");}
	| IDENT '[' expr ']' '=' expr		{System.out.println("201702087 Rule14-25");};
args	: expr (',' expr)*		{System.out.println("201702087 Rule15-1");}
	|					        {System.out.println("201702087 Rule15-2");};

VOID: 'void'    {System.out.println("201702087 Rule16");};
INT: 'int'  {System.out.println("201702087 Rule17");};

WHILE: 'while'  {System.out.println("201702087 Rule18");};
IF: 'if'    {System.out.println("201702087 Rule19");};
ELSE: 'else'    {System.out.println("201702087 Rule20");};
RETURN: 'return'    {System.out.println("201702087 Rule21");};
OR: 'or'    {System.out.println("201702087 Rule22");};
AND: 'and'  {System.out.println("201702087 Rule23");};
LE: '<='    {System.out.println("201702087 Rule24");};
GE: '>='    {System.out.println("201702087 Rule25");};
EQ: '=='    {System.out.println("201702087 Rule26");};
NE: '!='    {System.out.println("201702087 Rule27");};

IDENT  : [a-zA-Z_]      {System.out.println("201702087 Rule28-1");}
        (   [a-zA-Z_]   {System.out.println("201702087 Rule28-2");}
        |  [0-9]        {System.out.println("201702087 Rule28-3");}
        )*              {System.out.println("201702087 Rule28-4");};


LITERAL:   DecimalConstant          {System.out.println("201702087 Rule29-1");}
        |   OctalConstant           {System.out.println("201702087 Rule29-2");}
        |   HexadecimalConstant     {System.out.println("201702087 Rule29-3");};


DecimalConstant
    :   '0'             {System.out.println("201702087 Rule30-1");}
	|   [1-9] [0-9]*    {System.out.println("201702087 Rule30-2");}
    ;

OctalConstant
    :   '0'[0-7]*       {System.out.println("201702087 Rule31");}
    ;

HexadecimalConstant
    :   '0' [xX] [0-9a-fA-F] +      {System.out.println("201702087 Rule32");}
    ;

WS  :   (   ' '                     {System.out.println("201702087 Rule33-1");}
        |   '\t'                    {System.out.println("201702087 Rule33-2");}
        |   '\r'                    {System.out.println("201702087 Rule33-3");}
        |   '\n'                    {System.out.println("201702087 Rule33-4");}
        )+                          {System.out.println("201702087 Rule33-5");}
	-> channel(HIDDEN)	 
    ;
