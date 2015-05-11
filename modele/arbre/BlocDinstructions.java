package modele.arbre;

import java.util.ArrayList;

/**
 * BlocDinstructions
 * Classe ayant pour but de contenir une liste instructions que l utilisateur aura rentrees
 * et qui seront traduites.
 * @author Louis Mougin
 * @version Decembre 2014
 */
public class BlocDinstructions extends ArbreAbstrait{

	protected ArrayList<ArbreAbstrait> listeInstructions;
	
	/**
	 * Instanciation du bloc
	 */
	public BlocDinstructions() {
		super();
		listeInstructions = new ArrayList<ArbreAbstrait>();
	}
	
	/**
	 * Fonction pour ajouter une instruction au bloc
	 * @param instruction Un ArbreAbstrait correspondant a une instruction
	 */
	public void ajouter(ArbreAbstrait instruction) {
		listeInstructions.add(instruction);
		System.out.println("ajout : "+instruction.toString());
	}

	public void semantiqueCorrect() throws Exception {
		int i = 0;
		while(i<listeInstructions.size()) {
			listeInstructions.get(i).semantiqueCorrect();
			i++;
		}
	}
	
	/**
	 * Fonction pour recuperer l ensemble des instructions
	 * @return Un String correspondant a l ensemble des instructions traduites
	 */
	public String getCodeDecore() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<listeInstructions.size();i++) {
			sb.append(listeInstructions.get(i).getCodeDecore());
			sb.append("\n");
		}
		sb.append("move $v1,$v0\n");
		sb.append("li $v0 , 1 	# $v0 <- 1 (code du print entier)\n");
		sb.append("move $a0,$v1 	# $a0 <- i (valeur à afficher)\n");
		sb.append("syscall 	# afficher\n");
		return sb.toString();
	}

	/**
	 * Fonction pour afficher le contenu de la liste d instruction
	 */
	public String toString() {
		return listeInstructions.toString();
	}
	
	public BlocDinstructions getBlocDinstructions(){
		return this;
	}
	
	public int size() {
		return listeInstructions.size();
	}
}
