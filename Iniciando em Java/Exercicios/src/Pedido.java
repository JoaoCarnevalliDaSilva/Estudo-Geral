public class Pedido {
    //criar os atributos
    private int numeroPedido;
    private String cliente;
    private double valorTotal;
    private String status;
    //criar o construtor
    public Pedido(int nPedido, String c, double valor) {
        this.numeroPedido = nPedido;
        this.cliente = c;
        this.valorTotal = valor;
        this.status = "Em andamento";
    }
    //criar os metodos de inicializacao
    public int getNumeroPedido() {
        return this.numeroPedido;
    }
    public void setNumeroPedido(int nPedido) {
        this.numeroPedido = nPedido;
    }
    public String getCliente() {
        return this.cliente;
    }
    public void setCliente(String novoCliente) {
        this.cliente = novoCliente;
    }
    public double getValorTotal() {
        return this.valorTotal;
    }
    public void setValorTotal(double valor){
        if(valor <= 0) {
            System.out.println("Valor tem que ser maior que zero");
        } else {
            this.valorTotal = valor;
        }
    }
    public String getStatus() {
        return this.status;
    }
    public void setStatus(String novoStatus) {
        this.status = novoStatus;
    }
    //criar os metodos de acao
    public void exibirResumo() {
        System.out.println("STATUS GERAL DO PEDIDO");
        System.out.println("======================");
        System.out.println("Pedido: "+this.getNumeroPedido());
        System.out.println("Cliente: "+this.getCliente());
        System.out.println("Valor: "+this.getValorTotal());
        System.out.println("Status: "+this.getStatus());
    }

}
