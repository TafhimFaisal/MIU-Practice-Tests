public class App {
    public static int isEvenSpaced(int[] a) {
        if(a.length < 2) return 0;
        int isEvenSpaced = 0;
        int max = a[0];
        int min = a[0];
        for (int i : a) {
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        
        isEvenSpaced = (max - min)%2 == 0 ? 1 : 0;
        return isEvenSpaced;
    }
    public static void main(String[] args) throws Exception {
        // Test cases
        int[] arr1 = {100, 19, 131, 140};
        int[] arr2 = {200, 1, 151, 160};
        int[] arr3 = {200, 10, 151, 160};
        int[] arr4 = {100, 19, -131, -140};
        int[] arr5 = {80, -56, 11, -81};

        System.out.println(isEvenSpaced(arr1)); // Expected: 0
        System.out.println(isEvenSpaced(arr2)); // Expected: 0
        System.out.println(isEvenSpaced(arr3)); // Expected: 1
        System.out.println(isEvenSpaced(arr4)); // Expected: 1
        System.out.println(isEvenSpaced(arr5)); // Expected: 0
    }
}
