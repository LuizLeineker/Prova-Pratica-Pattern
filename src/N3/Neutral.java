package N3;

public class Neutral implements State {

    @Override
    public void handle(Context contexto, Dados valores) {
        // Se o valor for superior a 300 = ALERTA AMARELO
        if(valores.temperature > 300){
            contexto.StateUpdt(new Yellow());
            return;
        }
    }

    @Override
    public String typeState() {
        return "Operação Normal";
    }
}
