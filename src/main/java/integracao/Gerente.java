package integracao;

public class Gerente extends Aprovador {

    public Gerente(Aprovador superior) {
        super(superior);
    }

    public float getLimite() {
        return 5000.0f;
    }

    public String getCargo() {
        return "Gerente";
    }
}
