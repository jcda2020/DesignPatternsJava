package builder;

public class CarroTurbinado1 extends CarroBuilder{

	
	@Override
	public void BuildarCondicionado() {
		// TODO Auto-generated method stub
		carro.setArCondicionado(true);
	}

	@Override
	public void BuildDirecao() {
		// TODO Auto-generated method stub
		carro.setDirecao("Dire��o hidr�lica");
	}

	@Override
	public void BuildQuantidadeAirbags() {
		// TODO Auto-generated method stub
		carro.setQuantidadeAirbags(2);
	}

	@Override
	public void BuildRetrovisor() {
		// TODO Auto-generated method stub
		carro.setRetrovisor("Retrovisores retr�til com comando nas portas");
	}

	@Override
	public void BuildPainel() {
		// TODO Auto-generated method stub
		carro.setPainel("Painel com computador de bordo");
	}

	@Override
	public void BuildControleDoAr() {
		// TODO Auto-generated method stub
		carro.setControleDoAr("Controle eletr�nico do n�vel do ar");
	}

	@Override
	public void BuildMultimidia() {
		// TODO Auto-generated method stub
		carro.setMultimidia(false);
	}

	@Override
	public void BuildcomandoVoz() {
		// TODO Auto-generated method stub
		carro.setComandoVoz(false);
	}
	
}
