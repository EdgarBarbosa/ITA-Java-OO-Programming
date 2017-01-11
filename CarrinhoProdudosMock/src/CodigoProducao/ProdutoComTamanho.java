package CodigoProducao;

public class ProdutoComTamanho extends Produto {
	private int tamanho;
	public ProdutoComTamanho(String nome, String codigo, double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
			}
	
	@Override
	public int hashCode() {
		final int prime = 13;
		int result=super.hashCode();
		result = prime * result + tamanho;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (tamanho != other.tamanho | this.getCodigo() != other.getCodigo())
			return false;
		return true;
	}

}
