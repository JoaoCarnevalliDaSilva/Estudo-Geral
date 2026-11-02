import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ex3Funcionario novoFuncionario = new Ex3Funcionario("Carlos", "Operador", 1000);
        novoFuncionario.calcularBonus();
        novoFuncionario.exibir();
        System.out.println("-------------------------");
        Ex3Funcionario novoGerente = new Ex3Gerente("Joao", "Gerente", 3000);
        novoGerente.calcularBonus();
        novoGerente.exibir();
        System.out.println("-------------------------");
        Ex3Funcionario novoDiretor = new Ex3Diretor("Maria", "Diretor", 5000);
        novoDiretor.calcularBonus();
        novoDiretor.exibir();
    }
}