// Ex 5.13 pg 123
public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }

    public void calculateMonthlyInterest(){
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double newRate){
        annualInterestRate = newRate;
    }

    public void setSavingsBalance(double newBalance){
        savingsBalance = newBalance;
    }

    public static void main(String[] args){
        SavingsAccount customer1 = new SavingsAccount(1500.00);
        SavingsAccount customer2 = new SavingsAccount(34000.00);
        SavingsAccount customer3 = new SavingsAccount(1800);
        SavingsAccount customer4 = new SavingsAccount(2000);

        modifyInterestRate(5);
        customer1.calculateMonthlyInterest();
        customer2.calculateMonthlyInterest();
        customer3.calculateMonthlyInterest();
        customer4.calculateMonthlyInterest();

        System.out.println("AIR = " + getAnnualInterestRate());
        System.out.println("Customer1 balance = " + customer1.getSavingsBalance());
        System.out.println("Customer2 balance = " + customer2.getSavingsBalance());
        System.out.println("Customer3 balance = " + customer3.getSavingsBalance());
        System.out.println("Customer4 balance = " + customer4.getSavingsBalance());
    }
}