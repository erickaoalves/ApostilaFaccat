/*19) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.*/
		
package apostilaFACCAT;

	import java.util.Scanner;

		public class Exercicio19 {

			public static void main(String[] args) {
			
				Scanner sc = new Scanner (System.in);
				
				try {
					System.out.println("Digite um valor: ");
					int valor = sc.nextInt();
				
					System.out.println("Digite outro valor: ");
					int valor1 = sc.nextInt();
					
					if (valor>valor1) {
						System.out.println("O maior valor digitado foi: "+valor);
						
					} else {
						System.out.println("O maior valor digitado foi: "+valor1);

					}
					
				} catch (Exception e) {
					System.out.println("Erro, insira apenas números !!!"+e);
				}
				
				sc.close();

	}

}
