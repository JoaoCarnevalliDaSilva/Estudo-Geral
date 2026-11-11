public class ex6ProdutoFisico extends ex6Produto{
    private double taxaFrete;
    public ex6ProdutoFisico(String n, double pb, double tx){super(n, pb);this.taxaFrete=tx;}
    public double getTaxaFrete(){return this.taxaFrete;}
    public void setTaxaFrete(double tx){this.taxaFrete=tx;}
    @Override
    double calcularPrecoFinal() {
        return this.getPrecoBase()+this.getTaxaFrete();
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Valor Frete: "+this.getTaxaFrete());
        System.out.println("Valor Final: "+calcularPrecoFinal());
    }
}
