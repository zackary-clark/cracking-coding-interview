package Q12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathsWithSumTest {
    @Test
    public void pathsWithSum_shouldReturn3_ForThisCase() {
        Node ten = new Node(10);
        Node five = new Node(5);
        ten.left = five;
        Node two = new Node(2);
        five.right = two;
        Node one = new Node(1);
        two.right = one;
        Node threeA = new Node(3);
        five.left = threeA;
        Node threeB = new Node(3);
        threeA.left = threeB;
        Node negTwo = new Node(-2);
        threeA.right = negTwo;
        Node negThree = new Node(-3);
        ten.right = negThree;
        Node eleven = new Node(11);
        negThree.right = eleven;
        PathsWithSum subject = new PathsWithSum(ten);
        assertEquals(3, subject.numPaths(8));
    }
}
