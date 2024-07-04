public class App {
    public static int isSquare(int n) {
        if(n < 0){
            return 0;
        }
        for (int i = 0; i*i <= n; i++) {
            if(i * i == n){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isSquare(4));   // Output: 1
        System.out.println(isSquare(25));  // Output: 1
        System.out.println(isSquare(-4));    // Output: 0
        System.out.println(isSquare(8));   // Output: 0
        System.out.println(isSquare(0));   // Output: 1
    }
}
