public class ex4PagamentoBoleto extends ex4Pagamento{
    private int codigoBarras;
    public ex4PagamentoBoleto(double v, int c) {super(v); this.codigoBarras=c;}
    public int getCodigoBarras(){return this.codigoBarras;}
    public void setCodigoBarras(int c){this.codigoBarras=c;}

    @Override
    public void processarPagamento() {
        System.out.println("Gerando boleto bancario no valor de R$: "+this.getValor()+
                " . Codigo de barras: "+this.getCodigoBarras());
    }
}
