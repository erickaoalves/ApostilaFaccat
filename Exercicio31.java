//31) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.
// OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados. 
package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {
				
		System.out.println("Digite o valor do lado A:");
        double A = sc.nextDouble(); 

        System.out.println("Digite o valor do lado B:");
        double B = sc.nextDouble();

        System.out.println("Digite o valor do lado C:");
        double C = sc.nextDouble();

        //Se lado A for menor que lado B soma lado C;
        //Se lado B for menor que lado A soma lado C;
        //Se lado C for menor que lado A soma lado B;
        if ((A<B+C)&&(B<A+C)&&(C<A+B)) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
      
		} catch (Exception e) {
			System.out.println("Erro. Digite somente números!!!"+e);
		}
        sc.close();
    }
}
