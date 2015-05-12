package modele.arbre;

import modele.Entree;
import modele.Symbole;
import modele.TDS;
import modele.analyse.exception.IdentifiantInexistantException;
import modele.analyse.exception.MauvaiseAffectationException;
import modele.analyse.exception.OperandeDiffException;

public class Affectation extends Instruction{

	protected String i;
	protected Expression e;
	
	public Affectation(String i, Expression e,int ligne, int colonne) {
		super(ligne, colonne);
		this.i = i;
		this.e = e;
		
	}

	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		Symbole s = TDS.getInstance().identifier(i);
		int depl = s.getDeplacement();
		
		sb.append(e.getCodeDecore());
		sb.append("#--Association de l'expression à la variable\n");
		sb.append("sw $v0, "+depl+"($s7)\n");
		return sb.toString();
	}
	
	public void semantiqueCorrect() throws MauvaiseAffectationException, IdentifiantInexistantException {
		Entree tmp = new Entree(i,ligne,colonne);
		if(!TDS.getInstance().contains(tmp)) {
			throw new IdentifiantInexistantException("Variable "+i+" inexistante.\n",ligne,colonne);
		} else {
			if(!(TDS.getInstance().identifier(i).memeType(e.getType()))) {
				throw new MauvaiseAffectationException("Affectation attendus à la variable "+i+" de type : "+e.getType().getType(),ligne,colonne);
			}
		}
	}
	
	public String toString() {
		return i+" = "+e.toString()+";";
	}
	
	
	
}
