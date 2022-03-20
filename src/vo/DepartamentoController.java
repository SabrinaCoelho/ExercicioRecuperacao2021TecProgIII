package vo;

public class DepartamentoController {
	public Departamento createDepartamento(String nome, int qtF) {
		Departamento departamento = new Departamento();
		departamento.setNome(nome);
		departamento.setQuantidadeFuncionarios(qtF);
		return departamento;
	}
	
}
