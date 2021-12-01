package computador;

public class Main {

	public static void main(String[] args) {

	
		HD hd = new HD();
		hd.setMarca("WD");
		hd.setModelo("NAS");
		hd.setCapacidade(1000);
		hd.setRpm(5400);

		Memoria m = new Memoria();
		m.setMarca("Pichau");
		m.setModelo("TEAM GROUP T-FORCE VULCAN");
		m.setCapacidade(8);
		m.setVelocidade(3200);

		Processador p = new Processador();
		p.setMarca("Intel");
		p.setModelo("Core i7 8700");
		p.setClock(3.5);
		p.setCache(12);

		PlacaMae pm = new PlacaMae();
		pm.setMarca("Asus");
		pm.setModelo("b450");
		pm.processador = p;
		pm.hd = hd;
		pm.memoria = m;
		System.out.println(pm);

		

		gabinete g = new gabinete();
		g.setModelo("Aero Cool");
		g.setTipo("Gamer");
		g.setBaias(8);
		g.placamae = pm;

		Monitor mo = new Monitor();
		mo.setMarca("LG");
		mo.setTipo("LED");
		mo.setResolucao("HD 1600x900 60 Hz");

		Teclado t = new Teclado();
		t.setMarca("REDRAGON RUDRA");
		t.setTipo("Mecânico");

		Mouse mouse = new Mouse();
		mouse.setMarca("REDRAGON");
		mouse.setTipo("Gamer");

		computador pc = new computador();
		pc.setMarca("Montado");
		pc.setModelo("Gamer");
		pc.gabinete = g;
		pc.teclado = t;
		pc.mouse = mouse;
		pc.monitor = mo;
		System.out.println(pc);


		EquipamentoEletronico ee = new EquipamentoEletronico();
		ee.setTensao(120);
		ee.setConsumo(500);
		ee.setMarca("");
		ee.setModelo("");
		ee.gabinete = g;
		ee.teclado = t;
		ee.mouse = mouse;
		ee.monitor = mo;
		System.out.println(ee);

	}

}