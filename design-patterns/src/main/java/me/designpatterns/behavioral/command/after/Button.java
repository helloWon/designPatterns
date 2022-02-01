package me.designpatterns.behavioral.command.after;

import java.util.Stack;

import me.designpatterns.behavioral.command.before.Game;
import me.designpatterns.behavioral.command.before.Light;

public class Button {

    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {
        // Button button = new Button(new LightOnCommand(new Light())); // 더 이상 button의 코드를 고치지 않아도 됨
        // button.press();
        Button button = new Button();
        button.press(new GameStartCommand(new Game()));
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();
    }
}
