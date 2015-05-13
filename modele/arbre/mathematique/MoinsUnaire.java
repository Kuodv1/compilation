package modele.arbre.mathematique;

import modele.Type;
import modele.analyse.exception.ErreurSemantiqueException;
import modele.analyse.exception.OperandeDiffException;
import modele.arbre.Expression;

public class MoinsUnaire extends Expression {

	protected StringBuilder sb;
	protected Expression e;
	
	/**
	 * Constrcuteur MoinsUnaire
	 */
	public MoinsUnaire(Expression e, int ligne, int colonne) {
		super(ligne,colonne);
		this.e = e;
		sb = new StringBuilder();
		isBool = false;
		type = new Type("entier");
	}
	
	/**
	 * Retourne un boolean qui vérifie la sémantique
	 */
	public void semantiqueCorrect() {
    	e.semantiqueCorrect();
    	if(e.isBool) {
    		new OperandeDiffException("MOINS_UNAIRE | ATTENDUS - int",ligne,colonne);
    	}
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
