package modele.arbre.mathematique;

import modele.arbre.Expression;

public class Nombre extends Expression{

    private double nbr;

    public Nombre(String cste){
	this.nbr = Integer.parseInt(cste);
    }
    
    public double valeur(){
	return nbr;
    }

    public int nbOperateurs(){
	return 0;
    }

    public int nbOperandes(){
	return 1;
    }

    public String toString(){
	return ""+nbr;
    }

	@Override
	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		sb.append("# Constante "+(int)nbr+"\n");
		sb.append("li $v0, "+(int)nbr+"\n");
		return sb.toString();
	}
}