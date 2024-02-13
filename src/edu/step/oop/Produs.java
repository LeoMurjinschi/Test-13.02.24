package edu.step.oop;

public class Produs {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public void Produs(int productId)
    {
        this.productId=productId;
    }

    public void Produs(int productId , String name , double price , int quantity)
    {
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public double getPrice()
    {
        return this.price;
    }

    public void changeQuantity(int qunatity)
    {
        this.quantity=quantity;
    }

}
