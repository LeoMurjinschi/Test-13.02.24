package edu.step.math;

public class calculator {
    public static int suma(int numar1, int numar2)
    {
        return numar1+numar2;
    }

    public static double suma(double numar1, double numar2)
    {
        return numar1+numar2;
    }

    public static int scadere(int numar1, int numar2)
    {
        return numar1-numar2;
    }

    public static double scadere(double numar1, double numar2)
    {
        return numar1-numar2;
    }

    public static int inmultire(int numar1, int numar2)
    {
        return numar1*numar2;
    }

    public static double inmultire(double numar1, double numar2)
    {
        return numar1*numar2;
    }

    public static int impartire(int numar1, int numar2)
    {
        return numar1/numar2;
    }

    public static double impartire(double numar1, double numar2)
    {
        return numar1/numar2;
    }

    public static void tabla_inmultirii(int number)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.print(number);
            System.out.print("*");
            System.out.print(i);
            System.out.print("=");
            System.out.println(number*i);
        }
    }

    public static void suma_numerelor(int number)
    {
        int s=0;
        for(int i=1;i<=number;i++)
        {
            s+=i;
        }
        System.out.println(s);
    }
}
