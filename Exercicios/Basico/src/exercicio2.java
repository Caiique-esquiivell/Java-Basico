import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio,area ,PI = 3.14159;
		raio = sc.nextDouble();
		area = PI*raio*raio;
		System.out.printf("A=%.4f%n",area);
		sc.close();
	}

}
