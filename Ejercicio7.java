package UD06;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String money = JOptionPane.showInputDialog("Indica qué cantidad de euros quieres conversar");
		String eleccion = JOptionPane.showInputDialog("Ahora indica a qué moneda: dólar, libra o yen").toLowerCase().trim();
		
		int cantidad = Integer.parseInt(money);

		eligeMoneda(eleccion, cantidad);
	}

	public static void eligeMoneda(String eleccion, int cantidad) {

		switch (eleccion) {
		case "dolar":
		case "dólar":
			Dolar(cantidad);
			break;
		case "libra":
			Libra(cantidad);
			break;
		case "yen":
			Yen(cantidad);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Debe elegir entre dólar, libra o yen");
			break;
		}

	}

	public static void Dolar(int cantidad) {
		double dolar = cantidad * 1.28611;
		JOptionPane.showMessageDialog(null, "La conversión de la cantidad de euros de " + cantidad + " equivale a: " + dolar + " dólares");
	}

	public static void Libra(int cantidad) {
		double libra = cantidad * 0.86;
		JOptionPane.showMessageDialog(null, "La conversión de la cantidad de euros de " + cantidad + " equivale a " + libra + " libras");
	}

	public static void Yen(int cantidad) {
		double yenes = cantidad * 129.852;
		JOptionPane.showMessageDialog(null, "La conversión de la cantidad de euros de " + cantidad + " equivale a " + yenes + " yenes");
	}

}
