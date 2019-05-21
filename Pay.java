public class Pay {

    private int dailyWage;
    private double workHours;
    private int numberOfDays;
    private double taxPercentage;
    private int savingsGoal;
    private double savingsPercentage;

    private double hourlyRate;
    private double weeklyPay;
    private double monthlyPay;
    private double annualPay;

    public void setValues(int dailyWage, double workHours, int numberOfDays,
                            double taxPercentage, int savingsGoal, double savingsPercentage) {
        this.dailyWage = dailyWage;
        this.workHours = workHours;
        this.numberOfDays = numberOfDays;
        this.taxPercentage = taxPercentage / 100;
        this.savingsGoal = savingsGoal;
        this.savingsPercentage = savingsPercentage / 100;
    }

    public void compute() {

        annualPay = dailyWage * numberOfDays;
        monthlyPay = annualPay / 12;
        weeklyPay = annualPay / 52;
        hourlyRate = dailyWage / workHours;
    }

    public double getHourlyRate() {

        return hourlyRate;
    }

    public double getDailyPayTax() {

        return dailyWage - (taxPercentage * dailyWage);
    }

    public double getWeeklyPay() {

        return weeklyPay;
    }

    public double getWeeklyPayTax() {

        return weeklyPay - (taxPercentage * weeklyPay);
    }

    public double getMonthlyPay() {

        return monthlyPay;
    }

    public double getMonthlyPayTax() {

        return monthlyPay - (taxPercentage * monthlyPay);
    }

    public double getAnnualPay() {

        return annualPay;
    }

    public double getAnnualPayTax() {

        return annualPay - (taxPercentage * annualPay);
    }

    public double getSavingsPerMonth() {

        return savingsPercentage * getMonthlyPay();
    }

    public double getMonthsGoal() {

        return savingsGoal / getSavingsPerMonth();
    }
}
