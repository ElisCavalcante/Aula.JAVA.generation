package exercicio1;

public class Questao1 {

	public static void main(String[] args) {
		// Informar todos os números de 1000 a 1999 que quando divididos por 11
		//obtemos resto = 5.
		
		 System.out.println("Resultados");
			for(int num=1000;num<=1999;num++) 
			{
				if (num%11==5) 
				{
					System.out.println(num);
				}
			}

	}
}
				
			