package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExercicioProposto01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Double> temperaturas = new ArrayList<>();

		double soma = 0.0;
		for (int i = 1; i <= 6; i++) {
			System.out.print("Qual a temperatura do mês " + i + ": ");
			double temp = sc.nextDouble();
			temperaturas.add(temp);
			soma += temp;
		}

		System.out.println();

		double mediaTemperaturas = soma / temperaturas.size();
		System.out.println("Temperaturas Semestral: " + temperaturas);
		System.out.println("----------");
		System.out.println("Média temperaturas Semestral: " + mediaTemperaturas + "oC");
		System.out.println("----------");
		System.out.println("Temperaturas acima da média: ");
		for (Double temp : temperaturas) {
			if (temp > mediaTemperaturas) {
				int index = temperaturas.indexOf(temp);
				switch (index) {
				case 0:
					System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
					break;
				case 1:
					System.out.println((index + 1) + " - FEVEREIRO: " + temp + " oC");
					break;
				case 2:
					System.out.println((index + 1) + " - MARÇO: " + temp + " oC");
					break;
				case 3:
					System.out.println((index + 1) + " - ABRIL: " + temp + " oC");
					break;
				case 4:
					System.out.println((index + 1) + " - MAIO: " + temp + " oC");
					break;
				case 5:
					System.out.println((index + 1) + " - JUNHO: " + temp + " oC");
					break;
				default:
					break;
				}
			}
		}
		sc.close();
	}
	

}
