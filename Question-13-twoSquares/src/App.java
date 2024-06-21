public class App {
    public static String twoSquare(int n) {
        int count = 0;
        for (int i = 0; i*i <= n; i++) {
            for (int j = i; j*j <= n; j++) {
                if(i*i + j*j == n){
                    count++;
                    if(count > 2){
                        return "can be expressed as a sum of two squares";
                    }
                }
            }
        }
        return count > 2 ? "can be expressed as a sum of two squares" : "can not be expressed as a sum of two squares";
    }
    public static void main(String[] args) throws Exception {
        System.out.println(twoSquare(41));
    }
}
