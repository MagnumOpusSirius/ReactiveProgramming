package org.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;

public class Example9 {
    public static void main(String[] args) throws IOException {
        //use ReactiveSources.intNumbersFlux();

        //print size of intNumbersFlux() after the last item returns:

        Flux<Integer> iflux = ReactiveSources.intNumbersFlux();
//
//        iflux
//                .doOnNext(value -> System.out.println("Value: " + value)) // Print each integer
//                .collectList()
//                .subscribe(
//                        list -> {
//                            int size = list.size();
//                            System.out.println("Size of intNumbersFlux: " + size);
//                        },
//                        error -> System.err.println("Error: " + error.getMessage())
//                );


        //collect all items of intNumbersFlux into a single list and print it.
//        iflux
//                .collectList()
//                .subscribe(
//                        list -> System.out.println("List: " + list),
//                        error -> System.err.println("Error: " + error.getMessage())
//                );

        //transform to a sequence of sums of adjacent two numbers:
        iflux
                .buffer(2, 1)
                .map(list -> list.stream().reduce(0, Integer::sum))
                .subscribe(
                        value -> System.out.println("Value: " + value),
                        error -> System.err.println("Error: " + error.getMessage())
                );

        System.in.read();
    }
}
