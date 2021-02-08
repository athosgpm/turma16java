package entidadesEcommerce;

import java.util.HashMap;

import java.util.Map;

public class Carrinho {
	
	private double subTotal;
	private Map<String, ItemCarrinho> mapItemCarrinho = new HashMap<String,ItemCarrinho>();
	
	public Carrinho() {
		
	}
	
	public Map<String, ItemCarrinho> getMapItemCarrinho() {
		return mapItemCarrinho;
	}

	public void setMapItemCarrinho(Map<String, ItemCarrinho> mapItemCarrinho) {
		this.mapItemCarrinho = mapItemCarrinho;
	}

	public double valorSubtotal() {
		double valor=0;
		for(ItemCarrinho item : mapItemCarrinho.values()) {
			valor += item.getTotalItem();
		}
		subTotal = valor;
		return subTotal;
	}
	
	public void addItemCarrinho(ItemCarrinho itemCarrinho) {
		this.mapItemCarrinho.put(itemCarrinho.getProduto().getid(), itemCarrinho);
	}
}
