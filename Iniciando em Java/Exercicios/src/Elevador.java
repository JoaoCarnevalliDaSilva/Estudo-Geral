public class Elevador {
    // criar os atributos
    private int andarAtual = 0;
    private int totalAndares = 0;
    private int capacidade = 0;
    private int pessoasPresentes = 0;
    // criar os elementos
    public void inicializar(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }
    public void entrar() {
        if(this.pessoasPresentes < this.capacidade) {
            this.pessoasPresentes += 1;
            System.out.println("Entrada permitida. Capacidade atual: "+this.pessoasPresentes);
        } else {
            System.out.println("Desculpe, o elevador esta cheio.");
        }
    }
    public void sair() {
        if(this.pessoasPresentes > 0) {
            this.pessoasPresentes -= 1;
            System.out.println("Saida. Capacidade atual: "+this.pessoasPresentes);
        }
    }
    public void subir() {
        if(this.andarAtual < this.totalAndares) {
            this.andarAtual += 1;
            System.out.println("Descendo. Andar atual: "+this.andarAtual);
        } else {
            System.out.println("Nao eh possivel subir. Andar atual: "+this.andarAtual);
        }
    }
    public void descer() {
        if(this.andarAtual > 0 ) {
            this.andarAtual -= 1;
            System.out.println("Descendo. Andar atual: "+this.andarAtual);
        } else {
            System.out.println("Nao eh possivel descer. Andar atual: "+this.andarAtual);
        }
    }
    public void status() {
        System.out.println("STATUS DO ELEVADOR");
        System.out.println("==================");
        System.out.println("Andar Atual: "+this.andarAtual);
        System.out.println("Total de Andares: "+this.totalAndares);
        System.out.println("Pessoas no elevador: "+this.pessoasPresentes);
        System.out.println("Capacidade Maxima: "+this.capacidade);
    }
}
