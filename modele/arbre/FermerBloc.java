package modele.arbre;

import modele.TDS;

public class FermerBloc extends Instruction{

	public FermerBloc(int ligne, int colonne) {
		super(ligne, colonne);
	}

	
	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		sb.append("#Fermeture d'un bloc. Changement de $sp\n");
		sb.append("addi $sp, $sp, +"+4*(TDS.getInstance().getSize())+"\n\n");
		return sb.toString();
	}
	
	
	public String toString() {
		return "Fermeture d'un bloc\n";
	}
}
