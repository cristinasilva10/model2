package model;

public class Veiculo {
	
	private int id;
	private String placa;
	private int ano;
	private String modelo;
	private String cor;

	public Veiculo () {
		 
	}

	public Veiculo(int id, String placa, int ano, String modelo, String cor) {
		this.id = id;
		this.placa = placa;
		this.ano = ano;
		this.modelo = modelo;
		this.cor = cor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
	