package modele.arbre.logique;

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
	}
	/**
	 * Retourne un boolean qui vérifie la sémantique
	 */
	public void semantiqueCorrect() throws OperandeDiffException {
    	e.semantiqueCorrect();
    	if(!e.isBool) {
    		throw new OperandeDiffException("OPERATION : ! | Attendus !bool",ligne,colonne);
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
