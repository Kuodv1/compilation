package modele.arbre;

public class Ecrire extends Instruction{

	protected String chaine;
	
	public Ecrire(String chaine, int ligne, int colonne) {
		super(ligne, colonne);
		this.chaine = chaine;
	}
	
	public String toString() {
		return "Ecrire : "+chaine;
	}
	
	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		sb.append("#ECRIRE chaine\n");
		sb.append(".data\n");
		sb.append("out_string"+3+": .asciiz \""+chaine+"\"\n");
		sb.append(".text\n");
		sb.append("li $v0, 4\n");
		sb.append("la $a0, out_string"+3+"\n");
		sb.append("syscall\n");
		
		
		return sb.toString();
	}

}
