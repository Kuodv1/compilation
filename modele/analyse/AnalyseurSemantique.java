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
			for(int i = 0; i<listeErreurSemantique.size()-1;i++) {
				sb.append(listeErreurSemantique.get(i)+"\n");
			}
			sb.append(listeErreurSemantique.get(listeErreurSemantique.size()-1));
			throw new Exception(sb.toString());
		}
	}
}
