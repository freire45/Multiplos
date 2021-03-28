package br.com.erickfreire.multiplos;

import java.util.Scanner;

/**
 * Crie um programa em Java que recebe dois valores e verifica se o primeiro é multiplo do segundo.
 * @author Erick Freire
 * @version 1 - criado em 27-03-2021 as 22:11
 */

public class Multiplos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int resultado;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
		numero2 = entrada.nextInt();
		
		resultado = numero1 % numero2;
		
		if(resultado == 0)
			System.out.println("O número é multiplo");
		
		if(resultado == 1)
			System.out.println("O número não é multiplo");
		
		
	}

}
