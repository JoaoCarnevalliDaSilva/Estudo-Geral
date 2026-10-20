public class Televisao {

    // criar os atributos
    public String marca;
    private int canal = 1;
    private int voluma = 10;
    private boolean ligada;

    // crias os metodos

    public void ligar() {
        this.ligada = true;
    }

    public void aumentarVolume() {
        if (this.ligada == true && this.voluma <= 100) {
            this.voluma += 1;
        } else {
            System.out.println("Erro, função indisponivel");
        }
    }

    public void mudarCanal(int novoCanal) {
        if(this.ligada==true && this.canal > 0) {
            this.canal = novoCanal;
        } else {
            System.out.println("Erro");
        }
    }

    public void status() {
        System.out.println("STATUS DA TELEVISAO:");
        System.out.println("====================");
        System.out.println("Marca: "+this.marca);
        System.out.println("Status: "+this.ligada);
        System.out.println("Canal: "+this.canal);
        System.out.println("Volume: "+this.voluma);
    }


}
