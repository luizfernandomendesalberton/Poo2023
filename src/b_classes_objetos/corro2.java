package b_classes_objetos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class corro2 {
	public static void main(String[] args) {
		ArrayList<corro>corros = new ArrayList<corro>();
		String menu = "1 - ano " + "2 - marca " + "3 - cor " + "4 - sair ";
		
		int op = 0;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if(op == 1) {
				String result = "listar por ano\n\n ";
				for(corro c :corros ) {
					c.cadastra();
					c.listar_ano();
					corros .add(c);
					result += c.exibirdados();
				}
				JOptionPane.showConfirmDialog(null, result);
			}
			if(op == 2) {
				String result = "listar por marca\n\n";
		 
				corro c = new corro ();
				c.listar_marca();
				c.cadastra ();
				corros .add(c);
				result += c.exibirdados();
				JOptionPane.showInputDialog(null, result);
			}
				
			
			if (op == 3) {
				String result  = "listar por cor\n\n";
				for(corro c : corros ) {
				c.cadastra ();
				c.listar_cor();
				corros .add(c);
				result += c.exibirdados();
			
			}
				JOptionPane.showInputDialog(null, result);
			}
		}while (op != 4);
	}

}
