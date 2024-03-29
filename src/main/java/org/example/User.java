package org.example;

public class User
{
    // AllArgsCtor
    // NoArgsCtor

    public User() {
    }

    public User(String name, String surname, String email, String password, int age)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    private String name;
    private String surname;
    private String email;
    private String password;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
