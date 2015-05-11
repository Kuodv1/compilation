package modele;

import java.util.HashMap;

import modele.analyse.exception.DoubleDeclarationException;

public class TDS {

	private static TDS tds = new TDS();
	public static TDS getInstance() {return tds;}
	
	private HashMap<String,Symbole> dictionnaire;
	private int compteur;
	
	private TDS(){
		compteur = 0;
		dictionnaire = new HashMap<String,Symbole>();
	}
	
	public void ajouter(Entree e, Symbole s) throws DoubleDeclarationException{
		if(contains(e)) {
			throw new DoubleDeclarationException(e.getEntree(),e.ligne,e.colonne);
		} else {
			dictionnaire.put(e.toString(), s);
		}
	}
	
	public Symbole identifier(String e) {
		return dictionnaire.get(e);
	}
	
	public boolean contains(Entree e) {
		return dictionnaire.containsKey(e.toString());
	}
	
	public int getSize() {
		return dictionnaire.size();
	}
	
	public void entrerBloc() {
	}
	
	public void sortirBloc() {
	}
}
