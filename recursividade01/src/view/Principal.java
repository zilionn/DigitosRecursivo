package view;

import javax.swing.JOptionPane;

import controller.DigitosController;

public class Principal {

	public static void main(String[] args) {
		DigitosController digCont = new DigitosController();
		int n = 0;
		do {
			try {
				String input = JOptionPane.showInputDialog("Digite um número: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrado");
					System.exit(0);
				}
				n = Integer.parseInt(input);
				if (n <= 0) {
					JOptionPane.showMessageDialog(null, "Número inválido, insira novamente: ");
					continue;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Número inválido, insira novamente: ");
				continue;
				} break;
			} while(true);
		JOptionPane.showMessageDialog(null, "O total de digítos do número " + n + " é de: " +digCont.ContaDigitos(n));
		}

	}


