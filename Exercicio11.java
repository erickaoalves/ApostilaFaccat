/*11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, 
 * mais  uma  comissão  também  fixa  para  cada  carro  vendido  e  mais  5% do  valor  das  vendas  
 * por  ele efetuadas. Escrever um algoritmo que leia o número de  carros por  ele vendidos, o valor 
 * total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o 
 * salário final do vendedor. 
 * */
package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		try {
			
			System.out.println("Digite a quantidade de carros vendidos: ");
			double totalCarroVendido = sc.nextInt();
			System.out.println("Digite o valor total de suas vendas: ");
			double totalDeVendas = sc.nextInt();
			System.out.println("Digite seu salário fixo: ");
			double salarioFixo = sc.nextInt();
			System.out.println("Digite o valor por cada carro vendido: ");
			double valorPorCarro = sc.nextInt();
			
			totalCarroVendido = totalCarroVendido*valorPorCarro;
			double comissao = totalDeVendas*0.05;
			double salarioFinal = totalCarroVendido+comissao+salarioFixo;
			
			System.out.println("Seu salário final foi R$ "+salarioFinal);
			
		} catch (Exception e) {
			System.out.println("Erro, insira apenas números !!!"+e);
		}
		sc.close();
		

	}

}
