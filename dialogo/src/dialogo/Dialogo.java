package dialogo;

import javax.swing.JOptionPane;

public class Dialogo {
	
	static String pessoa;
	static String pergunta[] = new String[] {"E membro da Familia","� colega de trabalho ou faculdade?","Convive Fora do Trabalho, Faculdade?","Sera um drama se n�o convidar?","Manteve contato durante o ano?","Conversam sobre a festa?","A festa ir� ficar 			mais divertida?","Voc� foi convidado para a festa dela?"};


		public static void main(String[] args) {
			JOptionPane.showMessageDialog(null,"Este programa faz a verifica��o se uma pessoa x pode ser convidada para uma festa ou n�o. Clique em ok para iniciar - BY Claudio Neves. 2018 ","Convido ou N�o Convido",JOptionPane.OK_OPTION);
			pessoa = JOptionPane.showInputDialog(null,"Digite um nome ou deixe em branco se n�o quiser expor a pessoa");
			Questoes.Teste(pergunta);
		}
		
			
		
			
}


