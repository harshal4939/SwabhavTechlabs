import java.util.Scanner;
import java.lang.Math;   
class Bookcricket 
{	
	static int getRandomto300h() 
	{
		int random = (int) (Math.random() * 299) + 1;	
		return random;
	}
    
	
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BookCricketGame !!! ");
		System.out.println("Rules for the Game : ");
		System.out.println("**Assume a book of 300 pages ");
		System.out.println("1. Player 1 opens the book to read a page number(example 87)(Randomly generated)");
		System.out.println("2. If the page number is 87->87%7(%7 results in score between 0-6)=3 should be added to the score");
		System.out.println("3. Player 1 continues and keeps adding to the score until the page number results in a 0 score");
		System.out.println("4. Player 2 starts the game and tries to beat the score of Player 1");
		System.out.println("5. In case of tie, check the number of turns(player with lesser turns is winner");
		System.out.println("6. Show the winner of the game.");
        System.out.print("Enter 1 To Start The Game And 0 For Exit : ");
        int n = sc.nextInt();
        while (n == 1) 
		{
            innings(sc);
            System.out.print("Enter 1 To Start The Game And 0 For Exit : ");
            n = sc.nextInt();
        }
    }
	
	
    static int innings(Scanner sc) 
    {
        String p1;
        String p2;
        System.out.print("Enter Player 1 Name : ");
        p1 = sc.next();
        System.out.print("Enter Player 2 Name : ");
        p2 = sc.next();
        int point = 0;
        int rounds_p1 = 0;
        System.out.println("Player : " + p1 );
        System.out.println("Enter 1 to Open Book : ");
        int m = sc.nextInt();
        while (m == 1) 
		{
            rounds_p1++;
            int a = getRandomto300();
            int run = a % 7;
            System.out.println("Page Number " + a + " Point : " + run + "Score : " + (point + run) + " ");
            if (run == 0) 
			{	
				System.out.println("Out!!!");
                break;
            } 
			else 
			{
                point = point + run;
            }
            System.out.print("Enter 1 to Open Book : ");
            m = sc.nextInt();
        }
        
        System.out.println(p1 + " Total Score : " + point + "\n");
        System.out.println(p1 + " Takes " + rounds_p1 + " Rounds");
        int point_p2 = 0;
        int rounds_p2 = 0;
        System.out.println(p2 + " Needs " + (point + 1) + " Score in " + rounds_p1 + " Rounds To WIN MATCH");
        System.out.println("Player : " + p2 );
        System.out.print("Enter 1 to Open Book : ");
        m = sc.nextInt();
        
        while (m == 1 && rounds_p2 < rounds_p1) 
        {
            rounds_p2++;
            int a = getRandomto300();
            int run = a % 7;
            System.out.println("Page Number " + a + " \tPoint : " + run + "\tScore : " + (point_p2 + run) + " ");
            if (run == 0)
			{	
				System.out.println("Out!!!");
                break;
            } 
            else 
			{
                point_p2 = point_p2 + run;
            }

            if (point_p2 > point) 
			{
                System.out.println(p2 + " Win Match !!");
                return 0;
            }
            System.out.print("Enter 1 to Open Book : ");
            m = sc.nextInt();
        }
        
        if (point == point_p2)
		{
            System.out.println("Match Draw");
            return 0;
        }

        System.out.println(p1 + " Win Match !!\n");
        return 0;
    }
}