package builder;

public class CarroBasicoBuilder  extends CarroBuilder{

	@Override
	public void BuildarCondicionado() {
		// TODO Auto-generated method stub
		carro.setArCondicionado(true);
	}

	@Override
	public void BuildDirecao() {
		// TODO Auto-generated method stub
		carro.setDirecao("Direção hidrálica");
	}

	@Override
	public void BuildQuantidadeAirbags() {
		// TODO Auto-generated method stub
		carro.setQuantidadeAirbags(2);
	}

	@Override
	public void BuildRetrovisor() {
		// TODO Auto-generated method stub
		carro.setRetrovisor("Retrovisores com ajuste manual/mecânico");
	}

	@Override
	public void BuildPainel() {
		// TODO Auto-generated method stub
		carro.setPainel("Painel básico com ponteiro marcador de velocidade");
	}

	@Override
	public void BuildControleDoAr() {
		// TODO Auto-generated method stub
		carro.setControleDoAr("Controle mecânico do nível do ar");
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
