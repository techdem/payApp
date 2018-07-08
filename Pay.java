public class Pay {

    private int weeklyPay;
    private double basicHours;
    private double hourlyRate;
    private double monthlyPay;
    private double annualPay;
    private int goal;
    private double yearsGoal;

    public void setWeeklyPay(int weeklyPay) {

        this.weeklyPay = weeklyPay;
    }

    public void setBasicHours(double basicHours) {

        this.basicHours = basicHours;
    }

    public void setGoal(int goal) {

        this.goal = goal;
    }

    public void compute() {

        monthlyPay = weeklyPay*4.33;
        annualPay = weeklyPay*52;
        hourlyRate = weeklyPay/basicHours;
        yearsGoal = goal/annualPay;
    }

    public double getWeeklyPayTax() {

        return 500+(0.52*(weeklyPay-577));
    }

    public double getMonthlyPay() {

        return monthlyPay;
    }

    public double getMonthlyPayTax() {

        return 2165+(0.52*(monthlyPay-2500));
    }

    public double getAnnualPay() {

        return annualPay;
    }

    public double getAnnualPayTax() {

        return 26000+(0.52*(annualPay-30000));
    }

    public double getHourlyRate() {

        return hourlyRate;
    }

    public double getYearsGoal() {

        return yearsGoal;
    }
}
