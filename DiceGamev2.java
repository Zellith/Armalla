import java.util.*;

public class DiceGame {


	public static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fields
		String playrName, choice;
		int rolled, health;

		//toggles the game whether the player chose Yes or No.
		boolean gameStart = false;

		Die dice = new Die();
		Players play = new Players();
		Health hp = new Health();
		Damage dmg = new Damage();
		Mobs spawner = new Mobs();


		//Introduction Line(s).
		System.out.println("Welcome to Armalla!!");
		System.out.println("Enter Player Name: ");
		playrName = console.nextLine();
		play.setName(playrName);
		System.out.println("Setting up health..."+"\nNote: Health is Randomized at start to create a more challenging gameplay and just to mess with you.");
		hp.setHealth();

		//simulates loading of a game.
		try 
		{
			Thread.sleep(2122);
		} 
		catch(InterruptedException ex) 
		{
			Thread.currentThread().interrupt();
		}

		System.out.println("\nWe have just finished setting up, "+play.getName()+" your health is: "+ hp.getHealthUpdate());
		System.out.println("Finalizing System Check...");

		try 
		{
			Thread.sleep(3000);
		} 
		catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}

		System.out.println("All Systems GREEN");
		System.out.println("Once again Welcome "+play.getName()+" to Armalla. \nThe Forsaken Tower!!");
		System.out.println("Would you like start "+play.getName()+". Y/N");
		choice = console.nextLine();

		if (choice == "Y")
		{
			gameStart = true;
		}
		else if(choice == "N")
		{
			System.out.println("GAMEOVER!!");
		}


		System.out.println("(Sound of water dripping)\n"+play.getName()+": Ughh... where am I?\n"+play.getName()+": I feel sick");
		System.out.println("Welcome to Armalla, the goal of the game is simple just kill 50 mobs to escape the tower.");

		for(int i = 0; i<=49 || gameStart != true; i++)
		{
			//gets the current health of the player.
			health = hp.getHealthUpdate();

			if(health>0)//checks if the player is alive or not.
			{
				//Decides the mob that will appear
				spawner.setMob();
				spawner.setMobHealth(); //Sets the health of the mob to a random variable cause we CAN!
				System.out.println("A "+spawner.getMobName()+" just appeared.");
				
				try 
				{
					Thread.sleep(1000);
				} 
				catch(InterruptedException ex) 
				{
					Thread.currentThread().interrupt();
				}

				System.out.println("This "+spawner.getMobName()+" has "+spawner.getMobHealth()+" health.");



				while(spawner.getMobHealth()>0)//loops until mob only has 0 or less health left.
				{
					//Ask the player if he/she wants to beat the crap out of the ASCII(text) code.
					System.out.println("Roll a die?: Y/N");
					choice = console.nextLine();
					//stores the value of the rolled dice into the variable "rolled".
					rolled = dice.rollDice();
					//Sets the damage you deal to the mob.
					
					try 
					{
						Thread.sleep(1000);
					} 
					catch(InterruptedException ex) 
					{
						Thread.currentThread().interrupt();
					}
					
					System.out.println("You just rolled a "+dice.getValue()+".");
					dmg.setDamage(health,rolled);

					//Player Attack Phase
					System.out.println("You just dealed "+dmg.getDamage()+" damage to the "+spawner.getMobName());
					spawner.updateMobHealth(dmg.getDamage());
					System.out.println(spawner.getMobName()+" has "+spawner.getMobHealth()+" left.");

					if(spawner.getMobHealth()> 0)//checks if the mob was killed before it could attack.
					{
						//Mob Attack Phase
						System.out.println(spawner.getMobName()+" is attacking.");
						spawner.setMobAttack(); //set the damage of the mob.
						System.out.println(spawner.getMobName()+" dealed "+spawner.getMobDamage());
						hp.setHealthDamaged(spawner.getMobDamage()); //updates the health of the player.
						health = hp.getHealthUpdate();
					}

					if(spawner.getMobHealth()<=0)
					{
						System.out.println("CONRATULATIONS you just killed a person are you happy now?!\n");
					}

					//Check if the players life is below or equal to 0
					if(hp.getHealthUpdate()<=0)
					{
						System.out.println("You just Died NOOB~!");
						gameStart = false;
						break;
					}

					System.out.println(play.getName()+" has "+hp.getHealthUpdate()+" health left.");

				}
			}

		}
		System.out.println("CONGRATULATIONS you just killed every browser in the world!!"+"\n Are you happy now that you brought forth No-Internet to every person on Earth.");
	}

}

