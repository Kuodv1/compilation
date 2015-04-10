package modele;

import java.io.ByteArrayInputStream;

import modele.arbre.ArbreAbstrait;
import modele.analyse.*;

public class Luncher {
	public Luncher() {
		
		String code = "!((1>0)^(3!=3))";
		try {
			
			AnalyseurSyntaxique analyseur = new AnalyseurSyntaxique(
													new AnalyseurLexical(
															new ByteArrayInputStream(code.getBytes())));
		
			ArbreAbstrait arbre = (ArbreAbstrait) analyseur.parse().value;

			System.out.println(arbre.getCodeDecore());

		}catch (Exception e) {
			//Erreur d ecriture de code (non reconnus par l analyseurSyntaxique)
			throw new RuntimeException(e.getMessage());
		}			


}
	
    public static void main(String[] args) {
        new Luncher();
    }
}
