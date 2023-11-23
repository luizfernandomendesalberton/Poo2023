package banco_1;

public class caixa {
public static boolean depositar(Conta c,double vl) {
	return c.deposito(vl);
}
public static boolean sacar (Conta c, double vl) {
	return c.saque(vl);
}
public static boolean tranferir(Conta origem,Conta destino,double vl) {
	return origem.tranferencia(destino, vl);
}
}
