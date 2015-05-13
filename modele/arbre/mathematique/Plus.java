package modele.arbre.mathematique;

import modele.analyse.exception.ErreurSemantiqueException;
import modele.analyse.exception.OperandeDiffException;
import modele.arbre.Expression;
import modele.arbre.OperateurBinaire;

public class Plus extends OperateurBinaire {

    /**
     * Constrcuteur Plus
     */
    public Plus(Expression operande1, Expression operande2, int ligne, int colonne){
	       	super(operande1,operande2,false,"+",ligne,colonne);
       	}
     
	public String toString() {
		return opg.toString()+" + "+opd.toString();
	}
    
    public void semantiqueCorrect(){

    	opg.semantiqueCorrect();
    	opd.semantiqueCorrect();
    	if(opg.isBool || opd.isBool) {
    		new OperandeDiffException("ADDITION | ATTENDUS : int "+symbole+" int",ligne,colonne);
    	}
    }
    
	/**
	 * Retourne le code MIPS d'une addition sous forme de chaîne caractère
	 */
    	public String getCodeDecore(){
    		sb.append(opg.getCodeDecore()+"\n");
    		sb.append("sw   $v0, 0($sp)\n");
    		sb.append("addi  $sp, $sp, -4\n"); // sauvegarde sur la pile
    		sb.append(opd.getCodeDecore()+"\n"); // recupération dans v0 de opD
    		
	        sb.append("#Addition\n");
	        sb.append("lw $t8, 4($sp)\n");	// t8 = première valeur de la pile
	        sb.append("addi $sp, $sp, 4\n"); // dépilement
	        sb.append("add $v0, $v0, $t8\n"); // v0 = v0 + t8
    		
    		return sb.toString();
	}
   	

}
   
