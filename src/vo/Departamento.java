package vo;

public class Departamento {
	private String nome;
	private int quantidadeFuncionarios;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}
	public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
	/**/
	@Override
	public String toString() {
		return "Departamento [nome:" + nome + "\nquantidadeFuncionarios:" + quantidadeFuncionarios+"]";
	}
	
	
}
