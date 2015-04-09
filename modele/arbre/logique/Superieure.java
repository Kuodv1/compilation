package modele.arbre.logique;

import modele.arbre.Expression;
import modele.arbre.OperateurBinaire;

public class Superieure extends OperateurBinaire{

	public Superieure(Expression e1, Expression e2) {
		super(e1, e2);
	}

	@Override
	public String getCodeDecore() {
		sb.append(opg.getCodeDecore()+"\n");
		sb.append("sw   $v0, 0($sp)\n");
		sb.append("addi  $sp, $sp, -4\n"); // sauvegarde sur la pile
		sb.append(opd.getCodeDecore()+"\n"); // recupération dans v0 de opD
		
        sb.append("#Superieure strict\n");
        sb.append("lw $t8, 4($sp)\n");	// t8 = première valeur de la pile
        
        sb.append("sub $v0,$v0,$t8 # v0 = v0-t8 ( soit opd - opg )\n");
    	sb.append("bgez $v0, inf # si opd-opg>=0 allez à inf");//si v0-t8 >= 0, alors opg <= opd
        sb.append("li $v0, 1 #v0 = 1, soit v0 = vrai, opG > opD\n");
        sb.append("j suite #jump à la suite\n");
        sb.append("inf: #v0>=0, soit opg<=opd (! opg>opd)\n");
        sb.append("li $v0, 0#v0 = 0, soit v0 = faux\n");
        sb.append("suite: #v0 est soit vrai, soit faux\n");
        return sb.toString();
	}

}
