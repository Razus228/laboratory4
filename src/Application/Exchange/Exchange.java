package Application.Exchange;

import Application.BankClient.Client;

public class Exchange extends Client {

    private float exchangeRateEuro = 0;
    private float exchangeRateDollar = 0;

    public Exchange() {
    }

    public Exchange(float exchangeRateEuro, float exchangeRateDollar) {
        this.exchangeRateEuro = exchangeRateEuro;
        this.exchangeRateDollar = exchangeRateDollar;
    }

    public void setExchangeRateDollar(float exchangeRateDollar) {
        this.exchangeRateDollar = exchangeRateDollar;
    }

    public float getExchangeRateDollar() {
        return this.exchangeRateDollar;
    }

    public void setExchangeRateEuro(float exchangeRateEuro) {
        this.exchangeRateEuro = exchangeRateEuro;
    }

    public float getExchangeRateEuro() {
        return this.exchangeRateEuro;
    }

    public float sellEuro(float amount) {
        if (exchangeRateEuro == 0) {
            System.out.println("Error the exchange rate for Euro is not available");
            return 0;
        }
        return amount * exchangeRateEuro;
    }

    public float buyEuro(float amount) {
        if (exchangeRateEuro == 0) {
            System.out.println("Error the exchange rate for Euro is not available");
            return 0;
        }
        return amount / exchangeRateEuro;
    }

    public float sellDollar(float amount) {
        if (exchangeRateDollar == 0) {
            System.out.println("Error the exchange rate for Dollar is not available");
            return 0;
        }
        return amount * exchangeRateDollar;
    }

    public float buyDollar(float amount) {
        if (exchangeRateDollar == 0) {
            System.out.println("Error the exchange rate for Dollar is not available");
            return 0;
        }
        return amount / exchangeRateDollar;
    }
}
