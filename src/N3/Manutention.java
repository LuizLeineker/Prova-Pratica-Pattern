package N3;

public class Manutention implements State{
    @Override
    public void handle(Context contexto, Dados valores) {
        System.out.println("MANUTENÇÃO ATIVA.");
    }

    @Override
    public String typeState() {
        return "MANUTENÇÃO";
    }
}
