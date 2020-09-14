package senai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class evento {
	
	private String nome;
	private LocalDate data;
	private usuario organizador; 
	private usuario[] participantes;
	private int posicaoParticipantes=0;
	
	public evento(String nome, LocalDate data, usuario organizador) {
		super();
		this.nome = nome;
		this.data = data;
		this.organizador = organizador;
		this.participantes = new usuario[10]; 
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
	
	public void setData(String data) {
		String format= "dd/MM/yyyy";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		this.data=LocalDate.parse(data,formatter);
		
	}
	
	
	
	
	
	public usuario getOrganizador() {
		return organizador;
	}

	public void setOrganizador(usuario organizador) {
		this.organizador = organizador;
	} 
	
	public void addParticipante(usuario participante) {
		this.participantes[this.posicaoParticipantes]= participante;
		this.posicaoParticipantes++;
		
	}

	@Override
	public String toString() {
		return "evento [nome=" + nome + ", data=" + data + ", organizador=" + organizador + "]";
	}
	
	
	
	
	

}
