import java.util.Scanner;

public class activity11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        int compra = entrada.nextInt();

        System.out.print("Digite o valor pago: ");
        int pago = entrada.nextInt();

        int troco = pago - compra;

        System.out.println("\nTroco: R$ " + troco);

        int notas50 = troco / 50;
        troco = troco % 50;

        int notas20 = troco / 20;
        troco = troco % 20;

        int notas10 = troco / 10;
        troco = troco % 10;

        int notas5 = troco / 5;
        troco = troco % 5;

        int notas2 = troco / 2;
        troco = troco % 2;

        int moedas1 = troco;

        System.out.println("Notas de R$ 50: " + notas50);
        System.out.println("Notas de R$ 20: " + notas20);
        System.out.println("Notas de R$ 10: " + notas10);
        System.out.println("Notas de R$ 5: " + notas5);
        System.out.println("Notas de R$ 2: " + notas2);
        System.out.println("Moedas de R$ 1: " + moedas1);

        entrada.close();
    }
}