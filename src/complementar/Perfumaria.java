package complementar;

import java.awt.Insets;
import java.util.ArrayList;

public class Perfumaria extends Farmacia {
	ArrayList<Cliente>clientes = new ArrayList<Cliente>(getClientes());
	
	private double limite;

	public Perfumaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perfumaria(ArrayList<Cliente> clientes, String nome, double valor, double estoque) {
		super(clientes, nome, valor, estoque);
		// TODO Auto-generated constructor stub
	}
	public boolean estoqueconfere(double estq) {
   	 if(limite + estoque >= estq) {
   		 estoque -= estq;
   		 return true;
   	 }
   	 return false;
    }
	public boolean clientepode (Cliente clientes, double saldocliente) {
		if(clientes.getSaldocliente() > 100) {
			return true;
		}
		return false;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	

}
