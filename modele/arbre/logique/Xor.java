package modele.arbre.logique;

import modele.analyse.exception.ErreurSemantiqueException;
import modele.analyse.exception.OperandeDiffException;
import modele.arbre.Expression;
import modele.arbre.OperateurBinaire;

public class Xor extends OperateurBinaire {

	/**
	 * Constructeur Xor
	 */
	public Xor(Expression e1, Expression e2, int ligne, int colonne){
		super(e1,e2,true,"^", ligne, colonne);
	}

	public String toString() {
		return opg.toString()+ " ^ "+opd.toString();
	}
	
    public void semantiqueCorrect(){
    	opg.semantiqueCorrect();
    	opd.semantiqueCorrect();
    	if(!opg.isBool || !opd.isBool) {
    		new OperandeDiffException("XOR | ATTENDUS : bool "+symbole+" bool",ligne,colonne);
    	}
    }
	
	@Override
	/**
	 * Retourne le code MIPS d'un OU exclusif sous forme de chaîne caractère
	 */
	public String getCodeDecore() {
 		sb.append(opg.getCodeDecore()+"\n");
		sb.append("sw   $v0, 0($sp)\n");
		sb.append("addi  $sp, $sp, -4\n"); // sauvegarde sur la pile
		sb.append(opd.getCodeDecore()+"\n"); // recupération dans v0 de opD
		
        sb.append("#XOR Logique\n");
        sb.append("lw $t8, 4($sp)\n");	// t8 = première valeur de la pile
        sb.append("addi $sp, $sp, 4\n"); // dépilement
        sb.append("xor $v0,$v0,$t8 #XOR logique de v0 et t8, stock dans v0\n");
		return sb.toString();
	}

}
