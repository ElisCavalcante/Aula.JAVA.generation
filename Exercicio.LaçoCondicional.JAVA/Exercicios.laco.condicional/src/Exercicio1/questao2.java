package Exercicio1;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
			Scanner leia =  new Scanner (System.in);
			
			int a,b,c;
			
			System.out.println("Digite 3 numeros inteiros");
			a = leia.nextInt();
			b = leia.nextInt();
			c = leia.nextInt();
			
			if(a<=b && b<=c) {
				System.out.println("a ordem é: "+a+b+c);
			}
				else if(a>=b && b>=c) {
					
					System.out.println("a ordem é: "+c+b+a);

				}
			
					else if(a<=c && c<=b) {
					
						System.out.println("a ordem é: "+a+c+b);

				}
			
					else if(b<=c && c<=a) {
						
						System.out.println("a ordem é: "+b+c+a);

					}
			
					else if(c<=a && a<=b) {
						
						System.out.println(" a ordem é: "+c+a+b);

					}
					
					else  {
						
						System.out.println(" a ordem é: "+b+a+c);

					}

				}
			
	}
