package br.com.targettrust.snack.domain;

public class Produto {
	private Long codigo;
	private String descricao;
	private Long qtd;
	private Float preco;

	public Produto() {
    }

	public Produto(Long codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Produto(Long codigo, String descricao, Long qtd, Float preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.qtd = qtd;
		this.preco = preco;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Long getQtd() {
		return qtd;
	}

	public void setQtd(Long qtd) {
		this.qtd = qtd;
	}

	@Override
	public String toString() {
		return "Produto{" +
				"codigo=" + codigo +
				", descricao='" + descricao + '\'' +
				", quantidade=" + qtd +
				", preco=" + preco +
				'}';
	}
}
