package integracao;

public class PedidoVarejo extends Pedido {

    public PedidoVarejo(float valorItens, Frete frete) {
        super(valorItens, frete);
    }

    protected float calcularDesconto() {
        return 0.0f;
    }

    @Override
    public String getTipo() {
        return "Varejo";
    }
}
