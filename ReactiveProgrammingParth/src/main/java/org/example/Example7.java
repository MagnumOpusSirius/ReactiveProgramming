package org.example;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;

public class Example7 {
    public static void main(String[] args) throws IOException {
        //print all the values from intNumbersFlux thats greater than 5
//        Flux<Integer> result= ReactiveSources.intNumbersFlux().filter(e->e>5);
//        result.subscribe(System.out::println);
//
//        //or also:


//        ReactiveSources.intNumbersFlux().filter(e->e>5).subscribe(System.out::println);

        //print 10 multiplication of each value from intNumbersFlux thats greater than 5:
//        Flux<Integer> result1= ReactiveSources.intNumbersFlux().filter(e->e>5).map(e->e*10);
//        result1.subscribe(System.out::println);

        //print 10 times each value from intNumbersFlux for the first 3 numbers thats greater than 5:
//        Flux<Integer> result2= ReactiveSources.intNumbersFlux().filter(e->e>5).map(e->e*10).take(3);
//        result2.subscribe(System.out::println);

        //print each value from intNumbersFlux thats greater than 20. Print -1 if no elements are found.
//        Flux<Integer> result3= ReactiveSources.intNumbersFlux().filter(e->e>20).defaultIfEmpty(-1);
//        result3.subscribe(System.out::println);

        //switch ints from intNumbersFlux to the right user from userFlux:
//        Flux<Integer> intNumbersFlux = ReactiveSources.intNumbersFlux();
//        Flux<User> userFlux = ReactiveSources.userFlux();
//
//        Flux<User> result = intNumbersFlux
//                .flatMap(number -> userFlux
//                        .elementAt(number - 1) // Adjust for 0-based index
//                        .switchIfEmpty(Mono.empty())) // Handle out-of-range values
//                .filter(user -> user != null); // Filter out null values
//
//        result.subscribe(System.out::println);


//        ReactiveSources.intNumbersFlux().flatMap(id->ReactiveSources.userFlux().filter(user->user.getId()==id)).distinct().subscribe(System.out::println);


        //print only distinct numbers from intNumbersFluxWithRepeat
//        Flux<Integer> result5= ReactiveSources.intNumbersFluxWithRepeat().distinct();
//        result5.subscribe(System.out::println);
//
//        //print from intNumbersFluxWithRepeat excluding immediately repeated numbers
//        Flux<Integer> result6= ReactiveSources.intNumbersFluxWithRepeat().distinctUntilChanged();
//        result6.subscribe(System.out::println);


        System.in.read();
    }
}
