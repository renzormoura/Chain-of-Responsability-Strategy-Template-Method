package integracao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AprovadorTest {

    Aprovador aprovacao;

    @BeforeEach
    void setUp() {
        aprovacao = new Vendedor(new Gerente(new Diretor(null)));
    }

    @Test
    void deveSerAprovadoPeloVendedor() {
        assertEquals("Vendedor", aprovacao.aprovar(new PedidoVarejo(500.0f, new FreteNormal())));
    }

    @Test
    void deveSerAprovadoPeloGerente() {
        assertEquals("Gerente", aprovacao.aprovar(new PedidoAtacado(4000.0f, new FreteExpresso())));
    }

    @Test
    void deveSerAprovadoPeloDiretor() {
        assertEquals("Diretor", aprovacao.aprovar(new PedidoAtacado(15000.0f, new FreteNormal())));
    }

    @Test
    void deveSerRecusado() {
        assertEquals("Pedido recusado", aprovacao.aprovar(new PedidoVarejo(30000.0f, new FreteExpresso())));
    }
}
