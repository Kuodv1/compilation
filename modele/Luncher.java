package modele;

import java.io.ByteArrayInputStream;
import java.io.File;

import modele.arbre.ArbreAbstrait;
import modele.analyse.*;

public class Luncher {
	public Luncher(File filename,String nameSortie) {
		InputOutput io = new InputOutput();
		if(io.verifExt(filename)) {
			String code = io.readFile(filename);
			System.out.println(code);
			try {
				
				AnalyseurSyntaxique analyseur = new AnalyseurSyntaxique(
														new AnalyseurLexical(
																new ByteArrayInputStream(code.getBytes())));
			
				ArbreAbstrait arbre = (ArbreAbstrait) analyseur.parse().value;

				if(arbre.semantiqueCorrect()) {
					io.writeFile(arbre.getCodeDecore(),nameSortie);
				}
				
				
	
			}catch (Exception e) {
				//Erreur d ecriture de code (non reconnus par l analyseurSyntaxique)
				throw new RuntimeException(e.getMessage());
			}
		}else{
			System.out.println("Arrêt du programme. Fichier avec mauvaise extension et/ou n'existe pas.\n");
		}


}
	
    public static void main(String[] args) {
    	if(args.length==2) {
    		try{
	    		File test = new File(args[0]);
	    		new Luncher(test, args[1]);
    		} catch (Exception e) {
    			System.out.println(e.toString());
    		}
    	} else {
    		System.out.println("Erreur syntax. Argument attendus : fichier.plic nomSortieFichier\n");
    	}
    }
}
