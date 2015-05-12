package modele.arbre;

import modele.Entree;
import modele.Symbole;
import modele.TDS;
import modele.analyse.exception.IdentifiantInexistantException;

public class Variable extends Expression {

	protected String var;
	
	public Variable(String var, int ligne, int colonne) {
		super(ligne, colonne);
		this.var = var;
		
	}

	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		Symbole s = TDS.getInstance().identifier(var);
		int depl = s.getDeplacement();
		
		sb.append("#--Recupération de la variable"+var+"\n");
		sb.append("lw $v0, "+depl+"($s7)\n");
		return sb.toString();
	}
	
	@Override
	public void semantiqueCorrect() throws IdentifiantInexistantException{
		Entree tmp = new Entree(var,ligne,colonne);
		if(!TDS.getInstance().contains(tmp)) {
			throw new IdentifiantInexistantException("Variable "+var+" inexistante.\n",ligne,colonne);
		}
		
	}
	
	public String toString() {
		return var;
	}

}
