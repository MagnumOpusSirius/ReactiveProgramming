package org.example;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;
public class Example {
    public static void main(String[] args) throws IOException {
        ReactiveSources.intNumbersFlux().log().subscribe(new MySubscriber());
        System.in.read();
    }
}

class MySubscriber<T> extends BaseSubscriber<T> {
    @Override
    public void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscribe happen");
        request(5);

    }
    @Override
    public void hookOnNext(T value) {
        System.out.println("value: " + value);
        request(1);
    }
}
