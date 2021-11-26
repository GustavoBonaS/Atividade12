package ContaAvancada;

public class ContaBancaria {

	private int agencia;
	private int numeroDaConta;
	private double saldo;
	protected Banco banco;
	protected Pessoa correntista;

	public ContaBancaria() {
		banco = new Banco();
		correntista = new Pessoa();
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0)
			this.agencia = agencia;
	}

	public int getNumeroconta() {
		return numeroDaConta;
	}

	public void setNumeroconta(int numeroconta) {
		if (numeroconta > 0)
			this.numeroDaConta = numeroconta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean deposito(double valor) {
		if (valor > 0) {
			setSaldo(getSaldo() + valor);
			return true;
		}
		return false;
	}

	public boolean saque(double valor) {
		if (valor <= getSaldo() && valor > 0) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroDaConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append("]");
		return builder.toString();
	}

}
