import java.util.Scanner; 

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		numero = sc.nextInt();
		if (numero >= 0) {
			System.out.print("NÃO NEGATIVO");
		}
		else {
			System.out.print("NEGATIVO");
		}
		sc.close();
	}

}
