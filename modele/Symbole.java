package modele;

public class Symbole {

	protected Type type;
	protected boolean estPrivate;
	protected int deplacement;
	
	public Symbole(String type, boolean estPrivate) {
		this.type = new Type(type);
		this.estPrivate = estPrivate;
		deplacement = 0;
	}
	
	public void setDeplacement(int deplacement) {
		this.deplacement = deplacement;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public void setPrivate(boolean estPrivate) {
		this.estPrivate = estPrivate;
	}
	
	public Type getType() {
		return type;
	}
	
	public boolean estPrivate() {
		return estPrivate;
	}
	
	public int getDeplacement() {
		return deplacement;
	}
	
	public boolean memeType(Type s) {
		return s.equals(type);
	}
	
	public String toString() {
		return type.getType()+" "+estPrivate+" - depl"+deplacement;
	}
	
}
