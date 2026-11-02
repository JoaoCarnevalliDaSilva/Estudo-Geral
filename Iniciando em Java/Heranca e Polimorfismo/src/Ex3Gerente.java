public class Ex3Gerente extends Ex3Funcionario{

    public Ex3Gerente(String n, String c, double s){super(n, c, s);}
    @Override
    public double calcularBonus() {
        return getSalario()*0.20;
    }
}
