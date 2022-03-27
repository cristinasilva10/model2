package model;

import controller.ChamadoController;
import controller.FuncionarioController;
import controller.VeiculoController;
import model.Funcionario;
import model.Veiculo;

public class Principal {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo(1, "ABC123", 2010, "nnnn", "aZUL");
		Funcionario f1 = new Funcionario(1, "nOME", "00000000", "321321321", "dasdsads@rmail.com");
		Chamado chamado = new Chamado(1, "rua rewrew", "8882299", "sao jose", "ewqesc", "324", "1321", "21322");

		f1.setVeiculo(veiculo);

		Veiculo veiculo2 = new Veiculo(2, "ABC143", 2010, "nnnn", "aZUL");

		Funcionario f2 = new Funcionario(2, "nOME 2", "200000000", "2321321321", "dasdsads2@rmail.com");
		f2.setVeiculo(veiculo2);

		FuncionarioController controllerFuncionario = new FuncionarioController();
		VeiculoController controllerVeiculo = new VeiculoController();
		ChamadoController controllerChamado = new ChamadoController();

		try {
			controllerFuncionario.cadastrar(f1);
			
			controllerFuncionario.cadastrar(f2);

			controllerVeiculo.cadastrar(veiculo);
			controllerVeiculo.cadastrar(veiculo2);

			controllerChamado.cadastrar(chamado);
			controllerChamado.cadastrar(chamado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Lista de funcionarios:");
		for (Funcionario f : controllerFuncionario.listar()) {
			System.out.println("Nome: " + f.getNome());
			System.out.println("CPF: " + f.getCpf());
		}
		for (Veiculo f : controllerVeiculo.listar()) {
			System.out.println("Ano: " + f.getAno());
			System.out.println("ID: " + f.getId());
		}

     for (Chamado f : controllerChamado.listar()) {
    	 System.out.println("Cep: " + f.getCep());
    	 System.out.println("cidade: " + f.getEndereco());
     }
	}
}
