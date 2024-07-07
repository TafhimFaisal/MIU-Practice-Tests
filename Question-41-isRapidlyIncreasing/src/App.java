public class App {
    public static int isRapidlyIncreasing(int[] arr) {
        if(arr.length == 0) return 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum+=arr[j];
            }
            if(arr[i] <= sum*2){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
    
        int[] arr1 = {1, 3, 9, 27};
        int[] arr2 = {1, 3, 200, 500};
        int[] arr3 = {1};
        int[] arr4 = {1, 3, 9, 26};
        int[] arr5 = {1, 3, 7, 26};
        int[] arr6 = {1, 3, 8, 26}; 
        
        System.out.println(isRapidlyIncreasing(arr1));
        System.out.println(isRapidlyIncreasing(arr2));
        System.out.println(isRapidlyIncreasing(arr3));
        System.out.println(isRapidlyIncreasing(arr4));
        System.out.println(isRapidlyIncreasing(arr5));
        System.out.println(isRapidlyIncreasing(arr6));

    }
}
