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
    public OperateurBinaire(Expression opg,Expression opd, boolean isBool, String symbole) throws OperandeDiffException {
	this.opg = opg;
	this.opd = opd;
	this.isBool=isBool;
	this.symbole=symbole;
	sb = new StringBuilder();
	if(!semantiqueCorrect()) {
		StringBuilder err = new StringBuilder();
		String type = "int";
		if(this.isBool) type="bool";
		err.append("Erreur de type : \nFormat attendus\n");
		err.append(type+" "+this.signeToString()+" "+type+"\n");
		String type1 = "int";
		String type2 = "int";
		if(opg.isBool) type1="bool";
		if(opd.isBool) type2="bool";
		
		err.append("Format retrouvé :\n");
		err.append(type1+" "+this.signeToString()+" "+type2+"\n");
		err.append("Dans l'expression suivante :\n");
		err.append(this.toString());
		
		throw new OperandeDiffException(err.toString());
	}
    }

    public boolean semantiqueCorrect() {
    	return (opg.isBool==this.isBool)&&(opd.isBool==this.isBool)&&opg.semantiqueCorrect()&&opd.semantiqueCorrect();
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
