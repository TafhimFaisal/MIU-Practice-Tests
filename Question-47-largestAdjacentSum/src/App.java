public class App {
    public static int largestAdjacentSum(int[] a) {
        int maxSum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int sum = a[i] + a[i+1];
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) throws Exception {
        // Test cases
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {18, -12, 9, -10};
        int[] array3 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] array4 = {1, 1, 1, 1, 1, 2, 1, 1, 1};

        System.out.println(largestAdjacentSum(array1)); // Output: 7
        System.out.println(largestAdjacentSum(array2)); // Output: 6
        System.out.println(largestAdjacentSum(array3)); // Output: 2
        System.out.println(largestAdjacentSum(array4)); // Output: 3
    }
}
