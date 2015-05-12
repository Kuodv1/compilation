package modele.arbre;

public class Instruction extends ArbreAbstrait{

	protected int ligne;
	protected int colonne;
	
	public Instruction(int ligne, int colonne) {
		this.ligne = ligne;
		this.colonne = colonne;
	}
	
	@Override
	public void semantiqueCorrect() throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public String getCodeDecore() {
		return "";
	}
	
	public int getLigne(){
		return ligne;
	}
	
	public int getColonne() {
		return colonne;
	}

}
