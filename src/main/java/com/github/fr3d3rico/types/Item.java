package com.github.fr3d3rico.types;

public class Item {
	
	private Long id;
	private String codigoItem;
	private String valorItem;
	
	public Item() {
	}

	public Item(Long id, String codigoItem, String valorItem) {
		this.id = id;
		this.codigoItem = codigoItem;
		this.valorItem = valorItem;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigoItem() {
		return codigoItem;
	}
	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}
	public String getValorItem() {
		return valorItem;
	}
	public void setValorItem(String valorItem) {
		this.valorItem = valorItem;
	}

}
