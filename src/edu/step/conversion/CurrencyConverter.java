package edu.step.conversion;

public class CurrencyConverter {
    private double rataDeConversie;

    public void setRataDeConversie(double rataDeConversie)
    {
        if(rataDeConversie>0)
        this.rataDeConversie=rataDeConversie;
    }

    public double transformaSumaInEuro(double number)
    {
            return number / this.rataDeConversie;
    }

    public double transformaSumaInLei(double number)
    {
            return number * this.rataDeConversie;
    }

}
