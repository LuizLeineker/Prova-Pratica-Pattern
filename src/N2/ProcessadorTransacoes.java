package N2;

public interface ProcessadorTransacoes{
    Request autorizar(String cartao, double valor, String moeda);
}
