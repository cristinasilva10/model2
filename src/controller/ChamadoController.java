package controller;

import java.util.List;

import dao.ChamadoDao;
import dao.FuncionarioDao;
import dao.VeiculoDao;
import model.Chamado;
import model.Veiculo;

public class ChamadoController {

	public void cadastrar(Chamado chamado) throws Exception {
		if (chamado.getDistancia() == null) {
			throw new Exception();
		}
		ChamadoDao.getInstance().cadastrar(chamado);

	}

	public void editar(Chamado chamado) throws Exception {
		if (chamado.getDistancia() == null || chamado.getDistancia().length() < 3) {
			throw new Exception();
		}
		ChamadoDao.getInstance().editar(chamado);

	}

	public void deletar(int idChamado) throws Exception {
		if (idChamado == 0) {
			throw new Exception();
		}
		ChamadoDao.getInstance().deletar(idChamado);
	}

	public List<Chamado> listar() {
		return ChamadoDao.getInstance().listar();
	}

}
