import java.util.Scanner;

public class activity7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double preco = ler.nextDouble();
        double porcentagem = ler.nextDouble();

        double desconto = preco * porcentagem / 100;
        double finalPreco = preco - desconto;

        System.out.println("Desconto: " + desconto);
        System.out.println("Preco final: " + finalPreco);
    }
}