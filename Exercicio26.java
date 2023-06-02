//26)Faça  um  algoritmo  para  ler:  quantidade  atual  em  estoque,  quantidade  máxima  em  estoque  e quantidade 
// mínima  em  estoque  de  um  produto.  Calcular  e  escrever  a  quantidade  média  ((quantidade média = quantidade 
// máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a  quantidade  média  escrever  a  mensagem
// 'Não  efetuar  compra',  senão  escrever  a  mensagem  'Efetuar compra'. 

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
			
		System.out.println("Digite o número atual no estoque: ");
		int atual = sc.nextInt();
		System.out.println("Digite a quantidade máxima para o estoque: ");
		int maxima = sc.nextInt();
		System.out.println("Digite a quantidade mínima para o estoque: ");
		int minima = sc.nextInt();
		
		int media = (maxima + minima)/2;
		
		if (atual>=media) {
			System.out.println("Não efetuar compra.");
		}
			else {
				System.out.println("Efetuar compra.");
			}
		
		} catch (Exception e) {
			System.out.println("Erro. Digite apenas números!"+e); //Utilizando um "try, catch" podemos amarrar o programa;
		}
		sc.close();
	}
}
