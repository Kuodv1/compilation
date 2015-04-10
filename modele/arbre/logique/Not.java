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
		sb.append("#Not\n");
		sb.append("neg $v0, $v0\n");
		return sb.toString();
	}

}
