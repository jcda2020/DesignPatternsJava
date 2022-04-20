package builder;

public class CarroTurbinado2 extends CarroBuilder{

	@Override
	public void BuildarCondicionado() {
		// TODO Auto-generated method stub
		carro.setArCondicionado(true);
	}

	@Override
	public void BuildDirecao() {
		// TODO Auto-generated method stub
		carro.setDirecao("Direção Elétrica assistida");
	}

	@Override
	public void BuildQuantidadeAirbags() {
		// TODO Auto-generated method stub
		carro.setQuantidadeAirbags(4);
	}

	@Override
	public void BuildRetrovisor() {
		// TODO Auto-generated method stub
		carro.setRetrovisor("Retrovisores com ajuste retrátil com comando no volante");
	}

	@Override
	public void BuildPainel() {
		// TODO Auto-generated method stub
		carro.setPainel("Painel com computador de bordo");
	}

	@Override
	public void BuildControleDoAr() {
		// TODO Auto-generated method stub
		carro.setControleDoAr("Controle eletrônico do nível do ar");
	}

	@Override
	public void BuildMultimidia() {
		// TODO Auto-generated method stub
		carro.setMultimidia(true);
	}

	@Override
	public void BuildcomandoVoz() {
		// TODO Auto-generated method stub
		carro.setComandoVoz(true);
	}
	
}
