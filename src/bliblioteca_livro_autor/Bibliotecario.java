package bliblioteca_livro_autor;

import javax.swing.JOptionPane;

public class Bibliotecario {
	private String nomebibliotecario;
	
	public void cadastrabibliotecario() {
	 setNomebibliotecario(JOptionPane.showInputDialog("nome no porta - voz"));
	}
	public String exibirbibliotecario() {
		return getNomebibliotecario()+"-0";
	}

	public String getNomebibliotecario() {
		return nomebibliotecario;
	}

	public void setNomebibliotecario(String nomebibliotecario) {
		this.nomebibliotecario = nomebibliotecario;
	}
    
}
