public class Ex1Funcionario {
    private String nome;
    private double salario;
    public Ex1Funcionario(String novoNome, double novoSalario) {this.nome=novoNome;this.salario=novoSalario;}
    public String getNome(){return this.nome;}
    public void setNome(String novoNome) {this.nome = novoNome;}
    public double getSalario(){return this.salario;}
    public void setSalario(double novoSalario) {this.salario = novoSalario;}
    public void exibirStatus(){
        System.out.println("INFORMACOES GERAIS:");
        System.out.println("===================");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Salario: "+this.getSalario());
    }
}
