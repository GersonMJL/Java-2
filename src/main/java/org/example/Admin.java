package org.example;

public class Admin extends AuthenticatedEmployee {

    @Override
    public double getBonus() {
        return 50;
    }
}
