package integracao;

public class Vendedor extends Aprovador {

    public Vendedor(Aprovador superior) {
        super(superior);
    }

    public float getLimite() {
        return 1000.0f;
    }

    public String getCargo() {
        return "Vendedor";
    }
}
