package integracao;

public abstract class Pedido {

    private float valorItens;
    private Frete frete;

    public Pedido(float valorItens, Frete frete) {
        this.valorItens = valorItens;
        this.frete = frete;
    }

    public float getValorItens() {
        return valorItens;
    }

    public final float calcularTotal() {
        return valorItens + frete.calcular(valorItens) - calcularDesconto();
    }

    protected abstract float calcularDesconto();

    public String getTipo() {
        return "Pedido";
    }
}
