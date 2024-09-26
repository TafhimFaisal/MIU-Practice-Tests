import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
         // Test cases
        System.out.println(Arrays.toString(encodeNumber(2)));      // Output: [2]
        System.out.println(Arrays.toString(encodeNumber(6)));      // Output: [2, 3]
        System.out.println(Arrays.toString(encodeNumber(14)));     // Output: [2, 7]
        System.out.println(Arrays.toString(encodeNumber(24)));     // Output: [2, 2, 2, 3]
        System.out.println(Arrays.toString(encodeNumber(1200)));   // Output: [2, 2, 2, 2, 3, 5, 5]
        System.out.println(Arrays.toString(encodeNumber(1)));      // Output: null
        System.out.println(Arrays.toString(encodeNumber(-18)));      // Output: null
    }
    public static int[] encodeNumber(int n) {
        if(n<=1){
            return null;
        }
        int count = 0;
        int temp = n;
        for (int i = 2; i < temp; i++) {
            while(temp%i == 0){
                count++;
                temp/=i;
            }
        }
        if(temp > 1){
            count++;
        }

        int[] primeCounts = new int[count];
        temp = n;
        int index = 0;
        for (int i = 2; i < temp; i++) {
            while (temp%i == 0) {
                primeCounts[index++] = temp;
                temp/=i;
            }
        }
        if(temp > 1){
            primeCounts[index] = temp;
        }

        return primeCounts;
    }
}
