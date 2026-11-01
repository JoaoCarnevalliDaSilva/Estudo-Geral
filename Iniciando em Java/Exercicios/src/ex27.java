import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pedido newPedido = new Pedido(345, "Carlos", 45);
        newPedido.exibirResumo();
        newPedido.setStatus("Finalizado");
        newPedido.exibirResumo();
    }
}