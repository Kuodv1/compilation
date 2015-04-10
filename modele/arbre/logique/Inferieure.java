package modele.arbre.logique;

import modele.arbre.Expression;
import modele.arbre.OperateurBinaire;

public class Inferieure extends OperateurBinaire{

	public Inferieure(Expression e1, Expression e2) {
		super(e1, e2);
	}

	@Override
	public String getCodeDecore() {
		sb.append(opg.getCodeDecore()+"\n");
		sb.append("sw   $v0, 0($sp)\n");
		sb.append("addi  $sp, $sp, -4\n"); // sauvegarde sur la pile
		sb.append(opd.getCodeDecore()+"\n"); // recupération dans v0 de opD
		
        sb.append("#Inferieure strict\n");
        sb.append("lw $t8, 4($sp)\n");	// t8 = première valeur de la pile
        sb.append("addi $sp, $sp, 4\n"); // dépilement
        sb.append("slt $v0, $t8, $v0 # v0 = t8<v0\n");
		return sb.toString();
	}

}
