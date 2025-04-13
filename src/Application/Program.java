package Application;

import java.util.Random;

import java.util.Scanner;

import entities.Heroi;
import entities.Vilao;

public class Program {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		Random numeroAleatorio = new Random();
		
		Heroi heroi = new Heroi(2,1);
		Vilao vilao = new Vilao(2,1);
		
		
		System.out.println("----------------------------------");
		System.out.println("---Bem vindo a Jornado do héroi---");

		while(heroi.getLife() > 0 && vilao.getLife() > 0) {
		
			System.out.print("Escolha um numero entre 1 e 2: ");
			int escolhaJogador = sc.nextInt();
			System.out.println("Escolha entre 1 e 2: ");
			int aleatorio = numeroAleatorio.nextInt(1,3);
			System.out.println(aleatorio);
			
			if(escolhaJogador > aleatorio) {
				
				System.out.print(" 1 para atacar e 2 para defender: ");
				escolhaJogador = sc.nextInt();
				
				if(escolhaJogador == 1) {
					System.out.println("Ataque bem suscedido!");
					vilao.setLife(vilao.opponentsAttack(vilao.getLife(), heroi.getAttack()));
					heroi.setAttack(heroi.getAttack());
					System.out.println(vilao.toString()); 
					System.out.println(heroi.toString());
					
				}else {
					heroi.setLife(heroi.setLifeUp(heroi.getLife()));
					System.out.println(vilao.toString()); 
					System.out.println(heroi.toString());
				}
			
			}else {
				
				System.out.println("Você errou! ");
				int vilaoAleatorio = numeroAleatorio.nextInt(1,3);
				
				if(vilaoAleatorio == aleatorio) {
			
					System.out.println("Ataque bem suscedido do Vilão!");
					heroi.setLife(heroi.opponentsAttack(heroi.getLife(), vilao.getAttack()));  //devolve a nova vida do heroi após sofre um ataque
					vilao.setAttack(vilao.getAttack()); //Devolve o novo ponto de atributos de ataque do héroi
					System.out.println(vilao.toString()); 
					System.out.println(heroi.toString());

				} else {
					System.out.println("Vilão errou o ataque!");
				}
				
			}
			
			
			if (heroi.getLife() < 0) {
				System.out.println("-----------------------");
				System.out.println("Vilão venceu a partida!");
				System.out.println("-----------------------");
			} else if (vilao.getLife() < 0) {
				System.out.println("-------------------------------------");
				System.out.println("Parabéns!!!! Você venceu a partida!!!");
				System.out.println("-------------------------------------");
			}
			
		}
		
	}

}

