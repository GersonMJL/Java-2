package org.example.Tests;

import org.example.BonusControl;
import org.example.Manager;
import org.example.VideoEditor;

public class PolymorphismTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("Gerson");
        manager.setWage(6000);

        VideoEditor employee = new VideoEditor();
        employee.setWage(3000);

        VideoEditor editor = new VideoEditor();
        editor.setWage(4000);

        BonusControl control = new BonusControl();
        control.register(manager);
        control.register(employee);
        control.register(editor);

        System.out.println(control.getSum());
    }
}
