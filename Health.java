import java.util.*;

public class Health {
	private int currentHealth;
	
	public void setHealth()
	{
		Random mobr = new Random();
		currentHealth = mobr.nextInt(250)+1;
	}
	
	public void setHealthDamaged(int Damage)
	{
		currentHealth = (currentHealth-Damage);
	}
	
	public int getHealthUpdate()
	{
		return currentHealth;
	}
}
