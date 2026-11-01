public class Livro2 {
    //criar os atributos
    private String titulo;
    private String autor;
    private int paginas;
    private boolean lido;

    //criar o construtor
    public Livro2(String tituloPadrao ,String autorPadrao, int paginasPadrao) {
        this.titulo = tituloPadrao;
        this.autor = autorPadrao;
        this.paginas = paginasPadrao;
    }

    //criar os metodos de inicializacao
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPaginas() {
        return this.paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    //criar os metodos de acao

    public void lerLivro() {
        this.lido = true;
    }

    public void exibirStatus() {
        System.out.println("STATUS DO LIVRO");
        System.out.println("================");
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Numero de paginas: "+this.getPaginas());
        System.out.println("Leu?: "+this.lido);
    }

}
