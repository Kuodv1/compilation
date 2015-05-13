package modele.analyse.exception;

public class MauvaiseAffectationException extends ErreurSemantiqueException{
	public MauvaiseAffectationException(String message,int ligne, int colonne) {
		super("MAUVAISE AFFECTATION - "+message,ligne,colonne);
	}
}