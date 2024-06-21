public class App {
    public static int isBeen(int[] args) {
        for (int n : args) {
            boolean found = false;
            for (int m : args) {
                if(m == 2*n || m == 2*n+1 || (n%2 == 0 && m == n/2)){
                    found = true;
                    break;
                }
            }
            if(!found){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws Exception {
        int[] numbs = {3, 8, 4};
        System.out.println(isBeen(numbs));
    }
}
