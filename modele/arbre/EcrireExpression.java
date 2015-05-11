package modele.arbre;

public class EcrireExpression extends Ecrire{
	
	public EcrireExpression(Expression e, int ligne, int colonne) {
		super(e.toString(),ligne, colonne);
	}

}
