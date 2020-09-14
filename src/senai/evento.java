package senai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class evento implements Agendamento {
	
	private String nome;
	private LocalDate data;	
	private usuario organizador; 
	private List<usuario> participantes;
	
	/**
	 * Construtor padrão
	 * @param nome nome do evento
	 * @param data data do evento 
	 * @param organizador organizador do evento 
	 */
	
	public evento(String nome, LocalDate data, usuario organizador) {
		super();
		this.nome = nome;
		this.data = data;
		this.organizador = organizador;
		this.participantes = new ArrayList<usuario>(); 
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
		this.participantes.add(participante);
		
	}

	@Override
	public String toString() {
		return "evento [nome=" + nome + ", data=" + data + ", organizador=" + organizador + "]";
	}
	
	
	
	
	

}
