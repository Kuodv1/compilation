package modele.arbre.mathematique;

import modele.analyse.exception.OperandeDiffException;
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
	public boolean semantiqueCorrect() throws OperandeDiffException {
		boolean check = true;
		if(!((this.isBool==e.getIsBool())&&e.semantiqueCorrect())) {
	   		check = false;
    		sb = new StringBuilder();
    		StringBuilder err = new StringBuilder();
    		String type = "int";
    		err.append("Erreur de type : \nFormat attendus\n");
    		err.append("- "+type+"\n");
    		String type1="bool";
    		
    		err.append("Format retrouvé :\n");
    		err.append("- "+type1+"\n");
    		err.append("Dans l'expression suivante :\n");
    		err.append(this.toString());
    			
    		throw new OperandeDiffException(err.toString());
    	}
		return check;
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
