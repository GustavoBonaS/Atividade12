
public class Main {

	public static void main(String[] args) {
		
		Carro ca = new Carro();
		ca.setAno(2019);
		ca.setCor("Vermelho");
		ca.setFabricante("Renault");
		ca.setModelo("Duster");
		
		ca.dono.setPessoa("Gustavo");
		ca.dono.setEndereco("Rua tal coisa");
		
		ca.motor.setCilindros(450);
		ca.motor.setCombustivel("Gasolina");
		ca.motor.setMarca("Ford");
		ca.motor.setPotencia(500);	
		
		System.out.println(ca);
		System.out.println(ca.motor);
		System.out.println(ca.dono);
		
		
	}

}
