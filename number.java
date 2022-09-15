import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        // 1
        int area;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        area = input.nextInt();
        System.out.println("Input a second number: ");
        area = area * input.nextInt();
        System.out.println("the area is " + area);
        // 2
        double average, numbers;
        System.out.println("Input a number: ");
        numbers = input.nextInt();
        System.out.println("Input a second number: ");
        numbers = numbers + input.nextInt();
        System.out.println("Input a third number: ");
        numbers = numbers + input.nextInt();
        System.out.println("Input a fourth number: ");
        numbers = numbers + input.nextInt();
        average = numbers / 4;
        System.out.println("The average is: " + average);
        // 3
        double fahrenheit, celsius;
        System.out.println("Input the temperature (fahrenheit): ");
        fahrenheit = input.nextInt();
        System.out.println("Input the temperature (celsius): ");
        celsius = input.nextInt();
        fahrenheit -= 32;
        fahrenheit = fahrenheit * (0.55);
        fahrenheit = (int) fahrenheit;
        celsius = celsius * (1.8);
        celsius += 32;
        celsius = (int) celsius;
        System.out.println("Celsius -> Fahrenheit: " + celsius);
        System.out.println("Fahrenheit -> Celsuis: " + fahrenheit);
        // 4

        // 5
        int useirnput;
        System.out.println("Input a 2 digit number: ");
        useirnput = input.nextInt();
        int number2 = useirnput % 10;
        int number3 = useirnput / 10;
        System.out.println("Ones: " + number2);
        System.out.println("Tens: " + number3);

    }

}
