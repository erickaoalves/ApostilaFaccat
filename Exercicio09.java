/* 09) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. 
Calcular e escrever o valor do novo salário. 
*/

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			
			try {
				
				System.out.println("Digite seu salário: ");
				float salarioAtual = ler.nextFloat();
				
				System.out.println("Digite o valor do reajuste: ");
				float reajuste = ler.nextFloat();
				
				float valorDoReajuste = salarioAtual*reajuste/100;
				float salarioNovo = salarioAtual+valorDoReajuste;
				
				System.out.printf("Parabéns seu novo salário é R$ %.2f",salarioNovo);
				
				
			} catch (Exception e) {
				System.out.println("Erro, insira apenas números !!!"+e);
			}
			ler.close();
	}

}
