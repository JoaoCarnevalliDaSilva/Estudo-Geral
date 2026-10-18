import java.util.Scanner;

public class OrientadoObjetos3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Caneta3 c1 = new Caneta3();
        //c1.modelo = "BIC"; --> Essa função tem um modelo privado, nao permitindo acesso
        //c1.setModelo("BIC"); //METODO MODIFICADOR
        //c1.ponta = 0.5f; --> Essa função tem um modelo privado, nao permitindo acesso
        //c1.setPonta(0.5f);
        //c1.status();

        // Metodo construtor - Para que todos os objetos instanciados recebam o mesmo valor

        Caneta3 c2 = new Caneta3("NIC", "Amarela", 0.4f);
        c2.status();

        scanner.close();
    }
}