package modele;

import java.io.ByteArrayInputStream;
import java.io.File;

import java_cup.parser;

import modele.arbre.ArbreAbstrait;
import modele.arbre.BlocDinstructions;
import modele.arbre.Ecrire;
import modele.analyse.*;

public class Luncher {
	public Luncher(File filename,String nameSortie) {
		InputOutput io = new InputOutput();
		if(io.verifExt(filename)) {
			String code = io.readFile(filename);
			
				AnalyseurSyntaxique analyseur = new AnalyseurSyntaxique(
														new AnalyseurLexical(
																new ByteArrayInputStream(code.getBytes())));

				try {
					analyseur.parse();
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.exit(1);
				}
				
				BlocDinstructions arbre = analyseur.getBlocDinstructions();
				arbre.semantiqueCorrect();
				
				boolean err = false;
				try {
					AnalyseurSemantique.getInstance().analyseErreurSemantique();
				} catch (Exception e) {
					System.out.println(e.getMessage());
					err = true;
				}
				if(!err) {
					System.out.println("COMPILATION OK\n");
					io.writeFile(arbre.getCodeDecore(),nameSortie);
				} /*else {
					System.out.println("COMPILATION ABBANDONNEE\n");
				}*/
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
