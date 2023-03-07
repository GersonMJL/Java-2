package org.example;

public class InternalSystem {
    private int password = 2222;
    public void authenticate(AuthenticatedEmployee employee) {
        boolean authenticated = employee.authenticate(this.password);

        if (authenticated) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Password invalid.");
        }
    }
}
