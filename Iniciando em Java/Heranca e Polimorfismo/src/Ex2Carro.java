public class Ex2Carro extends Ex2Veiculo{
    private int quantidadePortas;
    public Ex2Carro(String ma, String mo, int qtdPts) {
        super(ma, mo);
        this.quantidadePortas = qtdPts;
    }

    public void ligarArCondicionado() {
        System.out.println("Ar Condicionado foi ligado");
    }

}
