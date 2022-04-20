package director;

import builder.CarroBuilder;
import model.Carro;

public class DirectorCar {

	private CarroBuilder builder; 
	
	
	public DirectorCar(CarroBuilder builder) {
		this.builder = builder;
	}
	
	
	
	
	public void makeCar() {
		builder.BuildarCondicionado();
		builder.BuildcomandoVoz();
		builder.BuildControleDoAr();
		builder.BuildDirecao();
		builder.BuildMultimidia();
		builder.BuildPainel();
		builder.BuildQuantidadeAirbags();
		builder.BuildRetrovisor();
		
		
		
	}
	
	
public Carro getMontagem() {
		
		return builder.getCarro();
	}
	
}
