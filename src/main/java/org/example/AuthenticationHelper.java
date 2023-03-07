package org.example;

public class AuthenticationHelper {

    protected int password;

    public boolean authenticate(int password) {
        return this.password == password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
