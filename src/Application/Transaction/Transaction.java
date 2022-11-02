package Application.Transaction;

import Application.BankClient.Client;

public class Transaction extends Client {

    public int transactionId;
    public float amount;

    public Transaction(){}


    public Transaction(int transactionId,float amount){
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public void setTransactionId(int transactionId){
        this.transactionId = transactionId;
    }
    public int getTransactionId(){

        return this.transactionId;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public float getAmount(){

        return this.amount;
    }

}