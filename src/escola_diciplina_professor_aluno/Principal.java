package escola_diciplina_professor_aluno;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.text.Utilities;

import jdk.jshell.execution.Util;

public class Principal {
	private static ArrayList<Professor> professores = new ArrayList<Professor>();
	private static ArrayList<Diciplina> diciplinas = new ArrayList<Diciplina>();
	private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private static ArrayList<Nota>notas = new ArrayList<Nota>();
	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				professores.add(new Professor());
				break;
			case 2:
				Diciplina d = new Diciplina();
				d.cadastradiciplina(professores);
				diciplinas.add(d);
				break;
			case 3:
				Aluno a = new Aluno();
				a.cadastraaluno();
				alunos.add(a);
				break;
			case 4:
				String ret = "Busca de livros por alunos:\n";
				String Aluno = JOptionPane.showInputDialog("Buscar por autor com o nome:");
				for (Nota nota: notas) {
					if(Nota.temAluno(Aluno)) {
						ret += Nota.exibiraluno();
					}
			}
				JOptionPane.showMessageDialog(null, ret);
			}
		}while(op != 10);
		}
	
	public static int menu() {
		String menu = "1 - Cadastrar Professores\n"
				+ "2 - Cadastrar Disciplinas\n"
				+ "3 - Cadastrar Alunos\n"
				+ "4 - buscar alunos cadastrados"
				+ "10 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
	

	


}
