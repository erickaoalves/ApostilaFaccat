/* 8) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos 
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total 
de eleitores. */

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		try {
			
			System.out.println("Número total de eleitores de um município: ");
			int eleitores = ler.nextInt();
			
			System.out.println("Digite o número de votos brancos: ");
			int votosBrancos = ler.nextInt();
			
			System.out.println("Digite o número de votos nulos: ");
			int votosNulos = ler.nextInt();
			
			System.out.println("Digite o número de votos válidos: ");
			int votosValidos = ler.nextInt();

			double percentualVotosBrancos = votosBrancos*100/eleitores;
			double percentualVotosNulos = votosNulos*100/eleitores;
			double percentualVotosValidos = votosValidos*100/eleitores;
			
			final int porcentagemValorTotal = 100;
			
			System.out.println("Votos brancos "+percentualVotosBrancos+"%");
			System.out.println("Votos nulos "+percentualVotosNulos+"%");
	        System.out.println("Votos válidos "+percentualVotosValidos+"%");
	        System.out.println("A porcentam correspondente a todos os eleitores corresponde a "+porcentagemValorTotal+"%");
			
		} catch (Exception e) {
		    System.out.println("Erro, insira apenas números !!!"+e);
		}
		ler.close();
	}

}
