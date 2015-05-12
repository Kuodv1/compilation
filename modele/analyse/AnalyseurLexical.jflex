package modele.analyse ;

import java_cup.runtime.*;
import modele.arbre.*;
import modele.arbre.logique.*;
import modele.arbre.mathematique.*;
      
%%
   
%class AnalyseurLexical
%public

%line
%column
    
%type Symbol
%eofval{
        return symbol(CodesLexicaux.EOF) ;
%eofval}

%cup
   
%{
  private Symbol symbol(int type) {
	return new Symbol(type, yyline, yycolumn) ;
  }

  private Symbol symbol(int type, Object value) {
	return new Symbol(type, yyline, yycolumn, value) ;
  }
%}

%state commentaire

lettre = [a-zA-Z]
chiffre = [0-9]

nombre  = {chiffre}+
idf = {lettre}+

bool = "vrai" | "faux"

type = "entier"

commentaireSlashSlash = [/][/].*\n
commentaireSlashEtoile = [/][*]
commentaireEtoileSlash = [*][/]

csteChaine = \".*\"

%%

<YYINITIAL>";"                	{ return symbol(CodesLexicaux.POINTVIRGULE); }

<YYINITIAL>{commentaireSlashSlash} {}
<YYINITIAL>{commentaireSlashEtoile} { yybegin(commentaire);}
<commentaire>{commentaireEtoileSlash} { yybegin(YYINITIAL); }

<YYINITIAL>"classe"			{ return symbol(CodesLexicaux.IDFCLASSE, yytext()); }
<YYINITIAL>"lire"			{ return symbol(CodesLexicaux.IDFLIRE, yytext()); }
<YYINITIAL>"ecrire"			{ return symbol(CodesLexicaux.IDFECRIRE, yytext()); }
<YYINITIAL>"fin"			{ return symbol(CodesLexicaux.FIN, yytext()); }

<YYINITIAL>"publique"			{ return symbol(CodesLexicaux.PUBLIQUE, yytext()) ; }
<YYINITIAL>"privee"			{ return symbol(CodesLexicaux.PRIVEE, yytext()) ; }

<YYINITIAL>"("			{ return symbol(CodesLexicaux.PAROUV, yytext()); }
<YYINITIAL>{bool}			{ return symbol(CodesLexicaux.BOOL, yytext()) ; }
<YYINITIAL>{type}			{ return symbol(CodesLexicaux.TYPE, yytext()) ; }
<YYINITIAL>{idf}			{ return symbol(CodesLexicaux.IDF, yytext()) ; }
<YYINITIAL>"+"			{ return symbol(CodesLexicaux.PLUS, yytext()) ;}
<YYINITIAL>"-"			{ return symbol(CodesLexicaux.MOINS, yytext()) ;}
<YYINITIAL>"*"			{ return symbol(CodesLexicaux.MULT, yytext()) ;}
<YYINITIAL>"/"			{ return symbol(CodesLexicaux.DIV, yytext()) ;}
<YYINITIAL>">"			{ return symbol(CodesLexicaux.SUP, yytext()) ;}
<YYINITIAL>"<"			{ return symbol(CodesLexicaux.INF, yytext()) ;}
<YYINITIAL>"!="			{ return symbol(CodesLexicaux.DIFF, yytext()) ;}
<YYINITIAL>"&&"			{ return symbol(CodesLexicaux.AND, yytext()) ;}
<YYINITIAL>"||"			{ return symbol(CodesLexicaux.OR, yytext()) ;}
<YYINITIAL>"^"			{ return symbol(CodesLexicaux.XOR, yytext()) ;}
<YYINITIAL>"!"			{ return symbol(CodesLexicaux.NOT, yytext()) ;}


<YYINITIAL>"="			{ return symbol(CodesLexicaux.EGALE, yytext()) ;}
<YYINITIAL>"=="			{ return symbol(CodesLexicaux.EGALEEGALE, yytext()) ;}

<YYINITIAL>	","		{ return symbol(CodesLexicaux.VIRGULE, yytext()); }


<YYINITIAL>{nombre} 		{ return symbol(CodesLexicaux.CSTE, yytext()) ; }

<YYINITIAL>")"			{ return symbol(CodesLexicaux.PARFER, yytext()); }

<YYINITIAL>	{csteChaine}	{return symbol(CodesLexicaux.CSTECHAINE, yytext()); }

.                       {}
\n                      {}
