package N2;

public class Request {
    private boolean aprovado;
    private String codigoAutorizacao;
    private String mensagem;

    public Request(boolean aprovado, String codigoAutorizacao, String mensagem) {
        this.aprovado = aprovado;
        this.codigoAutorizacao = codigoAutorizacao;
        this.mensagem = mensagem;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public String getCodigo() {
        return codigoAutorizacao;
    }

    public String getMensagem() {
        return mensagem;
    }
}