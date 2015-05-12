package modele.analyse.exception;

public class MauvaiseAffectationException extends RuntimeException{
	public MauvaiseAffectationException(String message,int ligne, int colonne) {
		super("MAUVAISE AFFECTATION : Ligne : "+ligne+" Colonne : "+colonne+"\n"+message);
	}
}