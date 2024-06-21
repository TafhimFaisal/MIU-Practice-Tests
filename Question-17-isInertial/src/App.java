import java.util.List;

public class App {
    public static int isInertial(int[] args) {
        int maxValue = args[0];
        boolean hasOdd = false;

        for (int i : args) {
            if(i > maxValue ){
                maxValue = i;
            }
            if(i%2 != 0){
                hasOdd = true;
            }
        }

        if(!hasOdd || maxValue%2 != 0){
            return 0;
        }

        for (int odd : args) {
            if(odd%2 != 0){
                for (int even : args) {
                    if(even%2 == 0 && even < maxValue){
                        if(odd <= even){
                            return 0;
                        }
                    }
                }
            }
        }

        
        return 1;
    }
    public static void main(String[] args) throws Exception {
        // Test cases
        int[] test1 = {11, 4, 20, 9, 2, 8}; // Expected: 1
        int[] test2 = {12, 11, 4, 9, 2, 3, 10}; // Expected: 0
        int[] test3 = {1}; // Expected: 0
        int[] test4 = {2}; // Expected: 0
        int[] test5 = {1, 2, 3, 4}; // Expected: 0
        int[] test6 = {1, 1, 1, 1, 1, 1, 2}; // Expected: 1
        int[] test7 = {2, 12, 4, 6, 8, 11}; // Expected: 1
        int[] test8 = {2, 12, 12, 4, 6, 8, 11}; // Expected: 1
        int[] test9 = {-2, -4, -6, -8, -11}; // Expected: 0
        int[] test10 = {2, 3, 5, 7}; // Expected: 0
        int[] test11 = {2, 4, 6, 8, 10}; // Expected: 0

        System.out.println(isInertial(test1)); // 1
        System.out.println(isInertial(test2)); // 0
        System.out.println(isInertial(test3)); // 0
        System.out.println(isInertial(test4)); // 0
        System.out.println(isInertial(test5)); // 0
        System.out.println(isInertial(test6)); // 1
        System.out.println(isInertial(test7)); // 1
        System.out.println(isInertial(test8)); // 1
        System.out.println(isInertial(test9)); // 0
        System.out.println(isInertial(test10)); // 0
        System.out.println(isInertial(test11)); // 0
    }
}
