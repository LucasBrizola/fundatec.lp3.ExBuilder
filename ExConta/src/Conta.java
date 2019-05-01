public class Conta {
	
	private int numeroDaConta;
	private String nome;
	private String agencia;
	private double balanco;
	private double taxaDeManutencao;

	public static class Builder {
		private int numeroDaConta;
		private String nome;
		private String agencia;
		private double balanco;
		private double taxaDeManutencao;

	public Builder(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

		public Builder comNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder comAgencia(String agencia) {
			this.agencia = agencia;
			return this;
		}

		public Builder comBalanco(double balanco) {
			this.balanco = balanco;
			return this;
		}

		public Builder comTaxaDeManutencao(double taxaDeManutencao) {
			this.taxaDeManutencao = taxaDeManutencao;
			return this;
		}

		public Conta build() {
			Conta conta = new Conta();
			conta.numeroDaConta = this.numeroDaConta;
			conta.nome = this.nome;
			conta.agencia = this.agencia;
			conta.balanco = this.balanco;
			conta.taxaDeManutencao = this.taxaDeManutencao;
			return conta;
		}

	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNome() {
		return nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public double getBalanco() {
		return balanco;
	}

	public double getTaxaDeManutencao() {
		return taxaDeManutencao;
	}

	private Conta() {

	}

}
