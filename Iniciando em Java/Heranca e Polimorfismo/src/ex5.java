import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ex5Funcionario novoFun = new ex5Funcionario("Joao", 2000);
        novoFun.calcularSalarioTotal();
        System.out.println("========================");
        ex5Funcionario novoDev = new ex5Desenvolvedor("Carlos",3000,250,400);
        novoDev.calcularSalarioTotal();
        System.out.println("========================");
        ex5Funcionario novoGerente = new ex5GerenteTI("Bruno",6000,10000);
        novoGerente.calcularSalarioTotal();
    }
}