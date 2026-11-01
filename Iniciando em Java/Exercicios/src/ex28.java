import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Carro novoCarro1 = new Carro("SUV", "Chevrolet");
        Carro novoCarro2 = new Carro("Picape", "Ford", 100);
        novoCarro1.exibirStatus();
        novoCarro2.exibirStatus();
    }
}