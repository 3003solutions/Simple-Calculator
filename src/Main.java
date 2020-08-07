// Author Shahriar Khalighi -- 08/06/2020 -- Simple Calculator using switch statement.
import java.util.*;

public class Main {

    public static void main(String []args){

        Scanner Shawn = new Scanner(System.in);

        double fnum, snum;

        int symbol;

        String answer = "";

        System.out.println("Enter first number");

        fnum = Shawn.nextDouble();

        System.out.println("Enter second number");

        snum = Shawn.nextDouble();

        System.out.println("Press 1 to add, 2 to subtract and 3 to divide");

        symbol = Shawn.nextInt();

        switch(symbol){

            case 1:

                System.out.println("Your answer is " + (fnum + snum));

                break;

            case 2:

                System.out.println("Your answer is " + (fnum - snum));

                break;

            case 3:

                System.out.println("Your answer is " + (fnum / snum));

                break;

            default:

                System.out.println("Next time enter 1,2,3 for addition,subtraction or to divide");

                break;

        }
    }
}
