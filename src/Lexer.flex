import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column
%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }
%}
/* Variables básicas de comentarios y espacios */
TerminadorDeLinea = \r|\n|\r\n
EntradaDeCaracter = [^\r\n]
EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
ComentarioTradicional = "/*" [^*] ~"*/" | "/*" "*"+ "/"
FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "/**" {ContenidoComentario} "*"+ "/"


/* Comentario */
Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}

/* Identificador */
Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*

/* Número */
Numero = 0 | [1-9][0-9]*
%%
/* Comentarios o espacios en blanco */
{Comentario}|{EspacioEnBlanco} { /*Ignorar*/ }

/* Identificador */
\${Identificador} { return token(yytext(), "Identificador", yyline, yycolumn); }


/* Número */
{Numero} { return token(yytext(), "NUMERO", yyline, yycolumn); }

/* Colores 
#[{Letra}{Digito}]{6} { return token(yytext(), "COLOR", yyline, yycolumn); } */

/* Operadores de agrupación */
"(" { return token(yytext(), "PARENTESIS_A", yyline, yycolumn); }
")" { return token(yytext(), "PARENTESIS_C", yyline, yycolumn); }
"{" { return token(yytext(), "LLAVE_A", yyline, yycolumn); }
"}" { return token(yytext(), "LLAVE_C", yyline, yycolumn); }

/* Signos de puntuación */
"," { return token(yytext(), "COMA", yyline, yycolumn); }
";" { return token(yytext(), "PUNTO_COMA", yyline, yycolumn); }

/* Operador de asignación */
--> { return token (yytext(), "OP_ASIG", yyline, yycolumn); }


/* Palabras Reservadas */
bienvenidos { return token(yytext(), "Saludo", yyline, yycolumn); }
class { return token(yytext(), "Clase", yyline, yycolumn); }
suma { return token(yytext(), "tipoOperacion", yyline, yycolumn); }
void { return token(yytext(), "null", yyline, yycolumn); }
string { return token(yytext(), "AceptaCadenas", yyline, yycolumn); }
args { return token(yytext(), "parametro", yyline, yycolumn); }
a { return token(yytext(), "operador", yyline, yycolumn); }
b { return token(yytext(), "operadores", yyline, yycolumn); }
c { return token(yytext(), "OPERADOR", yyline, yycolumn); }
system { return token(yytext(), "metodoComplementador", yyline, yycolumn); }
. { return token(yytext(), "separador", yyline, yycolumn); }
out { return token(yytext(), "CampoEstatico", yyline, yycolumn); }
println { return token(yytext(), "MuestraResultado", yyline, yycolumn); }
int { return token(yytext(), "tipoDato", yyline, yycolumn); }
main { return token(yytext(), "Inicializa", yyline, yycolumn); }
la { return token(yytext(), "acoplador", yyline, yycolumn); }
de { return token(yytext(), "acopladores", yyline, yycolumn); }
es { return token(yytext(), "acoplador1", yyline, yycolumn); }
else { return token(yytext(), "verificador", yyline, yycolumn); }
while  { return token(yytext(), "comparador", yyline, yycolumn); }
for { return token(yytext(), "iteracion", yyline, yycolumn); }
new { return token(yytext(), "nuevo", yyline, yycolumn); }
private { return token(yytext(), "clases", yyline, yycolumn); }
this { return token(yytext(), "referencia", yyline, yycolumn); }
public { return token(yytext(), "clase", yyline, yycolumn); }
return { return token(yytext(), "devuelve", yyline, yycolumn); }
static { return token(yytext(), "tipoClase", yyline, yycolumn); }
long { return token(yytext(), "longitud", yyline, yycolumn); }
case { return token(yytext(), "SwComplemento", yyline, yycolumn); }
byte { return token(yytext(), "cantidad", yyline, yycolumn); }

/* Estructura if */
si |
sino { return token(yytext(), "ESTRUCTURA_SI", yyline, yycolumn); }

/* Operadores lógicos */
"&" |
"|" { return token(yytext(), "OP_LOGICO", yyline, yycolumn); }

/* Final */
final { return token(yytext(), "FINAL", yyline, yycolumn); }

/* Errores */
// Número erróneo
0 {Numero}+ { return token(yytext(), "ERROR_1", yyline, yycolumn); }
// Identificador sin $
{Identificador} { return token(yytext(), "ERROR_2", yyline, yycolumn); }
. { return token(yytext(), "ERROR", yyline, yycolumn); }
