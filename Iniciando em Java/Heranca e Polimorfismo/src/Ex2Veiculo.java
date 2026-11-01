public class Ex2Veiculo {
    private String marca;
    private String modelo;

    public Ex2Veiculo (String ma, String mo) {
        this.marca = ma;
        this.modelo = mo;
    }

    public String getMarca(){return this.marca;}
    public void setMarca(String ma) {this.marca=ma;}
    public String getModelo(){return this.modelo;}
    public void setModelo(String mo) {this.modelo=mo;}

    public void exibir(){
        System.out.println("STATUS DO VEICULO");
        System.out.println("=================");
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
    }
}
