package br.unicesumar.forum;

public class App {

	public static void main(String[] args) {

		Encomenda encomenda = new Encomenda("Longhini","Pedro", "Guitarra");
		encomenda.addListener(new Console());
		encomenda.SendoPreparada();
		encomenda.Enviada();
		encomenda.Entregue();
		
	}

}
