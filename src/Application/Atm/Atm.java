package Application.Atm;

import Application.Cards.Card;

public class Atm extends Card {

    private int cardId;
    private String atmAdress;
    private float amount;

    public Atm(){}

    public Atm(int cardId,String atmAdress,float amount){
        this.cardId = cardId;
        this.atmAdress = atmAdress;
        this.amount = amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setAtmAdress(String atmAdress) {
        this.atmAdress = atmAdress;
    }

    public String getAtmAdress() {
        return this.atmAdress;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getCardId() {
        return this.cardId;
    }
}
