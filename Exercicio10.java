/* 10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do 
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor 
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, 
calcular e escrever o custo final ao consumidor. */

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		try {
			System.out.println("Digite o valor do carro de fabrica:R$ ");
			double custoDeFabrica = sc.nextDouble();
			
			double distribuidor = custoDeFabrica*0.28;
			double imposto = custoDeFabrica*0.45;
			double custoFinal = distribuidor + imposto + custoDeFabrica;
			
			System.out.println("O valor final do carro é R$ "+custoFinal);
			
		} catch (Exception e) {
			System.out.println("Erro, insira apenas números !!!"+e);
		}
		sc.close();
		
		
		

	}

}
