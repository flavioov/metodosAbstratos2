package Entities;

public class Individual extends Taxpayer {
    private double healthExpense;

    public Individual() {
        super();
    }

    public Individual(String name, double anualIncome, double healthExpense) {
        super(name, anualIncome);
        this.healthExpense = healthExpense;
    }

    public double getHealthExpense() {
        return healthExpense;
    }

    public void setHealthExpense(double healthExpense) {
        this.healthExpense = healthExpense;
    }

    @Override
    public double totalTax() {
        if (getAnualIncome() < 20000.00) {
            return (getAnualIncome() * 0.15) - (healthExpense * 0.5);
        }

        return (getAnualIncome() * 0.25) - (healthExpense * 0.5);
    }
}
