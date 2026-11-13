package integracao;

public class Main {

    public static void main(String[] args) {
        Aprovador aprovacao = new Vendedor(new Gerente(new Diretor(null)));

        Pedido[] pedidos = {
                new PedidoVarejo(500.0f, new FreteNormal()),
                new PedidoAtacado(4000.0f, new FreteExpresso()),
                new PedidoAtacado(15000.0f, new FreteNormal()),
                new PedidoVarejo(30000.0f, new FreteExpresso())
        };

        for (Pedido pedido : pedidos) {
            System.out.println(pedido.getTipo() + " | total R$ " + pedido.calcularTotal()
                    + " | aprovado por: " + aprovacao.aprovar(pedido));
        }
    }
}
