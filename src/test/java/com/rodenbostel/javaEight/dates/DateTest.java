package com.rodenbostel.javaEight.dates;

import org.junit.Test;

import static java.lang.System.out;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by justin on 10/6/16.
 */
public class DateTest {

    DateFun df = new DateFun();

    @Test
    public void testGetClock() {
        out.println(df.getClock());
        assertEquals("SystemClock[America/Chicago]", df.getClock().toString());
    }

    @Test
    public void testGetMillis() {
        out.println(df.getMillis());
        assertNotNull(df.getMillis());
    }

    @Test
    public void testGetInstance() {
        out.println(df.getInstant());
        assertNotNull(df.getInstant());
    }

    @Test
    public void testGetLegacyDate() {
        out.println(df.getLegacyDate());
        assertTrue(df.getLegacyDate() instanceof java.util.Date);
    }

    @Test
    public void testGetZone1() {
        out.println(df.getZone1());
        assertEquals("Europe/Berlin", df.getZone1().toString());
    }

    @Test
    public void testGetZone2() {
        out.println(df.getZone2());
        assertEquals("Brazil/East", df.getZone2().toString());
    }

    @Test
    public void testGetNow1() {
        out.println(df.getNow1());
        assertNotNull(df.getNow1());
    }

    @Test
    public void testGetNow2() {
        out.println(df.getNow2());
        assertNotNull(df.getNow2());
    }

    @Test
    public void testGetHoursBetween() {
        assertEquals(-5, df.getHoursBetween());
    }

    @Test
    public void testGetMinutesBetween() {
        assertEquals(-300, df.getMinutesBetween());
    }

    @Test
    public void testGetToday() {
        out.println(df.getToday().toString());
        assertNotNull(df.getToday().toString());
    }

    @Test
    public void testGetTomorrow() {
        out.println(df.getTomorrow().toString());
        assertNotNull(df.getTomorrow().toString());
    }

    @Test
    public void testGetYesterday() {
        out.println(df.getYesterday().toString());
        assertNotNull(df.getYesterday().toString());
    }
}
