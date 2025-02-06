package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static double fahrenheits;
    static double celsius;
    private static final String FINAL_MSG = "Thank you for using! Come back soon!!";
    static Scanner scanner = new Scanner(System.in);
    static int choice;

    public static void main(String[] args) {
        System.out.println("""
                Convert app!
                Version 1.0;
                I can convert from Fahrenheit to Celsius and  from Celsius to Fahrenheit!
                
                Choose option:
                1 - convert  from Fahrenheit to Celsius
                2 - convert from Celsius to Fahrenheit
                3 - exit
                """);
        try {
                System.out.print("Input number of operation and i will do it: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> {
                        fahrenheits = getInput("Fahrenheit: ");
                        getOutput("Fahrenheit", "Celsius", convertFromFahrenheitToCelsius());
                    }
                    case 2 -> {
                        celsius = getInput("Celsius: ");
                        getOutput("Celsius", "Fahrenheit", convertFromCelsiusToFahrenheit());
                    }
                    case 3 -> System.out.println(FINAL_MSG);
                    default -> System.out.print("I am really sorry, but you input invalid value!!");
                }
            //посмотрел InputMismatchException во время выполнения кода, вызывая ошибку намеренно
        } catch (InputMismatchException e) {
            System.out.println("Error - your input not a number!!");
        }

    }

    private static double convertFromFahrenheitToCelsius() {
        return ((fahrenheits - 32) * 5) / 9;
    }

    private static double convertFromCelsiusToFahrenheit() {
        return ((celsius * 9) / 5) + 32;
    }

    private static double getInput(String input) {
        System.out.print("Input " + input);
        return scanner.nextDouble();
    }

    private static void getOutput(String convertFrom, String convertTo, double result) {
        System.out.printf("Result of converting from %s to %s is %.2f %s\n", convertFrom, convertTo, result, convertTo);
    }

}
