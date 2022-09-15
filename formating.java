import java.text.NumberFormat;
import java.util.Scanner;

public class formating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();
        double Designing, Coding, debugging, Testing, total;
        System.out.println("Enter the number of minutes you spend on: ");
        System.out.println("Designing: ");
        Designing = input.nextInt();
        System.out.println("Coding: ");
        Coding = input.nextInt();
        System.out.println("Debugging: ");
        debugging = input.nextInt();
        System.out.println("Testing: ");
        Testing = input.nextInt();
        total = Designing + Coding + debugging + Testing;
        Designing = Designing / total;
        Coding = Coding / total;
        debugging = debugging / total;
        Testing = Testing / total;
        System.out.println("\nTask: ");
        System.out.println("Designing: " + percent.format(Designing));
        System.out.println("Coding: " + percent.format(Coding));
        System.out.println("Debugging: " + percent.format(debugging));
        System.out.println("Testing: " + percent.format(Testing));
    }
}
