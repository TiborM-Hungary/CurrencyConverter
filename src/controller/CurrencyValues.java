package controller;

public class CurrencyValues {

    /**
     * Singleton class - to enable single instance access for the currency values
     */

    //Empty constructor
    public CurrencyValues() {
    }

    //Single instance of the class
    private static CurrencyValues sessionInstance;

    //Getter - to get the instance of this class - Singleton
    public static CurrencyValues getSessionInstance() {
        //Failsafe - if there is no instance of the class at this point, we create it
        if (sessionInstance == null) {
            sessionInstance = new CurrencyValues();
        }
        return sessionInstance;
    }

    //Currency values with getters
    int eur = 357;
    int usd = 301;
    int gbp = 416;
    int aud = 225;
    int cad = 241;
    double rub = 4.23;

    public int getEur() {
        return eur;
    }

    public int getUsd() {
        return usd;
    }

    public int getGbp() {
        return gbp;
    }

    public int getAud() {
        return aud;
    }

    public int getCad() {
        return cad;
    }

    public double getRub() {
        return rub;
    }
}
