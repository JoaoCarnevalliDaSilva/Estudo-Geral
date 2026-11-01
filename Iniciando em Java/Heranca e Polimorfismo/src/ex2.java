import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ex2Carro novoCarro = new Ex2Carro("Chevrolet", "SUV", 4);
        novoCarro.ligarArCondicionado();
        novoCarro.exibir();

        System.out.println("--------------------");

        Ex2Moto novaMoto = new Ex2Moto("Honda", "CG", true);
        novaMoto.empinar();
        novaMoto.exibir();

    }
}