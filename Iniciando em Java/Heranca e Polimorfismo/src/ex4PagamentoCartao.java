public class ex4PagamentoCartao extends ex4Pagamento{
    private int numeroCartao;
    public ex4PagamentoCartao(double v, int n) {super(v); this.numeroCartao=n;}
    public int getNumeroCartao() {return this.numeroCartao;}
    public void setNumeroCartao(int n) {this.numeroCartao=n;}
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via cartao de credito no valor de R$"+this.getValor()
                +" . Numero do cartao: "+this.getNumeroCartao());
    }
}
