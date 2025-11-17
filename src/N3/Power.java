package N3;

public class Power implements State {
    // State - OFF/ON || DESLIGADO/LIGADO
    @Override
    public void handle(Context contexto, Dados valores) {
        if (valores.temperature > 0) {
            contexto.StateUpdt(new Neutral());
        }
    }

    @Override
    public String typeState() {
        return "DESLIGADA";
    }
}
