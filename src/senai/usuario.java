package senai;

public class usuario {
	private String nome;

	public usuario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "usuario [nome=" + nome + "]";
	}
	
	
	
	

}
