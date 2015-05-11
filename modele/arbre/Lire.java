package modele.arbre;

public class Lire extends Instruction{

	protected String i;
	
	public Lire(String i,int ligne, int colonne) {
		super(ligne, colonne);
		this.i = i;
	}

	
	public String toString() {
		return "Lire "+i;
	}
}
