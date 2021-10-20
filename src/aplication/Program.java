package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Quantos funcionarios  s�o registrados");
		int N = sc.nextInt();
		 for (int i=0; i<N; i++) {
			 System.out.println("Funcionario #" + (i + 1) + ":");
			 System.out.print("ID: ");
			 Integer id = sc.nextInt();
			 System.out.print("Name: ");
			 sc.nextLine();
			 String name = sc.nextLine();
			 System.out.print("Salary: ");
			 Double salary = sc.nextDouble();
			 
			 Employee emp = new Employee (id, name, salary);
			 list.add(emp);
		 }
		
		
		
		
		
		
		
		sc.close();
	}

}
