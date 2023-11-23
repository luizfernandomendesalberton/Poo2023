package bliblioteca_livro_autor;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Autor {
	private String nomeautor;
	private ArrayList<Livro>livros = new ArrayList<Livro>();
	
	public void cadastraautor(ArrayList<Livro> livros) {
		setNomeautor(JOptionPane.showInputDialog("nome autor"));
		
		
	}
	public String exibirautor() {
		return getNomeautor()+"-"+getLivros();
	}

	public String getNomeautor() {
		return nomeautor;
	}

	public void setNomeautor(String nomeautor) {
		this.nomeautor = nomeautor;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	

	
}
