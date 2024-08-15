import java.util.Scanner;

public class NumberGame {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int chances=5;
        int finals=0;
        boolean playAgain=true;
        System.out.println("Welcome to Magic Shows-->");
        System.out.println("Hey Users you have about "+chances+" chances to Win the game :");
        while(playAgain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("Chance."+(i+1)+":Enter your Guess:");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("You Won It. ");
                    break;
                }
                else if(user>rand){
                    System.out.println("Too High");
                }
                else{
                    System.out.println("Too Low");
                }
            }
            if(guess==false){
                System.out.println("Sorry,You Lose It.If you Curious about what number it is?Then,the Number is "+rand+".");
            }
            System.out.println("Do you Want to play Again(Yes/No)");
            String pA=sc.next();
            playAgain=pA.equalsIgnoreCase("Yes");
        }
        System.out.println("That's All for Today Return back Next day with some luck.");
        System.out.println("Your Score:"+finals);
    }

    public static int getrandN(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}