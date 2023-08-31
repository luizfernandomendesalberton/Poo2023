package biblioteca;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class frontend {
	public static void main(String[] args) {
		
		ArrayList<livro>livros = new ArrayList<livro>();
		String menu = "1 - cadastrar por livros " 
		+"2 - cadastra livro"
	+ "3-puxar por valoris minimo e maximo"
				+"4-listar por filho de autores "
	+ "5-listar por sexo"
				+"6- sair";
		
		int op = 0;
		do {
			Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			
			if(op == 1) {
				livro l = new livro ();
				l.cadastrarlivros();
				livros.add(l);
			}
			if(op == 1) {
				livro l = new livro ();
				l.cadastraautor();
				livros.add(l);
			}
			if(op == 3) {
				String resultado = "valores";
				double max = Double.parseDouble(JOptionPane.showInputDialog("valor maximo"));
				double min = Double.parseDouble(JOptionPane.showInputDialog("valor minimo"));
				
				for(livro livro : livros) {
					if(livro.getCustolivro()>= max && livro.getCustolivro() <= min ) {
						resultado += livro.exibirlivro();
					}
					
				}
				JOptionPane.showInternalMessageDialog(null, resultado);
			}
			if(op == 4) {
				String resultado = "filho";
			
			for (livro livro : livros) {
		        for (autor autor : livro.getAutores() ) {
		            if ("SIM".equalsIgnoreCase(autor.getFilho())  &&  autor.getIdadefilho() <= 12) {
		                resultado += livro.exibirlivro();
		            }
		            }
		        }
			     JOptionPane.showInternalMessageDialog(null, resultado);
			}
			
			if(op == 5) {
			String resultado = "por sexo";
			String sexo = JOptionPane.showInputDialog("sexo");
			
			for(livro livro : livros) {
				for(autor autor : livro.getAutores()) {
					if(sexo.equalsIgnoreCase(autor.getSexo())) {
						resultado += livro.exibirlivro();
					}
				}
			}
			}	
			JOptionPane.showInternalMessageDialog(null, resultado);
			
		}while(op!=6);
		}	
		}
	

	
	


