package org.example;

public abstract class BaseLogger implements Logger
{
    public void logBase(String message)
    {
        System.out.println("Loglama başladı..");
        log(message);
        System.out.println("Loglama bitti..");
    }
}
