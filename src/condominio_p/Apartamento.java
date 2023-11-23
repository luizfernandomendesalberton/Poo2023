package condominio_p;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Apartamento {
     private int numeroapartamento;
     private double custometro;
     private ArrayList<Apartamento>apartamentos = new ArrayList<Apartamento>(); 
     
     
     public void cadastracondominio() {
    	 setNumeroapartamento(Integer.parseInt(JOptionPane.showInputDialog("numero do apartamento")));
    	 setCustometro(Double.parseDouble(JOptionPane.showInputDialog("imforme a qt metros de terreno")));
    	   String continua = "\n";
    	 do {
 			Apartamento a = new Apartamento();
 			a.cadastracondominio();
 			apartamentos.add(a);
 			continua = JOptionPane.showInputDialog("Incluir mais apartamento? (S ou N)");
 		}while(continua.equalsIgnoreCase("S"));
 		
 	}
     public double calcularvalorapart() {
    	 double calculo = 0;
    	 calculo = (custometro * 5)/30 / numeroapartamento;
    	 
    	 return calculo;
     }
     public String exibirapartamento() {
    	 return " numero dde apartamento = " + getNumeroapartamento() + "\n" + " valor do apartamento = " + calcularvalorapart();
     }

	public int getNumeroapartamento() {
		return numeroapartamento;
	}

	public void setNumeroapartamento(int numeroapartamento) {
		this.numeroapartamento = numeroapartamento;
	}

	public double getCustometro() {
		return custometro;
	}

	public void setCustometro(double custometro) {
		this.custometro = custometro;
	}

	
     
}
