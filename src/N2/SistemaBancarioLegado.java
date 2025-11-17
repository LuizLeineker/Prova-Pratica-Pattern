package N2;

import java.util.HashMap;

public class SistemaBancarioLegado {

    // Sistema Incopativel
    public HashMap<String, Object> processarTransacao(HashMap<String, Object> parametros) {
        HashMap<String, Object> resposta = new HashMap<>();


        if(parametros.get("numeroCartao") == null){
            resposta.put("status", "ERRO");
            resposta.put("mensagem", "Cartão inexistente");
        }else{
            resposta.put("status", "OK");
            resposta.put("mensagem", "Cartão Ok");
        }

        return resposta;
    }
}