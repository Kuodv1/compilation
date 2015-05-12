package modele.arbre;

import modele.analyse.exception.OperandeDiffException;

public class EcrireExpression extends Instruction{
	
	protected Expression e;
	
	public EcrireExpression(Expression e, int ligne, int colonne) {
		super(ligne, colonne);
		this.e = e;
	}

	
	public void semantiqueCorrect() throws OperandeDiffException {
		e.semantiqueCorrect();
	}
	
	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		sb.append("#Recuperation valeur expression\n");
		sb.append(e.getCodeDecore());
		sb.append("\n#ECRIRE chaineExpression\n");
		sb.append("sw $v0, 0($sp)\n");
		sb.append("lw $a0, 0($sp)\n");
		sb.append("li $v0, 1\n");
		sb.append("syscall\n");
		return sb.toString();
	}
	
	public String toString() {
		return "Ecrire : "+e.toString();
	}
}
