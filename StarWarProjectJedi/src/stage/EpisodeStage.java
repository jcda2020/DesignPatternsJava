package stage;

import decoratorjedai.PadawanDecorator;
import decoratorjedai.SithDecorator;
import factoryjedai.FactoryAbstractJedi;
import factoryjedai.FactoryConcreteJedi;
import observernotifyforce.Force;
import strategyuseforce.BattleContext;
import strategyuseforce.LightSaber;
import strategyuseforce.Telecinese;

public class EpisodeStage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FactoryAbstractJedi anyJedi = null;
		
		anyJedi = new FactoryConcreteJedi();
			
		
		String personGame = "padawan";
		
		//if(personGame.equalsIgnoreCase("padawan")) {			
			
			PadawanDecorator jediPadawan = new PadawanDecorator(anyJedi);
					
					
			for (int i = 0; i < 5; i++) {
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			Thread.sleep(2000);
			System.out.print("Há muito tempo, ");
			Thread.sleep(1500);
			System.out.print("em uma galáxia muito,");
			Thread.sleep(1500);
			System.out.print(" muito distante");
			
			for (int i = 0; i < 3; i++) {
				System.out.print(".");
				Thread.sleep(2000);
			}
			System.out.println();
	
			
			
			System.out.println("Movimentação do Padawan 1:");
			jediPadawan.speedOfForce(1);
			
			PadawanDecorator jediPadawan2 = new PadawanDecorator(anyJedi);
			

			for (int i = 0; i < 5; i++) {
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			
			System.out.println("Movimentação do Padawan 2:");
			jediPadawan2.speedOfForce(2);
			
			//extends of subject from Cosmos Energy Field
			//The Force, the energy that unites all living beings 
			Force force = new Force();
				force.addPerson(jediPadawan);
				force.addPerson(jediPadawan2);
			
		
			FactoryAbstractJedi sith = new FactoryConcreteJedi();	
			force.addPerson(sith);

			for (int i = 0; i < 5; i++) {
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			
			
			System.out.println("Mudança no ambiente...");		
			
				force.notifyOfForce(sith);
				SithDecorator sithDarthMaul  = new SithDecorator(sith);
					force.addPerson(sithDarthMaul);
					
				for (int i = 0; i < 10; i++) {
					System.out.print(".");
					Thread.sleep(2000);
				}
				System.out.println();
				
				System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⢿⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠃⠈⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠋⠀⠀⠘⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣾⣿⣿⣷⠾⠿⠿⠿⢿⣷⣦⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⡄⠀⠀⠀⠀⠀⠀⠀⣀⣴⠾⠛⠋⠉⠀⠀⠀⣀⣤⣤⡀⠀⠀⠈⠙⠛⠿⢷⣶⣤⡀⠀⠀⠀⠀⠀⣠⣶⢿⣦⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡟⠻⢦⣤⣠⣤⣴⣾⠟⠋⠀⠀⠀⠀⠀⠀⢀⣾⣿⠏⠘⣷⡀⠀⠀⠀⠀⠀⠀⠈⠙⠻⢷⣦⣤⣴⡾⠛⠁⢸⡿⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⢈⣿⣿⠟⠁⠀⠀⣀⣴⣾⡇⠀⠀⣾⣿⡟⠀⠀⣿⣷⡀⠀⠀⠀⠀⣾⣷⣄⠀⠀⠙⢿⡇⠀⠀⠀⣾⡇⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣧⠀⣠⡿⢫⣤⣤⣄⣠⣾⣿⣿⡿⠁⠀⣸⣿⣿⠁⠀⠀⣿⣿⣧⠀⠀⠀⠀⢹⣿⣿⣷⣄⠀⣸⢿⣦⣤⣾⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⣶⡿⠀⣿⠇⠈⢻⣿⣿⣿⣿⠃⠀⠀⣿⣿⢿⣆⠀⣴⣿⣿⣿⠄⠀⠀⢀⣼⣿⣿⣿⠛⠋⠀⣾⡟⢿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠁⢸⣿⡀⠀⠈⣿⢿⣿⣿⠀⠀⠀⣿⣿⣧⡛⠟⢉⣼⣿⣿⠀⠀⠀⢸⣿⣷⡙⢿⡀⠀⢀⣿⠁⢸⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⠀⠀⢻⣧⣀⠠⠋⣿⣿⡿⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀⠀⣿⣿⣷⡄⠱⣤⣾⡟⠀⠀⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⠀⠀⠈⣧⣤⣶⣿⣿⡿⠃⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⢹⣿⣿⣿⣷⣿⣿⠃⠀⠀⢻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⡀⠀⠀⣿⣿⡿⠛⠉⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠉⠉⠙⢻⣿⡇⠀⠀⠀⢸⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣷⡀⠀⣿⣿⠀⠀⢀⣀⣀⠀⠀⠀⠀⠀⠻⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⢻⣷⠀⢀⣴⣿⣿⣇⠀⠀⠀⣀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠘⢿⣷⣤⣿⠟⠻⢷⣄⠀⠀⠀⠀⠈⠛⠁⠀⠀⠀⠀⠀⠀⣤⣾⠿⣷⣤⣴⡿⠋⢰⣿⣿⡿⢛⣿⣤⡶⢿⣿⡇⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠻⣿⣿⡄⠉⠙⠛⠻⣧⠈⢿⡀⠀⠉⠋⠁⠀⠀⢀⣽⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⠟⠁⠀⠈⠙⠉⠀⠀⣾⣿⡿⣴⠃⠈⠁⠀⣼⠟⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠙⢿⣿⡀⠀⠀⢀⣿⠀⣾⡇⠀⣠⡀⠀⠀⠸⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣄⠀⠀⠀⠀⠀⠀⠀⣿⣿⣇⣿⠀⢀⣤⣿⡟⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠹⣷⣤⣠⡾⠁⣼⣿⠇⠘⠿⢿⣷⣄⠀⠙⠻⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡼⠟⠀⠀⢀⣴⡿⠟⠀⢹⣿⣿⠙⢻⣿⣿⡏⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⡏⠀⣴⣶⣤⡀⠙⠀⠀⠀⠈⠻⣷⡀⠀⢀⣴⣆⠀⢠⣾⣏⠀⠀⠀⠀⠋⠀⣀⣀⠀⠈⢿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⡟⠀⣼⣿⣿⣿⣿⣷⣶⣦⣤⣀⣰⡟⠁⠀⢼⣿⣿⠇⠀⠙⣿⣆⢀⣀⣤⣶⣿⣿⣿⣷⠀⠈⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⠃⠀⢿⣿⣿⣿⠹⣿⢿⠿⢿⣿⣿⡀⠀⠀⠀⢿⠏⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⢿⣿⣿⣧⠀⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⡀⠀⠀⠻⣿⣿⣧⣘⣓⣚⣋⣀⣿⣿⡆⠲⠶⣾⣷⠄⣾⣿⣿⣿⠿⠳⠤⠜⢃⣼⣿⣿⠟⠀⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⣿⡇⠀⠀⠀⢘⣿⣿⣿⣿⣿⣿⡿⠟⠋⠀⠀⢠⣾⣄⠀⠈⠙⠻⠿⣿⣶⣶⣾⣿⣿⣿⠃⠀⢸⣿⡿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⡀⢀⣶⡿⠟⠋⠀⠀⠈⠉⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠉⠉⠛⠛⠻⣿⡄⠀⣸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣏⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⢰⣶⡆⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⢀⣿⣷⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⡿⢿⣷⣦⣄⠀⠀⣰⣿⠛⠛⢷⣄⠀⠀⠉⠁⠀⣠⣴⠟⢿⣿⣦⡀⢀⣴⣿⡿⠋⢠⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⠿⣿⣧⡀⠈⠛⠿⣿⣾⠟⠁⠀⠀⠀⣿⣷⣄⣀⣤⣾⣿⡇⠀⠀⠻⣿⣿⡿⠟⠉⠀⢀⣾⣿⣿⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⡿⠋⠀⠀⢸⣿⣿⣦⡀⠀⠈⠉⠀⠀⠀⠀⠀⠈⠛⠿⣿⣿⠿⠛⠁⠀⠀⠀⠈⠁⠀⠀⠀⢠⣾⣿⠛⢿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⢀⣾⠟⠉⠀⠀⠀⠀⠘⣿⣿⣿⣧⠀⠀⠀⠀⠀⢀⣠⣾⣷⣦⣄⡀⢀⣠⣶⣦⣄⠀⠀⠀⠀⠀⢀⣴⣿⣿⠃⠀⠀⠘⢿⣿⣷⡄⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⢀⣠⣴⡟⠁⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣧⡀⠀⢀⣴⣿⣯⡀⢩⡿⠛⠛⠿⢿⡏⠉⣿⣷⣄⠀⠀⣠⣿⣿⣿⣿⡄⠀⠀⠀⠈⠻⣿⣿⣦⠀⠀⠀⠀⠀\r\n"
						+ "⣠⣴⣶⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⣠⡾⠁⠙⢿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣦⣤⣤⣤⣤⣿⣿⣿⣿⣿⣷⣶⣿⣿⡿⠁⢻⣧⠀⠀⠀⠀⠀⠈⢿⣿⣿⣦⣀⠀⠀\r\n"
						+ "⠿⠛⠋⣹⡟⠁⠀⠀⠀⠀⠀⠀⠀⣴⣿⡇⠀⠀⠈⢿⣿⣿⣿⣿⣿⡿⠟⠋⠉⢈⣩⣭⣭⣍⣉⠉⠙⠻⣿⣿⣿⣿⣿⠁⠀⠸⣿⡀⠀⠀⠀⠀⠀⠀⢿⡿⣿⣿⣷⡆\r\n"
						+ "⠀⠀⣰⣿⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣧⠀⠀⠀⠈⣿⣿⣿⣿⠉⠀⠀⠀⣴⣿⠋⠀⠘⢻⣿⣆⠀⠀⠘⣿⣿⣿⡿⠀⠀⠀⣿⣇⠀⠀⠀⠀⠀⠀⢸⡇⠀⠙⠻⣷\r\n"
						+ "⠀⢠⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⣼⡿⣿⣿⡄⠀⠀⠀⢹⣿⣿⣿⣤⡀⠀⠸⡿⠁⠀⠀⠀⠀⣿⡿⠀⠀⣠⣿⠟⣿⠃⠀⠀⢀⣿⣿⠀⠀⠀⠀⠀⠀⠸⣿⠀⠀⠀⠀\r\n"
						+ "⠀⠙⠛⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⠃⠘⢿⣷⠀⠀⠀⠈⢿⣿⣿⡟⣿⣷⣦⣤⣤⣀⣀⣀⣀⣠⣤⣤⣾⡿⠃⢠⡟⠀⠀⠀⣼⠿⣿⡇⠀⠀⠀⠀⠀⠀⠙⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡏⠀⠀⠈⢿⣇⠀⠀⠀⠈⢿⣿⣇⠀⠙⠛⠿⠿⠿⠿⠿⠿⠿⠿⠛⠉⠀⢰⡿⠁⠀⠀⣼⡿⠀⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
				
				for (int i = 0; i < 5; i++) {
					System.out.print(".");
					Thread.sleep(500);
				}
				System.out.println();
				
				System.out.println("Movimentação do sith Darth Maul:");
				sithDarthMaul.speedOfForce(3);
			
				
		BattleContext jediPadawanConsoleGamer;
		
		jediPadawanConsoleGamer = new BattleContext(new Telecinese());
		
		System.out.println("Ação do Padawan 1:");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		
		jediPadawanConsoleGamer.jediSkills();
		
		BattleContext sithDarthMaulConsoleGamer;
		
		for (int i = 0; i < 5; i++) {
			System.out.print(".");
			Thread.sleep(1000);
		}
		System.out.println();
		
		System.out.println("Ação do sith Darth Maul:");
		
		
		sithDarthMaulConsoleGamer = new BattleContext(new LightSaber());
		
		sithDarthMaulConsoleGamer.jediSkills();
		
		Thread.sleep(1000);
		
		System.out.print("To ");
		Thread.sleep(2000);
		System.out.print("be");
		Thread.sleep(2000);
		System.out.print(" continued");
		for (int i = 0; i < 3; i++) {
			System.out.print(".");
			Thread.sleep(3000);
		}
		
	
		
	}

}
