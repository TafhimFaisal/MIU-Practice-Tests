public class App {
    public static int isSym(int[] a) {
        for (int i = 0,j=a.length - 1; i <= j; i++,j--) {
            if(
                ( a[i]%2 != 0 && a[j]%2 == 0 ) ||
                ( a[i]%2 == 0 && a[j]%2 != 0 )
            ){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) throws Exception {

        int[] arr1 = {2, 7, 9, 10, 11, 5, 8};
        int[] arr2 = {9, 8, 7, 13, 14, 17};
        int[] arr3 = {2, 7, 8, 9, 11, 13, 10};

        System.out.println(isSym(arr1)); // Output: 1
        System.out.println(isSym(arr2)); // Output: 1
        System.out.println(isSym(arr3)); // Output: 0
    }
}
