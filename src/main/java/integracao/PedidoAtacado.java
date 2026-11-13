package integracao;

public class PedidoAtacado extends Pedido {

    public PedidoAtacado(float valorItens, Frete frete) {
        super(valorItens, frete);
    }

    protected float calcularDesconto() {
        return getValorItens() * 0.10f;
    }

    @Override
    public String getTipo() {
        return "Atacado";
    }
}
