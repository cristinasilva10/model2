package dao;

import java.util.ArrayList;
import java.util.List;

import model.Chamado;


public class ChamadoDao {
	
	private static ChamadoDao instance;
	private List<Chamado> listaChamados = new ArrayList<>();

	public static ChamadoDao getInstance() {
		if (instance == null ) {
			instance = new ChamadoDao();
		}
		return instance;
	}

	public void cadastrar(Chamado chamado) {
		listaChamados.add(chamado);
	}

	public void editar(Chamado chamado) {
		  listaChamados.set(chamado.getId(), chamado);
	}


	public void deletar(int idChamado) {
		 listaChamados.remove(idChamado);
	}

	public List<Chamado> listar() {
		return listaChamados;
	}

}
