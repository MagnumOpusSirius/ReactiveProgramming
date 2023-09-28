package org.example;

import java.util.stream.Stream;

public class StreamSources {

    public static Stream<String> stringNumbersStream() {
        // we want to create a stream of strings from 1 to 10
        // what does a stream do? it takes a source and processes it
        // what is the source? a collection, an array, a generator, a file, a network socket, etc.
        // where is this stream stored? in memory, on disk, in a database, etc.
        return Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
    }

    public static Stream<Integer> intNumbersStream() {
        //what this does is it creates a stream of numbers from 1 to 10
        //we want to iterate with the seed starting from 0 and incrementing by 2.
        return Stream.iterate(0, i -> i + 2)
                .limit(10);
    }

    public static Stream<User> userStream() {
        //we want to create a stream of users by creating a new user object
        return Stream.of(
                new User(1, "Lionel", "Messi"),
                new User(2, "Cristiano", "Ronaldo"),
                new User(3, "Diego", "Maradona"),
                new User(4, "Zinedine", "Zidane"),
                new User(5, "J�rgen", "Klinsmann"),
                new User(6, "Gareth", "Bale")
        );
    }
}
