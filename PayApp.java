import java.lang.*;
import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class PayApp {

    public static void main (String[] args){

        int dailyWage;
        double workHours;
        int numberOfDays;
        double taxPercentage;
        int savingsGoal;

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM/yyyy");

        Pay myPay = new Pay();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter daily pay rate: ");
        dailyWage = userInput.nextInt();

        System.out.println("Enter the number of work hours per day: ");
        workHours = userInput.nextDouble();

        System.out.println("Enter the number of work days per year: ");
        numberOfDays = userInput.nextInt();

        System.out.println("Enter the tax percentage: ");
        taxPercentage = userInput.nextDouble();

        System.out.println("Enter the saving goal: ");
        savingsGoal = userInput.nextInt();

        System.out.printf("\nValues given:\n\n\tDaily Pay Rate: %d\n\tWork Hours: %.2f\n\t" +
                        "Days per year: %d\n\tTax percentage: %.2f\n\tGoal: %,d\n\n",
                        dailyWage, workHours, numberOfDays, taxPercentage, savingsGoal);

        myPay.setDailyWage(dailyWage);
        myPay.setWorkHours(workHours);
        myPay.setNumberOfDays(numberOfDays);
        myPay.setTaxPercentage(taxPercentage);
        myPay.setGoal(savingsGoal);

        myPay.compute();

        System.out.printf("Result:\n\n\tRate per hour: %.2f\n\tDaily pay after tax: %.2f" +
                        "\n\tWeekly pay: %.2f\n\tWeekly pay after tax: %.2f" +
                        "\n\tMonthly pay: %.2f\n\tMonthly pay after tax: %.2f" +
                        "\n\tAnnual pay: %.2f\n\tAnnual pay after tax: %.2f\n\n",
                myPay.getHourlyRate(), myPay.getDailyPayTax(),
                myPay.getWeeklyPay(), myPay.getWeeklyPayTax(),
                myPay.getMonthlyPay(), myPay.getMonthlyPayTax(),
                myPay.getAnnualPay(), myPay.getAnnualPayTax());

        String goalDate = LocalDateTime.now().plusMonths((long)(myPay.getYearsGoal()*12)).format(dateFormat);

        System.out.printf("\nSavings goal reached in:\n\n\tMonths: %.2f\n\tYears: %.2f\n\t%s\n\n",
                myPay.getYearsGoal()*12, myPay.getYearsGoal(), goalDate);
    }
}
