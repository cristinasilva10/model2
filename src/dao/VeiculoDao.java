package dao;

import java.util.ArrayList;
import java.util.List;
import model.Veiculo;

public class VeiculoDao {

	private static VeiculoDao instance;
	private List<Veiculo> listaVeiculos = new ArrayList<>();

	public static VeiculoDao getInstance() {
		if (instance == null) {
			instance = new VeiculoDao();
		}
		return instance;
	}

	public void cadastrar(Veiculo veiculo) {
		listaVeiculos.add(veiculo);
	}

	public void editar(Veiculo veiculo) {
		 listaVeiculos.set(veiculo.getId(), veiculo);
	}
	
	public void deletar(int idveiculo) {
		 listaVeiculos.remove(idveiculo);
	}

	public List<Veiculo> listar() {
		return listaVeiculos;
	}

}