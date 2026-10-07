import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o valor que voce recebe por hora trabalhada: ");
        double salarioHora = scanner.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mes ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.println("Digite o percentual de desconto salarial: ");
        double descontoSalario = scanner.nextDouble();
        double salarioBruto = 0, valorDesconto = 0, salarioLiquido = 0;
        salarioBruto = horasTrabalhadas*salarioHora;
        valorDesconto = salarioBruto*(descontoSalario/100);
        salarioLiquido = salarioBruto-valorDesconto;

        System.out.printf("O seu salario mensal sera de: R$%.2f%n", salarioLiquido);

        scanner.close();
    }
}