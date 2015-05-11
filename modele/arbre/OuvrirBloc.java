package modele.arbre;

public class OuvrirBloc extends Instruction{

	public OuvrirBloc(int ligne, int colonne) {
		super(ligne, colonne);
	}

	public String toString() {
		return "Ouverture d'un bloc\n";
	}
}
