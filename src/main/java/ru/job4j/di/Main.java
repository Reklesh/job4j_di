package ru.job4j.di;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        IntStream.range(0, 2).forEach(i -> {
            ui.add("Введите имя:");
        });
        ui.print();
    }
}