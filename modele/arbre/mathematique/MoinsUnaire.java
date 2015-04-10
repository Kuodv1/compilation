package modele.arbre.mathematique;

import modele.arbre.Expression;

public class MoinsUnaire extends Expression {

	protected StringBuilder sb;
	protected Expression e;
	
	/**
	 * Constrcuteur MoinsUnaire
	 */
	public MoinsUnaire(Expression e) {
		this.e = e;
		sb = new StringBuilder();
		isBool = false;
	}
	
	/**
	 * Retourne un boolean qui vérifie la sémantique
	 */
	public boolean semantiqueCorrect() {
		return (this.isBool == e.getIsBool())&&e.semantiqueCorrect();
	}
	
	public String toString() {
		return "-"+e.toString();
	}
	
	@Override
	/**
	 * Retourne le code MIPS d'une négation sous forme de chaîne caractère
	 */
	public String getCodeDecore() {
		sb.append(e.getCodeDecore()+"\n");
		sb.append("#MoinsUnaire\n");
		sb.append("neg $v0, $v0\n");
		return sb.toString();
	}



}
