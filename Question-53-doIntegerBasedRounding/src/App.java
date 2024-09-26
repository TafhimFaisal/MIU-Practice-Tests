import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
       int[] arr1 = {1, 2, 3, 4, 5};
       int[] arr2 = {1, 2, 3, 4, 5};
       int[] arr3 = {1, 2, 3, 4, 5};
       int[] arr4 = {-1, -2, -3, -4, -5};
       int[] arr5 = {-18, 1, 2, 3, 4, 5};
       int[] arr6 = {1, 2, 3, 4, 5};
       int[] arr7 = {1, 2, 3, 4, 5};
       int n1 = 2;
       int n2 = 3;
       int n3 = -3;
       int n4 = 3;
       int n5 = 4;
       int n6 = 5;
       int n7 = 100;
    
       System.out.println(Arrays.toString(doIntegerBasedRounding(arr1, n1)) ); // Expected output: {2, 2, 4, 4, 6}
       System.out.println(Arrays.toString(doIntegerBasedRounding(arr2, n2))); // Expected output: {0, 3, 3, 3, 6}
       System.out.println(Arrays.toString(doIntegerBasedRounding(arr3, n3))); // Expected output: {1, 2, 3, 4, 5}
       System.out.println(Arrays.toString(doIntegerBasedRounding(arr4, n4))); // Expected output: {-1, -2, -3, -4, -5}
       System.out.println(Arrays.toString(doIntegerBasedRounding(arr5, n5))); // Expected output: {-18, 0, 4, 4, 4, 4}
       System.out.println(Arrays.toString(doIntegerBasedRounding(arr6, n6))); // Expected output: {0, 0, 5, 5, 5}
       System.out.println(Arrays.toString(doIntegerBasedRounding(arr7, n7))); // Expected output: {0, 0, 0, 0, 0}

    }

    public static int[] doIntegerBasedRounding(int[] a, int n) {
        
        if(n<=0){
            return a;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] > 0){
                int lowest = (a[i]/n)*n;
                int heighest = lowest+n;
                if(a[i] - lowest < heighest - a[i]){
                    a[i] = lowest;
                }else{
                    a[i] = heighest;
                }
            }
        }
        return a;
    }
}
