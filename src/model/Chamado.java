package model;

public class Chamado {
	
	private int id;
	private String endereco;
	private String cep;
	private String cidade;
	private String estado;
	private String distancia;
	private String id_funcionario;
	private String id_veiculo;

	public Chamado() {
	}

	public Chamado(int id, String endereco, String cep, String cidade, String estado, String distancia,
			String id_funcionario, String id_veiculo) {
		this.id = id;
		this.endereco = endereco;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.distancia = distancia;
		this.id_funcionario = id_funcionario;
		this.id_veiculo = id_veiculo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDistancia() {
		return distancia;
	}

	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}

	public String getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(String id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(String id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

}
