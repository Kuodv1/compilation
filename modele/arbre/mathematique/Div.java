package modele.arbre.mathematique;

import modele.analyse.exception.OperandeDiffException;
import modele.arbre.Expression;
import modele.arbre.OperateurBinaire;

public class Div extends OperateurBinaire {
	
    /**
     * Constructeur Div
     */
    public Div(Expression operande1, Expression operande2){
	       	super(operande1,operande2,false,"/");
       	}
       	
     
	/**
	 * Retourne le code MIPS d'une addition sous forme de chaîne caractère
	 */
    	public String getCodeDecore(){
	        sb.append("#Division\n");
    		sb.append("li $v0,"+opg.getCodeDecore()+"\n");
    		sb.append("sub  $sp, $sp, 4\n"); // sauvegarde sur la pile
    		sb.append("sw   $v0, 0($sp)\n");
    		
    		sb.append("li $a0,"+opd.getCodeDecore()+"\n");
    		sb.append("sub  $sp, $sp, 4\n"); // sauvegarde sur la pile
    		sb.append("sw   $v0, 0($sp)\n");
    		
    		sb.append("lw   $v0, 4($sp)\n"); // a0 <- opg
    		sb.append("lw   $v1, 0($sp)\n"); // a0 <- opd
    		sb.append("add  $sp, $sp, 8\n"); // On d�salloue la m�moire
    		sb.append("div  $v0, $v0, $v1\n");
    		sb.append("sub  $sp, $sp, 4\n"); // Sauvegarde sur la pile
    		sb.append("sw   $v0, 0($sp)\n");
    		
    		return sb.toString();
	}
}
   
