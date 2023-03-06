package org.example;

public class Manager extends Employee{
    private int password;

    public boolean authenticate(int password) {
        return this.password == password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getBonus() {
        return super.getBonus() + super.getWage();
    }
}
