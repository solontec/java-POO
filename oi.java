package com.projeto;

import java.util.Scanner;



public class ProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int a = scanner.nextInt();
		int b= scanner.nextInt();
		int c= scanner.nextInt();
		
		int maior = max(a,b,c);
		
		showResult(maior);
		
		scanner.close();
	}
	
public static int max(int x, int y, int z) {
	
	int aux; 
	
	if(x > y && x > z) {
		aux = x;
	} else if(y > z) {
		aux = y;
	} else {
		aux = z;
	}
	
	return aux;
	
}

public static void showResult(int value) {
  System.out.println(value);
}

}
