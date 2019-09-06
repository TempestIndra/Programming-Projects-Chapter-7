import java.text.NumberFormat;

public class PP7_6 {

    private final double interest = 1.03;

    private double Bank[][] = new double [30][2];
    private int AccountNum = 0;


    public PP7_6(double accountNumber, double amount){
        Bank[AccountNum][0] = accountNumber;
        Bank[AccountNum][1] = amount;
    }

    public void addInterest(){
        for(int i = 0; i < 30; i++){
            Bank[i][2] = Bank[i][1] * interest;
        }
    }

    public double deposit(double accountNumber, double amount){
        int realOrder = 0;
        for(int i  =0 ; i< 30; i++){
            if(Bank[i][0] == accountNumber){
                realOrder = i;
            }
        }
        if(Bank[realOrder][1] > 0){
            Bank[realOrder][1] = Bank[realOrder][1] + amount;
        }
        return Bank[realOrder][1];
    }

    public double withdraw(double accountNumber, double amount, double fee){
        int realOrder = 0;
        for(int i  =0 ; i< 30; i++){
            if(Bank[i][0] == accountNumber){
                realOrder = i;
            }
        }
        if(amount+fee > 0 && amount +fee < Bank[realOrder][1]){
            Bank[realOrder][1] = Bank[realOrder][1] - amount - fee;
        }
        return Bank[realOrder][1];
    }

    public double getBalance(double accountNumber){
        int realOrder = 0;
        for(int i  =0 ; i< 30; i++){
            if(Bank[i][0] == accountNumber){
                realOrder = i;
            }
        }
        return Bank[realOrder][1];
    }

    public String toString(double accountNumber){
        int realOrder = 0;
        for(int i  =0 ; i< 30; i++){
            if(Bank[i][0] == accountNumber){
                realOrder = i;
            }
        }
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (accountNumber + "\t" + fmt.format( Bank[realOrder][1] ));
    }
}

/*
* The L&L Bank can handle up to 30 customers who have savings
* accounts. Design and implements a program that manages the ac-
* counts. Keep track of key information, and allow each customer
* to make deposits and withdrawals. Produce appropriate error
* messages for invalid transactions. Hint: you may want to base
* your accounts on the Account class from Chapter 5. Also provide
* a method to add 3 percent interest to all accounts when ever the
* method is invoked
* */
