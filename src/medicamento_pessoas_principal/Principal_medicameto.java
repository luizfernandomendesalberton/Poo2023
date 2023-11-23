package medicamento_pessoas_principal;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal_medicameto {
	private static ArrayList<Pessoa>pessoas = new ArrayList<Pessoa>();
	private static ArrayList<Medicamento>medicamentos = new ArrayList<Medicamento>();
    public static void main(String[] args) {
    	int op = 0;
		do {
			op = menu();
			switch (op) {
			case 1:
				Pessoa p = new pessoa();
				p.c
				
				break;
			
			}
	
	
}while(op == 10);
}
    public static int menu() {
    	String menu = "1 - Cadastrar Professores\\n\"\r\n"
    			+ "	+ \"2 - Cadastrar Disciplinas\\n\"\r\n"
    			+ "	+ \"3 - Cadastrar Alunos\\n\"\r\n"
    			+ "	+ \"4 - buscar alunos cadastrados\"\r\n"
    			+ "	+ \"10 - Sair";
    	return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
}
