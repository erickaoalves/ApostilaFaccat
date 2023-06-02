/*13)  Faça  um  algoritmo  que  leia  três  notas  de  um  aluno,  calcule  e  escreva  a  média  final 
 *  deste  aluno. Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o 
 *  cálculo da média final é: 
 *  
 *  media final = n1 * 2  + n2 * 3 + n3 * 5 / 10 
 *  */

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio13 {
	
public static void main (String[] Args) {
	
	  Scanner sc = new Scanner (System.in);
	  
	  try {
		  System.out.println("Digite a primeira nota: ");
		  float n1 = sc.nextFloat();
		  System.out.println("Digite a segunda nota: ");
		  float n2 = sc.nextFloat();
		  System.out.println("Digite a terceira nota: ");
		  float n3 = sc.nextFloat();
		
		  float mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5)/10;
		  
		  if (n1 < 0 || n2 < 0 || n3 < 0 || n1 > 10 || n2 > 10 || n3 > 10) {
			  
			  System.out.println("ERRO! Digite um número que seja positivo entre 0 a 10."); }
			  else
				  
		  System.out.println("A média final do aluno é "+mediaFinal);
		  
	} catch (Exception e) {
		
		System.out.println("ERRO, insira apenas números!"+e);
	}
	  sc.close();
}

}
