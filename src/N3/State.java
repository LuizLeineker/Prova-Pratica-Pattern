package N3;

public interface State {
    void handle(Context contexto, Dados valores);
    String typeState();
}
