package banco_1;

public class Conta {
   protected double numero;
   protected double agencia;
   protected String nomeCorrentista;
   protected double saldo;
   
   
   
public Conta() {
	this(0,0,"",0);
	
}
public Conta(double numero, double agencia, String nomeCorrentista, double saldo) {
	super();
	this.numero = numero;
	this.agencia = agencia;
	this.nomeCorrentista = nomeCorrentista;
	this.saldo = saldo;
}



@Override
public String toString() {
	return "Conta [numero=" + numero + ", agencia=" + agencia + ", nomeCorrentista=" + nomeCorrentista + ", salso="
			+ saldo + "]";
}
public boolean deposito(double vl ) {
	saldo += vl;
	
	return true;
}
public boolean saque(double vl) {
	if(saldo <= vl) {	
	saldo -= vl;
	return true;
	}
	return false;
	
}
public boolean tranferencia(Conta destino, double vl ) {
	if(saque(vl)) {
		if(destino.deposito(vl)) {
			return true;
			
		}else {
			deposito(vl);
			return false;
		}
	}
	return false;
}



public double getNumero() {
	return numero;
}
public void setNumero(double numero) {
	this.numero = numero;
}
public double getAgencia() {
	return agencia;
}
public void setAgencia(double agencia) {
	this.agencia = agencia;
}
public String getNomeCorrentista() {
	return nomeCorrentista;
}
public void setNomeCorrentista(String nomeCorrentista) {
	this.nomeCorrentista = nomeCorrentista;
}
public double getSalso() {
	return saldo;
}
public void setSalso(double salso) {
	this.saldo = salso;
}
public boolean aramazena1(double vl, String nm, double estq) {
	// TODO Auto-generated method stub
	return false;
}
   
   
   
}

