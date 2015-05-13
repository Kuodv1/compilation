package modele.arbre;

import modele.Type;
import modele.analyse.exception.ErreurSemantiqueException;

public abstract class Expression extends Instruction {
		
		public boolean isBool;
		public Type type;
		
		public Expression(int ligne, int colonne) {
			super(ligne,colonne);
		}
	
		public String toString() {
			return "blabla";
		}
		
		public abstract void semantiqueCorrect();
		
		public boolean getIsBool() {
			return isBool;
		}
		
		public int nbOperandes() {
			return 1;
		}
		public int nbOperateurs() {
			return 1;
		}
		
		public Type getType() {
			return type;
		}
}
