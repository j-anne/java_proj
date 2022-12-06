public class TriangleDrawer {
    public static void drawTriangle(int N) {
        for (int i = 0; i <= N; i+=1){
            for (int j = 0; j < i; j+=1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}