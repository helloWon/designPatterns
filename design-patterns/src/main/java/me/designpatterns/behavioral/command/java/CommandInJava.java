package me.designpatterns.behavioral.command.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import me.designpatterns.behavioral.command.before.Game;
import me.designpatterns.behavioral.command.before.Light;

public class CommandInJava {

    public static void main(String[] args) {
        Light light = new Light();
        Game game = new Game();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        // executorService.submit(new Runnable() {
        // @Override
        // public void run() {
        // light.on();
        // }
        // });
        executorService.submit(() -> light.on());
        executorService.submit(light::on);
        executorService.submit(game::start);
        executorService.submit(game::end);
        executorService.submit(light::off);
        executorService.shutdown();
    }
}
