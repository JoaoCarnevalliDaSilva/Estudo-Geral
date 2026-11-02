public class Ex3Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    public Ex3Funcionario(String n, String c, double s) {this.nome = n;this.cargo=c;this.salario = s;}
    public String getNome() {return this.nome;}
    public void setNome(String n) {this.nome=n;}
    public String getCargo() {return this.cargo;}
    public void setCargo(String c) {this.cargo=c;}
    public double getSalario() {return this.salario;}
    public void setSalario(double s) {this.salario=s;}
    public double calcularBonus() {return this.salario*0.10;}
    public double bonificacao() {return this.salario+calcularBonus();}
    public void exibir(){
        System.out.println("INFORMACOES GERAIS");
        System.out.println("==================");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Cargo: "+this.getCargo());
        System.out.println("Salario: "+this.getSalario());
        System.out.println("Bonus: "+calcularBonus());
        System.out.println("Bonificacao Total: "+bonificacao());
    }
}
