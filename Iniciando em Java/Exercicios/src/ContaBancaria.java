public class ContaBancaria {
    // criar os atributos
    public String titular;
    private double saldo;
    private boolean status; // inicia como false por padrão do Java

    //criar os metodos
    public void abrirConta() {
        this.status=true;
        System.out.println("Conta aberta com sucesso. Bem vindo ao sistema " + this.titular);
    }

    public void depositar(double valor) {
        if(this.status=true) {
            this.saldo += valor;
            System.out.printf("Deposito de %.2f realizado;%n", valor);
        } else {
            System.out.println("ERRO: Conta esta fechada para receber depositos.");
        }
    }

    public void sacar(double valor) {
        // Regra de negócio: conta precisa estar aberta E ter saldo suficiente
        if (this.status == false) {
            System.out.println("ERRO: Nao eh possivel sacar de uma conta fechada!");
        } else if (valor > this.saldo) {
            System.out.println("ERRO: Saldo insuficiente para realizar o saque de R$ " + valor);
        } else {
            this.saldo -= valor; // Subtrai o valor do saldo atual
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        }
    }

    // Ação 4: Exibir o resumo da conta
    public void exibirExtrato() {
        System.out.println("\n--- EXTRATO BANCARIO ---");
        System.out.println("Titular: " + this.titular);
        System.out.println("Conta Ativa? " + this.status);
        System.out.printf("Saldo Atual: R$ %.2f%n", this.saldo);
        System.out.println("------------------------\n");
    }
}



