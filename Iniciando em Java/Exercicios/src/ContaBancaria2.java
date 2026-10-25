public class ContaBancaria2 {
    //criar os atributos
    private String titular;
    private double saldo;
    private double limite;
    //criar os elementos inicializadores
    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String nome) {
        this.titular=nome;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double valor) {
        this.saldo=valor;
    }
    public double getLimite(){
        return this.saldo;
    }
    public void setLimite(double limite) {
        if(limite <= 0) {
            System.out.println("Erro. Valor deve ser positivo");
        } else {
            this.limite=limite;
        }
    }
    //criar os elementos de acao
    public void depositar(double valor) {
        if(valor <= 0) {
            System.out.println("Erro. Valor deve ser positivo");
        } else {
            this.saldo+=valor;
        }
    }
    public void sacar(double valor){
        if(valor > (this.saldo+this.limite)){
            System.out.println("Erro. Saldo insuficiente");
        } else {
            this.saldo-=valor;
        }
    }
    public void exibirExtrato() {
        System.out.println("INFORMACOES BANCARIAS");
        System.out.println("=====================");
        System.out.println("Titular: "+getTitular());
        System.out.println("Saldo Bancario: "+getSaldo());
        System.out.println("Limite: "+getLimite());
    }
}
