public class ArCondicionado {

    // criar os atributos
    public String marca;
    private int temperatura = 20;
    private boolean ligada; //inicia em false por padrao

    // criar os elementos
    public void ligar() {
        this.ligada = true;
    }
    public void desligado() {
        this.ligada = false;
    }
    public void aumentarTemperatura() {
        if (this.ligada && this.temperatura < 30) {
            this.temperatura += 1;
        } else {
            System.out.println("Erro.");
        }
    }
    public void diminuirTemperatura() {
        if (this.ligada && this.temperatura > 16) {
            this.temperatura -= 1;
        } else {
            System.out.println("Erro.");
        }
    }
    public void status() {
        System.out.println("STATUS GERAL DO AR CONDICIONADO");
        System.out.println("================================");
        System.out.println("Marca: "+this.marca);
        System.out.println("Estado: "+this.ligada);
        System.out.println("Temperatura: "+this.temperatura);
    }

}
