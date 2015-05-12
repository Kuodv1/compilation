package modele.arbre;

public class Ecrire extends Instruction{

	protected String chaine;
	protected int jump;
	
	public Ecrire(String chaine, int jump, int ligne, int colonne) {
		super(ligne, colonne);
		this.chaine = chaine;
		this.jump = jump;
	}
	
	public String toString() {
		return "Ecrire : "+chaine;
	}
	
	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		sb.append("#ECRIRE chaine\n");
		sb.append(".data\n");
		sb.append("chaineNum"+jump+": .asciiz "+chaine+"\n");
		sb.append(".text\n");
		sb.append("li $v0, 4\n");
		sb.append("la $a0, chaineNum"+jump+"\n");
		sb.append("syscall\n");
		
		
		return sb.toString();
	}

}
