package Application.Loan;

import Application.BankClient.Client;

public class Loan extends Client {

    private int loanId;
    private float loanAmount;
    private float rate;


    public Loan(){}


    public Loan(int loanId,float loanAmount,float rate){
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.rate = rate;

    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public int getLoanId() {
        return this.loanId;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public float getLoanAmount() {
        return this.loanAmount;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getRate() {
        return this.rate;
    }
}