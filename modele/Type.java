package modele;

public class Type {

	protected String type; //boolean ou entier pour l'instant
	
	public Type(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public boolean equals(Object o) {
		return ((Type)o).getType().equals(type);
	}
}
