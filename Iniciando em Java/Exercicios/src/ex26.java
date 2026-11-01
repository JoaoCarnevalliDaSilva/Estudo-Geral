import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Livro2 novoLivro = new Livro2("Harry Potter", "Joao", 500);
        novoLivro.lerLivro();
        novoLivro.exibirStatus();

    }
}