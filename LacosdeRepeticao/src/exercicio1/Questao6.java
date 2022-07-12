package exercicio1;

import java.util.Scanner;

public class Questao6{

	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		int num, soma=0, contador=0;
		do
		{
			System.out.println("\ninsira um numero: ");
				num = leia.nextInt();
			if(num%3==0 && num!=0)
				{
				soma = soma+num;
				contador++;
				}
		}while(num!=0);
			System.out.println("\nA media dos multiplos de 3: "+soma/contador);
	}
}