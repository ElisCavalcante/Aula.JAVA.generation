package Exercicio1;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args)
	
	{
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.printf("Insira três  numeros inteiros");
		a = leia.nextInt();
		b = leia.nextInt();
		c= leia.nextInt();

		
		if(a>b && a>c)
		{
			System.out.printf("O maior numero é: "+a);
		}
		
		else if (b>c && b>a) {
			System.out.printf("\nO número maior é: "+b);
		}
		else
		{
			System.out.printf("\nO número maior é: "+c );
		}
	}
	}
