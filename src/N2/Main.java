package N2;

public class Main {
    public static void main(String[] args) {
        // O adpter permite interfaces diferentes se comunicarem, assim como cita na N2
        // Permite um sistema antigo se comunicar com outrao, por meio de adaptação

        SistemaBancarioLegado legado = new SistemaBancarioLegado();

        ProcessadorTransacoes processador = new Adapter(legado);

        Request retorno = processador.autorizar("342543", 80.00, "USD");

        System.out.println(retorno.getAprovado());
        System.out.println(retorno.getCodigo());
        System.out.println(retorno.getMensagem());
    }
}
