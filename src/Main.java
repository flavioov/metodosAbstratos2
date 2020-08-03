import Entities.Company;
import Entities.Individual;
import Entities.Taxpayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Taxpayer> taxPayers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int numberOfContributors = input.nextInt();

        for (int i = 0; i < numberOfContributors; i++) {
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or Company (i/c)?");
            char ch = input.next().charAt(0);

            System.out.print("Name: ");
            String name = input.next();

            System.out.print("Anual Income: ");
            double anualIncome = input.nextDouble();

            if (ch == 'i') {
                System.out.print("Health Expenditure: ");
                double healthExpenditure = input.nextDouble();

                taxPayers.add(new Individual(name, anualIncome, healthExpenditure));

            } else if (ch == 'c') {
                System.out.print("Number of Employees: ");
                int numberOfEmployees = input.nextInt();

                taxPayers.add(new Company(name, anualIncome, numberOfEmployees));

            }

        }

        input.close();
        System.out.println("\nTAXES PAID:");

        double totalTaxes = 0;
        for (Taxpayer contributor : taxPayers) {
            System.out.print(String.format("%s: $ %.2f%n", contributor.getName(), contributor.totalTax()));
            totalTaxes += contributor.totalTax();
        }

        System.out.println("\nTOTAL TAXES: $" + totalTaxes);

    }
}
