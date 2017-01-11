package producao;

	public class MecanicaModoTempoLimitado extends MecanicaDoJogo {
	private Cronometro cronometroDaPartida = new Cronometro();
	private boolean isTerminadoJogo = false;
	
	public void setIsTerminadoJogo(boolean isTerminado) {
		this.isTerminadoJogo = isTerminado;
	}

	@Override
	public boolean isTerminadoJogo() {
		
		return isTerminadoJogo;
	}

	@Override
	public boolean isIniciadoJogo(){
		super.isIniciadoJogo();
		cronometroDaPartida.iniciaCronometro(this);
		
		return true;
	}
	@Override
	public double calcularPontuacaoDoJogador() {				
			pontuacaoDoJogador += 100 * (1 + embaralhadorDePalavras.getFatorDePontuacao());
		
			return pontuacaoDoJogador;
	}

	@Override
	public int getNumeroDeVidasDoJogador() {
		
		return 0;
	}
	
	

}
