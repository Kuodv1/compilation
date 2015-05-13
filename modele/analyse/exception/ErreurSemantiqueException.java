package modele.analyse.exception;

import modele.analyse.AnalyseurSemantique;

public class ErreurSemantiqueException {
	public ErreurSemantiqueException(String message,int ligne, int colonne) {
		AnalyseurSemantique.getInstance().addErreurSemantique("ERREUR SEMANTIQUE : Ligne : "+ligne+" Colonne : "+colonne+" : "+message);
	}
}
