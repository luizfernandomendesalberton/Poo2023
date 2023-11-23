package banco_1;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaEspecial(double numero, double agencia, String nomeCorrentista, double saldo) {
		super(numero, agencia, nomeCorrentista, saldo);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean saque(double vl) {
		if(limite + saldo >= vl) {
			saldo -= vl;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + "]";
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
     
	

	
}
