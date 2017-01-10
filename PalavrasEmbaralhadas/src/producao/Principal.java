package producao;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	private static Scanner scanner;
	public static void main(String[] args) throws IOException {
		String nomeJogador;
		boolean fimDejogo = false;
		int modoDeJogo;
		
		
		
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
			modoDeJogo = scanner.nextInt();

		}while(modoDeJogo < 0 || modoDeJogo > 3);


		switch(modoDeJogo){
		case 0 : mecanicaDoJogo = fabricaDeMecanicaDoJogo.getMecanicaDoJogo(modoDeJogo);
		while(fimDejogo==false){


			mecanicaDoJogo.iniciaJogo();
			System.out.println("Esta é a palavra embaralhada :");
			System.out.println(mecanicaDoJogo.palabraEmbaralhada);
			System.out.println("Qual é a palavra?");
			scanner = new Scanner(System.in);
			System.out.println((mecanicaDoJogo.isAcertouPalavraEmbaralhada
					(scanner.nextLine()) ? "Acertou!! Pontuação "
					+ mecanicaDoJogo.getPontuacao()
					+ " Pontos " : "Errou!! Você possue " 
					+ mecanicaDoJogo.getVidas()
					+ " Vidas" ));		
			System.out.println();
			fimDejogo = mecanicaDoJogo.isTerminado();

		}
		System.out.println("Fim de jogo "+ nomeJogador );
		System.out.println("Sua Pontuação final é: "+ mecanicaDoJogo.getPontuacao() );
		break;
		
		
		case 1 : mecanicaDoJogo = fabricaDeMecanicaDoJogo.getMecanicaDoJogo(modoDeJogo);
		while(fimDejogo==false){


			mecanicaDoJogo.iniciaJogo();
			System.out.println("Esta é a palavra embaralhada :");
			System.out.println(mecanicaDoJogo.palabraEmbaralhada);
			System.out.println("Qual é a palavra?");
			scanner = new Scanner(System.in);
			System.out.println((mecanicaDoJogo.isAcertouPalavraEmbaralhada
					(scanner.nextLine()) ? "Acertou!! Pontuação "
					+ mecanicaDoJogo.getPontuacao()
					+ " Pontos " : "Errou!!"));		
			System.out.println();
			fimDejogo = mecanicaDoJogo.isTerminado();

		}
		System.out.println("Fim de jogo "+ nomeJogador );
		System.out.println("Sua Pontuação final é: "+ mecanicaDoJogo.getPontuacao() );
		break;
		
		
		
		case 2 :imprimeAjuda();
		break;
		case 3 : 	fimDejogo = true;
		System.out.println("Jogo Finalizado!!");
		System.exit(0);
		break;

		}

	}
	public static void imprimeAjuda(){
		System.out.println("O objetivo do jogo é adivinhar  palavras que foram embaralhadas.");
		System.out.println("Para cada palavra que o jogador acerta é computada a pontuação do jogador.");
		System.out.println("");
		System.out.println("No modo de jogo vidas o jogador inicia com cinco vidas e para cada");
		System.out.println("resposta errada o jogador perde uma vida.");
		System.out.println("O jogo segue até que se acabe as vidas");
		System.out.println("");
		System.out.println("No modo de jogo tempo limite o jogador dispõe de cinco minutos");
		System.out.println("para cada 1000 pontos acumuldos o jogador ganha mais três minutos");
		System.out.println("O jogo acaba quando o tempo se esgotar");
	}
}


