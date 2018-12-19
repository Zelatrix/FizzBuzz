/**
 * Write a description of class FizzBuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FizzBuzz
{
    public void main(String[] args)
    {
        FizzBuzz f = new FizzBuzz();
    }

    private int i;
    /**
     * Constructor for objects of class FizzBuzz
     */
    public FizzBuzz()
    {
        // initialise instance variables
        i = 0;
    }

    /**
     * If x is a multiple of 3, print "fizz"
     * If x is a multiple of 5, print "buzz"
     * If x is a multiple of both 3 and 5, print "fizzbuzz"
     */
    public void FizzBuzz()
    {
        for(i=1; i<=100; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }

            else if(i%3==0)
            {
                System.out.println("Fizz");
            }

            else if(i%5==0)
            {
                System.out.println("Buzz");
            }

            else
            {
                System.out.println(i);
            }
        }
    }
}