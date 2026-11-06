import java.util.Scanner;

public class activity3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1 = ler.nextDouble();
        double n2 = ler.nextDouble();
        double n3 = ler.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("Media: " + media);
    }
}