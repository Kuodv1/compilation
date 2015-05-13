package modele.analyse.exception;

public class ErreurLexicaleException extends RuntimeException {
	public ErreurLexicaleException(String message,int ligne, int colonne) {
		super("ERREUR LEXICALE : Ligne : "+ligne+" Colonne : "+colonne+"\n"+message);
	}

}
