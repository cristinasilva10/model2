package model;

public class Funcionario {
	
	private int id;
	private String nome;
	private String cpf;
	private String rg;
	private String email;

	public Funcionario() {	
	}

	public Funcionario(int id, String nome, String cpf, String rg, String email) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
		
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setVeiculo(Veiculo veiculo) {
		// TODO Auto-generated method stub
		
	}

	public char[] getCidade() {
		// TODO Auto-generated method stub
		return null;
	}
}
	