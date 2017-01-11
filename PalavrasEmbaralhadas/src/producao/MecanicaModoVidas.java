package producao;

public class MecanicaModoVidas extends MecanicaDoJogo {
 private int numeroDeVidas = 5;
 
	@Override
	public int getNumeroDeVidasDoJogador() {
		return this.numeroDeVidas;
	}

	@Override
	public boolean isTerminadoJogo() {
		return (numeroDeVidas==0) ? true : false;
	}
	
	@Override
	public double calcularPontuacaoDoJogador() {
			this.pontuacaoDoJogador += 100;
			if(this.getPontuacaoDoJogador() % 1000 == 0)
				numeroDeVidas++;
		
		return pontuacaoDoJogador;
	}

	public boolean isAcertouPalavraEmbaralhada(String palavraRespostaJogador){
		if(super.isAcertouPalavraEmbaralhada(palavraRespostaJogador))
			return true;
		else {numeroDeVidas--;
			return false;
		}
}
	


	
}
