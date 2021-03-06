package modele.arbre.logique;

import modele.analyse.exception.ErreurSemantiqueException;
import modele.analyse.exception.OperandeDiffException;
import modele.arbre.Expression;
import modele.arbre.OperateurBinaire;

public class Egalite extends OperateurBinaire {
	
	/**
	 * Constructeur Egalité
	 */
	public Egalite(Expression e1, Expression e2,int ligne, int colonne){
		super(e1,e2,true,"==",ligne,colonne);
	}
	
	public String toString() {
		return opg.toString()+" == "+opd.toString();
	}
	
    public void semantiqueCorrect() {
    	opg.semantiqueCorrect();
    	opd.semantiqueCorrect();
    	if(opg.isBool != opd.isBool) {
    		new OperandeDiffException("EGALITE | ATTENDUS int "+symbole+" int  OU  bool "+symbole+" bool ",ligne,colonne);
    	}
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
