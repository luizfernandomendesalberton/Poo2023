/*Produtos hospitalares podem ser vendidos mesmo que não tenha em estoque, 
pois as compras são feitas por
encomenda.*/
package complementar;

import java.util.ArrayList;

public class EquipamentosMédicos extends Farmacia {
	private double limite;

	public EquipamentosMédicos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EquipamentosMédicos(ArrayList<Cliente> clientes, String nome, double valor, double estoque) {
		super(clientes, nome, valor, estoque);
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public String toString() {
		return "EquipamentosMédicos [limite=" + limite + "]";
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}
