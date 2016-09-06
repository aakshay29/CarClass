import java.util.Random;

public class DiceRoller
 {
    public static void main( String[] args )
    {
        int dienumber;
        Random rnd = new Random();
        
        dienumber = rnd.nextInt(6) + 1;
        
        System.out.println("Your die roll was : " + dienumber);
    }
 }