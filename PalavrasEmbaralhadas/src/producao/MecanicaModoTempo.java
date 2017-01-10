package producao;

	public class MecanicaModoTempo extends MecanicaDoJogo {
	private Cronometro cronometro = new Cronometro();
	private boolean isTerminado = false;
	
	
	
	public void setTerminado(boolean isTerminado) {
		this.isTerminado = isTerminado;
	}

	@Override
	public boolean isTerminado() {
		
		return isTerminado;
	}

	
	@Override
	public boolean iniciaJogo(){
		super.iniciaJogo();
		cronometro.iniciaCronometro(this);
		
		return true;
	}
	@Override
	public double calcularFatorDePontuação() {
		double fatorDeCalculoDaPontuação = 0;
		if(this.embaralhadorDePalavras instanceof EmbaralhadorInvertePalavra)
			fatorDeCalculoDaPontuação = 0.10;
			if(this.embaralhadorDePalavras instanceof EmbaralhadorPermutaSilabas)
			fatorDeCalculoDaPontuação = 0.20;
			if(this.embaralhadorDePalavras instanceof EmbaralhadorPermutaLetras)
				fatorDeCalculoDaPontuação = 0.30;
		return fatorDeCalculoDaPontuação;
	}


	@Override
	public int getVidas() {
		
		return 0;
	}
	
	@Override
	public boolean isAcertouPalavraEmbaralhada(String palavraRespostaJogador) {
		boolean acertouPalavra = super.isAcertouPalavraEmbaralhada(palavraRespostaJogador);
		if(acertouPalavra)
			this.pontuacaoDoJogador += 100 * (1 + calcularFatorDePontuação());
			
		return acertouPalavra;
	}

}
