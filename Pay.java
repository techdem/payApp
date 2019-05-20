public class Pay {

    private int dailyWage;
    private double workHours;
    private double hourlyRate;
    private double weeklyPay;
    private double monthlyPay;
    private double annualPay;
    private int savingsGoal;
    private double yearsGoal;

    public void setDailyWage(int dailyWage) {

        this.dailyWage = dailyWage;
    }

    public void setWorkHours(double workHours) {

        this.workHours = workHours;
    }

    public void setGoal(int savingsGoal) {

        this.savingsGoal = savingsGoal;
    }

    public void compute() {

        weeklyPay = dailyWage * 5;
        monthlyPay = weeklyPay * 4.33;
        annualPay = dailyWage * 260;
        hourlyRate = dailyWage / workHours;
    }

    public double getHourlyRate() {

        return hourlyRate;
    }

    public double getDailyPayTax() {

        return dailyWage - (0.35 * dailyWage);
    }

    public double getWeeklyPay() {

        return weeklyPay;
    }

    public double getWeeklyPayTax() {

        return weeklyPay - (0.35 * weeklyPay);
    }

    public double getMonthlyPay() {

        return monthlyPay;
    }

    public double getMonthlyPayTax() {

        return monthlyPay - (0.35 * monthlyPay);
    }

    public double getAnnualPay() {

        return annualPay;
    }

    public double getAnnualPayTax() {

        yearsGoal = savingsGoal / (annualPay - (0.35 * annualPay));
        return annualPay - (0.35 * annualPay);
    }    

    public double getYearsGoal() {

        return yearsGoal;
    }
}
