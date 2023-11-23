package banco_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class contaTest {
	
	@BeforeEach
	void executarAntes() {
		origem = new Conta();
		origem.setSaldo(100);
		origem.setNumero(123);
		origem.setAgencia(456);
		origem.setCliente("cliente 1");
	}
	destino = new Conta(100, 100,"a",100);
	
	

	@Test
	void depositoTest() {
		assertEquals(300, origem.getSaldo());
	}
	@test
	void saquePossivelTest

}
