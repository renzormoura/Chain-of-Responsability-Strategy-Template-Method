package integracao;

public class FreteExpresso implements Frete {

    public float calcular(float valorItens) {
        return 20.0f + valorItens * 0.05f;
    }
}
