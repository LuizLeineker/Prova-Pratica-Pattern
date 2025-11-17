package N3;

public class Context {
    private State estadoAtual;
    private boolean manutencao = false;

    public Context(){
        this.estadoAtual = new Power();
    }

    public void manutencaoActive() {
        manutencao = true;
        estadoAtual = new Manutention();
    }

    // State normal:
    public void manutencaoDesative() {
        manutencao = false;
        estadoAtual = new Neutral();
    }

    public void update(Dados valores) {
        if (!manutencao)
            estadoAtual.handle(this, valores);
    }

    // Update State
    public void StateUpdt(State novo) {
        System.out.println("Estado atual: " + estadoAtual.typeState() + " -> Para: " + novo.typeState());
        this.estadoAtual = novo;
    }

    public String getState() {
        return estadoAtual.typeState();
    }
}
