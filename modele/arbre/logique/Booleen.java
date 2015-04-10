package modele.arbre.logique;

import modele.arbre.Expression;

public class Booleen extends Expression {

	protected int bool;
	
	public Booleen(String val) {
		if(val.equals("faux")) bool = 0;
		else bool = 1;
		isBool = true;
	}
	
	public boolean semantiqueCorrect() {
		return true;
	}
	
	@Override
	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		sb.append("# Booleen "+bool+"\n");
		sb.append("li $v0, "+bool+"\n");
		return sb.toString();
	}

}
