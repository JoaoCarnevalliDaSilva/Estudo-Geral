import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ex1Gerente novoGerente = new Ex1Gerente("Carlos", 10000, "caju");
        novoGerente.exibirStatus();
        novoGerente.login();

        System.out.println("-------------------");

        Ex1Programador novoProgramador = new Ex1Programador("Marcelo", 4000, "Java");
        novoProgramador.exibirStatus();
        novoProgramador.codar();
    }
}