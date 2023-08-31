package biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class livro {
	ArrayList<autor>autores = new ArrayList<autor>();
	
	private double Custolivro;
	private  String Autorlivro;
      
	public void cadastrarlivros() {
		setCustolivro(Double.parseDouble(JOptionPane.showInputDialog("imforme o preco do livro")));
		setAutorlivro(JOptionPane.showInputDialog("titulo do livro"));
		int qt = Integer.parseInt(JOptionPane.showInputDialog("quantidade de autores que deseja cadastrar"));
		
		if(qt < 4) {
		for(int i = 0; i < qt; i ++) {
		      autor a = new autor();
		      a.cadastraautor();
		      autores.add(a);
		}
		}
	}
	public String exibirlivro() {
	return getAutorlivro() + "  "+" R$"+ getCustolivro();
	}
	public String exibirc() {
		return getCustolivro() + " ";
		}

	public ArrayList<autor> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<autor> autores) {
		this.autores = autores;
		
	}
	public void cadastraautor() {
		autor a = new autor();
	     a.cadastraautor();
	     autores.add(a);
	}

	public double getCustolivro() {
		JOptionPane.showInternalMessageDialog(null, "R$");
		return Custolivro;
	}

	public void setCustolivro(double custolivro) {
		Custolivro = custolivro;
	}

	public String getAutorlivro() {
		return Autorlivro;
	}

	public void setAutorlivro(String autorlivro) {
		Autorlivro = autorlivro;
	}
	
	
	
    
	}
	

