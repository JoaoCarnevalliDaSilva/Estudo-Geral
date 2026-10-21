import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Elevador novoElevador = new Elevador();
        novoElevador.inicializar(5, 10);
        novoElevador.entrar();
        novoElevador.entrar();
        novoElevador.entrar();
        novoElevador.entrar();
        novoElevador.entrar();
        novoElevador.entrar();
        novoElevador.sair();
        novoElevador.descer();
        novoElevador.descer();
        novoElevador.descer();


        scanner.close();
    }
}