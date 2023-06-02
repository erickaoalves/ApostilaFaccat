/*14)  Ler  um  valor  e  escrever  a  mensagem  É  MAIOR  QUE  10!  se  o  valor  lido  for  maio
r 
 *  que  10,  caso contrário escrever NÃO É MAIOR QUE 10! */
package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio14 {
	
 public static void main (String[] args) {
	 
	 Scanner sc = new Scanner (System.in);
	 
	 try {
		 System.out.println("Digite um valor: ");
		 int valor = sc.nextInt();
		 
		 if (valor < 10) {
			 System.out.println("É menor que 10!"); }
			 else if (valor == 10) {
				 System.out.println("É igual a 10!");
			 }
			 else {
				 System.out.println("É maoir que 10!");
			 }
		
	} catch (Exception e) {
		System.out.println("ERRO, insira apenas números!"+e);
	}
	 sc.close();
	 }
 }
