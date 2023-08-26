package b_classes_objetos;

import javax.swing.JOptionPane;

public class corro {
	String marca;
	int anofabricacao,anoinicial,anofinal;
	String corrocor;
	
	void cadastra() {
		anofabricacao = Integer.parseInt(JOptionPane.showInputDialog("informe o ano de fabricaçao"));
		 
	}
    
	String listar_ano() {
		anoinicial = Integer.parseInt(JOptionPane.showInputDialog("ano inicial"));
		anofinal = Integer.parseInt(JOptionPane.showInputDialog("ano final"));
		
		return listar_ano();
	}
	String listar_marca() {
		marca = JOptionPane.showInputDialog("informe a marca do veiculo");
		return listar_marca();
	}
	String listar_cor() {
		corrocor = JOptionPane.showInputDialog("informe a cor do veiculo").toUpperCase();
	   return listar_cor();
	}
	String exibirdados() {
		return marca + "-" + listar_ano() + "-" + listar_cor() + "-" + listar_marca(); 
	}
}

