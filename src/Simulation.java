import java.util.Scanner;

public class Simulation
{
    int numSuper, numExp, numStandLines, arrivalRate, maxItems, maxSimTime;
    Scanner in = new Scanner(System.in);

    public void setData()
    {
        //numSuper The number of items allowed in the superexpress line
        System.out.println("Enter the number of items allowed in the superexpress line: ");
        int numSuper = in.nextInt();

        //numExp The number of items allowed in the express line
        System.out.println("Enter the number of items allowed in the express line: ");
        int numExp = in.nextInt();

        //numStandLines The number of regular lines
        System.out.println("Enter the number of regular lines: ");
        int numStandLines = in.nextInt();

        //arrivalRate The arrival rate of customers per hour
        System.out.println("Enter the arrival rate of customers per hour: ");
        int arrivalRate = in.nextInt();

        //maxItems The maximum number of items
        System.out.println("Enter the maximum number of items: ");
        int maxItems = in.nextInt();

        //maxSimTime The simulation time
        System.out.println("Enter the simulation time: ");
        int maxSimTime = in.nextInt();
    }
}