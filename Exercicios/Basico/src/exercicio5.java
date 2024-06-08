import java.util.Scanner;
import java.util.Locale;

public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1,numero1,peca2,numero2;
		double valor1,valor2,valorFinal;
		
		peca1 = sc.nextInt();
		numero1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		peca2 = sc.nextInt();
		numero2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		valorFinal = numero1 * valor1 + numero2 * valor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n ",valorFinal);
		
		sc.close();
	}

}
