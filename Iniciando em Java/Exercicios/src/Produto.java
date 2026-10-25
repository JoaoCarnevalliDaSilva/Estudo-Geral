public class Produto {
    //criar os atributos
    private String name;
    private double preco;
    private int quantidadeEstoque;
    //criar os elementos de inicialização
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        if(preco<=0) {
            System.out.println("Erro. Valor nao pode ser negativo ou zero");
        } else {
            this.preco=preco;
        }
    }
    public int getQuantidadeEstoque(){
        return this.quantidadeEstoque;
    }
    public void setQuantidadeEstoque(int qtd) {
        if(qtd<0) {
            System.out.println("Estoque nao pode ser negativo");
        } else {
            this.quantidadeEstoque=qtd;
        }
    }
    //criar os elementos de acao
    public void adicionarEstoque(int qtd) {
        this.quantidadeEstoque += qtd;
    }
    public void removerEstoque(int qtd) {
        this.quantidadeEstoque -= qtd;
    }
    public void exibirDetalhes() {
        System.out.println("INFORMACOES DE ESTOQUE:");
        System.out.println("=======================");
        System.out.println("Nome: "+this.getName());
        System.out.println("Preco: "+this.getPreco());
        System.out.println("Quantidade: "+this.getQuantidadeEstoque());
    }
}
