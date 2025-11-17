package N1;

public class Main {
    public static void main(String[] args){
        // Stategy - Permite a um objeto alterar seu comportamento em tempo de execução, delegando a execução de um algoritmo a diferentes estratégias.
        // Para essa atividade deve ser possível trocar de algoritmo de acordo com a necessidade de negócios.
        // O cliente não precisa se preocupar com a implementação dos algoritmos.

        // Dados Financeiros:
        FinancialContext finance = new FinancialContext(220.30,3,300.00);

        // Dados inicialmente está em processo de "valueRisk"
        Context dados = new Context(new ValueRisk());
        System.out.println("Risco:  " + dados.runStategy(finance));

        // Update os dados para 'exepectedShort.."
        dados.setStrategy(new ExpectedShortfall());
        System.out.println("ShortFall:  " + dados.runStategy(finance));

        // Para teste de stess
        dados.setStrategy(new StressTesting());
        System.out.println("Strees:  " + dados.runStategy(finance));
    }
}
