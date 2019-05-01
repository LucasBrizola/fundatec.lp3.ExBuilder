import org.junit.Test;

import junit.framework.Assert;

public class ContaTest {

	@Test
	public void deveCriarUmaConta() {

		Conta conta = new Conta.Builder(0100).comNome("Marge").comAgencia("Springfield").comBalanco(100)
				.comTaxaDeManutencao(2.5).build();

		Assert.assertEquals(0100, conta.getNumeroDaConta());
		Assert.assertEquals("Marge", conta.getNome());
		Assert.assertEquals("Springfield", conta.getAgencia());
		Assert.assertEquals(100, conta.getBalanco(), 0);
		Assert.assertEquals(2.5, conta.getTaxaDeManutencao(), 0);
	}
}
