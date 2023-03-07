package org.example;

public class Client implements Authenticated {

    private AuthenticationHelper helper;

    public Client() {
        this.helper = new AuthenticationHelper();
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
