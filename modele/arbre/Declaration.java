package modele.arbre;

import modele.Entree;
import modele.Symbole;
import modele.TDS;
import modele.analyse.exception.DoubleDeclarationException;

public class Declaration extends Instruction{

	protected boolean doubleDecl;
	protected Entree e;
	
	public Declaration(String nomVar, boolean estPrivee, int ligne, int colonne) {
		super(ligne, colonne);
		this.e = new Entree(nomVar,ligne,colonne);
		String type = "entier";
		Symbole s = new Symbole(type,estPrivee);
		
		if(TDS.getInstance().contains(e)) {
			doubleDecl = true;
			
		} else {
			TDS.getInstance().ajouter(e, s);
			doubleDecl = false;
		}
	}
	
	public String toString() {
		return "Declaration de "+e.toString();
	}
	
	public void semantiqueCorrect() throws DoubleDeclarationException {
		if(doubleDecl) {
			throw new DoubleDeclarationException(e.toString(),ligne,colonne);
		}
	}

}
