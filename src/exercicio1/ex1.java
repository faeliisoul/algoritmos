package exercicio1;

import java.util.Scanner;

/**
 * Faça um programa para calcular o estoque médio de uma peça, sendo que:
 * ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 * 
 * @author Rafael
 *
 */
public class ex1 {

	private static Scanner x;

	public static void main(String[] args) {
		x = new Scanner(System.in);
		int min = 0;
		int max = 0;
		System.out.println("Entre com o valor MÍNIMO de estoque: ");
		min = x.nextInt();
		System.out.println("Entre com o valor MÁXIMO de estoque: ");
		max = x.nextInt();
		System.out.println("À média de peças no estoque é: " + (min + max) / 2);

	}

}
