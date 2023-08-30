package desafio_empresa;

import javax.swing.JOptionPane;

public class Funcionario {
	
	private String Nome;
	private int TotalFuncionario;
	private int IdadeMinima;
	
	public void cadastrar () {
		setNome(JOptionPane.showInputDialog(" Nome"));
		setTotalFuncionario(Integer.parseInt(JOptionPane.showInputDialog("funcionarios")));
		setIdadeMinima(Integer.parseInt(JOptionPane.showInputDialog("idade")));
		
	}
	
	
	public String exibir () {
		return getNome ()+" - " + getTotalFuncionario()+" - " + getIdadeMinima()+ " \n ";
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public int getTotalFuncionario() {
		return TotalFuncionario;
	}

	public void setTotalFuncionario(int totalFuncionario) {
		TotalFuncionario = totalFuncionario;
	}

	public int getIdadeMinima() {
		return IdadeMinima;
	}

	public void setIdadeMinima(int idadeMinima) {
		IdadeMinima = idadeMinima;
	}
	
	

}
