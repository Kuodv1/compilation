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
	 * Retourne un boolean qui vérifie la sémantique
	 * @return 
	 */ 
	public boolean semantiqueCorrect() {
		return true;
	}
	
	/**
	 * Retourne le code en MIPS sous forme de chaîne de caractère
	 */
	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		sb.append("# Booleen "+bool+"\n");
		sb.append("li $v0, "+bool+"\n");
		return sb.toString();
	}

}
