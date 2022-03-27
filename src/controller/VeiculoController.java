package controller;

import java.util.List;

import dao.FuncionarioDao;
import dao.VeiculoDao;
import model.Veiculo;

public class VeiculoController {

	public void cadastrar(Veiculo veiculo) throws Exception {
		if (veiculo.getPlaca() == null || veiculo.getPlaca().length() < 3) {
			throw new Exception();
		}
		VeiculoDao.getInstance().cadastrar(veiculo);
	}

	public void editar(Veiculo veiculo) throws Exception {
		if (veiculo.getPlaca() == null || veiculo.getPlaca().length() < 3) {
			throw new Exception();
		}
		VeiculoDao.getInstance().editar(veiculo);
	}

	public void deletar(int idVeiculo) throws Exception {
		if (idVeiculo == 0) {
			throw new Exception();

		}
		VeiculoDao.getInstance().deletar(idVeiculo);
	}

	public List<Veiculo> listar() {
		return VeiculoDao.getInstance().listar();
	}

}