package Application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.HourContract;
import Entities.Worker;
import Entities.Enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter departament ´s name: ");
		String departamentName = sc.nextLine();
		System.out.print("Enter Worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel= sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel),baseSalary,new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i = 1;i<n;i++) {
			System.out.println("Enter contract #" + i + "data");
			System.out.print("Date (DD/MM/YYYY)");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hours)");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate,valuePerHour,hours);
			worker.addContract(contract);
			
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income(MM/YYYY)");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name" + worker.getName());
		System.out.println("Department" + worker.getDepartament().getName());
		System.out.println("Income for" + monthAndYear + ":" + String.format("%.2f", monthAndYear, (year,month)));
		sc.close();
	}

}
