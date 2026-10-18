import java.util.Scanner;

public class OrientadoObjetos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // instanciando um novo objeto
        Caneta2 c1 = new Caneta2();
        c1.modelo = "BIC Crystal";
        c1.cor = "Preta";
        //c1.ponta = 0.5f;
        c1.carga = 90;
        //c1.tampada = false;
        c1.destampar();
        c1.status();

        // Como somente a propria classe pode alterar os valores de uma classe privada, é possivel
        // chamar as funções que realizam a alteração dentro da classe - Para isso, a função deve
        // ser publica

        scanner.close();
    }
}