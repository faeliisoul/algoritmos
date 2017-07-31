package exercicio1;

import java.util.Scanner;

/**
 * 
 * @author Rafael 2) Faça um programa que: - Leia a cotação do dólar - Leia um
 *         valor em dólares - Converta esse valor para Real - Mostre o resultado
 * 
 */
public class ex2 {

	private static Scanner sc;

	public static void main(String[] args) {
		float dolar;
		float real;
		sc = new Scanner(System.in);
		System.out.println("Entre com o valor em dólares!");
		dolar = sc.nextFloat();
		System.out.println("Entre com a cotação do Real!: ");
		real = sc.nextFloat();
		System.out.println("O valor em Reais é : R$ " + dolar * real);

	}

}
