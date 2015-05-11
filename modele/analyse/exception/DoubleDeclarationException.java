package modele.analyse.exception;

public class DoubleDeclarationException extends RuntimeException {
	public DoubleDeclarationException(String message,int ligne, int colonne) {
		super("DOUBLE DECLARATION : Ligne : "+ligne+" Colonne : "+colonne+"\n"+message);
	}
}