import java.util.Random;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int p = rand.nextInt(200);

        int n = rand.nextInt(p);
        n += 1;

        System.out.println("Try to guess my number: ");
        int x = input.nextInt();
        if (x > n) {
            System.out.println("Number out of range.");
            System.out.println("Try to guess my number: ");
            x = input.nextInt();
        }
        while (x != n) {
            if (x < n) {
                System.out.println("Too low, try again");
                System.out.println("Try a number: ");
                x = input.nextInt();
            } else {
                System.out.println("Too high, try again");
                System.out.println("Try a number: ");
                x = input.nextInt();
            }
        }
        if (x == n) {
            System.out.println("You found it. Congrats!");
        }
    }
}
