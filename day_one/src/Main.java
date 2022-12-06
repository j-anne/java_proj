public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // Exercise 1: Draw triangle
//        TriangleDrawer.drawTriangle(10);

        // Exercise 2 & 3: Return Max
//        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
//        System.out.println(ReturnMax.max(numbers));

        // Exercise 4: Break and Continue
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        BreakContinue.windowPosSum(a, n);
        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}