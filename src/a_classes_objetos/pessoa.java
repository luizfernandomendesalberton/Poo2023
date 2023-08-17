package a_classes_objetos;

import javax.swing.JOptionPane;

public class pessoa {
	
	String nome;
	double peso;
	double altura;
	char sexo;
	
	void cadastra() {
		nome = JOptionPane.showInputDialog("informe  o nome");
		peso = Double.parseDouble(JOptionPane.showInputDialog("peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("altura"));
		sexo = JOptionPane.showInputDialog("sexo(M/F)").toUpperCase().charAt(0);
	}
	double calcularImc() {
		return peso/(altura*altura);
	}
	String avaliacao() {
		String avaliacao = "";
		double imc = calcularImc();
		
		 if (sexo == 'M') {
             if (imc < 20.7) {
                 JOptionPane.showMessageDialog(null, "abaixo do peso");
             } else if ((imc >= 20.7) && (imc <= 26.4)) {
                 JOptionPane.showMessageDialog(null, "peso ideal");
             } else if ((imc >= 26.5) && (imc <= 27.8)) {
     
            	 JOptionPane.showMessageDialog(null, "pouco acima do peso");
             } else if ((imc >= 27.9) && (imc <= 31.1)) {
                 JOptionPane.showMessageDialog(null, "acima do peso");
             } else if (imc > 31.2) {
                 JOptionPane.showMessageDialog(null, "obsidade");

             }

         }
         if (sexo == 'F') {
             if (imc < 19.1) {
                 JOptionPane.showMessageDialog(null, "abaixo do peso");
             } else if ((imc >= 19.1) && (imc <= 25.8)) {
                 JOptionPane.showMessageDialog(null, "peso ideal");
             } else if ((imc >= 25.9) && (imc <= 27.3)) {
                 JOptionPane.showMessageDialog(null, "pouco acima do peso");
             } else if ((imc >= 27.4) && (imc <= 32.3)) {
                 JOptionPane.showMessageDialog(null, "acima do peso");
             } else if (imc >= 32.4) {
                 JOptionPane.showMessageDialog(null, "obsidade");
             }

         }
		
		return avaliacao;
	}
	String exibirdados() {
		return nome + "-" + calcularImc() + "-" +  avaliacao() + "\n";
	}

}
