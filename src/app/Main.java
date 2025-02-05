package app;

import java.util.Scanner;

public class Main {
    static double fahrenheits;
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("""
                Convert app!
                Version 1.0;
                I can convert only from Fahrenheit to Celsius!""");
        fahrenheits = getInput("Fahrenheit: ");
getOutput("Fahrenheit", "Celsius", convertFromFahrenheitToCelsius());
    }

    private static double convertFromFahrenheitToCelsius() {
        return ((fahrenheits - 32) * 5) / 9 ;
    }
    private static double getInput(String input){
        System.out.print("Input " + input);
        return scanner.nextDouble();
    }
    private static void getOutput(String convertFrom, String convertTo, double result){
        System.out.printf("Result of converting from %s to %s is %.2f %s",convertFrom, convertTo, result, convertTo);
    }
}
