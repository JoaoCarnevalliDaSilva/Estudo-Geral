import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Livro novoLivro = new Livro();
        novoLivro.titulo = "Harry Potter";
        novoLivro.autor = "Lula";
        novoLivro.abrirLivro(200);
        novoLivro.avancarPaginas();
        novoLivro.folhear(250);
        novoLivro.status();

        scanner.close();
    }
}