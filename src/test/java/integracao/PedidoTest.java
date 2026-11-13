package integracao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularTotalVarejoComFreteNormal() {
        Pedido pedido = new PedidoVarejo(500.0f, new FreteNormal());
        assertEquals(520.0f, pedido.calcularTotal(), 0.01f);
    }

    @Test
    void deveCalcularTotalVarejoComFreteExpresso() {
        Pedido pedido = new PedidoVarejo(500.0f, new FreteExpresso());
        assertEquals(545.0f, pedido.calcularTotal(), 0.01f);
    }

    @Test
    void deveCalcularTotalAtacadoComDesconto() {
        Pedido pedido = new PedidoAtacado(4000.0f, new FreteNormal());
        assertEquals(3620.0f, pedido.calcularTotal(), 0.01f);
    }
}
