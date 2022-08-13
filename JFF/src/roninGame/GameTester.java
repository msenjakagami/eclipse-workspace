package roninGame;
import java.util.*;

public class GameTester {

	private static ArrayList<Team> teams = new ArrayList<Team>();

	public static void main(String args[]){
		System.out.println("Welcome to the world of Ronin Legends!");
		Team team = new Team();
		Scanner in = new Scanner(System.in);
		boolean yes = true;

		do{
			Player n; 
			n = characterCreate();

			do{
				System.out.println("Do you want to create a new team?\n[A] Yes\n[B] No");
				String x = in.next();
				if (x.equalsIgnoreCase("A")){
					team = newTeam(n);
					teams.add(team);
					break;
				}
				else if(x.equalsIgnoreCase("B") && teams.size() == 0){
					System.out.println("There is no existing team");
				}
				else if(x.equalsIgnoreCase("B")){
					displayTeams();
					chooseTeam(n);
					break;
				}

			}while(2>1); 

			do{
				System.out.println("Do you want to add more players?\n[A] Yes\n[B] No");
				String cont = in.next();
				if (cont.equalsIgnoreCase("a")){
					yes = true;
					break;
				}
				else if (cont.equalsIgnoreCase("b")){
					yes = false;
					break;
				}
				else{
					continue;
				}
			}while(2>1);

		}while(yes);
		System.out.println("It's time to start your journey!");
		//		String name = name();
		//		Species playerSpecies = species();
		//		playerSpecies.setStats(playerSpecies.getName());
		//		playerSpecies.getStats();
		//		Player player = new Player(name, playerSpecies.getName(), playerSpecies.getStats());
		//		player.characterScreen();	
	}

	public static Species species(){
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		int choice2;
		Species playerSpecies = new Species();
		if (choice == 1){
			System.out.println("Tell me, are you human or caedion?");
			System.out.println("1. Human");
			System.out.println("2. Caedion");
			choice2 = in.nextInt();
			if (choice2 == 1){
				playerSpecies.setSpecies("Human");
			}
			else if(choice2 == 2){
				playerSpecies.setSpecies("Caedion");
			}
		}
		else if(choice == 2){
			playerSpecies.setSpecies("Vikitronian");
		}
		else if(choice == 3){
			playerSpecies.setSpecies("Serako");
		}
		else if(choice == 4){
			playerSpecies.setSpecies("Synthenian");
		}
		else if(choice == 5){
			int random = (int) Math.random();
			if (random == 0){
				playerSpecies.setSpecies("Human");
			}
			else{
				playerSpecies.setSpecies("Caedion");
			}
		}
		return playerSpecies;
	}

	public static String name(){
		Scanner in = new Scanner(System.in);
		System.out.println("Why don't you start off by telling me your name?");
		System.out.print("Name: ");
		String name = in.nextLine();
		System.out.println("It's very nice to meet you " + name + "!");
		System.out.println("My name is Maya...");
		System.out.println("I'm here to help you in your journey throughout the galaxy...");
		System.out.println("Tell me, where are you from?");
		System.out.println("1. Endo Reish");
		System.out.println("2. Vikitros");
		System.out.println("3. Elysium");
		System.out.println("4. Synthenia");
		System.out.println("5. I'm not sure...");
		return name;
	}

	public static Player characterCreate(){
		Scanner in = new Scanner(System.in);
		Player character;
		boolean done = false;
		do {
			String name = name();
			Species species = species();
			species.setStats();
			if(species.getSpeciesName().equalsIgnoreCase("Elysian")|| species.getSpeciesName().equalsIgnoreCase("serako")){
				character = new Iriziajin(name);
				character.characterScreen();
			}
			else{
				character = new Player(name, species);
				character.characterScreen();
			}
			do{	
				System.out.println("Is the data above correct?");
				System.out.println("\n[A] Yes \n[B] No");
				String yon = in.next();
				if (yon.equalsIgnoreCase("a")){
					done = true;
					break;
				}
				else if (yon.equalsIgnoreCase("B")){
					done = false;
					break;
				}
			} while(2 > 1);
		}while(!done);
		return character;
	}

	public static Team newTeam(Player n){
		Team team = new Team();
		Scanner in = new Scanner(System.in);
		System.out.println("What do you want to name your new team?");
		String teamName = in.next();
		team.setName(teamName);
		team.addLeader(n);
		team.displayTeam();
		return team;
	}

	public static void displayTeams(){
		int i = 1;
		for (Team x : teams){
			System.out.println(i +". Team " + x.getName());
			i++;
		}
	}

	public static void chooseTeam(Player n){
		//Team team = new Team();
		boolean run = false;
		do{
			Scanner in = new Scanner(System.in);
			System.out.println("Which team do you want to be added to? (or press [B] to end)");
			String teamChoice = in.nextLine();
			for (int i = 0; i <= teams.size(); i++){
				if (teamChoice.equalsIgnoreCase("b")){
					run = true;
					break;
				}
				else if(!teamChoice.equals(teams.get(i).getName()) && i == teams.size() - 1 && teams.size() == 1){
					System.out.println("Team does not exist");
					break;
				}

				else if (!teamChoice.equals(teams.get(i).getName()) && i == teams.size() - 1){
					System.out.println("Team does not exist");
					break;
				}
				else if (teamChoice.equals(teams.get(i).getName())){
					int size = teams.get(i).addPlayer(n);
					if(size == 4){
						System.out.println("Team is full");
						run = false;
					}
					else{
						teams.get(i).displayTeam();
						run = true;
					}
					break;
				}

			}
			if(!run){
				System.out.println("Do you want to try again? \n 1. [A] \n 2. [B]");
				String c = in.next();
				if (c.equalsIgnoreCase("a")){
					continue;
				}
				else if(c.equalsIgnoreCase("b")){
					run = true;
				}
			}
		} while(!run);
	}
}





/* Team ronin = new Team("Ronin");
Elysian ronin2 = new Elysian(true, 3);
ronin2.setName("Kazuko");
ronin2.setSpecies("Elysian");
for (int i = 0; i <= 6; i++){
	ronin2.levelUp();
	if(i==0 || i == 1){
		ronin2.changeStats(-1, 0);
	}
	else if(i==2 || i == 3 || i == 4){
		ronin2.changeStats(1, 1);
	}
	else if(i==5){
		ronin2.changeStats(2, 1);
	}
	else if(i==6){
		ronin2.changeStats(3, -1);
	}
}
int[] val_stats = {7, 6, 4, 5};
int[] aaron_stats = {5, 5, 6, 5};
int[] david_stats = {4, 5, 5, 6};
int[] magni_stats = {8, 3, 6, 4};
int[] eiko_stats = {3, 7, 5, 3};
Player ronin1 = new Player("Val", "Caedion", 7, val_stats);
Player ronin3 = new Player("Aaron", 8, aaron_stats);
Player ronin4 = new Player("Eiko", "Synthenian", 6, eiko_stats);
Player ronin5 = new Player("David", "Human", 5, david_stats);
Player ronin6 = new Player("Magni", "Vikitronians", 6, magni_stats);
ronin.addPlayer(ronin1);
ronin.addPlayer(ronin2);
ronin.addPlayer(ronin3);
ronin.addPlayer(ronin4);
ronin.addPlayer(ronin5);
ronin.addPlayer(ronin6);
ronin.displayTeam();
 */