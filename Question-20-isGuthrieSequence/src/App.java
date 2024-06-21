public class App {
    public static int isGuthrieSequence(int[] args) {
        if(args.length == 0 || args[args.length - 1] != 1){
            return 0;
        }

        int n = args[0];
        for (int i = 1; i < args.length; i++) {
            if(n == 1){
                return 0;
            }
            if(args[i]%2 == 0){
                n = n*2;
            }else{
                n = (n-1)/2;
            }
            if(args[i] != n){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
        int[] a1 = {8, 4, 2, 1};
        int[] a2 = {8, 17, 4, 1};
        int[] a3 = {8, 4, 1};
        int[] a4 = {8, 4, 2};

        System.out.println(isGuthrieSequence(a1)); // Output: 1
        System.out.println(isGuthrieSequence(a2)); // Output: 0
        System.out.println(isGuthrieSequence(a3)); // Output: 0
        System.out.println(isGuthrieSequence(a4)); // Output: 0
    }
}
