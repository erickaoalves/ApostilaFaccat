/*12) Escreva  um  algoritmo  para  ler  uma  temperatura  em  graus  Fahrenheit,  calcular
 *   e  escrever  o  valor correspondente em graus Celsius.
 *   C / 5 = ( F - 32 ) / 9 
 *   
 * */
package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.println("Insira o valor em graus Fahrenheit: ");
			double totalFahrenheit = sc.nextDouble();
			
			double celsius = ((totalFahrenheit-32)/9)*5;
			
			System.out.println("O valor correspondente em graus Celsius é "+celsius);
			
		} catch (Exception e) {
			System.out.println("Erro, insira apenas números !!!"+e);
		}
		sc.close();
	}

}

