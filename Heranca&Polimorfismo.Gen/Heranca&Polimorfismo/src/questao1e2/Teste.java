package questao1e2;

import java.util.Scanner;

public class Teste{

public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	Cachorro cachorro = new Cachorro();
	Cavalo cavalo = new Cavalo();
	Preguica preguica = new Preguica();
	Animal animal = null; /*por que isso fica null eu ainda nao entendi :( . ESTUDAR! */
	
	
	int a=0;
	
	
	do {
		
	System.out.println("Qual é o  seu animal? \t1 -- Cachorro -- 2 -- Cavalo -- 3 -- Pregiça");
	a = leia.nextInt();
	
	
	if (a==1) {
		animal = cachorro;
		System.out.println("Qual nome do seu cachorro?");
		String nome = leia.next();
		System.out.println("Quantos anos seu cachorro tem?");
		int idade = leia.nextInt();
		System.out.println("Essa é legal! Qual som seu cachorro emite?");
		String som = leia.next();
		System.out.println("--------------------------");
		cachorro.Nome(nome);
		cachorro.Idade(idade);
		cachorro.Som(som);
		cachorro.Corre();
	}
	
	
	else if (a==2) {
		animal = cavalo;
		System.out.println("Qual nome do cavalo?");
		String nome = leia.next();
		System.out.println("Quantos anos este cavalo tem?");
		int idade = leia.nextInt();
		System.out.println("Qual o som que o cavalo emite?");
		String som = leia.next();
		System.out.println("--------------------------");
		cavalo.Nome(nome);
		cavalo.Idade(idade);
		cavalo.Som(som);
		cavalo.Corre();
	}
	
	
	else if (a==3) {
		animal = preguica;
		System.out.println("Qual nome da preguiça?");
		String nome = leia.next();
		System.out.println("Quantos anos esta preguiça tem?");
		int idade = leia.nextInt();
		System.out.println("Qual o som que a preguiça emite?");
		String som = leia.next();
		System.out.println("--------------------------");
		preguica.Nome(nome);
		preguica.Idade(idade);
		preguica.Som(som);
		preguica.Subirarvores();;
	}
	
	
	else{
		System.out.println("Opção inválida.");
	}
	
	}while(a<=0 || a>=4);
	
	
}

}