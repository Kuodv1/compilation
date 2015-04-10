package modele.arbre.mathematique;

import modele.arbre.Expression;

public class Nombre extends Expression{

    private double nbr;

    /**
     * Constrcuteur Nombre
     */
    public Nombre(String cste){
	this.nbr = Integer.parseInt(cste);
	isBool = false;
    }
    
    /**
     * Retourne un booleen qui vérifie la semantique
     */
    public boolean semantiqueCorrect() {
    	return true;
    }
    
    /**
     * Retourne la valeur du nombre
     * @return 
     */
    public double valeur(){
	return nbr;
    }

    /**
     * Retourne le nombre d'operateur
     * @return 
     */
    public int nbOperateurs(){
	return 0;
    }

    /**
     * Retourne le nombre d'operande
     * @return 
     */
    public int nbOperandes(){
	return 1;
    }

   /**
    * Retourne la valeur du nombre sous forme d'une chaîne de caractère
    */
    public String toString(){
	return ""+nbr;
    }

	@Override
	/**
	 * Retourne le code MIPS d'un nombre sous forme de chaîne caractère
	 */
	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		sb.append("# Constante "+(int)nbr+"\n");
		sb.append("li $v0, "+(int)nbr+"\n");
		return sb.toString();
	}
}
