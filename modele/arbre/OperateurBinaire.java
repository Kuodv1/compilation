package modele.arbre;
public abstract class OperateurBinaire extends Expression{
    
    protected Expression opg;
    protected Expression opd;

    public OperateurBinaire(Expression opg,Expression opd){
	this.opg = opg;
	this.opd = opd;
    }

    public abstract String toString();

    public int nbOperateurs(){
	return opg.nbOperateurs()+opd.nbOperateurs()+1;
    }

    public int nbOperandes(){
	return opg.nbOperandes()+opd.nbOperandes();
    }
}