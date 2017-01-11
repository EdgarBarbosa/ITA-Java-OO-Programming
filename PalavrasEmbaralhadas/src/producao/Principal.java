
package producao;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	private static Scanner scanner;
	public static void main(String[] args) throws IOException {
		String nomeJogador;
		boolean isFimDejogo = false;
		char modoDeJogo;
		FabricaDeMecanicaDoJogo fabricaDeMecanicaDoJogo = new FabricaDeMecanicaDoJogo();
		MecanicaDoJogo mecanicaDoJogo;
		
		scanner = new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("    Saudações! Entre com seu nome    ");
		System.out.println("======================================");

		nomeJogador = scanner.nextLine();

		do{
			System.out.println("====== " + nomeJogador + " escolha o modo de jogo ======");
			System.out.println("0 - Modo vidas");
			System.out.println("1 - Modo limite de tempo");
			System.out.println("2 - Ajuda");
			System.out.println("3 - Sair");
			modoDeJogo = scanner.next().charAt(0);

		}while(modoDeJogo < '0' || modoDeJogo > '3');


		switch(modoDeJogo){
		case '0' : mecanicaDoJogo = fabricaDeMecanicaDoJogo.getMecanicaDoJogo(modoDeJogo);
		while(isFimDejogo==false){


			mecanicaDoJogo.isIniciadoJogo();
			System.out.println("Esta é a palavra embaralhada :");
			System.out.println(mecanicaDoJogo.palabraEmbaralhada);
			System.out.println("Qual é a palavra?");
			scanner = new Scanner(System.in);
			System.out.println((mecanicaDoJogo.isAcertouPalavraEmbaralhada
					(scanner.nextLine()) ? "Acertou!! Pontuação "
					+ mecanicaDoJogo.getPontuacaoDoJogador()
					+ " Pontos " : "Errou!! Você possue " 
					+ mecanicaDoJogo.getNumeroDeVidasDoJogador()
					+ " Vidas" ));		
			System.out.println();
			isFimDejogo = mecanicaDoJogo.isTerminadoJogo();

		}
		System.out.println("Fim de jogo "+ nomeJogador );
		System.out.println("Sua Pontuação final é: "+ mecanicaDoJogo.getPontuacaoDoJogador() );
		break;
		
		
		case '1' : mecanicaDoJogo = fabricaDeMecanicaDoJogo.getMecanicaDoJogo(modoDeJogo);
		while(isFimDejogo==false){


			mecanicaDoJogo.isIniciadoJogo();
			System.out.println("Esta é a palavra embaralhada :");
			System.out.println(mecanicaDoJogo.palabraEmbaralhada);
			System.out.println("Qual é a palavra?");
			scanner = new Scanner(System.in);
			System.out.println((mecanicaDoJogo.isAcertouPalavraEmbaralhada
					(scanner.nextLine()) ? "Acertou!! Pontuação "
					+ mecanicaDoJogo.getPontuacaoDoJogador()
					+ " Pontos " : "Errou!!"));		
			System.out.println();
			isFimDejogo = mecanicaDoJogo.isTerminadoJogo();

		}
		System.out.println("Fim de jogo "+ nomeJogador );
		System.out.println("Sua Pontuação final é: "+ mecanicaDoJogo.getPontuacaoDoJogador() );
		break;
		
		
		
		case '2' :imprimeAjuda();
		break;
		case '3' : 	isFimDejogo = true;
		System.out.println("Jogo Finalizado!!");
		System.exit(0);
		break;

		}

	}
	public static void imprimeAjuda(){
		System.out.println("O objetivo do jogo é adivinhar  palavras que foram embaralhadas.");
		System.out.println("Para cada palavra que o jogador acerta é computada a pontuação do jogador.");
		System.out.println("");
		System.out.println("No modo de jogo vidas o jogador inicia com três vidas.");
		System.out.println("A cada resposta errada o jogador perde uma vida.");
		System.out.println("Para  cada 1000 pontos acumulados o jogador ganha uma vida");
		System.out.println("O jogo segue até que se acabe as vidas");
		System.out.println("");
		System.out.println("No modo de jogo tempo limite o jogador dispõe de dois minutos para responder as palavras.");
		System.out.println("A pontuação e calculada de acordo com a dificuldade do algoritimo de embaralhamento");
		System.out.println("O jogo acaba quando o tempo se esgotar");
	}
	
}


