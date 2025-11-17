package N3;

public class Yellow implements State{
    double temp;


    @Override
    public void handle(Context contexto, Dados valores) {
        // Se resfriamento falhar
        if(valores.cooling == false){
            contexto.StateUpdt(new Red());
        }
        // Para voltar ao estado normal se abaixar a temp
        if (valores.temperature <= 300) {
            contexto.StateUpdt(new Neutral());
        }
    }

    @Override
    public String typeState() {
        return "ALERTA - AMARELO";
    }
}
