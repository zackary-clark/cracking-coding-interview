package Q12;

public class PathsWithSum {
    private final Node root;

    public PathsWithSum(Node root) {
        this.root = root;
    }

    public int numPaths(int sum) {
        return numPathsHelper(sum, root, new int[0]);
    }

    private int numPathsHelper(int sum, Node node, int[] runningSum) {
        if (node == null) {
            return 0;
        }
        int[] newRunningSum = new int[runningSum.length + 1];
        int paths = node.data == sum ? 1 : 0;
        for (int i = 0; i < runningSum.length; i++) {
            if ((node.data + runningSum[i]) == sum) {
                paths++;
            }
            newRunningSum[i] = runningSum[i] + node.data;
        }
        newRunningSum[runningSum.length] = node.data;
        int leftPaths = numPathsHelper(sum, node.left, newRunningSum);
        int rightPaths = numPathsHelper(sum, node.right, newRunningSum);
        return leftPaths + rightPaths + paths;
    }
}
