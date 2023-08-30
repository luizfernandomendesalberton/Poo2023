package desafio_empresa;
/*Um método chamado "contratar" que recebe como parâmetros o nome e a
idade de um funcionário, e verifica se a idade é maior ou igual à idade
mínima permitida. Se for, o método deve incrementar o contador de total de
funcionários e exibir uma mensagem de sucesso na contratação. Caso
contrário, o método deve exibir uma mensagem informando que o
funcionário não pode ser contratado devido à idade.
Requisitos: Exibir o número total de funcionários atualmente na empresa e
contratar funcionários com nomes e idades diferentes.
Desenvolver testes unitários para verificar se as funcionalidades estão corretas.*/
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Contratar {
	
		
		private int Idade;
	private	ArrayList<Funcionario> Funcionarios = new ArrayList<Funcionario>();
	
	public void cadastra () {
		
		String  continua = "**\n";
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("informe sua idade ")));
		do {
			Funcionario f = new Funcionario();
			f.cadastrar();
			Funcionarios.add(f);
			continua = JOptionPane.showInputDialog("adicionar mais funcionarios? S/N");
			
		}while(continua.equalsIgnoreCase("S"));
	}
	public int diferensa () {
		int Didade = 0;
		
	 if(Idade >= 18 ) {
		 JOptionPane.showInternalMessageDialog(null, " sucesso na contratação: ");
	 }
	 if(Idade < 18) {
		 JOptionPane.showMessageDialog(null, "funcionário não pode ser contratado devido à idade. ");
	 }
	   return Didade;
	}
	
	
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		this.Idade = idade;
	}

	public ArrayList<Funcionario> getFuncionarios() {
		return Funcionarios;
	}

	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		Funcionarios = funcionarios;
	}

}
