package modele.arbre.mathematique;

import modele.arbre.Expression;

public class MoinsUnaire extends Expression {

	protected StringBuilder sb;
	protected Expression e;
	
	public MoinsUnaire(Expression e) {
		this.e = e;
		sb = new StringBuilder();
		isBool = false;
	}
	
	public boolean semantiqueCorrect() {
		return (this.isBool == e.getIsBool())&&e.semantiqueCorrect();
	}
	
	@Override
	public String getCodeDecore() {
		sb.append(e.getCodeDecore()+"\n");
		sb.append("#MoinsUnaire\n");
		sb.append("neg $v0, $v0\n");
		return sb.toString();
	}



}
