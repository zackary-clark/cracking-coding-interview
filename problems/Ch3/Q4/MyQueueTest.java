package Q4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyQueueTest {
    @Test
    public void shouldEnqueueAndDequeueInCorrectOrder() {
        MyQueue subject = new MyQueue();
        subject.enqueue(1);
        subject.enqueue(2);
        subject.enqueue(3);
        subject.enqueue(4);
        assertEquals(1, subject.dequeue());
        assertEquals(2, subject.dequeue());
        subject.enqueue(5);
        assertEquals(3, subject.dequeue());
        assertEquals(4, subject.dequeue());
        assertEquals(5, subject.dequeue());
    }
}
