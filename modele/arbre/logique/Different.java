package modele.arbre.logique;

import modele.arbre.Expression;
import modele.arbre.OperateurBinaire;

public class Different extends OperateurBinaire {
	
	public Different(Expression e1, Expression e2) {
		super(e1,e2);
		
	}

	@Override
	public String getCodeDecore() {
 		sb.append(opg.getCodeDecore()+"\n");
		sb.append("sw   $v0, 0($sp)\n");
		sb.append("addi  $sp, $sp, -4\n"); // sauvegarde sur la pile
		sb.append(opd.getCodeDecore()+"\n"); // recupération dans v0 de opD
		
        sb.append("#Different\n");
        sb.append("lw $t8, 4($sp)\n");	// t8 = première valeur de la pile
        sb.append("beq $v0, $t8, egal #si v0 == t8, alors va a egal\n");
        sb.append("li $v0, 1 #v0 = 1, soit v0 = vrai\n");
        sb.append("j suite #jump à la suite\n");
        sb.append("egal: #v0 == t0\n");
        sb.append("li $v0, 0#v0 = 0, soit v0 = Faux\n");
        sb.append("suite: #v0 est soit vrai, soit faux\n");
		return sb.toString();
	}
	
}