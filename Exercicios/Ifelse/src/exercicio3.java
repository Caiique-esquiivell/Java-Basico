import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		if(numero1 % numero2 == 0 ||numero2 % numero1 == 0){
			System.out.print("São multiplos");
		}
		else {
			System.out.print("Não são Multiplos");
		}
		sc.close();
	}

}
