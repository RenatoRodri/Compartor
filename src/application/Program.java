package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 3000.0));
		list.add(new Product("Smart Tv", 4000.00));
		list.add(new Product("Telefone", 1500.00));
		
		Comparator <Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort(comp);
		
		
		for(Product p: list) {
			System.out.println(p);
		}
		
		
		
		
		
		
		sc.close();
		
	}

}
