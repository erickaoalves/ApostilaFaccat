//29)  Ler  3  valores (considere  que  não  serão  informados  valores  iguais) e  escrever  a  soma  dos  2 maiores. 

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
			
		System.out.println("Insira o 1º valor");
		int n1 = sc.nextInt();
		System.out.println("Insira o 2º valor");
		int n2 = sc.nextInt();
		System.out.println("Insira o 3º valor");
		int n3 = sc.nextInt();
		
		if ((n1==n2)||(n2==n3)||(n3==n1)) {
			System.out.println("Valores iguais não são permitidos.");
		} else if ((n1<n2)&&(n1<n3)) {
			System.out.println("O dois maiores valores é "+n2+" e "+n3+" a soma deles é = "+(n2+n3));
		} else if ((n2<n1)&&(n2<n3)) {
			System.out.println("O dois maiores valores é "+n3+" e "+n1+" a soma deles é = "+(n3+n1));
		} else
			System.out.println("O dois maiores valores é "+n1+" e "+n2+" a soma deles é = "+(n1+n2));
		
		} catch (Exception e) {
			System.out.println("Erro. Digite somente números!!!"+e);
		}

		sc.close();
		}
	}
