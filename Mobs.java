import java.util.*;

public class Mobs {
	private String mobNames[] = {"Chrome", "Firefox", "Maxthon", "Tor", "Torch", "IE", "Dolphin"};
	private int currentMobHealth, mobNumber, mobDamage;
	
	Random i = new Random();
			
	public void setMob()
	{
	mobNumber = (i.nextInt(5)+1); //Randomizes a number to use as a reference for the mobNames variable
	}
	
	public String getMobName()
	{
		return mobNames[mobNumber];
	}
	
	public void setMobHealth()
	{
		currentMobHealth = (i.nextInt(50)+1); //Randomizes the mob health.
	}
	
	public void updateMobHealth(int damage)
	{
		currentMobHealth = (currentMobHealth-damage); //Updates the health by applying the damage and returning the difference into currentMobHealth.
	}
	
	public int getMobHealth()
	{
		return currentMobHealth;
	}
	
	public void setMobAttack()
	{
		mobDamage =  (i.nextInt(52)+1);
	}
	
	public int getMobDamage()
	{
		return mobDamage;
	}
	
}
