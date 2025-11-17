package N1;

public class FinancialContext {
    private double value;
    private double time;
    private double objective;

    public FinancialContext(double value, double time, double objective){
        this.value = value;
        this.time = time;
        this.objective = objective;
    }

    public double getValue(){
        return value;
    }
    public double getTime(){
        return time;
    }
    public double getObjective(){
        return objective;
    }

}