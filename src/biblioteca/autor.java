package biblioteca;

import javax.swing.JOptionPane;

public class autor {
	  private String Nome;
	     private String Sexo;
	     private int Idade;
	     private String Filho;
	     private int Idadefilho;
	     
	     
	     public void cadastraautor() {
	    	 setNome(JOptionPane.showInputDialog("nome do  autor "));
	    	 setIdade(Integer.parseInt(JOptionPane.showInputDialog("informe a idade do autor")));
	    	 setSexo(JOptionPane.showInputDialog("informe o  seu jenero digite masculino para homen"+
	    	 "ou digite feminino para mulher"));
	    	 setFilho(JOptionPane.showInputDialog("informe voce tem filho s para sim n para nao"));
	    	 if(getFilho().equalsIgnoreCase("sim")) {
	    		 
	    	 
	    	 setIdadefilho(Integer.parseInt(JOptionPane.showInputDialog("informe a idade do filho")));
	     }
	     }
	     public String exibir() {
	    	
	    	 return getNome() + "-" + getIdade() + "-" + getSexo() + getfilho() + "-" +
	    	 getIdadefilho() + "\n";
	     }
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			this.Nome = nome;
		}
		public String getSexo() {
			return Sexo;
		}
		public void setSexo(String sexo) {
			this.Sexo = sexo;
		}
		public int getIdade() {
			return Idade;
		}
		public void setIdade(int idade) {
			this.Idade = idade;
		}
		public String getFilho() {
			return Filho;
		}
		public void setFilho(String filho) {
			this.Filho = filho;
		}
		public int getIdadefilho() {
			return Idadefilho;
		}
		public void setIdadefilho(int idadefilho) {
			this.Idadefilho = idadefilho;
		}
	     
}
