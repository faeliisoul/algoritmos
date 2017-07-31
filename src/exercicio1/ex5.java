package exercicio1;

import java.util.Scanner;

/**
 * Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem,
 * utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o
 * usuário deve fornecer o tempo gasto na viagem e a velocidade média. Desta
 * forma, será possível obter a distância percorrida com a fórmula DISTANCIA =
 * TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade
 * de litros de combustível utilizada na viagem com a fórmula: LITROS_USADOS =
 * DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
 * tempo gasto, a distância percorrida e a quantidade de litros utilizada na
 * viagem. Dica: trabalhe com valores reais.
 * 
 * @author Rafael
 *
 */
public class ex5 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Entre com o tempo gasto na viagem(Em horas):sdasda/h");
		int tempo = sc.nextInt();
		System.out.println("Entre com a velocidade méida feita na viagem:");
		int velocidade = sc.nextInt();
		int distancia = (tempo * velocidade);
		int litros_usados = distancia / 12;
		System.out.println("A velocidade média foi: " + velocidade);
		System.out.println("O tempo gasto foi : " + tempo);
		System.out.println("A distância percorrida em KM foi: " + distancia);
		System.out.println("A quantidade de litros utilizados foi: " + litros_usados);

	}

}
