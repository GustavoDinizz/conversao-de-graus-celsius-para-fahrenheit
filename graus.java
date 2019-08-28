package nega;

import javax.swing.JOptionPane;

public class graus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em graus Celsius: "));
		double F = ((C*9+160)/5);
		
		JOptionPane.showMessageDialog(null,"O valor de graus em Fahrenheit é: " + F);
		
	}

}
