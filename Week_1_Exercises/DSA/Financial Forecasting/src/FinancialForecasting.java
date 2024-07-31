public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double predictFutureValue(double initialValue, double growthRate, int years) {
        // Base case: if years is 0, return the initial value
        if (years == 0) {
            return initialValue;
        }

        // Recursive case: calculate the next year's value
        double nextValue = initialValue * (1 + growthRate);
        return predictFutureValue(nextValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // initial value
        double growthRate = 0.05; // 5% annual growth rate
        int years = 5; // number of years to forecast

        double futureValue = predictFutureValue(initialValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}
