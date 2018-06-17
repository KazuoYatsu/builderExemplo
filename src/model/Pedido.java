package model;

import java.util.HashSet;
import java.util.Set;

public class Pedido{
	private Set<String> dentroDaCaixa;
	private Set<String> foraDaCaixa;
	
	
	
	private Pedido(Builder builder) {
		this.dentroDaCaixa = builder.dentroDaCaixa;
		this.foraDaCaixa = builder.foraDaCaixa;
	}
	
	public static class Builder{
		private Set<String> dentroDaCaixa = new HashSet<>();
		private Set<String> foraDaCaixa = new HashSet<>();
		
		public Builder sanduiche(Sanduiche sanduiche) {
			String item = sanduiche.name();
			item = item.substring(0, 1) + item.substring(1).toLowerCase();
			
			this.dentroDaCaixa.add(item);
			
			return this;
		}
		
		public Builder batata(Batata batata) {
			String item = batata.name();
			item = item.substring(0, 1) + item.substring(1).toLowerCase();
			
			this.dentroDaCaixa.add(item);
			
			return this;
		}
		
		public Builder brinquedo(Brinquedo brinquedo) {
			String item = brinquedo.name();
			item = item.substring(0, 1) + item.substring(1).toLowerCase();
			
			this.dentroDaCaixa.add(item);
			
			return this;
		}
		
		public Builder refrigerante(Refri refri) {
			String item = refri.name();
			item = item.substring(0, 1) + item.substring(1).toLowerCase();
			
			this.foraDaCaixa.add(item);
			
			return this;
		}
		
		public Pedido build() {
			return new Pedido(this);
		}
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Seu pedido:\n");
		buffer.append("Dentro da caixa:\n");
		
		for(String s : this.dentroDaCaixa) {
			buffer.append("\t" + s + "\n");
		}
		
		buffer.append("Fora da caixa:\n");
		
		for(String s : this.foraDaCaixa) {
			buffer.append("\t" + s + "\n");
		}
		
		buffer.append("\nTenha um bom dia!\n\n");
		
		return buffer.toString();
	}
}
