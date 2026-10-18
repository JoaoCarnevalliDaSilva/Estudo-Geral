public class Caneta2 {
    //Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    //Metodos
    public void status() {
        System.out.println("O modelo da caneta eh: " + this.modelo);
        System.out.println("Uma caneta da cor: " + this.cor);
        System.out.println("A ponta da caneta eh: "+this.ponta);
        System.out.println("A carga da caneta atualmente eh: "+this.carga);
        System.out.println("Esta tampada? "+this.tampada);
    }

    public void rabiscar() {
        if(this.tampada==true) {
            System.out.println("Erro, nao posso rabiscar. Caneta esta fechada");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar() {
        this.tampada=true; //this é utilizado para chamar o objeto que utilizou a função, no caso c1
    }

    public void destampar() {
        this.tampada=false;
    }
}
