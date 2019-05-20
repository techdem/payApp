public class Pay {

    private int dailyWage;
    private double workHours;
    private int numberOfDays;
    private double taxPercentage;
    private int savingsGoal;

    private double hourlyRate;
    private double weeklyPay;
    private double monthlyPay;
    private double annualPay;
    private double yearsGoal;

    public void setDailyWage(int dailyWage) {

        this.dailyWage = dailyWage;
    }

    public void setWorkHours(double workHours) {

        this.workHours = workHours;
    }

    public void setNumberOfDays(int numberOfDays) {

        this.numberOfDays = numberOfDays;
    }

    public void setTaxPercentage(double taxPercentage) {

        this.taxPercentage = taxPercentage / 100;
    }

    public void setGoal(int savingsGoal) {

        this.savingsGoal = savingsGoal;
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

    public double getYearsGoal() {

        return savingsGoal / getAnnualPayTax();
    }
}
