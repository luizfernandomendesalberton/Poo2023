package escola_diciplina_professor_aluno;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Diciplina {

	private String nomediciplina;
	private int cargahoraria;
	private Professor professor;
	
	
	public void cadastradiciplina(ArrayList<Professor>professores) {
		setNomediciplina (JOptionPane.showInputDialog("nome diciplina"));
		setCargahoraria  (Integer.parseInt(JOptionPane.showInputDialog("carga horaria do professor")));
		String professormenu = " ";
		int cont = 1;  
		for (Professor p : professores) {
			professormenu += cont + " - " + p.exibirDados()+"\n";
			cont ++;
		}
		int escolhaProf = Integer.parseInt(JOptionPane.showInputDialog(professormenu));
		setProfessor(professores.get(escolhaProf - 1));
	}


	public String getNomediciplina() {
		return nomediciplina;
	}


	public void setNomediciplina(String nomediciplina) {
		this.nomediciplina = nomediciplina;
	}


	public int getCargahoraria() {
		return cargahoraria;
	}


	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}


	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	}

