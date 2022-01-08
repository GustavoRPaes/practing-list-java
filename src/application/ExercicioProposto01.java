package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Fa�a um programa que receba a temperatura m�dia os 6 primeiros meses do ano e armazene-as em uma lista.
Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as temperaturas acima desta m�dia,
e em que m�s elas ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro e etc).
*/

public class ExercicioProposto01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Double> temperaturas = new ArrayList<>();

		double soma = 0.0;
		for (int i = 1; i <= 6; i++) {
			System.out.print("Qual a temperatura do m�s " + i + ": ");
			double temp = sc.nextDouble();
			temperaturas.add(temp);
			soma += temp;
		}

		System.out.println();

		double mediaTemperaturas = soma / temperaturas.size();
		System.out.println("Temperaturas Semestral: " + temperaturas);
		System.out.println("----------");
		System.out.println("M�dia temperaturas Semestral: " + mediaTemperaturas + "oC");
		System.out.println("----------");
		System.out.println("Temperaturas acima da m�dia: ");
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
					System.out.println((index + 1) + " - MAR�O: " + temp + " oC");
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
