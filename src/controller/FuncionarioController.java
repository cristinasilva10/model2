package controller;

import java.util.List;

import dao.FuncionarioDao;
import model.Funcionario;

public class FuncionarioController {

	public void cadastrar(Funcionario funcionario) throws Exception {
		if (funcionario.getNome() == null || funcionario.getNome().length() < 3) {
			throw new Exception();
		}
		FuncionarioDao.getInstance().cadastrar(funcionario);

	}

	public void editar(Funcionario funcionario) throws Exception {
		if (funcionario.getNome() == null || funcionario.getNome().length() < 3) {
			throw new Exception();
		}
		
		FuncionarioDao.getInstance().editar(funcionario);
	}

	public void deletar(int idFuncionario) throws Exception {
      if (idFuncionario == 0) {
    	  throw new Exception();
      }
      FuncionarioDao.getInstance().deletar(idFuncionario);
	
	}

	public List<Funcionario> listar() {
		return FuncionarioDao.getInstance().listar();
	}
}