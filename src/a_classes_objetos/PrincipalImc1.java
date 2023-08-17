package a_classes_objetos;

import javax.swing.JOptionPane;

public class PrincipalImc1 {
public static void main(String[] args) {
	int n = Integer.parseInt(JOptionPane.showInputDialog("qtd pessoas"));
	
	pessoa pessoas[] = new pessoa [n];
	 String resultado = "";
	
	for(int i = 0; i < n ; i ++) {
		pessoa p = new pessoa ();
		p.cadastra();
		pessoas[i] = p;
		resultado += p.exibirdados();
	}
	JOptionPane.showInputDialog(null, resultado);
	
}
}
