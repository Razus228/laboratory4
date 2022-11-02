package Application.Deposit;

import Application.BankClient.Client;

public class Deposit extends Client {

    private int depositId;
    private float depositAmount;

    public Deposit(){}


    public Deposit(int depositId,float depositAmount){
        this.depositId = depositId;
        this.depositAmount = depositAmount;
    }

    public void setDepositId(int depositId) {
        this.depositId = depositId;
    }

    public int getDepositId() {
        return this.depositId;
    }

    public void setDepositAmount(float depositAmount) {
        this.depositAmount = depositAmount;
    }

    public float getDepositAmount() {
        return this.depositAmount;
    }
}