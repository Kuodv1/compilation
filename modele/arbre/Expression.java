package modele.arbre;
public abstract class Expression extends Instruction {
		
		public boolean isBool;
	
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
}
