package modele.analyse.exception;

public class ErreurLexicaleException extends RuntimeException {
	public ErreurLexicaleException(String message,int ligne, int colonne) {
		super("ERREUR LEXICALE : "+ligne+" : "+message);
	}

}
