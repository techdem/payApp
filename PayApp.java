import java.lang.*;
import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class PayApp {

    public static void main (String[] args){

        int weeklyPay;
        double basicHours;
        int goal;

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM/yyyy");//("yyyy-MM-dd HH:mm:ss");

        Pay myPay = new Pay();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter weekly pay rate: ");
        weeklyPay = userInput.nextInt();

        System.out.println("Now enter the number of basic hours of work per week: ");
        basicHours = userInput.nextDouble();

        System.out.println("Now enter the goal amount: ");
        goal = userInput.nextInt();

        System.out.printf("\nValues given:\n\tWeekly Pay Rate: €%d\n\tBasic Hours: %.2f\n\tGoal: €%,d\n",
                weeklyPay, basicHours, goal);

        myPay.setWeeklyPay(weeklyPay);
        myPay.setBasicHours(basicHours);
        myPay.setGoal(goal);

        myPay.compute();

        System.out.printf("\nTotals:\n\tRate per hour: €%.2f\n\tWeekly pay after tax: €%.2f" +
                        "\n\tMonthly pay: €%.2f\n\tMonthly pay after tax: €%.2f" +
                        "\n\tAnnual pay: €%.2f\n\tAnnual pay after tax: €%.2f\n",
                myPay.getHourlyRate(), myPay.getWeeklyPayTax(), myPay.getMonthlyPay(), myPay.getMonthlyPayTax(),
                myPay.getAnnualPay(), myPay.getAnnualPayTax());

        System.out.printf("\nGoal reached in:\n\tMonths: %.2f\n\tYears: %.2f\n",
                myPay.getYearsGoal()*12, myPay.getYearsGoal());

        String year = LocalDateTime.now().plusMonths((long)(myPay.getYearsGoal()*12)).format(dateFormat);

        System.out.println("\nGoal will be reached in: " + year);
    }
}
