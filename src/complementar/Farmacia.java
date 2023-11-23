

import java.util.ArrayList;

import banco_1.Conta;

public class Farmacia {
	static ArrayList<Cliente>clientes = new ArrayList<Cliente>(null);
	protected String nome;
	protected double valor;
	protected double estoque;
	
	public Farmacia() {
		this(clientes, " ",0,0);
	}
	public Farmacia(ArrayList<Cliente> clientes, String nome, double valor, double estoque) {
		super();
		this.clientes = clientes;
		this.nome = nome;
		this.valor = valor;
		this.estoque = estoque;
	}
	
	
	@Override
	public String toString() {
		return "Farmacia [clientes=" + clientes + ", nome=" + nome + ", valor=" + valor + ", estoque=" + estoque + "]";
	}
	public boolean armazena1(double vl,String nm,double estq ) {
		nome += nm;
		valor += vl;
		estoque += estq;
		
		return true;
	}
	public boolean tirarestoque(double estoq) {
		if(estoque <= estoq) {	
			estoque -= estoq;
			return true;
			}
			return false;
	
	}
	
	public boolean seleciona(Farmacia destino,String nm,double vl,double estq ) {
		if(tirarestoque(vl)) {
			if(destino.armazena1(vl,nm,estq)) {
				return true;
				
			}else {
				armazena1(vl,nm,estq);
				return false;
			}
		}
		return false;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getEstoque() {
		return estoque;
	}
	public void setEstoque(double estoque) {
		this.estoque = estoque;
	}
	
	
	
	
	

}
