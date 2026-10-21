import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArCondicionado novoAr = new ArCondicionado();
        novoAr.marca = "Phillips";
        novoAr.aumentarTemperatura();
        novoAr.ligar();
        novoAr.diminuirTemperatura();
        novoAr.status();


        scanner.close();
    }
}