package modele.arbre;

import modele.Entree;
import modele.Symbole;
import modele.TDS;
import modele.analyse.exception.IdentifiantInexistantException;
import modele.analyse.exception.MauvaiseAffectationException;

public class Lire extends Instruction{

	protected String i;
	
	public Lire(String i,int ligne, int colonne) {
		super(ligne, colonne);
		this.i = i;
	}

	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		
		Symbole s = TDS.getInstance().identifier(i);
		int depl = s.getDeplacement();
		
		sb.append("#--LIRE entier et stockage dans la var :"+i+"\n");
		sb.append("li $v0, 5\n");
		sb.append("syscall\n");
		sb.append("move $t0, $v0\n");
		sb.append("sw $t0,"+depl+"($s7)\n");
		
		return sb.toString();
	}
	
	public void semantiqueCorrect(){
		Entree tmp = new Entree(i,ligne,colonne);
		if(!TDS.getInstance().contains(tmp)) {
			new IdentifiantInexistantException("Variable "+i+" inexistante.\n",ligne,colonne);
		}
	}
	
	public String toString() {
		return "Lire "+i;
	}
}
