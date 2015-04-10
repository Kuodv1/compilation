package modele.arbre;
public abstract class Expression extends ArbreAbstrait {
		
		protected boolean isBool;
	
		public Expression() {
			
		}
	
		public String toString() {
			return "blabla";
		}
		
		public abstract boolean semantiqueCorrect();
		
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
