
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean again = true;

    do {
        int die1 = rnd.nextInt(6)+1;
        int die2 = rnd.nextInt(6)+1;
        int sum = die1 + die2;

        System.out.println("Die 1:" + die1);
        System.out.println("Die 2:" + die2);
        System.out.println("Sum:" + sum);

        if (sum == 2 || sum == 3 || sum == 12)  {
            System.out.println("You crapped out with a " + sum + ", meaning you lost!");

        } else if (sum == 7 || sum == 11) {
            System.out.println( "You got a natural with a " + sum + ", meaning you won!");

        } else {
            int point = sum;
            System.out.println("The point is " + sum);
            boolean pointRoll = true;

            while (pointRoll) {
                int pdie1 = rnd.nextInt(6)+1;
                int pdie2 = rnd.nextInt(6)+1;
                int psum = pdie1 + pdie2;
                System.out.println("point: " + point);

                System.out.println("Die 1:" + pdie1);
                System.out.println("Die 2:" + pdie2);
                System.out.println("Sum:" + psum);

                if (psum == point)  {
                    System.out.println("You got the point " + point + ", meaning you won!");
                    pointRoll = false;

                } else if (psum == 7) {
                    System.out.println( "You got a 7 before your point, meaning you lost!");
                    pointRoll = false;
                }
                else {
                    System.out.println( "You got a " + psum + ", rerolling now!");
                }
            }
        }

    System.out.println("Type 'Y' to play again");
    String response = in.nextLine();
        if (response.equals("Y") || response.equals("y")) {
            again = true;
        } else {
            again = false;
        }



    } while (again);


    }
}