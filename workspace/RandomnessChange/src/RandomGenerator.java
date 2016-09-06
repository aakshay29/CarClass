import java.util.Random;

public class RandomGenerator{
    public static void main(String[] args)
    {
    	System.out.println("Generate 10 random integers between 5 and 95");

        Random rnd = new Random();
        
        int randomInt = (rnd.nextInt(6)) + 5;  
        System.out.println("Generated number: " + randomInt);

    }
}
