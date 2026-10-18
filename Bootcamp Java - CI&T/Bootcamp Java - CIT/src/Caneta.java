public class Caneta {
    //Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    //Metodos
    void status() {
        System.out.println("O modelo da caneta eh: " + this.modelo);
        System.out.println("Uma caneta da cor: " + this.cor);
        System.out.println("A ponta da caneta eh: "+this.ponta);
        System.out.println("A carga da caneta atualmente eh: "+this.carga);
        System.out.println("Esta tampada? "+this.tampada);
    }

    void rabiscar() {
        if(this.tampada==true) {
            System.out.println("Erro, nao posso rabiscar. Caneta esta fechada");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    void tampar() {
        this.tampada=true; //this é utilizado para chamar o objeto que utilizou a função, no caso c1
    }

    void destampar() {
        this.tampada=false;
    }
}
