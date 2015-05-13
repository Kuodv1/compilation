package modele.analyse.exception;

public class DoubleDeclarationException extends ErreurSemantiqueException {
	public DoubleDeclarationException(String message,int ligne, int colonne) {
		super("DOUBLE DECLARATION : "+message,ligne,colonne);
	}
}