package org.example;

import reactor.core.publisher.Flux;

import java.io.IOException;

public class Example8 {
    public static void main(String[] args) throws IOException {
        //use ReactiveSources.intNumbersFluxWithException():

        //print values from intNumbersFluxWithException() and print a message when error happens.
        ReactiveSources.intNumbersFluxWithException()
                .subscribe(
                        value -> System.out.println("Value: " + value),  // Handle emitted values
                        error -> System.err.println("Error: " + error.getMessage())  // Handle errors
                );

        //print values from intNumbersFluxWithException() and continue on errors:
//        ReactiveSources.intNumbersFluxWithException()
//                .onErrorContinue((error, value) -> System.err.println("Error: " + error.getMessage()))
//                .subscribe(
//                        value -> System.out.println("Value: " + value),  // Handle emitted values
//                        error -> System.err.println("Error: " + error.getMessage())  // Handle errors
//                );

        //print values from intNumbersFluxWithException and when errors happen, replace with a fallback sequence of -1 and -2:
//        ReactiveSources.intNumbersFluxWithException()
//                .onErrorResume(error -> Flux.just(-1, -2))
//                .subscribe(
//                        value -> System.out.println("Value: " + value),  // Handle emitted values
//                        error -> System.err.println("Error: " + error.getMessage())  // Handle errors
//                );

        System.in.read();

    }
}
