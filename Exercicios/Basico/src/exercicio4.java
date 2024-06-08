import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, horas;
		double valorPorHora,salario;
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorPorHora = sc.nextDouble();
		salario = horas*valorPorHora;
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario );
		sc.close();
	}

}
