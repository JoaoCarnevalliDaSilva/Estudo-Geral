public class Lampada {

    // criar os atributos

    public String marca;
    public String tipo;
    private boolean ligada;

    // criar os metodos

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void observar() {
        if(this.ligada == true){
            System.out.println("A lampada esta acessa");
        } else {
            System.out.println("A lampada esta apagada");
        }
    }

    public void mudarEstado() {
        if(this.ligada == true){
            this.ligada = false;
            System.out.println("A lampada estava acessa, agora esta apagada");
        } else {
            this.ligada = true;
            System.out.println("A lampada estava apagada, agora esta acessa");
        }
    }
}
