/*24) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele  recebe
uma  comissão  de  3%  sobre  o  total  das  vendas  até  R$  1.500,00  mais  5%  sobre  o  que ultrapassar este 
valor, calcular e escrever o seu salário total.*/

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
	
		double comissao = 0;
		
		System.out.print("Digite o salário fixo do vendedor R$ ");
		double salarioFixo = sc.nextDouble();
		
		System.out.print("Digite o valor das vendas efetuadas pelo vendedor R$ ");
		double valorDasVendas = sc.nextDouble();
		
		if (valorDasVendas<=1500) {
			comissao = valorDasVendas * 0.03;
		}
		else {
			double valorExtra = valorDasVendas - 1500;
			comissao = 1500 * 0.03 + valorExtra * 0.05;
		}
		double salarioTotal = salarioFixo + comissao;
		
		System.out.println("O salário total do vendendor é R$ "+salarioTotal);
		
		} catch (Exception e) {
			System.out.println("Erro. Insira somente números válidos!!!"+e);
		}
		sc.close();
		
	    }
	}

