package org.example;

public abstract class AuthenticatedEmployee extends Employee{
    protected int password;

    public boolean authenticate(int password) {
        return this.password == password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
}
