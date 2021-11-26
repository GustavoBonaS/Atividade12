
public class pessoa {

	private String pessoa;
	private String endereco;
	
	
	public String getPessoa() {
		return pessoa;
	}
	public void setPessoa(String pessoa) {
		if (pessoa.length() > 0);
		this.pessoa = pessoa;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if (endereco.length() > 0);
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pessoa [pessoa=");
		builder.append(pessoa);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
	
	
}
