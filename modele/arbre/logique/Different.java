package modele.arbre.logique;

import modele.analyse.exception.OperandeDiffException;
import modele.arbre.Expression;
import modele.arbre.OperateurBinaire;

public class Different extends OperateurBinaire {
	
	/**
	 * Constucteur Different
	 * @throws OperandeDiffException 
	 */
	public Different(Expression e1, Expression e2) {
		super(e1,e2,true,"!=");
	}

	public boolean semantiqueCorrect() throws OperandeDiffException {
		boolean check = true;
		if(!((opg.getIsBool()==opd.getIsBool())&&opg.semantiqueCorrect()&&opd.semantiqueCorrect())) {
			check = false;
			sb = new StringBuilder();
			StringBuilder err = new StringBuilder();
			String type = "int";
			if(this.isBool) type="bool";
			err.append("Erreur de type : \nFormat attendus\n");
			err.append(type+" "+this.signeToString()+" "+type+"\n");
			String type1 = "int";
			String type2 = "int";
			if(opg.getIsBool()) type1="bool";
			if(opd.getIsBool()) type2="bool";
			
			err.append("Format retrouvé :\n");
			err.append(type1+" "+this.signeToString()+" "+type2+"\n");
			err.append("Dans l'expression suivante :\n");
			err.append(this.toString());
				
			throw new OperandeDiffException(err.toString());
		}
	return check;
	}
	
	@Override
	/**
	 * Retourne le code en MIPS d'une difference sous forme de chaîne de caractère
	 */
	public String getCodeDecore() {
 		sb.append(opg.getCodeDecore()+"\n");
		sb.append("sw   $v0, 0($sp)\n");
		sb.append("addi  $sp, $sp, -4\n"); // sauvegarde sur la pile
		sb.append(opd.getCodeDecore()+"\n"); // recupération dans v0 de opD
		
        sb.append("#Different\n");
        sb.append("lw $t8, 4($sp)\n");	// t8 = première valeur de la pile
        sb.append("addi $sp, $sp, 4\n"); // dépilement
        sb.append("sne $v0, $v0, $t8 # v0 = (v0!=t8)\n");
		return sb.toString();
	}
	
}
