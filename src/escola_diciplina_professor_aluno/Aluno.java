package escola_diciplina_professor_aluno;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {
	
	private String nomealuno;
	private ArrayList<Diciplina> diciplinaMatriculadas = new ArrayList<Diciplina>();
	private ArrayList<Nota> notas = new ArrayList<Nota>();
	
	public void cadastraaluno() {
		setNomealuno(JOptionPane.showInputDialog("nome do aluno"));
	}
	
	public String exibiraluno() {
		return getNomealuno()+"-"+ getNotas() + getDiciplinaMatriculadas();
	}

	public String getNomealuno() {
		return nomealuno;
	}

	public void setNomealuno(String nomealuno) {
		this.nomealuno = nomealuno;
	}

	public ArrayList<Diciplina> getDiciplinaMatriculadas() {
		return diciplinaMatriculadas;
	}

	public void setDiciplinaMatriculadas(ArrayList<Diciplina> diciplinaMatriculadas) {
		this.diciplinaMatriculadas = diciplinaMatriculadas;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
    
}
