package banco_1;

public class ContaUnivercitaria extends Conta {
 
 
 

public ContaUnivercitaria() {
	super();

}

public ContaUnivercitaria(double numero, double agencia, String nomeCorrentista, double saldo) {
	super(numero, agencia, nomeCorrentista, saldo);

}
public boolean deposito(double vl) {
	if(saldo + vl < 2000 ) {
		return super.deposito(vl);
	}
	return false;
}

 
}
