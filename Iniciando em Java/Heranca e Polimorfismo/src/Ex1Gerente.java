public class Ex1Gerente extends Ex1Funcionario{
    private String senha;
    public Ex1Gerente(String novoNome, double novoSalario, String senha) {
        super(novoNome, novoSalario);
        this.senha = senha;
    }
    public String getSenha() {return this.senha;}
    public void setSenha(String senha) {this.senha=senha;}

    public void login() {
        System.out.println("Bem vindo " +getNome()+ ". Entrou no sistema");
    }
}