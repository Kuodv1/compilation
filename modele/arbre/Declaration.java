package modele.arbre;

import modele.Entree;
import modele.Symbole;
import modele.TDS;
import modele.analyse.exception.DoubleDeclarationException;

public class Declaration extends Instruction{

	protected boolean doubleDecl;
	protected Entree e;
	
	public Declaration(String nomVar, boolean estPrivee, String type, int ligne, int colonne) {
		super(ligne, colonne);
		this.e = new Entree(nomVar,ligne,colonne);
		Symbole s = new Symbole(type,estPrivee);
		
		if(TDS.getInstance().contains(e)) {
			doubleDecl = true;
			
		} else {
			TDS.getInstance().ajouter(e, s);
			doubleDecl = false;
		}
	}
	
	public void semantiqueCorrect() throws DoubleDeclarationException {
		throw new DoubleDeclarationException(e.toString(),ligne,colonne);
	}

}
