package modele.analyse.exception;

public class OperandeDiffException extends RuntimeException {
	public OperandeDiffException(String message,int ligne, int colonne) {
		super("ERREUR SYNTAXIQUE : Ligne : "+ligne+" Colonne : "+colonne+"\n"+message);
	}
}
