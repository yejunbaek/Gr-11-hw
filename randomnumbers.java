import java.util.Random;
import java.util.Scanner;

public class randomnumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        // 1
        System.out.println(rand.nextInt(25) + 25);
        // 2
        System.out.println("Enter a number: ");
        int userinput = input.nextInt();
        System.out.println("Enter a second number: ");
        int userinput2 = input.nextInt();
        System.out.println(rand.nextInt(userinput2) + userinput);
        // 3
        System.out.println((rand.nextInt(15) + 1) + " " + (rand.nextInt(15) + 1) + " " + (rand.nextInt(15) + 1) + " "
                + (rand.nextInt(15) + 1) + " " + (rand.nextInt(15) + 1) + " ");
        System.out.println((rand.nextInt(30) + 16) + " " + (rand.nextInt(30) + 16) + " " + (rand.nextInt(30) + 16) + " "
                + (rand.nextInt(30) + 16) + " " + (rand.nextInt(30) + 16));
        System.out.println((rand.nextInt(45) + 31) + " " + (rand.nextInt(45) + 31) + " " + (rand.nextInt(45) + 31) + " "
                + (rand.nextInt(45) + 31) + " " + (rand.nextInt(45) + 31) + " ");
        System.out.println((rand.nextInt(60) + 46) + " " + (rand.nextInt(60) + 46) + " " + (rand.nextInt(60) + 46) + " "
                + (rand.nextInt(60) + 46) + " " + (rand.nextInt(60) + 46) + " ");
        System.out.println((rand.nextInt(75) + 61) + " " + (rand.nextInt(75) + 61) + " " + (rand.nextInt(75) + 61) + " "
                + (rand.nextInt(75) + 61) + " " + (rand.nextInt(75) + 61 + " "));
    }
}
