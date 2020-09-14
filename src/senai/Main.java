 package senai;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		System.out.println( "--Sistema de eventos--");
		usuario usuario1 = new usuario("João");
		usuario usuario2 = new usuario("Maria");
		 
		System.out.println("--Evento1--");
		evento evento1= new eventoPresencial("Java for dummies", LocalDate.of(2020, 9, 14),usuario1,"Senai/SC",20);
		evento1.addParticipante(usuario2);
		evento1.setData("14/09/2020");
		System.out.println(evento1);
		
		System.out.println("--Evento2--");
		eventoVirtual evento2= new eventoVirtual("PostgreSQL for dummies", LocalDate.of(2020, 9, 14), usuario2,"https:\\evento.org");
		evento2.addParticipante(usuario2);
		System.out.println(evento2);
		
		System.out.println("--Compromisso--");
		compromisso compromisso= new compromisso("Reunião de planejamento", LocalDate.of(2020, 9, 14));
		System.out.println(compromisso);
		
		Agendamento[] agendamentos = new Agendamento[3];
		agendamentos[0]=evento1;
		agendamentos[1]=evento2;
		agendamentos[2]=compromisso;
		
		for (Agendamento agendamento : agendamentos) {
			System.out.println(agendamento);
			
		}
		
		 
		System.out.println("--FIM--");

	}

}
