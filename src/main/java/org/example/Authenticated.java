package org.example;

public interface Authenticated {

    boolean authenticate(int password);
    void setPassword(int password);
}
