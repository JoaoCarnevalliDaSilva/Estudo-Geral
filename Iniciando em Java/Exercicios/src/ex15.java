import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Televisao novaTV = new Televisao();
        novaTV.marca = "LG";
        novaTV.mudarCanal(5);
        novaTV.ligar();
        novaTV.aumentarVolume();
        novaTV.aumentarVolume();
        novaTV.mudarCanal(12);
        novaTV.status();

        scanner.close();
    }
}