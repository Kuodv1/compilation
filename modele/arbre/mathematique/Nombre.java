package modele.arbre.mathematique;

import modele.Type;
import modele.arbre.Expression;

public class Nombre extends Expression{

    private double nbr;

    /**
     * Constrcuteur Nombre
     */
    public Nombre(String cste, int ligne, int colonne){
    super(ligne,colonne);
	this.nbr = Integer.parseInt(cste);
	isBool = false;
	type = new Type("entier");
    }
    
    /**
     * Retourne un booleen qui vérifie la semantique
     */
    public void semantiqueCorrect() {
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
