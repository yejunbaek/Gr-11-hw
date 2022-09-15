
/*
Student: Joseph Baek
Teacher: Ms. Katsman
Course: ICS3U
Description: Getting how many chairs and tables they bought and how much they cost from the user
and calculating how much they would cost with tax.
*/
import java.util.Scanner;
import java.text.NumberFormat;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        double pricechair, pricetable, totalpricechair, totalpricetable, totalprice, tax, finalamount,
                useramount = 1000;
        int amountchair, amounttable;
        System.out.println(
                "Welcome, this program will calculate how much the chairs and tables would cost when given an amount. You have a $1000 with you");
        tax = 0.13;
        System.out.println("How much do the chairs cost?: ");
        pricechair = input.nextDouble();
        System.out.println("How many chairs did you buy?: ");
        amountchair = input.nextInt();
        System.out.println("How much do the tables cost?: ");
        pricetable = input.nextDouble();
        System.out.println("How many tables did you buy?: ");
        amounttable = input.nextInt();

        totalpricechair = pricechair * amountchair;
        totalpricetable = pricetable * amounttable;
        totalprice = totalpricechair + totalpricetable;
        finalamount = totalprice + (totalprice * tax);
        useramount -= finalamount;

        System.out.println("\nReceipt:");
        System.out.println("Total amount of chairs: " + amountchair);
        System.out.println("Total amount of tables: " + amounttable);
        System.out.println("Cost (without tax): " + money.format(totalprice));
        System.out.println("Total amount (with tax): " + money.format(finalamount));

        System.out.println("\nAfter giving $1000, you have " + money.format(useramount) + " left.");
        System.out.println("Thank you and goodbye.");
    }
}
