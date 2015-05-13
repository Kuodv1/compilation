package modele.analyse.exception;

public class ErreurSyntaxiqueException extends RuntimeException{
	public ErreurSyntaxiqueException(String message,int ligne, int colonne) {
		super("ERREUR SYNTAXIQUE : "+ligne+" : "+message);
	}
}
