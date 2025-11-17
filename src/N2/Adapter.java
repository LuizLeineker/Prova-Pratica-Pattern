package N2;

import java.util.HashMap;

public class Adapter implements ProcessadorTransacoes {

    private final SistemaBancarioLegado legado;

    public Adapter(SistemaBancarioLegado legado) {
        this.legado = legado;
    }

    @Override
    public Request autorizar(String cartao, double valor, String moeda) {

        HashMap<String, Object> parametros = new HashMap<>();

        // Sistema da empresa moderna para o legado
        parametros.put("numeroCartao", cartao);
        parametros.put("valorTransacao", valor);
        parametros.put("moeda", converterMoeda(moeda));

        parametros.put("canalOrigem", "ECOMMERCE");

        HashMap<String, Object> respLegado = legado.processarTransacao(parametros);


        return converterResposta(respLegado);
    }

    // Para as moedas
    private int converterMoeda(String moeda) {
        return switch (moeda.toUpperCase()) {
            case "USD" -> 1;
            case "EUR" -> 2;
            case "BRL" -> 3;
            default -> throw new IllegalArgumentException("Sem suporte para : " + moeda);
        };
    }

    // Legado para o Sistema da empresa
    private Request converterResposta(HashMap<String, Object> respostaLegado) {
        boolean aprovado = "OK".equals(respostaLegado.get("status"));
        String codigo = (String) respostaLegado.getOrDefault("codigoAut", null);
        String mensagem = (String) respostaLegado.getOrDefault("mensagem", "Sem mensagem");

        return new Request(aprovado, codigo, mensagem);
    }
}