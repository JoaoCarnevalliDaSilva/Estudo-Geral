public class ex6ProdutoDigital extends ex6Produto{
    private double descontoPromocional;
    public ex6ProdutoDigital(String n, double pb, double dp){super(n, pb);this.descontoPromocional=dp;}
    public double getDescontoPromocional(){return this.descontoPromocional;}
    public void setDescontoPromocional(double dp){this.descontoPromocional=dp;}
    @Override
    double calcularPrecoFinal() {
        return this.getPrecoBase()-this.getDescontoPromocional();
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Desconto: "+this.getDescontoPromocional());
        System.out.println("Valor Final: "+calcularPrecoFinal());
    }
}
