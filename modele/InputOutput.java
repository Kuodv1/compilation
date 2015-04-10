package modele;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputOutput {
	
	public InputOutput() {
		
	}
	
	public boolean verifExt(File filename) {
		boolean ok = false;
		
		String verif = filename.toString();
		verif = verif.substring(verif.lastIndexOf("."));
		ok = verif.equals(".plic");
		return ok;
	}
	
	/**
 * Lecture d'un fichier assembleur 
 * @param filename
 */
public String readFile(File filename) {
	StringBuilder contenu = new StringBuilder();
	String fichier = filename.toString();
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			int i = 1;
			while ((ligne=br.readLine())!=null){
				System.out.println("Ligne "+i+" : "+ligne);
				contenu.append(ligne+"\n");
				i++;
			}
			br.close();
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
	
	return contenu.toString();
 
}

/**
 * Création d'un fichier assembleur 
 * @param s
 */
public void writeFile(String s,String nameSortie)
{
  try {
	BufferedWriter writer = new BufferedWriter(new FileWriter(new File(nameSortie+".asm")));
		
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

}
