package senai;

import java.time.LocalDate;

public class compromisso implements Agendamento{

	private String nome;
	private LocalDate data;
	 
	public compromisso(String nome, LocalDate data) {
		super();
		this.nome = nome;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	
	 

}
