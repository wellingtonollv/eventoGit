package senai;

import java.time.LocalDate;

public class eventoVirtual extends evento {
	
	private String url;

	public eventoVirtual(String nome, LocalDate data, usuario organizador, String url) {
		super(nome, data, organizador);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
