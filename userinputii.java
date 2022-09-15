import java.util.Scanner;
import java.text.NumberFormat;

public class userinputii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat number = NumberFormat.getIntegerInstance();
        // 2
        int userinput, userinput2;
        System.out.println("Enter First Integer: ");
        userinput = input.nextInt();
        System.out.println("Enter Second Integer: ");
        userinput2 = input.nextInt();
        System.out.println(userinput + " / " + userinput2 + " = " + (userinput / userinput2));
        System.out.println(userinput + " % " + userinput2 + " = " + (userinput % userinput2));
        System.out.println(userinput2 + " / " + userinput + " = " + (userinput2 / userinput));
        System.out.println(userinput2 + " % " + userinput + " = " + (userinput2 % userinput));
        // 3
        int height, time;
        double equation;
        System.out.println("Enter a starting height: ");
        height = input.nextInt();
        System.out.println("Enter a time in seconds: ");
        time = input.nextInt();
        equation = height - 4.9 * (time * time);
        System.out.println("The height of the object is " + equation);

        // 4
        int birthdate, birthdate2, birthdate3, today, today2, today3, year, month, day, sleep;
        System.out.println("Enter birthdate: ");
        System.out.println("Year: ");
        birthdate = input.nextInt();
        System.out.println("Month: ");
        birthdate2 = input.nextInt();
        System.out.println("Day: ");
        birthdate3 = input.nextInt();
        System.out.println("Enter today's date: ");
        System.out.println("Year: ");
        today = input.nextInt();
        System.out.println("Month: ");
        today2 = input.nextInt();
        System.out.println("Day: ");
        today3 = input.nextInt();
        System.out.println("How many hours of sleep do you get per night: ");
        sleep = input.nextInt();
        year = today - birthdate;
        month = today2 - birthdate2;
        day = today3 - birthdate3;
        year = (365 * sleep * year);
        month = (30 * sleep * month);
        day = (24 * sleep);
        year = year + month + day;
        /*
         * year = sleep * 30 * 12 * year;
         * month = sleep * 30 * month;
         * day = sleep * day;
         * year = year + month + day;
         */
        System.out.println("You have slept for " + number.format(year) + " hours.");

    }

}
