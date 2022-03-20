package vo;

import java.util.ArrayList;

public class ProjetoController {
	public Projeto createProjeto(String inicio, String fim, String status, Departamento departamento, ArrayList<Funcionario> funcionarios) {
		Projeto projeto = new Projeto();
		projeto.setInicio(inicio);
		projeto.setFim(fim);
		projeto.setStatus(status);
		projeto.setDepartamento(departamento);
		projeto.setFuncionarios(funcionarios);
		return projeto;
	}
}
