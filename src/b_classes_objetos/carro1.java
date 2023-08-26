package b_classes_objetos;

import javax.swing.JOptionPane;

public class carro1 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("informe a quatidade de carros"));
		
		corro corros[] = new corro [n];
		String resultado = "";
		
		for(int i = 0 ; i < n ; i ++) {
			corro c = new corro();
			c.cadastra();
			corros [i]= c;
		    resultado += c.exibirdados();
		}
	      JOptionPane.showInputDialog( null,resultado);
	}
	

}
