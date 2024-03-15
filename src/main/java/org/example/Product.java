package org.example;

// Erişim Belirteci
public class Product
{
    // constructor - yapıcı blok
    // bir class hiç bir ctor tanımı içermiyor ise
    // boş ctor otomatik tanımlıdır.
    public Product(String name, double unitPrice, int stock)
    {
        this.name = name;
        this.unitPrice = unitPrice;
        this.stock = stock;
    }
    public Product()
    {

    }

    private String name;
    private double unitPrice; //read-only
    private int stock;

    // Concepts
    // OOP CONCEPTS


    // Encapsulation - Kapsülleme
    //getter

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
} // Scope