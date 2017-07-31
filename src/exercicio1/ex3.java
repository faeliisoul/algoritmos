package exercicio1;

import java.util.Scanner;

/**
 * Faça um programa para pagamento de comissão de vendedores de peças,
 * levando-se em consideração que sua comissão será de 5% do total da venda e
 * que você tem os seguintes dados: - Identificação do vendedor - Código da peça
 * - Preço unitário da peça - Quantidade vendida
 * 
 * @author Rafael
 *
 */
public class ex3 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Entre com nome do vendedor: ");
		String vendedor = sc.nextLine();
		System.out.println("Entre com o nome da peça: ");
		String peca = sc.nextLine();
		System.out.println("Entre com o código da peça: ");
		int codpeca = sc.nextInt();
		System.out.println("Entre com o preço da peça: ");
		float prepeca = sc.nextFloat();
		System.out.println("Entre com a quantidade de peças vendidas: ");
		int qtdpeca = sc.nextInt();

		float qtdpecafloat = (float) qtdpeca;

		System.out.println("Vendedor : " + vendedor);
		System.out.println("Código da peça vendida : " + codpeca);
		System.out.println("Nome da peça : " + peca);
		System.out.println("Quantidade vendida: " + qtdpeca);
		System.out.println("Comissão total: R$" + (qtdpecafloat * prepeca) * 0.05);

	}

}
