package br.unicesumar.forum;

import java.util.HashSet;
import java.util.Set;

public class Encomenda {
	private final String remetente;
	private final String destinatario;
	private final String produto;

	public Encomenda(final String remetente, final String destinatario, final String produto) {
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.produto = produto;
	}
	private final Set<EncomendaListener> listeners = new HashSet<>();

	public void Entregue() {
		for (final EncomendaListener listener : this.listeners) {
			listener.EncomendaEntregue();
		}
	}

	public void Enviada() {
		for (final EncomendaListener listener : this.listeners) {
			listener.EncomendaEnviada();
		}
	}

	public void Extraviada() {
		for (final EncomendaListener listener : this.listeners) {
			listener.EncomendaExtraviada();
		}
	}

	public void SendoPreparada() {
		for (final EncomendaListener listener : this.listeners) {
			listener.EncomendaSendoPreparada();
		}
	}
	
	public void addListener(Console listener) {
		this.listeners.add(listener);
	}

}
