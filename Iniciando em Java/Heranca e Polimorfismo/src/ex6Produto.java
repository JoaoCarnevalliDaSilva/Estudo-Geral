abstract class ex6Produto {
    private String name;
    private double precoBase;
    public ex6Produto(String n, double pb){this.name=n;this.precoBase=pb;}
    public String getName(){return this.name;}
    public void setName(String n){this.name=n;}
    public double getPrecoBase(){return this.precoBase;}
    public void setPrecoBase(double pb){this.precoBase=pb;}
    abstract double calcularPrecoFinal();
    public void exibirDetalhes(){
        System.out.println("INFORMACOES GERAIS");
        System.out.println("------------------");
        System.out.println("Produto: "+this.getName());
        System.out.println("Valor: "+this.getPrecoBase());
    }
}
