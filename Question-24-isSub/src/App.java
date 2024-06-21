public class App {
    public static int isSub(int[] a) {
        int isSub = 1;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i+1; j < a.length; j++) {
                sum+=a[j];
            }
            if(a[i] <= sum){
                isSub = 0;
            }
        }
        return isSub;
    }
    public static void main(String[] args) throws Exception {
        int[] arr1 = {13, 6, 3, 2};
        int[] arr2 = {11, 5, 3, 2};

        System.out.println(isSub(arr1)); // Output: 1 (true)
        System.out.println(isSub(arr2)); // Output: 0 (false)
    }
}
