package a_classes_objetos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principalimc2 {
public static void main(String[] args) {
	ArrayList<pessoa>pessoas = new ArrayList<pessoa>();
	String menu = "1 - cadastrar\n" + "2 - listar\n" + "3 - sair";
	
	int op = 0;
	
	do {
		op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		if(op == 1) {
			pessoa p = new pessoa ();
			p.cadastra();
			pessoas .add(p);
			
		}
		if(op == 2) {
			String result = "pessoas cadastradas \n\n";
			for(pessoa p : pessoas) {
				result += p.exibirdados();
			}
			JOptionPane.showConfirmDialog(null, result);
		}
		
	}while (op != 3);
 }
}
