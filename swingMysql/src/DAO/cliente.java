package DAO;

public class cliente {

	private String id;
	private String notas;

	// Constructor
	public cliente() {
		this.id = "";
		this.notas = "";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public String getNotas() {
		return notas;
	}

}
