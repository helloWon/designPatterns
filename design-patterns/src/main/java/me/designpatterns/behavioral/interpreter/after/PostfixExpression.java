package me.designpatterns.behavioral.interpreter.after;

import java.util.Map;

public interface PostfixExpression {

    int interpret(Map<Character, Integer> context);

    /**
     * 더 간단하게 구현하는 방법
     */
    // static PostfixExpression plus(PostfixExpression left, PostfixExpression right) { // 구현체를 만들어주는 static한 method
    //     return context -> left.interpret(context) + right.interpret(context);
    // }

    // static PostfixExpression minus(PostfixExpression left, PostfixExpression right) { // 구현체를 만들어주는 static한 method
    //     return context -> left.interpret(context) - right.interpret(context);
    // }

    // static PostfixExpression variable(Character c) { // 구현체를 만들어주는 static한 method
    //     return context -> context.get(c);
    // }
}
