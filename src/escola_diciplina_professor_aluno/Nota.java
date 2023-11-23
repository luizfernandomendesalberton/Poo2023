package escola_diciplina_professor_aluno;

import java.util.ArrayList;

public class Nota {
	private static ArrayList<Aluno>alunos = new ArrayList<Aluno>();
	private ArrayList<Diciplina> diciplinaMatriculadas = new ArrayList<Diciplina>();
	private Diciplina disc;
	private double n1;
	private double n2;
	private double n3;
	
	
	public String cadastranotasaluno() {
		return getAlunos()+ " = " + getDiciplinaMatriculadas() + " - " + getN1()+ " - " + getN2()+" - "+ getN3()+"\n";
	}
	public static  boolean temAluno(String nome) {
		for (Aluno aluno: alunos) {
			if(aluno.getNomealuno().contains(nome)) {
				return true;
			}
		}
		return false;
	}
	
	public Diciplina getDisc() {
		return disc;
	}
	public void setDisc(Diciplina disc) {
		this.disc = disc;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		Nota.alunos = alunos;
	}
	public ArrayList<Diciplina> getDiciplinaMatriculadas() {
		return diciplinaMatriculadas;
	}
	public void setDiciplinaMatriculadas(ArrayList<Diciplina> diciplinaMatriculadas) {
		this.diciplinaMatriculadas = diciplinaMatriculadas;
	}
	public static String exibiraluno() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
