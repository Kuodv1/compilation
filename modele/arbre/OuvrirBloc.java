package modele.arbre;

import modele.TDS;

public class OuvrirBloc extends Instruction{

	public OuvrirBloc(int ligne, int colonne) {
		super(ligne, colonne);
	}

	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		sb.append("#Ouverture d'un bloc. Changement de $sp\n");
		sb.append("move $s7,$sp\n");
		sb.append("addi $sp, $sp, -"+4*(TDS.getInstance().getSize())+"\n\n");
		return sb.toString();
	}
	
	public String toString() {
		return "Ouverture d'un bloc\n";
	}
}
