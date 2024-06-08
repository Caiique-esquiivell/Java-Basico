import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if(valor <0 || valor >100) {
			System.out.print("Fora de intervalo");
		}
		else if(valor <= 25) {
			System.out.print("Intervalo (0,25]");
		}
		else if(valor <=50) {
			System.out.print("Intervalo (25,50]");
		}
		else if (valor <= 75) {
			System.out.print("Intervalo (50,75]");
		}
		else {
			System.out.print("Intervalo (75,100]");
		}
		sc.close();
	}

}
