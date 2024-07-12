package br.com.targettrust.snack.domain;

import br.com.targettrust.snack.enumerations.EnumStatusFileira;

public class Fileira {
	private int id;
	private Produto produto;
	private EnumStatusFileira status;

	public Fileira(int id, Produto produto, EnumStatusFileira status) {
		this.id = id;
		this.produto = produto;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public EnumStatusFileira getStatus() {
		return status;
	}

	public void setStatus(EnumStatusFileira status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Fileira{" +
				"id=" + id +
				", produto=" + produto +
				", status=" + status +
				'}';
	}
}
