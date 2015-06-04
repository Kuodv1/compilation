package modele;

import java.util.ArrayList;
import java.util.HashMap;

import modele.analyse.exception.DoubleDeclarationException;

public class TDS {

	private static TDS tds = new TDS();
	public static TDS getInstance() {return tds;}
	
	private HashMap<String,Symbole> dictionnaire;
	//private HashMap<HashMap<String,Symbole>,HashMap<String,Symbole>> tableDictionnaire;
	private int compteur;
	
	private TDS(){
		compteur = 0;
		dictionnaire = new HashMap<String,Symbole>();
		//tableDictionnaire = new HashMap<HashMap<String,Symbole>,HashMap<String,Symbole>>();
		//tableDictionnaire.put(dictionnaire, dictionnaire);
	}
	
	public void ajouter(Entree e, Symbole s){
		dictionnaire.put(e.toString(), s);
		s.setDeplacement(compteur);
		compteur+=4;
	}
	
	//key = fils, value = pere
	//public HashMap<String,Symbole> getDictionnairePere(HashMap<String,Symbole> fils) {
	//	return tableDictionnaire.get(fils);
	//}
	
	public Symbole identifier(String e) {
		return dictionnaire.get(e);
	}
	
	public boolean contains(Entree e) {
		return dictionnaire.containsKey(e.toString());
	}
	
	public int getSize() {
		return dictionnaire.size();
	}
	
	public void ouvrirBloc() {
		//HashMap<String,Symbole> newDictionnaire = new HashMap<String,Symbole>();
		//tableDictionnaire.put(newDictionnaire, dictionnaire);
		//dictionnaire = newDictionnaire;
		
	}
	
	public void fermerBloc() {
		//dictionnaire = tableDictionnaire.get(dictionnaire);
	}
}
