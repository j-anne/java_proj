public class ReturnMax {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int largest = 0;
        for (int i = 0; i < m.length; i+=1) {
            if (m[i]> largest) {
                largest = m[i];
            }
        }
        return largest;
    }
}
