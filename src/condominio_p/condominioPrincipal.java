package condominio_p;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class condominioPrincipal {
	static private ArrayList<Apartamento>apartamentos = new ArrayList<Apartamento>();
	public static void main(String[] args) {
		
		int op = 0;
		
		do {
			op = menu();
			switch (op) {
			case 1:
			
				break;
				
			case 2:
				String resultado = "\n";
				for(Apartamento A : apartamentos) {
					resultado += A.exibirapartamento();	
				}
				JOptionPane.showMessageDialog(null, resultado);
				break;
			
			case 3:
				
				break;
			}
		}while(op == 10);
		
		
	}
	public static int menu() {
		String menu = "1 - calculo do apartamento\n"
				+ ""
				+ ""
				+ ""
				+ "10 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
}
