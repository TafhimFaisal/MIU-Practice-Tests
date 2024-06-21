public class App {
    public static int upcount(int[] array,int n) {
        boolean was_below_or_equal_n = true;
        int partial_sum = 0,count = 0;

        for (int i : array) {
            partial_sum+=i;
            if(was_below_or_equal_n && partial_sum > n){
                count++;
            }
            was_below_or_equal_n = partial_sum <= n;
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        App app = new App();
        int[] array = {2,3,1,-6,8,-3,-1,2};
        int n = 5;
        System.out.println(app.upcount(array,n));
    }
}
