package modele.arbre.logique;

import modele.arbre.Expression;

public class Not extends Expression {

	protected StringBuilder sb;
	protected Expression e;
	
	public Not(Expression e) {
		sb = new StringBuilder();
		this.e = e;
	}
	
	@Override
	public String getCodeDecore() {
		sb.append(e.getCodeDecore()+"\n");
		
		sb.append("sw   $v0, 0($sp)\n");
		sb.append("addi  $sp, $sp, -4\n"); // sauvegarde sur la pile
		sb.append("li $v0, 1 #v0 = 1\n");
        sb.append("#Not\n");
        sb.append("lw $t8, 4($sp)\n");	// t8 = première valeur de la pile
        sb.append("addi $sp, $sp, 4\n"); // dépilement
        sb.append("beq $v0, $t8, isEgal #si v0 == t8, soit $t8 = 1, on doit le passer à 0\n");
        sb.append("li $v0, 1 #v0 = 1, soit vrai \n");
        sb.append("j suiteNot #jump à la suite\n");
        sb.append("isEgal: #v0 == t8, t8 = 1\n");
        sb.append("li $v0, 0#v0 = 0, soit v0 = Faux\n");
        sb.append("suiteNot: #v0 est soit vrai, soit faux\n");
		return sb.toString();
	}

}
