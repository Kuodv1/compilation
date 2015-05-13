package modele.arbre.logique;

import modele.Type;
import modele.analyse.exception.ErreurSemantiqueException;
import modele.analyse.exception.OperandeDiffException;
import modele.arbre.Expression;

public class Not extends Expression {

	protected StringBuilder sb;
	protected Expression e;
	
	/**
	 * Constructeur Not
	 */
	public Not(Expression e,int ligne, int colonne) {
		super(ligne,colonne);
		sb = new StringBuilder();
		this.e = e;
		isBool = true;
		type = new Type("boolean");
	}
	/**
	 * Retourne un boolean qui vérifie la sémantique
	 */
	public void semantiqueCorrect(){
    	e.semantiqueCorrect();
    	if(!e.isBool) {
    		new OperandeDiffException("NOT | ATTENDUS : !bool",ligne,colonne);
    	}
	}
	
	public String toString() {
		return "!"+e.toString();
	}
	
	@Override
	/**
	 * Retourne le code MIPS d'un non logique sous forme de chaîne caractère
	 */
	public String getCodeDecore() {
		sb.append(e.getCodeDecore()+"\n");
		
		sb.append("sw   $v0, 0($sp)\n");
		sb.append("addi  $sp, $sp, -4\n"); // sauvegarde sur la pile
		sb.append("li $v0, 0 #v0 = 1\n");
        sb.append("#Not\n");
        sb.append("lw $t8, 4($sp)\n");	// t8 = première valeur de la pile
        sb.append("addi $sp, $sp, 4\n"); // dépilement
        sb.append("seq $v0, $v0, $t8 # v0 = (v0 == t8)\n");
		return sb.toString();
	}

}
