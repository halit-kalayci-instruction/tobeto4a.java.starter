package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // OOP
        // Nesne Yönelimli (Odaklı)

        // int,string,boolean,list
        String text = "Merhaba";

        // Laptop,Klavye
        // instance
        Product product = new Product("Laptop", 35000, 10);
        //product.setName("Laptop"); // set

        Product product2 = new Product("Klavye", 500, 5);
        //product2.setName("Klavye");
        //product2.setUnitPrice(50);
        Product product3 = new Product();

        System.out.println(product.getName());
        System.out.println(product2.getUnitPrice());
        //Category category =


        Customer customer = new Customer();
        customer.setName("Halit");
        customer.setSurname("Kalaycı");


        // Değişime çok açık.
        BaseLogger logger = new EmailLogger();
        logger.logBase("deneme");

        // O => Open/Closed Principle
        // SOLID => 5 adet clean code geliştirme
        // DRY => Dont repeat yourself
    }
}
// PostgreSQL
// Oracle