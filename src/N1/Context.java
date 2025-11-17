package N1;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // Para alterar a instacia dos dados
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Para rodar respectiva class
    public String runStategy(FinancialContext ctx){
        return strategy.execute(ctx);
    }
}
