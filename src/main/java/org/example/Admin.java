package org.example;

public class Admin extends Employee implements Authenticated {

    private AuthenticationHelper helper;

    public Admin() {
        this.helper = new AuthenticationHelper();
    }

    @Override
    public double getBonus() {
        return 50;
    }

    @Override
    public boolean authenticate(int password) {
        return this.helper.authenticate(password);
    }

    @Override
    public void setPassword(int password) {
        this.helper.password = password;
    }
}
