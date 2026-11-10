public class ex5Funcionario {
    private String name;
    private double salarioBase;
    public ex5Funcionario(String s, double sb) {this.name=s;this.salarioBase=sb;}
    public String getName() {return this.name;}
    public void setName(String s) {this.name=s;}
    public double getSalarioBase() {return this.salarioBase;}
    public void setSalarioBase(double sb) {this.salarioBase=sb;}
    public void calcularSalarioTotal() {
        System.out.println("INFORMACOES GERAIS");
        System.out.println("==================");
        System.out.println("Nome: "+this.getName());
        System.out.println("Salario Base: "+this.getSalarioBase());
    }
}
