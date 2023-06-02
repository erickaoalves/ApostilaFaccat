/*16) As  maçãs  custam  R$  1,30  cada  se  forem  compradas  menos  de  uma  dúzia, e  R$  1,00 
 *  se  forem compradas  pelo  menos  12.  Escreva  um  programa que  leia  o  número  de  maçãs 
 *   compradas,  calcule  e escreva o custo total da compra. */

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a quantidade de maçãs compradas: ");
		int macas = sc.nextInt();
		try {
			if (macas<1) {
				System.out.println("Digite um número de maçãs válidos.");}
			else {
				if (macas<12) {
					double resultado = macas*1.3;
					System.out.println("O valor a ser pago é: R$ "+resultado);}
				else {
					System.out.println("O valor a ser pago é: R$ "+macas);
				}
				sc.close();
			}

		} catch (Exception e) {
			System.out.println("Erro, insira apenas números !!!"+e);
		}
			}

}
