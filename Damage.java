
public class Damage {
	private int Attack = 5, Damage; //attack is declared as a constant
	
	public void setDamage(int health,int rolled)
	{
		Damage = health/(Attack*rolled);
	}
	public int getDamage()
	{
		return Damage;
	}
}
