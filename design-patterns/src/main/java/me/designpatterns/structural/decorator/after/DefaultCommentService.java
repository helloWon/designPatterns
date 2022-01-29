package me.designpatterns.structural.decorator.after;

public class DefaultCommentService implements CommentService { // 구현체
    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
