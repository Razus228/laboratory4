package Application.Cards;

import Application.BankClient.Client;

public class Card extends Client {

    private int cardId;
    private int pinCode;
    private float amount;

    public Card(){}

    public Card(int cardId,int pinCode,float amount){
        this.cardId = cardId;
        this.amount = amount;
        this.pinCode = pinCode;

    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getCardId() {
        return this.cardId;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getPinCode() {
        return this.pinCode;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return this.amount;
    }
}