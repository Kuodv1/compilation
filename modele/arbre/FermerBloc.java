package modele.arbre;

public class FermerBloc extends Instruction{

	public FermerBloc(int ligne, int colonne) {
		super(ligne, colonne);
	}

	
	public String toString() {
		return "Fermeture d'un bloc\n";
	}
}
