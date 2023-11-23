package bliblioteca_livro_autor;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pincipalb {
	static private ArrayList<Livro>livros = new ArrayList<Livro>();
	static private ArrayList<Autor>autores =new ArrayList<Autor>();
	public static void main(String[] args) {
		int op = 0;
		
		do {
			op = menu();
			switch (op) {
			case 1:
				
				
				break;
				
            case 2:
				
				
				break;	
			}
			
		}while(op == 10);
	}
	public static int menu() {
		String menu = "";
		
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

}
