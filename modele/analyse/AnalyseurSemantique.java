package modele.analyse;

import java.util.ArrayList;

import modele.TDS;

public class AnalyseurSemantique {

	protected ArrayList<String> listeErreurSemantique;
	
	private static AnalyseurSemantique analyseurSemantique = new AnalyseurSemantique();
	public static AnalyseurSemantique getInstance() {return analyseurSemantique;}
	
	private AnalyseurSemantique() {
		listeErreurSemantique = new ArrayList<String>();
	}
	
	public void addErreurSemantique(String nouvelleErreur) {
		listeErreurSemantique.add(nouvelleErreur);
	}
		
	public boolean presenceErreur() {
		return listeErreurSemantique.size()>0;
	}
	
	public void analyseErreurSemantique() throws Exception{
		if(presenceErreur()){
			StringBuilder sb = new StringBuilder();
			for(String s : listeErreurSemantique) {
				sb.append(s+"\n");
			}
			throw new Exception(sb.toString());
		}
	}
}
