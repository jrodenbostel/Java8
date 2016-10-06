package com.rodenbostel.javaEight.streams;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by justin on 10/6/16.
 */
public class StreamsStreamStreamsTest {

    StreamsStreamsStreams fun = new StreamsStreamsStreams();

    @Test
    public void testFilter() {
        List<String> tst = fun.filter();
        assertEquals(3, tst.size());
    }

    @Test
    public void testSort() {
        List<String> tst = fun.sort();
        assertEquals("aaa1", tst.get(0));
    }

    @Test
    public void testMap() {
        List<String> tst = fun.mapSomething();
        assertEquals("DDD2", tst.get(0));
    }

    @Test
    public void testFlatMap() {
        List<String> tst = fun.flatMapSomething();
        assertEquals(24, tst.size());
    }

    @Test
    public void testReduce() {
        Optional<String> tst = fun.reduceTheList();
        assertTrue(tst.isPresent());
        assertEquals("ddd2-aaa2-bbb1-aaa1-bbb3-ccc-bbb2-ddd1-ddd2-aaa2-bbb1-aaa1-bbb3-ccc-bbb2-ddd1-ddd2-aaa2-bbb1-aaa1-bbb3-ccc-bbb2-ddd1", tst.get());
    }

    @Test
    public void matchTheListTest() {
        assertTrue(fun.matchTheList());
    }
}
