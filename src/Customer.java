import java.util.Random;

public class Customer
{
    int items;
    Random rand = new Random();

    public Customer()
    {
        items = rand.nextInt(1, maxItems + 1);
    }
}