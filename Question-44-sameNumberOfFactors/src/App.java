public class App {
    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                count++;
            }
        }
        return count;
    }
    public static int sameNumberOfFactors(int n1, int n2) {
        if(n1 < 0 || n2 < 0){
            return -1;
        }

        if(n1 == n2){
            return 1;
        }

        int n1Factor = countFactors(n1);
        int n2Factor = countFactors(n2);
        
        return n1Factor == n2Factor ? 1 : 0;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(sameNumberOfFactors(-6, 21));    // -1
        System.out.println(sameNumberOfFactors(6, 21));  // 1
        System.out.println(sameNumberOfFactors(8, 12));  // 0
        System.out.println(sameNumberOfFactors(23, 97)); // 1
        System.out.println(sameNumberOfFactors(0, 1));   // 0
        System.out.println(sameNumberOfFactors(0, 0));   // 1
    }
}
