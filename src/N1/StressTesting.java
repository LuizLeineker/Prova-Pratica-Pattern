package N1;

public class StressTesting implements Strategy {
    @Override
    public String execute(FinancialContext ctx){
        double time = ctx.getTime();
        return "90%  para o tempo - " + String.format("%.2f", time);

    }
}
