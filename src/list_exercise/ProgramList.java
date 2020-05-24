package list_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List <Employee> list = new ArrayList<>();
		System.out.print("How many employees will be registered? ");
		int emp = sc.nextInt(); sc.nextLine();
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		for (int i=0;i<emp;i++) {
			System.out.println("Employee #"+(i+1)+" :");
			System.out.print("Enter employee ID: ");
			int id = sc.nextInt(); sc.nextLine();
			System.out.print("Enter employee name: ");
			String name = sc.nextLine();
			System.out.print("Enter employee salary: ");
			double salary = sc.nextDouble();sc.hasNextLine();
			list.add(new Employee(id,name,salary));
			System.out.println("---------------------------------------------------------------");
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();sc.nextLine();
		
		Employee employee = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		
		if (employee == null) {
			System.out.println("This id does not exist!");
			System.out.println();
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble(); sc.nextLine();
			employee.increaseSalary(percentage);
		}
		
		System.out.println("List of employees: ");
		System.out.println();
		for (Employee obj:list) {
			System.out.println(obj);
		}
		
		
		
		sc.close();

	}

}
