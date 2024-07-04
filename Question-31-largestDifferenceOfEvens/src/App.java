public class App {
    public static int largestDifferenceOfEvens(int[] a) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean foundEven = false;
        for (int num : a) {
            if(num % 2 == 0){
                foundEven = true;
                if( num < min) min = num;
                if( num > max) max = num;
            }
        }
        
        if(!foundEven || min == max) return -1;
        return max - min;

    }
    public static void main(String[] args) throws Exception {
        int[] array1 = {-2, 3, 4, 9};
        int[] array2 = {1, 3, 5, 7};
        int[] array3 = {2, 4, 6, 8};
        int[] array4 = {8, 8, 8, 8};
        int[] array5 = {10};

        System.out.println(largestDifferenceOfEvens(array2));  // Output: -1
        System.out.println(largestDifferenceOfEvens(array3));  // Output: 6
        System.out.println(largestDifferenceOfEvens(array4));  // Output: -1
        System.out.println(largestDifferenceOfEvens(array1));  // Output: 6
        System.out.println(largestDifferenceOfEvens(array5));  // Output: -1
    }
}
