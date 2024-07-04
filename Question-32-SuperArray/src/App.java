public class App {

    public static int isSuper(int[] a) {
        if(a.length == 0) return 0;
        int sum = 0;
        for (int number : a) {
            if(number <= sum){
                return 0;
            }
            sum+=number;
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 13};
        int[] arr2 = {2, 3, 5, 11};
        
        System.out.println(isSuper(arr1)); // Output: 1
        System.out.println(isSuper(arr2)); // Output: 0
    }

}