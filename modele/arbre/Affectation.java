package modele.arbre;

public class Affectation extends Instruction{

	protected String i;
	protected Expression e;
	
	public Affectation(String i, Expression e,int ligne, int colonne) {
		super(ligne, colonne);
		this.i = i;
		this.e = e;
		
	}

	
	
	public String toString() {
		return i+" = "+e.toString();
	}
	
	
	
}
