public class Ex2Moto extends Ex2Veiculo{
    private boolean temPartidaEletrica;

    public Ex2Moto(String ma, String mo, boolean PT) {
        super(ma, mo);
        this.temPartidaEletrica = PT;
    }

    public void empinar(){
        System.out.println("A moto esta empinando");
    }
}
