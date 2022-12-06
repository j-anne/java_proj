public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        for (int i = 0; i < a.length; i +=1){
            int total = 0;
            if (a[i] < 0) {
                continue;
            }
            for (int j = i; j <= n+i; j += 1) {
                if (j >= a.length){
                    break;
                }
                total = total + a[j];
            }
            a[i] = total;
        }
    }
}