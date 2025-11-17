package N3;

public class Main {
    public static void simulation(Dados dados, Context usinaNuclear) {
        for (int ciclo = 0; ciclo < 5; ciclo++) {

            dados.temperature += 120;

            if (dados.temperature > 400) {
                dados.temperatureHigh += 10;
            }
            System.out.println("\n\n");
            System.out.println("Temperatura: " + dados.temperature +"°C | Tempo com alta temperatura: " + dados.temperatureHigh);

            usinaNuclear.update(dados);
            System.out.println("Estado atual: " + usinaNuclear.getState());

        }
    }

    public static void main(String[] args) {
        // N3 - State
        // Conforme a temperatura tem um alerta, o estado muda de a amarelo para vermelho..
        // Quando um objeto possui múltiplos estados implementamos o state.

        Context usinaNuclear = new Context();
        Dados dados = new Dados();

        System.out.println("Estado inicial: " + usinaNuclear.getState());


        // Dados - Simulando temperatura altas em grande tempo
        System.out.println("Simulação ----------------------------------------------------");
        simulation(dados, usinaNuclear);
        System.out.println("--------------------------------------------------------------");

        // Sem resfriamento
        dados.cooling = false;
        usinaNuclear.update(dados);
        System.out.println("Sem resfriamento: ");
        System.out.println("Estado atual: " + usinaNuclear.getState());

        // Para manuteção
        usinaNuclear.manutencaoActive();
        System.out.println("Entrando em manutenção: ");
        System.out.println("Estado atual: " + usinaNuclear.getState());

    }


}
