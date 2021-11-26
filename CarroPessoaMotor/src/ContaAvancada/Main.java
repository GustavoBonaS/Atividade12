package ContaAvancada;

public class Main {

	public static void main(String[] args) {
	
		Banco b = new Banco ();
		b.setCodigo(6548);
		b.setNome("Banco do Brasil");
		b.setNumeroAgencias(456);
		System.out.println(b);
		
		Pessoa p = new Pessoa ();
		p.setEndereco("Laurentino");
		p.setNome("Gustavo");
		System.out.println(p);
		
		
		ContaBancaria cb = new ContaBancaria();
		cb.banco = b;
		cb.setAgencia(4567);
		cb.setNumeroconta(123456);
		cb.setSaldo(4563);
		cb.deposito(555);
		cb.saque(2300);
		cb.correntista = p;
		System.out.println(cb);

		CartaoDeCredito c = new CartaoDeCredito();
		c.setNumero(856);
		c.setOperadora("MasterCard");
		c.setLimite(100000);
		c.setTipoDeCartao("Black");
	
		
		ContaEspecial ce = new ContaEspecial();
		ce.banco = b;
		ce.setAgencia(4567);
		ce.setNumeroconta(123456);
		ce.setSaldo(45613);
		ce.deposito(4562);
		ce.saque(7899);
		ce.correntista = p;
		ce.setDiasSemJuros(9);
		ce.setLimite(10000);
		ce.cartao = c;
		System.out.println(ce);

		ContaSimples cs = new ContaSimples();
		cs.banco = b;
		cs.setAgencia(4567);
		cs.setNumeroconta(123456);
		cs.setSaldo(45632);
		cs.deposito(455);
		cs.saque(20000);
		cs.correntista = p;
		cs.setSaldoPoupanca(5666);
		System.out.println(cs);
		
	

	}

}
