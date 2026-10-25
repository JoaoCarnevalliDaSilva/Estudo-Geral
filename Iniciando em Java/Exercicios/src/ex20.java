import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Elevador2 novoElevador = new Elevador2();
        novoElevador.inicializar(4,8);
        novoElevador.entrar();
        novoElevador.subir();
        novoElevador.descer();
        novoElevador.status();
        scanner.close();
    }
}