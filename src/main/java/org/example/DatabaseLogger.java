package org.example;

public class DatabaseLogger extends BaseLogger
{
    @Override
    public void log(String message) {
        System.out.println("Db'a loglandı:"+message);
    }
}
