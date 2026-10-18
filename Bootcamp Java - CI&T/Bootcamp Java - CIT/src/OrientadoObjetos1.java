import java.util.Scanner;

public class OrientadoObjetos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // instanciando um novo objeto
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampar(); //chamar o metodo tampar, para tampar a caneta
        c1.status();

        scanner.close();
    }
}