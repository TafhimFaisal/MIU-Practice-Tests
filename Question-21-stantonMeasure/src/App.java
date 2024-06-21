public class App {
    public static int stantonMeasure(int[] a) {
        int n = 0;
        int stantonMeasure = 0;
        for (int i : a) {
            if(i==1){
                n++;
            }
        }
        
        for (int i : a) {
            if(i==n){
                stantonMeasure++;
            }
        }
        return stantonMeasure;
    }
    public static void main(String[] args) throws Exception {
        // Test cases
        int[] arr1 = {1};
        int[] arr2 = {0};
        int[] arr3 = {3, 1, 1, 4};
        int[] arr4 = {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4};
        int[] arr5 = {};

        System.out.println(stantonMeasure(arr1)); // Output: 1
        System.out.println(stantonMeasure(arr2)); // Output: 1
        System.out.println(stantonMeasure(arr3)); // Output: 0
        System.out.println(stantonMeasure(arr4)); // Output: 6
        System.out.println(stantonMeasure(arr5)); // Output: 0
    }
}
