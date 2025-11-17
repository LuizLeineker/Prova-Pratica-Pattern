package N3;

public class Red implements State{
    @Override
    public void handle(Context contexto, Dados valores) {
        if(valores.temperature > 400 && valores.temperatureHigh > 30){
            contexto.StateUpdt(new Danger());;
        }


    }

    @Override
    public String typeState() {
        return "ALERTA - VERMELHO";
    }
}
