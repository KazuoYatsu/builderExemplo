package application;

import model.Batata;
import model.Brinquedo;
import model.Pedido;
import model.Refri;
import model.Sanduiche;

public class Application {
	public static void main(String[] args) {
		Pedido pedido = new Pedido
				.Builder()
				.sanduiche(Sanduiche.CHEESEBURGUER)
				.build();
		
		System.out.println(pedido.toString());
		
		pedido = new Pedido
				.Builder()
				.sanduiche(Sanduiche.CHEESEBURGUER)
				.sanduiche(Sanduiche.HAMBURGUER)
				.batata(Batata.GRANDE)
				.brinquedo(Brinquedo.CARRINHO)
				.refrigerante(Refri.COCA)
				.build();
		
		System.out.println(pedido.toString());
		
		pedido = new Pedido
				.Builder()
				.refrigerante(Refri.COCA)
				.refrigerante(Refri.GUARANA)
				.refrigerante(Refri.COCA)
				.build();
		
		System.out.println(pedido.toString());
	}
}
