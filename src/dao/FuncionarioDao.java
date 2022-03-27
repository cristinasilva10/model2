package dao;

import java.util.ArrayList;
import java.util.List;

import model.Funcionario;

public class FuncionarioDao {

	private static FuncionarioDao instance;
	private List<Funcionario> listaFuncionarios = new ArrayList<>();

	public static FuncionarioDao getInstance() {
		if (instance == null) {
			instance = new FuncionarioDao();
		}
		return instance;
	}

	public void cadastrar(Funcionario funcionario) {
		listaFuncionarios.add(funcionario);
	}

	public void editar(Funcionario funcionario) {
           listaFuncionarios.set(funcionario.getId(), funcionario);
	}
	

	public void deletar(int idFuncionario) {
       listaFuncionarios.remove(idFuncionario);
	}

	public List<Funcionario> listar() {
		return listaFuncionarios;
	}
}
