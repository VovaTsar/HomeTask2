package com.task.homework4;

import com.task.homework4.init.Menu;
import com.task.homework4.view.ViewInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ConsoleApplication {
    Menu menu;
    ViewInfo viewInfo;

    @Autowired
    public ConsoleApplication(Menu menu, ViewInfo viewInfo) {
        this.menu = menu;
        this.viewInfo = viewInfo;
    }

    public static void main(String[] s) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.task.homework4");
        ConsoleApplication main = ctx.getBean(ConsoleApplication.class);
        main.menu.run();
        main.viewInfo.run();
    }
}
