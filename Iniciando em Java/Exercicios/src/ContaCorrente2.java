public class ContaCorrente2 {

    // criar os atributos
    private String titular;
    private double saldo = 0.00;
    private double limite = 0.00;
    private boolean especial;

    //criar os elementos
    public String getTitular() {
        return this.titular;
    }
    public void setTitular(String Titular) {
        this.titular = Titular;
    }
    public double getLimite() {
        return this.limite;
    }
    public void setLimite(double Limite) {
        this.limite = Limite;
        this.especial = true;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public boolean isEspecial() {
        return this.especial;
    }
    public void depositar(double valor) {
        if(valor>0) {
            this.saldo += valor;
        }
    }
    public void sacar(double valor) {
        if(valor <= (this.saldo+this.limite)) {
            this.saldo -= valor;
        }
    }
    public void exibirSaldo() {
        System.out.println("INFORMACOES BANCARIAS");
        System.out.println("=====================");
        System.out.println("Titular: "+getTitular());
        System.out.println("Especial: "+isEspecial());
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Limite: "+getLimite());
    }

}
