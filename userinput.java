import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 2
        // 3
        double userinput, foot, inches;
        System.out.println("Length(cm): ");
        userinput = input.nextInt();
        foot = userinput / 30.48;
        inches = userinput / 2.54;
        System.out.println("Cm - Inch: " + (int) inches + " inches");
        System.out.println("Cm - Foot: " + (int) foot + " feet");
        // 4
        int coins, quarters = 25, dimes = 10, nickles = 5, pennies = 1, amount;
        System.out.println("Enter the change in cents: ");
        coins = input.nextInt();
        System.out.println("The minimun number of coins is: ");
        amount = coins;
        coins = coins / quarters;
        System.out.println("Quarters: " + coins);
        coins = amount - coins * quarters;
        amount = coins;
        quarters = coins;
        coins = coins / dimes;
        System.out.println("Dimes: " + coins);
        coins = amount - coins * dimes;
        amount = coins;
        dimes = coins;
        coins = coins / nickles;
        System.out.println("Nickels: " + coins);
        coins = amount - coins * nickles;
        amount = coins;
        nickles = coins;
        coins = coins / pennies;
        System.out.println("Pennies: " + coins);
        coins = amount - coins * pennies;
        amount = coins;
        pennies = coins;

    }

}
