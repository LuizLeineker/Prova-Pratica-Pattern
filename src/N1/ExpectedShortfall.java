package N1;

public class ExpectedShortfall implements Strategy {
    @Override
    public String execute(FinancialContext ctx){
        double expected = ctx.getObjective() - ctx.getValue();

        return "Resultado Esperado - " + String.format("%.2f",expected);
    }
}
