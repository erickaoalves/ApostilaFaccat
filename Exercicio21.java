//21) Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras,
// sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do 
//	jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. 

package apostilaFACCAT;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		try {
			int horaInicio=24, horaFinal=24;
			
			while((horaInicio<0) || (horaInicio>23)) {
			System.out.println("Digite o horário inicial da partida de Xadrez: ");
			horaInicio = sc.nextInt();
			}
			while((horaFinal<0) || (horaFinal>23)) {
			System.out.println("Digite o horário final da partida de Xadrez: ");
			horaFinal = sc.nextInt();
			}
			int quantidadeHorasJogo = horaFinal - horaInicio;
			if (quantidadeHorasJogo<0) {
				quantidadeHorasJogo = quantidadeHorasJogo+24;
				System.out.println("O tempo jogado foi "+quantidadeHorasJogo+" horas.");
			}
			else if (quantidadeHorasJogo==0) {
				System.out.println("Fim do jogo, a duração chegou a 24 horas.");
			} else {
				System.out.println("O tempo jogado foi "+quantidadeHorasJogo+" horas.");
		    }
			
		} catch (Exception e) {
			System.out.println("Erro, insira apenas números !!!"+e);
		}
		sc.close();	
   }
}
