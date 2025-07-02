package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.IntStream;

public class SpringDI {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        IntStream.range(0, 2).forEach(i -> ui.add("Введите имя:"));
        ui.print();
    }
}