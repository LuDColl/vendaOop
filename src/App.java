import pedidos.clientes.Classificacao;
import pedidos.clientes.Cliente;
import pedidos.Produto;
import pedidos.Pedido;

public class App {
    public static void main(String[] args) throws Exception {
        Classificacao gold = new Classificacao(11, "GOLD", (float) 0.05, (float) 0.3);
        Classificacao silver = new Classificacao(22, "SILVER", (float) 0.075, (float) 0.15);
        Classificacao bronze = new Classificacao(33, "BRONZE", (float) 0.04, (float) 0);

        Cliente jose = new Cliente(101, "José da Silva", "MG", gold);
        Cliente antonio = new Cliente(202, "Antônio da Silva", "SP", silver);
        Cliente maria = new Cliente(303, "Maria da Silva", "RS", bronze);

        Produto teclado = new Produto("A10", "TECLADO", 120);
        Produto monitor = new Produto("A20", "MONITOR", 500);
        Produto notebook = new Produto("A30", "NOTEBOOK", 4580);
        Produto mouse = new Produto("A40", "MOUSE", 75);

        Pedido pedidoJose = new Pedido(1010, "29/03/2021", jose, teclado, 3);
        pedidoJose.addItem(monitor, 2);
        pedidoJose.addItem(notebook, 1);
        pedidoJose.addItem(mouse, 2);

        Pedido pedidoAntonio = new Pedido(2020, "30/03/2021", antonio, teclado, 10);
        pedidoAntonio.addItem(mouse, 10);

        Pedido pedidoMaria = new Pedido(3030, "01/04/2021", maria, monitor, 2);
        pedidoMaria.addItem(notebook, 2);
        pedidoMaria.addItem(mouse, 2);

        pedidoJose.print();
        pedidoAntonio.print();
        pedidoMaria.print();
    }
}
