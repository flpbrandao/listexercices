package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int id; 
		String name;
		double salary;
		
		System.out.println("How many employees will be registered?");
		int quant = sc.nextInt();
		sc.nextLine();
		List <Employee> list = new ArrayList<>();		// A lista é do tipo Employee então os dados irão ter que bater com os tipos
		
		for (int i=0; i<quant; i++) {
			System.out.println ("Employee #" + (i+1) + ":");
			System.out.println("ID:");
			id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			name = sc.nextLine();
			System.out.println("Salary: ");
			salary = sc.nextDouble();
			
			Employee emp = new Employee(id,name,salary); // Lembrar: O construtor já atribui os valores ao objeto com os parâmetros passados.
			list.add(emp);                               // A função da lista aqui é criar vários objetos do mesmo tipo na memória e que possam ser lidos.
		}
		
		sc.close();
	}

}