package calcDev;

import java.util.Scanner;

public class Calculadora {
	public void init() {
		Scanner scan = new Scanner(System.in);
		Boolean continua = true;
		while (continua) {
			System.out.println("Informe o calculo desejado!");
			String txt = scan.nextLine();
			if (txt.equalsIgnoreCase("sair")) {
				continua = false;
				break;
			} else {

				String operacao[] = new String[3];

				operacao = txt.split(" ");
				float valor1 = Float.parseFloat(operacao[0]);
				float valor2 = Float.parseFloat(operacao[2]);

				switch (operacao[1]) {
				case "+":
					System.out.println(txt + " = " + this.adicao(valor1, valor2));
					break;
				case "-":
					System.out.println(txt + " = " + this.subtracao(valor1, valor2));
					break;
				case "*":
					System.out.println(txt + " = " + this.multiplicacao(valor1, valor2));
					break;
				case "/":
					System.out.println(txt + " = " + this.divisao(valor1, valor2));
					break;
				default:
					System.out.println("Operador de férias");
					break;
				}
			}
		}
	}

	public float adicao(float v1, float v2) {
		return v1 + v2;
	}

	public float subtracao(float v1, float v2) {
		return v1 - v2;
	}

	public float multiplicacao(float v1, float v2) {
		return v1 * v2;
	}

	public float divisao(float v1, float v2) {
		return v1 / v2;
	}

}
