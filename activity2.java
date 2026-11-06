import java.util.Scanner;

public class activity2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double base = ler.nextDouble();
        double altura = ler.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}