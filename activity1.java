import java.util.Scanner;

public class activity1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a = ler.nextInt();
        int b = ler.nextInt();

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtracao: " + (a - b));
        System.out.println("Multiplicacao: " + (a * b));
        System.out.println("Divisao: " + ((double) a / b));
    }
}