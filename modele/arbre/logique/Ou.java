package modele.arbre.logique;

import modele.analyse.exception.OperandeDiffException;
import modele.arbre.Expression;
import modele.arbre.OperateurBinaire;

public class Ou extends OperateurBinaire {

	/**
	 * Constrcuteur Ou
	 */
	public Ou(Expression e1, Expression e2,int ligne, int colonne) {
		super(e1,e2,true,"||",ligne,colonne);
	}

	public String toString() {
		return opg.toString()+" || "+opd.toString();
	}
	
    public void semantiqueCorrect() throws OperandeDiffException {
    	opg.semantiqueCorrect();
    	opd.semantiqueCorrect();
    	if(!opg.isBool || !opd.isBool) {
    		throw new OperandeDiffException("OPERATION : "+symbole+" | ATTENDUS bool "+symbole+" bool",ligne,colonne);
    	}
    }
	
	@Override
	/**
	 * Retourne le code MIPS d'un OU logique sous forme de chaîne caractère
	 */
	public String getCodeDecore() {
 		sb.append(opg.getCodeDecore()+"\n");
		sb.append("sw   $v0, 0($sp)\n");
		sb.append("addi  $sp, $sp, -4\n"); // sauvegarde sur la pile
		sb.append(opd.getCodeDecore()+"\n"); // recupération dans v0 de opD
		
        sb.append("#OU Logique\n");
        sb.append("lw $t8, 4($sp)\n");	// t8 = première valeur de la pile
        sb.append("addi $sp, $sp, 4\n"); // dépilement
        sb.append("or $v0,$v0,$t8 #OU logique de v0 et t8, stock dans v0\n");
		return sb.toString();
	}

}
