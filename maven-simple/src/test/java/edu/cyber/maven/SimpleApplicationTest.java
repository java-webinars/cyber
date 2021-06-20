package edu.cyber.maven;

import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleApplicationTest
{
    @Test
    public void testSum() {
        SimpleApplication sa = new SimpleApplication();
        int answer = sa.sum(10, 15);
        Assert.assertTrue(answer == 25);
    }
}