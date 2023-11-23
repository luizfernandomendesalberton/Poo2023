package complementar;

import java.util.ArrayList;

public class Cliente {
	ArrayList<Perfumaria>perfumarias = new ArrayList<Perfumaria>();
	private String nomecliente;
	private double  saldocliente;
	
	
	public Cliente(String nomecliente, double saldocliente) {
		super();
		this.nomecliente = nomecliente;
		this.saldocliente = saldocliente;
	}
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNomecliente() {
		return nomecliente;
	}
	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}
	public double getSaldocliente() {
		return saldocliente;
	}
	public void setSaldocliente(double saldocliente) {
		if(saldocliente > 100) {
		this.saldocliente = saldocliente;
	}}

	
	
}
