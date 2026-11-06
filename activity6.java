import java.util.Scanner;

public class activity6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a = ler.nextInt();
        int b = elr.nextInt();

        System.out.println("Antes: a = " + a + ", b = " + b);

        int aux = a;
        a = b;
        b = aux;

        System.out.println("Depois: a = " + a + ", b = " + b);
    }
}