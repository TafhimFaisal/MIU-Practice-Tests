public class App {
    public static int isFunny(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 5 && arr[i+1] != 13 ){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
        int[] testArray1 = {5, 13, 1, 5, 13};
        int[] testArray2 = {5, 13, 1, 5, 1};
        int[] testArray3 = {1, 2, 3, 4, 5, 13, 5, 13, 6, 7};
        int[] testArray4 = {5, 13, 5, 13, 5, 5};
        
        System.out.println(isFunny(testArray1)); // Should print 1
        System.out.println(isFunny(testArray2)); // Should print 0
        System.out.println(isFunny(testArray3)); // Should print 1
        System.out.println(isFunny(testArray4)); // Should print 0
    }
}
