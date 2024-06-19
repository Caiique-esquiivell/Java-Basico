package Exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double[] vectdouble = new double[n];
		char[] vectchar = new char[n];
		
		for(int i=1; i<n;i++) {
			System.out.print("Altura da " + i +"a pessoa:");
			vectdouble[i] = sc.nextDouble();
			System.out.print("Genero da " + i +"a pessoa:");
			vectchar[i] = sc.next().charAt(0);
			}
		
		double maior = Double.MAX_VALUE;
		double menor = Double.MIN_VALUE;
		
		
		for(int i=1; i<vectdouble.length;i++) {
			if(vectdouble[i]<menor) {
				menor = vectdouble[i];
			}
		}
		
		for(int i =1;i<vectdouble.length;i++) {
			if(vectdouble[i]>maior) {
				maior = vectdouble[i];
			}
			
		}
		
		System.out.print("Menor altura" + menor);
		System.out.print("Maior altura" + maior);
		
		sc.close();
	}

}
