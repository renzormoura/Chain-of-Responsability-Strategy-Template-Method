package integracao;

public class Diretor extends Aprovador {

    public Diretor(Aprovador superior) {
        super(superior);
    }

    public float getLimite() {
        return 20000.0f;
    }

    public String getCargo() {
        return "Diretor";
    }
}
