package org.example.Tests;

import org.example.Authenticated;
import org.example.InternalSystem;
import org.example.Manager;

public class SystemTest {
    public static void main(String[] args) {
        Authenticated manager = new Manager();
        manager.setPassword(2222);

        InternalSystem is = new InternalSystem();
        is.authenticate(manager);
    }
}
