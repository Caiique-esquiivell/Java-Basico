package Exercicio3;

import java.util.Scanner;

public class Program {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		System.out.println();
		int quantpar = 0;
		System.out.println("\nNUMEROS PARES:");
		for(int i=0;i<n;i++) {
			if(vect[i]%2==0) {
				System.out.printf("%d", vect[i]);
				quantpar++;
			}
		}
		System.out.println("\nQUANTIDADE DE PARES = " + quantpar);
		
		sc.close();
	}

}
