public class ex4Pagamento {
    private double valor;
    public ex4Pagamento(double v) {this.valor=v;}
    public double getValor(){return this.valor;}
    public void setValor(double v) {this.valor=v;}
    public void processarPagamento(){
        System.out.println("Processando pagamento no valor de R$: "+this.getValor());
    }
}
