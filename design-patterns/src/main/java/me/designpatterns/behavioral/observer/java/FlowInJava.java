package me.designpatterns.behavioral.observer.java;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
// import java.util.concurrent.Flow.Subscriber;

/**
 * Flow API
 */
public class FlowInJava {

    public static void main(String[] args) throws InterruptedException {
        // Flow.Publisher<String> publisher = new Flow.Publisher<String>() { // 동기
        // @Override
        // public void subscribe(Subscriber<? super String> subscriber) {
        // subscriber.onNext("hello flow");
        // subscriber.onComplete();
        // }
        // };

        Flow.Publisher<String> publisher = new SubmissionPublisher<>(); // 비동기

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>() {

            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("sub!");
                this.subscription = subscription;
                this.subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println("onNext called");
                System.out.println(Thread.currentThread().getName());
                System.out.println(item);
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onComplete() {
                System.out.println("completed");
            }
        };

        publisher.subscribe(subscriber);

        ((SubmissionPublisher) publisher).submit("hello java");

        System.out.println("이게 먼저 출력될 수도 있습니다.");
    }
}
