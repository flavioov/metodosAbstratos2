package Entities;

public class Company extends Taxpayer {
    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double totalTax() {
        if (numberOfEmployees <= 10) {
            return getAnualIncome() * 0.16;
        } else {
            return getAnualIncome() * 0.14;
        }
    }
}

