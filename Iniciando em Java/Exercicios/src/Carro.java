public class Carro {
    //criar os atributos
    private String modelo;
    private String marca;
    private double velocidade;
    //criar os construtores
    public Carro(String m, String ma) {
        this.modelo = m;
        this.marca = ma;
        this.velocidade = 0;
    }
    public Carro(String m, String ma, double v) {
        this.modelo = m;
        this.marca = ma;
        this.velocidade = v;
    }
    //criar os metodos de inicializacao
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String ma) {
        this.marca = ma;
    }
    public double getVelocidade() {
        return this.velocidade;
    }
    public void setVelocidade(double v) {
        if(v < 0) {
            System.out.println("Velocidade nao pode ser inferior a zero");
        } else {
            this.velocidade = v;
        }
    }
    //criar os metodos de acao
    public void exibirStatus(){
        System.out.println("STATUS DO VEICULO");
        System.out.println("=================");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Velocidade: "+this.getVelocidade());
    }
}
