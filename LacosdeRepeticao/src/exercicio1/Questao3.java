package exercicio1;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99. (WHILE)

		
		int maiorC = 0,menorV = 0,idade;
		Scanner leia= new Scanner(System.in);
		
		System.out.println("insira sua idade: ");
		idade = leia.nextInt();
		
		
		while(idade!=-99) {
			
		if (idade<21)
		menorV++;
		
		if(idade>50) 
			maiorC++;
			
			
		System.out.println("\ninsira sua idade: ");
		idade = leia.nextInt();
		
		}
		
		
		
		System.out.print("\nO total de pessoas com menos de 21 é: "+menorV);
		System.out.print("\nO total de pessoas com mais de 50 é: "+maiorC);
	}
	
		
			
		
	
	}

