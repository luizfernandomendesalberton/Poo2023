package desafio_empresa;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Fim {
	public static void main(String[] args) {
		ArrayList<Contratar>Contratarei = new ArrayList<Contratar>();
		String menu = "1- cadastrar funcionarios \n" + "2 - listar funcionarios \n" + "4 - sair ";
		
		int op = 0;
		
		do { 
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if(op == 1 ) {
				Contratar c = new Contratar();
				c.cadastra();
				Contratarei.add(c);
			}
			if(op == 2) {
				String resultado = "listar funcionarios : ";
				for(Contratar c : Contratarei) {
					resultado += c.diferensa();
				}
				JOptionPane.showMessageDialog(null, resultado);
			}
			
		}while(op != 4);  
	}

}
