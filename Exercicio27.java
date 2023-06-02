//27) Ler um valor e escrever se é positivo, negativo ou zero.
package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
				
		System.out.println("Digite um valor: ");
	    int valor = sc.nextInt();
	    
	    if(valor>0) {
	    	System.out.println("É positivo");
	    } else if (valor==0){
	    	System.out.println("É zero");
	    } else
	    	System.out.println("É negativo");
	    
			} catch (Exception e) {
		    System.out.println("Erro. Digite somente números !!!"+e); 
		}   	
		sc.close();
	}
}
