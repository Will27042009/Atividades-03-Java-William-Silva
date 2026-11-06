import java.util.Scanner;

public class activity9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double distancia = ler.nextDouble();
        double litros = ler.nextDouble();
        double precoLitro = ler.nextDouble();

        double consumo = distancia / litros;
        double custo = litros * precoLitro;

        System.out.println("Consumo: " + consumo + " km/l");
        System.out.println("Custo: " + custo);
    }
}