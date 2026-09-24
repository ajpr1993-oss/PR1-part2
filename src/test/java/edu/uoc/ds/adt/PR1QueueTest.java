package edu.uoc.ds.adt;

import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.traversal.Iterator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class PR1QueueTest {
    PR1Queue pr1q;
    PR1MathFunction pr1f;

    private void fillQueue() {
        for (int c = 0; c < 15; c++) {
            pr1q.add(pr1f.computeValue(c));

        }
    }
    @Before
    public void setUp() {
        this.pr1q = new PR1Queue();
        this.pr1f = new PR1MathFunction();

        assertNotNull(this.pr1q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr1q = null;
        this.pr1f = null;
    }


    @org.junit.Test
    public void queueTest() {
        assertEquals(this.pr1q.CAPACITY-1, this.pr1q.getQueue().size());
        Assert.assertEquals(2, pr1q.poll());
        Assert.assertEquals(6, pr1q.poll());
        Assert.assertEquals(12, pr1q.poll());
        Assert.assertEquals(20, pr1q.poll());
        Assert.assertEquals(30, pr1q.poll());
        Assert.assertEquals(42, pr1q.poll());
        Assert.assertEquals(56, pr1q.poll());
        Assert.assertEquals(72, pr1q.poll());
        Assert.assertEquals(90, pr1q.poll());
        Assert.assertEquals(110, pr1q.poll());
        Assert.assertEquals(132, pr1q.poll());
        Assert.assertEquals(156, pr1q.poll());
        Assert.assertEquals(182, pr1q.poll());
        Assert.assertEquals(210, pr1q.poll());
        Assert.assertEquals(240, pr1q.poll());
        assertEquals(0, this.pr1q.getQueue().size());
    }

    @Test
    public void queueTest2() {

        Queue<Integer> queue = pr1q.getQueue();
        Iterator<Integer> it = queue.values();

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(2), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(6), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(12), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(20), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(30), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(42), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(56), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(72), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(90), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(110), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(132), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(156), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(182), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(210), it.next());

        assertTrue(it.hasNext());
        assertEquals(Integer.valueOf(240), it.next());

    }

}
