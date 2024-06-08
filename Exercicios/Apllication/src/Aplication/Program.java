package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle X,Y;
		X = new Triangle();
		Y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		X.A = sc.nextDouble();
		X.B = sc.nextDouble();
		X.C = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		Y.A = sc.nextDouble();
		Y.B = sc.nextDouble();
		Y.C = sc.nextDouble();
		
		double p =(X.A + X.B + X.C)/2.0;
		double areaX = Math.sqrt(p*(p-X.A)*(p-X.B)*(p-X.C));
		
		p =(Y.A + Y.B + Y.C)/2.0;
		double areaY = Math.sqrt(p*(p-Y.A)*(p-Y.B)*(p-Y.C));
		
		System.out.printf("Triangle X area : %.4f%n", areaX);
		System.out.printf("Triangle X area : %.4f%n", areaY);
		
		if(areaX > areaY) {
		System.out.println("Larger area X");
		}
		else {
			System.out.println("Larger area Y");
			
		}
		
		sc.close();
	}

}
