public class ex5GerenteTI extends ex5Funcionario{
    private double participacaoPLR;
    public ex5GerenteTI(String s, double sb, double plr){super(s, sb);this.participacaoPLR=plr;}
    public double getParticipacaoPLR(){return this.participacaoPLR;}
    public void setParticipacaoPLR(double plr){this.participacaoPLR=plr;}

    @Override
    public void calcularSalarioTotal() {
        System.out.println("INFORMACOES GERAIS");
        System.out.println("==================");
        System.out.println("Nome: "+this.getName());
        System.out.println("Salario Base: "+this.getSalarioBase());
        System.out.println("PLR: "+this.getParticipacaoPLR());
        System.out.println("Salario Total: "+(this.getSalarioBase()+this.getParticipacaoPLR()));
    }
}
