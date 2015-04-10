package modele.arbre;

/**
 * ArbreAbstrait
 * Classe abstraite, afin de generer le code d execution correspondant au instruction passees par 
 * l utilisateur
 * @author Louis Mougin
 * @version Decembre 2014
 */
public abstract class ArbreAbstrait {

	protected String code;
	
	/**
	 * Instanciation
	 */
	public ArbreAbstrait() {
	}
	
	/**
	 * Met a jour le code contenu par un ArbreAbstrait
	 * @param code Le nouveau code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * Retourne le code contenu par l ArbreAbstrait
	 */
	public String getCode() {
		return code;
	}
	
	public abstract boolean semantiqueCorrect();
	
	
	/**
	 * Fonction pour eviter les erreurs dans l analyseur Syntaxique.java
	 */
	public void ajouter(ArbreAbstrait instruction) {
		
	}
	
	/**
	 * Fonction qui retournera le code correspondant a l instruction instancier
	 */
	public abstract String getCodeDecore();
	
	
	/**
	 * Fonction pour recuperer le code de l ArbreAbstrait
	 */
	public String toString() {
		return "Code recup : "+code+"\n";
	}
}
