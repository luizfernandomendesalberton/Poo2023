package condominio_p;

import javax.swing.JOptionPane;

public class Dispesa {
   private String nomefatura;
   private double custo;
   
   public void cadastradispesa() {
	   setNomefatura(JOptionPane.showInputDialog("nome da fatura (conta agua luz ou telefone"));
	   setCusto(Double.parseDouble(JOptionPane.showInputDialog("custo")));
   }

public String getNomefatura() {
	return nomefatura;
}

public void setNomefatura(String nomefatura) {
	this.nomefatura = nomefatura;
}

public double getCusto() {
	return custo;
}

public void setCusto(double custo) {
	this.custo = custo;
}
   
}
