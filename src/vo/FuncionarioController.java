package vo;

public class FuncionarioController {
	public Funcionario createFuncionario(int op, String registro, String nome, String email, Departamento departamento) {
		Funcionario funcionario = null;
		if(op == 1) {
			System.out.println("developer");
			funcionario = new Desenvolvedor();
			funcionario.setRegistro(registro);
			funcionario.setNome(nome);
			funcionario.setEmail(email);
			funcionario.setDepartamento(departamento);
		}else {
			System.out.println("designer");
			funcionario = new Designer();
			funcionario.setRegistro(registro);
			funcionario.setNome(nome);
			funcionario.setEmail(email);
			funcionario.setDepartamento(departamento);
		}
		
		return funcionario;
	}
}
