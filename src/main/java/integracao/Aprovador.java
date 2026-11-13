package integracao;

public abstract class Aprovador {

    private Aprovador superior;

    public Aprovador(Aprovador superior) {
        this.superior = superior;
    }

    public abstract float getLimite();

    public abstract String getCargo();

    public String aprovar(Pedido pedido) {
        if (pedido.calcularTotal() <= getLimite()) {
            return getCargo();
        }
        else {
            if (superior != null) {
                return superior.aprovar(pedido);
            }
            else {
                return "Pedido recusado";
            }
        }
    }
}
