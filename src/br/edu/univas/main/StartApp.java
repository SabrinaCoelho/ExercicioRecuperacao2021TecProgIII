package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import vo.Departamento;
import vo.DepartamentoController;
import vo.Funcionario;
import vo.FuncionarioController;
import vo.Projeto;
import vo.ProjetoController;

public class StartApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Projeto novoProjeto = novoPJ(in);
		System.out.println(novoProjeto.toString());
		in.close();
	}
	public static Projeto novoPJ(Scanner in) {
		ProjetoController novoProjeto = new ProjetoController();
		System.out.println("---Novo projeto---");
		System.out.println("Início:");
		String inicio = in.nextLine();
		System.out.println("Fim:");
		String fim = in.nextLine();
		System.out.println("Status:");
		String status = in.nextLine();
		System.out.println("Departamento:");
		Departamento departamento = dadosDP(in);
		System.out.println("Funcionários:");
		ArrayList<Funcionario> funcionarios = cadastroFuncionarios(in);
		Projeto projeto  = novoProjeto.createProjeto(inicio, fim, status, departamento, funcionarios);
		return projeto;
	}
	public static ArrayList<Funcionario> cadastroFuncionarios(Scanner in) {
		ArrayList<Funcionario> funcionarios = new ArrayList();
		Funcionario funcionario = null;
		FuncionarioController fc = new FuncionarioController();
		int op = 0;
		while(op != 9){
			System.out.println("Função do funcionário: \n"
					+ "[1] Desenvolvedor \n"
					+ "[2] Designer \n"
					+ "[9] Encerrar cadastro de funcionários envolvidos");
			op = in.nextInt();
			in.nextLine();
			
			if(op == 9) {
				System.out.println("Encerrado o cadastro de funcinários envolvidos no projeto.");
				break;
			}else {
				System.out.println("---Dados funcionario---");
				System.out.println("Nome:");
				String nome = in.nextLine();
				System.out.println("Registro:");
				String registro = in.nextLine();
				System.out.println("Email:");
				String email = in.nextLine();
				System.out.println("Departamento:");
				Departamento dp = dadosDP(in);
				funcionario = fc.createFuncionario(op, nome, registro, email, dp);
			}
			funcionarios.add(funcionario);
		}
		
		return funcionarios;
	}
	public static Departamento dadosDP(Scanner in) {
		DepartamentoController departamento = new DepartamentoController();
		System.out.println("---Departamento---");
		System.out.println("Nome:");
		String nome = in.nextLine();
		System.out.println("Quantidade de funcionários:");
		int qtF = in.nextInt();
		in.nextLine();
		Departamento dp = departamento.createDepartamento(nome, qtF);//CATTO'S JUMP
		return dp;
	}
}
