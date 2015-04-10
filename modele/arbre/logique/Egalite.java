package modele.arbre.logique;

import modele.analyse.exception.OperandeDiffException;
import modele.arbre.Expression;
import modele.arbre.OperateurBinaire;

public class Egalite extends OperateurBinaire {
	
	/**
	 * Constructeur Egalité
	 */
	public Egalite(Expression e1, Expression e2) throws OperandeDiffException{
		super(e1,e2,true,"==");
	}
	
	
	public boolean semantiqueCorrect() {
		return (opg.getIsBool()==false)&&(opd.getIsBool()==false);
	}
	
	@Override
	/**
	 * Retourne le code MIPS d'une égalité sous forme de chaîne de caratère
	 */
	public String getCodeDecore() {
 		sb.append(opg.getCodeDecore()+"\n");
		sb.append("sw   $v0, 0($sp)\n");
		sb.append("addi  $sp, $sp, -4\n"); // sauvegarde sur la pile
		sb.append(opd.getCodeDecore()+"\n"); // recupération dans v0 de opD
		
        sb.append("#Egalite\n");
        sb.append("lw $t8, 4($sp)\n");	// t8 = première valeur de la pile
        sb.append("addi $sp, $sp, 4\n"); // dépilement
        sb.append("seq $v0, $v0, $t8 # v0 = (v0 == t8)\n");
		return sb.toString();
	}

}
