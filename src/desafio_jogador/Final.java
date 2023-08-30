package desafio_jogador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Final {
	public static void main(String[] args) {
		ArrayList<Time>times = new ArrayList<Time>();
		
		String menu = "1 - cadastrar time" + "2 - listar time " + "Artilheiro do campeonato" 
		+"4 - Time com mais gols;\n\n"
				+"5 - sair.";
		int op = 0;
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			if(op == 1) {
				Time t = new Time();
				t.cadastrar();
				times.add(t);		
			}
			if (op == 2) {
				String resultado = "Times cadastrados e seus jogadores:\n\n";
				for(Time t : times) {
					resultado +=t.exibir();
					
				}JOptionPane.showMessageDialog(null, resultado);
			}
			if(op == 3) {
				Jogador art = new Jogador();
                for (Time t: times) {
                    t.artilheiroTime();
                    if (t.artilheiroTime().getGols() > art.getGols()) {
                        art = t.artilheiroTime();
                    }
                }
                JOptionPane.showMessageDialog(null, "Artilheiro do campeonato: "+art.getNome());
			}
			if(op == 4) {
				Time tim = new Time();
                for (Time t: times) {
                    if (t.totalGols() > tim.totalGols()) {
                        tim = t;
                    }
                }
                JOptionPane.showMessageDialog(null, "Time com mais gols: "+tim.getNome());
			}
		}while(op !=5); 
		
	}


	}


