package org.example;

public class BonusControl {
    private double sum;
    public void register(Employee employee) {
        double bonus = employee.getBonus();
        this.sum = this.sum + bonus;
    }

    public double getSum() {
        return sum;
    }
}
