package com.geekcap.vmturbo;

import org.junit.Assert;
import org.junit.Test;
import java.io.Serializable;

/**
 * Created by shaines on 7/24/16.
 */
public class ThingTest implements Serializable{

    @Test
    public void testN() {
        Thing t = new Thing();
        t.setN(5);
        Assert.assertEquals("N should be 5", 5, t.getN());
    }
}
