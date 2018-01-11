package com.github.fr3d3rico.types;

import java.util.List;

public class Guia {
	
	private Long id;
	private String numeroGuiaCompleto;
	private String dataEmis;
	private List<Item> itemList;
	
	public Guia() {
	}
	
	public Guia(Long id, String numeroGuiaCompleto, String dataEmis) {
		this.id = id;
		this.numeroGuiaCompleto = numeroGuiaCompleto;
		this.dataEmis = dataEmis;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNumeroGuiaCompleto(String numeroGuiaCompleto) {
		this.numeroGuiaCompleto = numeroGuiaCompleto;
	}
	
	public String getNumeroGuiaCompleto() {
		return this.numeroGuiaCompleto;
	}

	public String getDataEmis() {
		return dataEmis;
	}

	public void setDataEmis(String dataEmis) {
		this.dataEmis = dataEmis;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

}
