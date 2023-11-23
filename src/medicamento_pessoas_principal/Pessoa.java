package medicamento_pessoas_principal;

import javax.swing.JOptionPane;

public class Pessoa {
   private String nomepaciente;
   private String nomesintomas;
   
   
   public String cadastrapaciente() {
	   getNomepaciente(JOptionPane.showInputDialog(""))
   }
public String getNomepaciente() {
	return nomepaciente;
}
public void setNomepaciente(String nomepaciente) {
	this.nomepaciente = nomepaciente;
}
public String getNomesintomas() {
	return nomesintomas;
}
public void setNomesintomas(String nomesintomas) {
	this.nomesintomas = nomesintomas;
}
   
}
