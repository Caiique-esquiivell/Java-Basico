import java.util.Scanner;

public class exercicio2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		numero = sc.nextInt();
		if(numero % 2 == 0) {
			System.out.print("PAR");
		}
		else {
			System.out.print("IMPAR");
		}
		sc.close();
	}
}
