package edu.uoc.ds.adt;

import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.traversal.Iterator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.*;

public class PR1StackTest {

    PR1Stack pr1q;
    PR1MathFunction pr1f;

    private void fillStack() {
        for (int c = 0; c < 15; c++) {
            pr1q.push(pr1f.computeValue(c));
        }
    }

    @Before
    public void setUp() {
        this.pr1q = new PR1Stack();
        this.pr1f = new PR1MathFunction();

        assertNotNull(this.pr1q.getStack());
        this.fillStack();
    }

    @After
    public void release() {
        this.pr1q = null;
        this.pr1f = null;
    }


    @org.junit.Test
    public void stackTest() {

        assertEquals(this.pr1q.CAPACITY-1, this.pr1q.getStack().size());

        Assert.assertEquals(240, pr1q.pop());
        Assert.assertEquals(210, pr1q.pop());
        Assert.assertEquals(182, pr1q.pop());
        Assert.assertEquals(156, pr1q.pop());
        Assert.assertEquals(132, pr1q.pop());
        Assert.assertEquals(110, pr1q.pop());
        Assert.assertEquals(90, pr1q.pop());
        Assert.assertEquals(72, pr1q.pop());
        Assert.assertEquals(56, pr1q.pop());
        Assert.assertEquals(42, pr1q.pop());
        Assert.assertEquals(30, pr1q.pop());
        Assert.assertEquals(20, pr1q.pop());
        Assert.assertEquals(12, pr1q.pop());
        Assert.assertEquals(6, pr1q.pop());
        Assert.assertEquals(2, pr1q.pop());

        assertEquals(0, this.pr1q.getStack().size());
    }

}
