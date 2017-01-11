package CodigoProducao;
import static org.junit.Assert.*;

public class MockObservadorCarrinho implements ObservadorCarrinho{
	private String codigoRecebido;
	private double valorRecebido;
	
	@Override
	public void produtoAdicionado(String codigo, double preco) {
		codigoRecebido = codigo;
		valorRecebido = preco;
		
	}

	public void verificaRecebimentoDoProduto(String codigoEsperado, double valorEsperado) {
		assertEquals(codigoEsperado, codigoRecebido);
		assertEquals(valorEsperado, valorRecebido,1.00);
	}

}
