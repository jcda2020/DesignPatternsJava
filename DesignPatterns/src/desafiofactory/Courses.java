package desafiofactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Courses implements PromoterServices{

	private String titulo;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Courses(String titulo) {
		
		this.titulo = titulo;
	}
public Courses() {
		
		this.titulo = "Em construção";
	}
	

@Override
public void cargaHoraria() {
	// TODO Auto-generated method stub
	
	Integer horas = 2;
	System.out.println("Carga horária: " + horas + " horas");
}


	@Override
	public ArrayList<String> itens() {
		// TODO Auto-generated method stub
		ArrayList<String> modulos = new ArrayList<>();
		
		Scanner leia = new Scanner(System.in);	
		int quantidadeModulos = 0;
		
		System.out.println("Quantos módulos seu curso terá: ");
				quantidadeModulos = leia.nextInt();
				
		for (int i = 0; i < quantidadeModulos; i++) {
			
			System.out.println("Digite os nomes dos módulos: ");
			String tema = leia.next();
			modulos.add(tema);
		}
		
		
		
		return modulos ;
		
	}
	

}
