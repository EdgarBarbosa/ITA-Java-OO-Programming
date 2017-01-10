package producao;

public class MecanicaModoVidas extends MecanicaDoJogo {
 private int numeroDeVidas = 5;
 
 
 

	@Override
	public int getVidas() {
		return this.numeroDeVidas;
	}

	
	@Override
	public boolean isAcertouPalavraEmbaralhada(String palavraRespostaJogador) {
		boolean acertouPalavra = super.isAcertouPalavraEmbaralhada(palavraRespostaJogador);
		if(acertouPalavra){
			this.pontuacaoDoJogador += 100;
			if(this.getPontuacao() % 1000 == 0)
				numeroDeVidas++;
		}
			else numeroDeVidas--;
		return acertouPalavra;
	}

	@Override
	public boolean isTerminado() {
		return (numeroDeVidas==0) ? true : false;
	}
	
	@Override
	public double calcularFatorDePontuação() {
		// TODO Auto-generated method stub
		return 0;
	}


	


	
}
