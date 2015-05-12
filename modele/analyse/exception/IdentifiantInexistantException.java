package modele.analyse.exception;

public class IdentifiantInexistantException extends RuntimeException {
	public IdentifiantInexistantException(String message,int ligne, int colonne) {
		super("IDENTIFIANT NON DECLARE : Ligne : "+ligne+" Colonne : "+colonne+"\n"+message);
	}
}