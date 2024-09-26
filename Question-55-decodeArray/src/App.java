public class App {
    public static int decodeArray(int[] a) {
        int sign = a[0] < 0 ? -1 : 1;
        int number = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int absolute = Math.abs(a[i] - a[i+1]);
            number = (number*10) + absolute;
        } 
        return sign*number;
    }
    public static void main(String[] args) throws Exception {
        // Test cases
        int[] array1 = {0, -3, 0, -4, 0};
        int[] array2 = {-1, 5, 8, 17, 15};
        int[] array3 = {1, 5, 8, 17, 15};
        int[] array4 = {111, 115, 118, 127, 125};
        int[] array5 = {1, 1};

        System.out.println(decodeArray(array1)); // Output: 3344
        System.out.println(decodeArray(array2)); // Output: -6392
        System.out.println(decodeArray(array3)); // Output: 4392
        System.out.println(decodeArray(array4)); // Output: 4392
        System.out.println(decodeArray(array5)); // Output: 0
    }
}
