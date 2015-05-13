package modele.analyse.exception;

public class IdentifiantInexistantException extends ErreurSemantiqueException {
	public IdentifiantInexistantException(String message,int ligne, int colonne) {
		super("IDENTIFIANT NON DECLARE : "+message,ligne,colonne);
	}
}