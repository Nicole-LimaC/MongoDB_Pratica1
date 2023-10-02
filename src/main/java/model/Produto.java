package model;

public class Produto {
	private int id;
	private String descricao;
	private float preco;
	
	public Produto() {
	}
	
	public Produto (int id, String descricao, float preco) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return "produto{" + ", descricao" + descricao + '\'' + ", preco" + preco + '}';
	}

}
