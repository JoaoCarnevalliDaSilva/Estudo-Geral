public class Funcionario {
    //criar atributos
    private String name;
    private String cargo;
    private double salario;
    private double salarioMinimo = 1412;
    //criar elementos inicializadores
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            System.out.println("Erro. Nome invalido");
        } else {
            this.name = name;
        }
    }
    public String getCargo() {
        return this.cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario) {
        if(salario<salarioMinimo) {
            System.out.println("Nao foi possivel registrar. Salario abaixo do valor minimo.");
        } else {
            this.salario = salario;
        }
    }
    //criar elementos de acao
    public void aumentarSalario(double percentual) {
        double novoSalario = 0;
        novoSalario = getSalario() + (getSalario() * (percentual/100));
        setSalario(novoSalario);
    }
    public void exibirDados() {
        System.out.println("INFORMACOES DO FUNCIONARIO:");
        System.out.println("===========================");
        System.out.println("Nome: "+this.getName());
        System.out.println("Cargo: "+this.getCargo());
        System.out.println("Salario: "+this.getSalario());
    }


}
