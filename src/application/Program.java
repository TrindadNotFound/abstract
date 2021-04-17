package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Program 
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of tax payers: ");
		int number = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i<= number; i++)
		{
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i / c)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(type == 'i' || type == 'I')
			{
				System.out.print("Health expenditures: ");
				double healthExpend = sc.nextDouble();
				
				Pessoa person = new Fisica(name, anualIncome, healthExpend);
				list.add(person);
			}
			else if(type == 'c' || type == 'C')
			{
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				
				Pessoa person = new Juridica(name, anualIncome, numberEmployees);
				list.add(person);
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("TAXES PAID");
		
		double total = 0;
		for(Pessoa p : list)
		{
			System.out.println(p.getNome() + ": " + String.format("%.2f",p.impostoPago()) + " €");
			
			 total += p.impostoPago();
		}
		
		System.out.println();
		
		System.out.println("TOTAL TAXES: " + total);
		
		sc.close();
	}
}
