package medicamento_pessoas_principal;

import javax.swing.JOptionPane;

public class Medicamento {
     private String nomemedicamento;
     private String nomeadiministracao;
     private String contraindicacao;
     private String indicacao;
     
     public void cadastramedicamento() {
    	 setNomeadiministracao(JOptionPane.showInputDialog("medico atendido"));
    	 setNomemedicamento(JOptionPane.showInputDialog(" nome do medicamento "));
    	 setContraindicacao(JOptionPane.showInputDialog("remedio que nao pode ser usado para o paciemte"));
    	 setIndicacao(JOptionPane.showInputDialog("remedios que posam ser ussado"));
     }
     public String exibirmedicamentos() {
    	return  getNomeadiministracao() + "-" + getNomemedicamento() + "-" + getContraindicacao() + "-" + 
     getIndicacao() + "\n";
     }
     
	public String getNomemedicamento() {
		return nomemedicamento;
	}
	public void setNomemedicamento(String nomemedicamento) {
		this.nomemedicamento = nomemedicamento;
	}
	public String getNomeadiministracao() {
		return nomeadiministracao;
	}
	public void setNomeadiministracao(String nomeadiministracao) {
		this.nomeadiministracao = nomeadiministracao;
	}
	public String getContraindicacao() {
		return contraindicacao;
	}
	public void setContraindicacao(String contraindicacao) {
		this.contraindicacao = contraindicacao;
	}
	public String getIndicacao() {
		return indicacao;
	}
	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}
     
     
     
     
}
