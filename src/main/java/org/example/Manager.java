package org.example;

public class Manager extends AuthenticatedEmployee {

    public double getBonus() {
        return super.getBonus() + super.getWage();
    }
}
