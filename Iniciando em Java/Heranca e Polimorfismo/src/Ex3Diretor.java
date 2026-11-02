public class Ex3Diretor extends Ex3Funcionario{
    public Ex3Diretor(String n, String c, double s){super(n, c, s);}

    @Override
    public double calcularBonus() {
        return this.getSalario()*0.30;
    }
}
