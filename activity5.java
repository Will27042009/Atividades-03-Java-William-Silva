import java.util.Scanner;

public class activity5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double c = ler.nextDouble();

        double f = c * 9 / 5 + 32;
        double k = c + 273.15;

        System.out.println("Fahrenheit: " + f);
        System.out.println("Kelvin: " + k);
    }
}