public class FindMax {
    public static int findMax(int[] array) {
        // finding the max value
        int max = array[0];
       for (int num : array) {
           if (num > max) {
               max = num;
           }
        }
       // returning the max value
        return max;
    }
}
