//25) Faça um  algoritmo para ler: número da  conta do cliente, saldo, débito e  crédito. Após,  calcular e escrever
// o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero 
// escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. 

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
			
		System.out.print("Digite o número da sua conta: "); //informar conta;
		int conta = sc.nextInt();
		System.out.print("Digite seu saldo R$"); //seu saldo na conta;
		double saldo = sc.nextDouble();
		System.out.print("Digite o valor a descontar de sua conta R$"); //descontar da conta;
		double debito = sc.nextDouble();
		System.out.print("Digite o crédito disponível de sua conta R$"); //quanto você tem R$ na conta;
		double credito = sc.nextDouble();
		
		double saldoAtual = saldo-debito+credito;
		
		if(saldoAtual>=0) {
			System.out.print("\nValor atual R$ " +saldoAtual+" seu saldo é Positivo.");
		}
			else {
				System.out.print("\nValor atual R$ " +saldoAtual+" seu saldo é Negativo.");
			}
		} catch (Exception e) {
			System.out.println("Erro. Insira somente números válidos!!!"+e);
		}
		sc.close();
		}

	}
