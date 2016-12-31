package producao;

public class CompraParcelada extends Compra{
	
	private int numeroParcelas;
	private double taxaDeJuros;
	
	public CompraParcelada(double valor, int numeroDeParcelas, double taxaDeJuros) {
		super(valor);
		this.numeroParcelas = numeroDeParcelas;
		this.taxaDeJuros = taxaDeJuros;
	}

	public Object getNumeroDeParcelas() {
		
		return this.numeroParcelas;
	}

	public double getTaxaDeJuros() {
		return this.taxaDeJuros;
	}

	@Override
	public double total() {
		return  super.total() * Math.pow((1 +  this.taxaDeJuros),numeroParcelas);
	}
	
	
}
