package modele.arbre;
public abstract class OperateurBinaire extends Expression{
    
    protected Expression opg;
    protected Expression opd;
    protected StringBuilder sb;

    public OperateurBinaire(Expression opg,Expression opd){
	this.opg = opg;
	this.opd = opd;
	sb = new StringBuilder();
    }

    public boolean semantiqueCorrect() {
    	System.out.println("g:"+opg.isBool+" d:"+opg.isBool+" - mil:"+isBool);
    	return (opg.isBool==this.isBool)&&(opd.isBool==this.isBool)&&opg.semantiqueCorrect()&&opd.semantiqueCorrect();
    }
    
    public int nbOperateurs(){
	return opg.nbOperateurs()+opd.nbOperateurs()+1;
    }

    public int nbOperandes(){
	return opg.nbOperandes()+opd.nbOperandes();
    }
}