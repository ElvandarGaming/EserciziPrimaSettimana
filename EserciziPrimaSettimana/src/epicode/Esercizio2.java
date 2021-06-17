package epicode;

public class Esercizio2 {

	public static void main(String[] args) {
		double lato1 = 7;
		double lato2 = 3.4;
				

		double perim = calcolaPerimetroRettangolo(lato1, lato2);

		System.out.println(perim);
		System.out.println(isEven(perim));
		
	}
	public static double calcolaPerimetroRettangolo(double h, double l) {
		double perimetro = h * 2 + l * 2;
		return perimetro;
	}

	public static boolean isEven(double x) {
		if (x % 3 == 0) {
			return true;
		}
		return false;
	}

}
