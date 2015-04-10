package modele.arbre.mathematique;

import modele.arbre.Expression;
import modele.arbre.OperateurBinaire;

public class Mult extends OperateurBinaire {
	

    public Mult(Expression operande1, Expression operande2){
	       	super(operande1,operande2);
	       	isBool = false;
       	}
       	
     

    	public String getCodeDecore(){
    		sb.append(opg.getCodeDecore()+"\n");
    		sb.append("sw   $v0, 0($sp)\n");
    		sb.append("addi  $sp, $sp, -4\n"); // sauvegarde sur la pile
    		sb.append(opd.getCodeDecore()+"\n"); // recupération dans v0 de opD
    		
	        sb.append("#Multiplication\n");
	        sb.append("lw $t8,4($sp)\n"); // t8 = première valeur de la pile
	        sb.append("addi $sp, $sp, 4\n"); // dépilement
	        sb.append("mult $v0, $t8\n"); //v0 = v0*t8
	        sb.append("mflo $v0\n");
    		
    		return sb.toString();
	}
}
   