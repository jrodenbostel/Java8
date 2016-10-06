package com.rodenbostel.javaEight.streams;

import sun.net.www.content.audio.x_aiff;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by justin on 10/6/16.
 */
public class StreamsStreamsStreams {

    List<String> stringCollection = new ArrayList<>();

    public StreamsStreamsStreams() {
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
    }

    public List<String> filter() {
        return stringCollection.stream().filter(x -> x.endsWith("2")).collect(Collectors.toList());
    }

    public List<String> sort() {
        return stringCollection.stream().sorted((p1, p2) -> p1.compareTo(p2)).collect(Collectors.toList());
    }

    public List<String> mapSomething() {
        return stringCollection.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }

    public List<String> flatMapSomething() {
        return Stream.of(stringCollection, stringCollection, stringCollection).flatMap(x -> x.stream()).map(x -> x.toUpperCase()).collect(Collectors.toList());
    }

    //Performs ops like foldRight in Scala.
    public Optional<String> reduceTheList() {
        return Stream.of(stringCollection, stringCollection, stringCollection).flatMap(x -> x.stream()).reduce((x, y) -> x + "-" + y);
    }

    public boolean matchTheList() {
        return Stream.of(stringCollection, stringCollection, stringCollection).flatMap(x -> x.stream()).anyMatch(x -> x.toUpperCase().startsWith("A"));
    }
}
