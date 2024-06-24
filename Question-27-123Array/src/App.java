public class App {
    public static int is123Array(int[] a) {
        if(a.length%3 != 0) return 0;
        for (int i = 0; i < a.length; i++) {
           if(a[i] != (i%3) + 1) return 0;
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
        int[] array1 = {1, 2, 3, 1, 2, 3, 1, 2, 3};
        int[] array2 = {1, 2, 3, 1, 2};

        System.out.println(is123Array(array1)); // Output: 1
        System.out.println(is123Array(array2)); // Output: 0
    }
}
