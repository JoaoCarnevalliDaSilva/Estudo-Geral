import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Lampada novaLampada = new Lampada();
        novaLampada.marca = "Phillips";
        novaLampada.tipo = "Area Externa";
        novaLampada.desligar();
        novaLampada.observar();
        novaLampada.mudarEstado();
        novaLampada.observar();

        scanner.close();
    }
}