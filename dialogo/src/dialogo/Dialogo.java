package dialogo;

import javax.swing.JOptionPane;

public class Dialogo {
	
	static String pessoa;
	static String pergunta[] = new String[] {"E membro da Familia","É colega de trabalho ou faculdade?","Convive Fora do Trabalho, Faculdade?","Sera um drama se não convidar?","Manteve contato durante o ano?","Conversam sobre a festa?","A festa irá ficar 			mais divertida?","Você foi convidado para a festa dela?"};


		public static void main(String[] args) {
			JOptionPane.showMessageDialog(null,"Este programa faz a verificação se uma pessoa x pode ser convidada para uma festa ou não. Clique em ok para iniciar - BY Claudio Neves. 2018 ","Convido ou Não Convido",JOptionPane.OK_OPTION);
			pessoa = JOptionPane.showInputDialog(null,"Digite um nome ou deixe em branco se não quiser expor a pessoa");
			Questoes.Teste(pergunta);
		}
		
			
		
			
}


