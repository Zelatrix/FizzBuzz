/**
 * Write a description of class FizzBuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FizzBuzz {
    public void main(String[] args) { FizzBuzz f = new FizzBuzz(); }

    /**
     * If x is a multiple of 3, print "fizz"
     * If x is a multiple of 5, print "buzz"
     * If x is a multiple of both 3 and 5, print "fizzbuzz"
     */
    public void FizzBuzz() {
        for(int i=1; i<=100; i++) {
            if(i%3==0 && i%5==0) { System.out.println("FizzBuzz"); }
            else if(i%3==0) { System.out.println("Fizz"); }
            else if(i%5==0) { System.out.println("Buzz"); }
            else { System.out.println(i); }
        }
    }

    public void FBImproved() {
        switch(num) {
            case (num % 3 == 0 && num % 5 == 0) { System.out::print("FizzBuzz") }
            case (num % 3 == 0) { System.out::print("Fizz") }
            case (num % 5 == 0) { System.out::print("Buzz") }
            default { System.out::print(i); }
        }
    }
}
