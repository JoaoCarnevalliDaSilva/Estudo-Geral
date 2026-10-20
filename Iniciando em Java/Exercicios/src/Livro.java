public class Livro {

    // criar os atributos
    public String titulo;
    public String autor;
    private int totalPaginas;
    private int paginaAtual;

    // criar os metodos
    public void abrirLivro(int numeroPaginas) {
        this.totalPaginas = numeroPaginas;
        this.paginaAtual = 1;
    }

    public void avancarPaginas() {
        if(this.paginaAtual >= this.totalPaginas ) {
           System.out.println("Nao ha mais paginas no livro");
        } else {
            this.paginaAtual += 1;
        }
    }

    public void folhear(int pagina) {
        if(pagina > this.totalPaginas || pagina <= 0) {
            System.out.println("Numero de pagina nao encontrado");
        } else {
            this.paginaAtual = pagina;
        }
    }

    public void status() {
        System.out.println("INFORMACOES DO LIVRO:");
        System.out.println("=====================");
        System.out.println("O titulo eh: "+this.titulo);
        System.out.println("O autor eh: "+this.autor);
        System.out.println("Total de paginas: "+this.totalPaginas);
        System.out.println("Leitor parou na pagina: "+this.paginaAtual);
    }
}
