package modele.arbre;
public class Moins extends OperateurBinaire {
	
	private StringBuilder sb;

    public Moins(Expression operande1, Expression operande2){
	       	super(operande1,operande2);
	       	sb = new StringBuilder();
       	}
       	
     

    	public String getCodeDecore(){
    		sb.append(opg.getCodeDecore()+"\n");
    		sb.append("sw   $v0, 0($sp)\n");
    		sb.append("addi  $sp, $sp, -4\n"); // sauvegarde sur la pile
    		sb.append(opd.getCodeDecore()+"\n"); // recupération dans v0 de opD
    		
	        sb.append("#Soustraction\n");
	        sb.append("lw $t8, 4($sp)\n");	// t8 = première valeur de la pile
	        sb.append("addi $sp, $sp, 4\n"); // dépilement
	        sb.append("sub $v0, $t8, $v0\n"); // v0 = v0 - t8
    		
    		return sb.toString();
	}



		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return null;
		}

    	

}
   