package modele.arbre.mathematique;

import modele.analyse.exception.OperandeDiffException;
import modele.arbre.Expression;
import modele.arbre.OperateurBinaire;

public class Plus extends OperateurBinaire {

    /**
     * Constrcuteur Plus
     */
    public Plus(Expression operande1, Expression operande2)throws OperandeDiffException{
	       	super(operande1,operande2,false,"+");
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
   
