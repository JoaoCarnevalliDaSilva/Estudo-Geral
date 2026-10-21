public class ContaCorrente {

    // criar os elementos
    public String titular;
    private double saldo = 0.00;
    private double limite;

    // criar os metodos
    public void definirLimites(double valor) {
        this.limite = valor;
    }
    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
        }
    }
    public void sacar(double valor) {
        if(this.saldo + this.limite >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo indisponivel. Saldo disponivel atualmente eh: "+(this.saldo+this.limite));
        }
    }
    public void exibirSaldo() {
        System.out.println("SALDO DA CONTA");
        System.out.println("==============");
        System.out.println("Saldo atual: "+this.saldo);
        System.out.println("Limite: "+this.limite);
        System.out.println("Saldo total: "+(this.saldo+this.limite));
    }

}
