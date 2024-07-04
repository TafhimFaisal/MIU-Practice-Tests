public class App {
    public static int isFilter(int[] a) {
        boolean containe11 = false;
        boolean containe9 = false;
        boolean containe7 = false;
        boolean containe13 = false;
        for (int i : a) {
            if(i == 11) containe11 = true;
            if(i == 9) containe9 = true;
            if(i == 7) containe7 = true;
            if(i == 13) containe13 = true;
        }

        if(containe9 && !containe11) return 0;
        if(containe7 && containe13) return 0;
        return 1;
    }
    public static void main(String[] args) throws Exception {
        // Test cases
        int[] array1 = {1, 2, 3, 9, 6, 11};
        int[] array2 = {3, 4, 6, 7, 14, 16};
        int[] array3 = {1, 2, 3, 4, 10, 11, 13};
        int[] array4 = {3, 6, 5, 5, 13, 6, 13};
        int[] array5 = {9, 6, 18};
        int[] array6 = {4, 7, 13};
        
        System.out.println(isFilter(array1)); // 1
        System.out.println(isFilter(array2)); // 1
        System.out.println(isFilter(array3)); // 1
        System.out.println(isFilter(array4)); // 1
        System.out.println(isFilter(array5)); // 0
        System.out.println(isFilter(array6)); // 0
    }
}
