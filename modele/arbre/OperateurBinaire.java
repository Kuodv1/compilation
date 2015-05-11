package modele.arbre;

import modele.analyse.exception.OperandeDiffException;

public abstract class OperateurBinaire extends Expression{
    
    protected Expression opg;
    protected Expression opd;
    protected StringBuilder sb;
    protected String symbole;
    
    /**
     * Constructeur OperateurBinaire
     **/
    public OperateurBinaire(Expression opg,Expression opd, boolean isBool, String symbole, int ligne, int colonne) {
	super(ligne,colonne);
    this.opg = opg;
	this.opd = opd;
	this.isBool=isBool;
	this.symbole=symbole;
	sb = new StringBuilder();

    }

    public String signeToString() {
    	return symbole;
    }
    
    public String toString() {
    	StringBuilder to = new StringBuilder();
    	to.append("("+opg.toString()+" "+symbole+" "+opd.toString()+")");
    	return to.toString();
    }
    
   /**
     * Retourne le nombre d'operateur
     * @return
     */
    public int nbOperateurs(){
	return opg.nbOperateurs()+opd.nbOperateurs()+1;
    }

    /**
     * Retourne le nombre d'operande
     * @return
     */
    public int nbOperandes(){
	return opg.nbOperandes()+opd.nbOperandes();
    }
}
