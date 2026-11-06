import java.util.Scanner;

public class activity10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int total = ler.nextInt();

        int horas = total / 3600;
        int minutos = (total % 3600) / 60;
        int segundos = total % 60;

        System.out.println(horas + "h " + minutos + "min " + segundos + "s");
    }
}