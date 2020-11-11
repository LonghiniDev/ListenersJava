package br.unicesumar.forum;

public class Console implements EncomendaListener {

	public void EncomendaSendoPreparada() {
		System.out.println("Encomenda Sendo Preparada");
	}

	public void EncomendaEnviada() {
		System.out.println("Encomenda Enviada");
	}

	public void EncomendaEntregue() {
		System.out.println("Encomenda Entregue");

	}

	public void EncomendaExtraviada() {
		System.out.println("Encomenda Extraviada");
	}

}
