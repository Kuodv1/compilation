package modele.arbre;
public abstract class Expression extends ArbreAbstrait {
		
		public Expression() {
			
		}
	
		public String toString() {
			return "blabla";
		}
		
		public int nbOperandes() {
			return 1;
		}
		public int nbOperateurs() {
			return 1;
		}
}
