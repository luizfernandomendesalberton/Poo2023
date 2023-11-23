/*- Medicamentos, podem ser vendidos, desde que tenham em estoque. Se o medicamento
tiver a indicação de retenção
de receita, é necessário informar na venda o nome do médico que prescreveu.*/
package complementar;

import java.util.ArrayList;

public class Medicamento extends Farmacia{
	
     private String retencao;
     private double limite;
	public Medicamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicamento(ArrayList<Cliente> clientes, String nome, double valor, double estoque) {
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
	
	
	@Override
	public String toString() {
		return "Medicamento [retencao=" + retencao + ", limite=" + limite + "]";
	}

	public String getRetencao() {
		return retencao;
	}

	public void setRetencao(String retencao) {
		this.retencao = retencao;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
