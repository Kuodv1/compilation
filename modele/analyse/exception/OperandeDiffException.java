package modele.analyse.exception;

public class OperandeDiffException extends ErreurSemantiqueException {
	public OperandeDiffException(String message,int ligne, int colonne) {
		super("ERREUR OPERANDE - "+message,ligne,colonne);
	}
}
