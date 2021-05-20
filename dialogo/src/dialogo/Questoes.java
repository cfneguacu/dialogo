package dialogo;

import javax.swing.JOptionPane;

public class Questoes {
	
	public static boolean Checagem(int resposta) {
		boolean check = false;
		if (resposta == JOptionPane.YES_OPTION) {
			check = true;
		}else if (resposta == JOptionPane.NO_OPTION) {
			check = false;
		}
		return check;
	}
	
	public static void MembroFamilia(String perguntas[]) {
		int resposta = JOptionPane.showConfirmDialog(null, perguntas[0], perguntas[0] , JOptionPane.YES_NO_OPTION);
		boolean check = Checagem(resposta);
		if (check == true) {
			SeraDrama(perguntas);
		}else{
			ColegaTrabalho(perguntas);
		}
	}
	
	public static void Teste(String perguntas[]) {
		MembroFamilia(perguntas);
	}
	
	
	public static void SeraDrama(String perguntas[]) {
		int resposta = JOptionPane.showConfirmDialog(null, perguntas[3], perguntas[3] , JOptionPane.YES_NO_OPTION);
		boolean check = Checagem(resposta);
		if (check == true) {
			FestaDivertida(perguntas);
		}else {
			ManteveContato(perguntas);
		}
	}
	
	public static void ManteveContato(String[] perguntas) {
		int resposta = JOptionPane.showConfirmDialog(null, perguntas[4], perguntas[4] , JOptionPane.YES_NO_OPTION);
		boolean check = Checagem(resposta);
		if (check == true) {
			ConversamFesta(perguntas);
		}else {
			FestaDivertida(perguntas);
		}
	}
		
	public static void ConversamFesta(String[] perguntas) {
		int resposta = JOptionPane.showConfirmDialog(null, perguntas[5], perguntas[5] , JOptionPane.YES_NO_OPTION);
		boolean check = Checagem(resposta);
		if (check == true) {
			FestaDivertida(perguntas);
		}else {
			FoiConvidado(perguntas);
		}
	}

	public static void FoiConvidado(String[] perguntas) {
		int resposta = JOptionPane.showConfirmDialog(null, perguntas[7], perguntas[7] , JOptionPane.YES_NO_OPTION);
		boolean check = Checagem(resposta);
		if (check == true) {
			FestaDivertida(perguntas);
		}else {
			JOptionPane.showMessageDialog(null, "Não convidar "+Dialogo.pessoa);
		}
	}

	public static void FestaDivertida(String[] perguntas) {
		int resposta = JOptionPane.showConfirmDialog(null, perguntas[6], perguntas[6] , JOptionPane.YES_NO_OPTION);
		boolean check = Checagem(resposta);
		if (check == true) {
			JOptionPane.showMessageDialog(null,"Convidar "+Dialogo.pessoa);
		}else{
			JOptionPane.showMessageDialog(null,"Não convidar "+Dialogo.pessoa);
		}
	}
	
	public static void ColegaTrabalho(String perguntas[]) {
		int resposta = JOptionPane.showConfirmDialog(null, perguntas[1], perguntas[1] , JOptionPane.YES_NO_OPTION);
		boolean check = Checagem(resposta);
		if (check == true) {
			ConviveFora(perguntas);
		}else{
			ManteveContato(perguntas);
		}
	}
	
	public static void ConviveFora(String perguntas[]) {
		int resposta = JOptionPane.showConfirmDialog(null, perguntas[2], perguntas[2] , JOptionPane.YES_NO_OPTION);
		boolean check = Checagem(resposta);
		if (check == true) {
			FoiConvidado(perguntas);
		}else {
			ConversamFesta(perguntas);
		}
	}	
}



