package N3;

public class Danger implements State{

    @Override
    public void handle(Context contexto, Dados valores) {
        System.out.println("Precisa ser feita a manunteção mais rapido possivel.");
    }

    @Override
    public String typeState() {
        return "PERIGO - EMERGENCIA - DANGER";
    }
}
