package bliblioteca_livro_autor;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Livro {
	private String titulolivro;
	private ArrayList<Autor>autores = new ArrayList<Autor>();
	
	public void cadastralivro() {
	 setTitulolivro(JOptionPane.showInputDialog("titulo do livro"));
	 
	}
	public String exibirlivro() {
		return getTitulolivro()+"-";
	}

	public String getTitulolivro() {
		return titulolivro;
	}

	public void setTitulolivro(String titulolivro) {
		this.titulolivro = titulolivro;
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}

	
  
}
