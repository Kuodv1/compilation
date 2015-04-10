package modele.arbre;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

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
	 * Création d'un fichier assembleur 
	 * @param s
	 */
	public void writeFile(String s)
	{
	  try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("fichierAssembleur.asm")));
			
		writer.write(".text \n"
				+ " main:\n"
				+ "move $s7,$sp \n"
	                        + s
			        + "end :\n"
				+ "li $v0, 10\n"
				+ "syscall ");
			 
		writer.close();
	     }
	   catch (IOException e)
	    {
		e.printStackTrace();
	    }
	}
	
		/**
	 * Lecture d'un fichier assembleur 
	 * @param filename
	 */
	public String readFile(File filename) {
	    try {
	       
	        FileReader reader = new FileReader(filename);
	        try {
	           
	            StringBuffer buffer = new StringBuffer();
	            char[] tmp = new char[2048];
	            int len;
	            while ( (len = reader.read(tmp)) > 0 ) {
	                buffer.append(tmp, 0, len);
	            }
	            return buffer.toString();
	        } finally {
	            reader.close();
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	        return null;
	    }
	 
	}
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
