public class App {
    public static int isCubePowerful(int n) {
        if(n<=0){
            return 0;
        }
        int original = n;
        int sum = 0;
        while (n>0) {
            int digit = n%10;
            sum+= Math.pow(digit, 3);
            n/=10;
        }
        if(original == sum){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(isCubePowerful(153)); // Output: 1
        System.out.println(isCubePowerful(370)); // Output: 1
        System.out.println(isCubePowerful(371)); // Output: 1
        System.out.println(isCubePowerful(407)); // Output: 1
        System.out.println(isCubePowerful(87));  // Output: 0
        System.out.println(isCubePowerful(0));   // Output: 0
        System.out.println(isCubePowerful(-81)); // Output: 0
    }
}
