package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Entities.Emplyoee;

public class Program {
	public static void main(String[] args) {
		
		List <Emplyoee> list = new ArrayList<>();
		Emplyoee emplyoee =new Emplyoee(null, null, null);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Emplyoee #"+i+": ");
			
			System.out.println("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Emplyoee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Emplyoee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.IncreaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Emplyoee obj : list) {
			System.out.println(obj);
		}
			
		sc.close();
	}
	
	public static boolean hasId(List<Emplyoee> list, int id) {
		Emplyoee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
