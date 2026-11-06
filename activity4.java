import java.util.Scanner;

public class activity4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1 = ler.nextDouble();
        double n2 = ler.nextDouble();
        double n3 = ler.nextDouble();

        double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

        System.out.println("Media ponderada: " + media);
    }
}