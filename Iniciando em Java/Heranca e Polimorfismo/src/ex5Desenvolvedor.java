public class ex5Desenvolvedor extends ex5Funcionario{
    private double valorHoraExtra;
    private double bonusProjeto;
    public ex5Desenvolvedor(String s, double sb, double he, double bj){super(s, sb);this.valorHoraExtra=he;this.bonusProjeto=bj;}
    public double getValorHoraExtra(){return this.valorHoraExtra;}
    public void setValorHoraExtra(double he){this.valorHoraExtra=he;}
    public double getBonusProjeto(){return this.bonusProjeto;}
    public void setBonusProjeto(double bj){this.bonusProjeto=bj;}
    @Override
    public void calcularSalarioTotal() {
        System.out.println("INFORMACOES GERAIS");
        System.out.println("==================");
        System.out.println("Nome: "+this.getName());
        System.out.println("Salario Base: "+this.getSalarioBase());
        System.out.println("Hora Extra: "+this.getValorHoraExtra());
        System.out.println("Bonus Projeto: "+this.getBonusProjeto());
        System.out.println("Salario Total: "+(this.getSalarioBase()+this.getValorHoraExtra()+this.getBonusProjeto()));
    }
}
