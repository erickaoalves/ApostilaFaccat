//22) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de  40  
//horas  receberá  hora  extra,  cujo  cálculo  é  o  valor  da  hora  regular  com  um  acréscimo  de  50%. 
//Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário 
//total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o
//mês possua 4 semanas exatas).

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
			int horasTrabalhadas = sc.nextInt();

			System.out.println("Digite o valor recebido por cada hora trabalhada: ");
			float valorHora = sc.nextFloat();

			if (horasTrabalhadas < 161) {
				float salarioFinal = horasTrabalhadas * valorHora;
				System.out.printf("O valor a ser recebido é R$ %.2f", salarioFinal);
			} else {
				float salarioFinal = (160 * valorHora) + (valorHora + valorHora + 50 / 100);
				System.out.printf("O valor a ser recebido é R$ %.2f", salarioFinal);
			}
			
		} catch (Exception e) {
			System.out.println("Erro, insira apenas números !!!"+e);

		}
		sc.close();
	}
}
