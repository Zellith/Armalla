import java.util.*;

public class Comments {
	private String backComment[] = {"I always wondered how it would feel like to punch people.","Peter piper pick a peck of pic~ SHI*! I bit my tongue.","Who ever is reading this is a douche.","Note to self: Use a glove next time randomly punching things that appear infront of me is hard","I always wondered how it would feel like if I punch myself.","What you looking at? Ohh!... nevermind.","I saw a guy punch a dog behind you, maybe you could team up yeah, NO! well suit yourself!","P.S if your hearing random voices in your head in means your crazy!","........, What! can't I just stay quiet!"};
	Random no = new Random();
	private int commentNumber;
	
	
	public String Comment()
	{
		commentNumber = no.nextInt(8)+1;
		return ("Mysterious Voice: "+backComment[commentNumber]);
	}
	
	public String attackComment(int damage)
	{
		if(damage<=20)
		{
			return ("Ha! you weak wuss~!");
		}
		
		if(damage>20)
		{
			return ("Ohh right in the smackers!");
		}
		
	return "";//just to remove the annoying return error
	}
}
