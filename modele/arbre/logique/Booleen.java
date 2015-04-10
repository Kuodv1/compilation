package modele.arbre.logique;

import modele.arbre.Expression;

public class Booleen extends Expression {

	protected int bool;
	/**
	 * Constructeur Booleen
	 */
	public Booleen(String val) {
		if(val.equals("faux")) bool = 0;
		else bool = 1;
		isBool = true;
	}
	
	/**
	 * Retourne un booleen qui vérifie la sémantique
	 * @return 
	 */ 
	public boolean semantiqueCorrect() {
		return true;
	}
	
	public String toString() {
		String ret = "faux";
		if(bool==1) ret = "vrai";
		return ret;
	}
	
	/**
	 * Retourne le code en MIPS d'un booleen sous forme de chaîne de caractère
	 */
	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		sb.append("# Booleen "+bool+"\n");
		sb.append("li $v0, "+bool+"\n");
		return sb.toString();
	}

}
