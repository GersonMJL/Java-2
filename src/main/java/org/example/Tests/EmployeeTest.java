package org.example.Tests;

import org.example.VideoEditor;

public class EmployeeTest {
    public static void main(String[] args) {
        VideoEditor gerson = new VideoEditor();
        gerson.setName("Gerson");
        gerson.setWage(7000.00);
        gerson.setCpf("222.222.222-22");

        System.out.println(gerson.getName());
        System.out.println(gerson.getBonus());
    }
}
