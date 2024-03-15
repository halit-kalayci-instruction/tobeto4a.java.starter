package org.example;

// DRY => Don't Repeat Yourself
// Inheritance
// subclass - superclass
public class Customer extends User
{
    public Customer(String name, String surname, String email, String password, int age, String customerNo) {
        super(name, surname, email, password, age);
        this.customerNo = customerNo;
    }

    public Customer() {
        super(); // ctor'a
    }

    private String customerNo;

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }
}
// Inheritance => Kalıtım,Miras
