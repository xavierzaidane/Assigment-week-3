package task;

class member {
   
private String memberID;
private String name;
private double loanAmount;

public member(String memberID, String name, double loanAmount) {
    this.memberID = memberID;
    this.name = name;
    this.loanAmount = loanAmount;
}

public String getMemberID() {
return memberID;
}

public String getName() {
return name;
}

public double getLoanAmount() {
return loanAmount;
}

public void borrow(double amount) {
loanAmount += amount;
}

public void repay(double amount) {
loanAmount -= amount;
}

public double getRemainingLoan() {
return loanAmount;
}
}

public class TestOperasi {
public static void main(String[] args) {
member donny = new member("111333444","Donny", 5000000);

System.out.println("Member name: " + donny.getName());
System.out.println("Loan limit: " + donny.getLoanAmount());

donny.borrow(1000000);
System.out.println("Donny borrowed 1,000,e0e. New loan amount: " + donny.getLoanAmount());

donny.repay(500000);
System.out.println("Donny repaid 500,000. New loan amount: " + donny.getLoanAmount());
}
private double loanAmount;
public void repay(double amount) {
    double minInstallment = loanAmount * 0.10;
    if (amount < minInstallment) {
        System.out.println("Sorry, installments must be 10% of the loan amount.");
    } else {
        loanAmount -= amount;
    }
}
}

