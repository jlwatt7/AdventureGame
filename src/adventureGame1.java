import java.util.*;
public class adventureGame1 {

	public static void main(String[] args) {
		// user input
		int gameCase =1; 
		boolean gameOn= false; 
		Scanner scanner = new Scanner(System.in); 
System.out.println("Welcome! What is your name? (enter your name):");
String userName = scanner.nextLine();
System.out.println("Would you like to play a game?(Y/N)");
String userAnswer = scanner.nextLine();
if (userAnswer.equalsIgnoreCase("Y"))
{
	gameOn=true;
	
	gameCase=1; 
 
while(gameOn)
	{
	switch(gameCase)
	{
	case 1:
	 
		System.out.println("Excellent! You are walking across a field and you "
				+ "encounter a fire breathing dragon! What would you do? (enter \"face the beast\" or \"run away\"):"); 
		String userFieldAnswer = scanner.nextLine(); 
		if(userFieldAnswer.equalsIgnoreCase("Face the beast"))
		{
			gameOn =true;
			gameCase =2;
		}else
			gameOn=false;
		break;
	
	case 2:
		System.out.println("You approach the dragon. You see that he has ___ heads. (enter \"1\", \"2\", or \"3\"):");
	String dragonHeads= scanner.nextLine(); 
	System.out.println("No one has ever faced a "+ dragonHeads+ "-headed dragn before! "
			+ "Choose your weapon. (enter \"slingshot\" or \"sword\" or \"bow and arrow\"):");
	String weaponChoice =scanner.nextLine(); 
	System.out.println("Armed with your " + weaponChoice+ ", you approach the dragon. You can feel its fiery "
			+ "breath as you get closer. It stares at you with its ___ eyes. (enter \"red\" or \"blue\"):");
String eyeColor= scanner.nextLine(); 
 System.out.println(" Oh thank goodness! " + eyeColor + "-eyed dragons are friendly. "
 		+ "You pet it and become friends. You name you dragon ___. (enter a name):");
 
 String dragonName= scanner.nextLine();
 System.out.println(userName + " and " + dragonName + " live happily ever after");
 gameOn=false; 
 break;
}
}

	}
}
}