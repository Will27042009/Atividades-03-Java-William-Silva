import java.util.Scanner;

public class activity8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double capital = ler.nextDouble();
        double taxa = ler.nextDouble();
        int meses = ler.nextInt();

        double juros = capital * taxa / 100 * meses;
        double montante = capital + juros;

        System.out.println("Juros: " + juros);
        System.out.println("Montante: " + montante);
    }
}