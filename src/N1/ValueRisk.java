package N1;

public class ValueRisk implements Strategy {
    @Override
    public String execute(FinancialContext ctx){
        double risco = ctx.getValue() * ctx.getTime();
        return String.format("%.2f", risco) + "% com base nos Dados";
    }

}
