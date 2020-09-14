package senai;

import java.time.LocalDate;

public class eventoPresencial extends evento {

	private String localizacao;
	private int CapacidadeMaxima;
	
	public eventoPresencial(String nome, LocalDate data, usuario organizador, String localizacao,
			int capacidadeMaxima) {
		super(nome, data, organizador);
		this.localizacao = localizacao;
		this.CapacidadeMaxima = capacidadeMaxima;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getCapacidadeMaxima() {
		return CapacidadeMaxima;
	}

	public void setCapacidadeMaxima(int capacidadeMaxima) {
		this.CapacidadeMaxima = capacidadeMaxima;
	}
	
	@Override
	public void addParticipante(usuario participante) {
		if(this.getCapacidadeMaxima() <= this.CapacidadeMaxima) {
			super.addParticipante(participante);
		}
	}
	
	
	

}
