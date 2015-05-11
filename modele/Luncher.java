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
			try {
			
				AnalyseurSyntaxique analyseur = new AnalyseurSyntaxique(
														new AnalyseurLexical(
																new ByteArrayInputStream(code.getBytes())));
				
				/*AnalyseurLexical al = new AnalyseurLexical(new ByteArrayInputStream(code.getBytes()));
				parser p = new parser(al);
				p.parse();*/
				try {
					analyseur.parse();
				} catch (Exception e) {
					System.out.println("Erreur niveau parse()");
					e.printStackTrace();
				}
				BlocDinstructions arbre = analyseur.getBlocDinstructions();
				System.out.println(arbre.size());
				System.out.println("couet");
				boolean err = false;
				try {
					arbre.semantiqueCorrect();
				} catch (Exception e) {
					System.out.println("Erreur niveau semantiqueCorrect()");
					e.printStackTrace();
					err = true;
				}
				if(!err) {
					System.out.println(arbre.getCodeDecore());
					//io.writeFile(arbre.getCodeDecore(),nameSortie);
				}
				
				Entree e  = new Entree("varI",1,3);
				Symbole s = new Symbole("int",false);
				TDS tds = TDS.getInstance();
				tds.ajouter(e, s);
				if(tds.contains(e)) {
					System.out.println(tds.identifier(e.toString()).toString());
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
