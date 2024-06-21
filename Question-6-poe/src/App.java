public class App {
    public static int findEquilibrium(int[] array) {
        int total_sum = 0;
        for (int i:array) {
            total_sum+=i;
        }
        int left_sum = 0;
        for (int idx = 0; idx < array.length; idx++) {
            int right_sum = total_sum - (left_sum + array[idx]);
            if(right_sum == left_sum){
                return idx;
            }
            
            left_sum+=array[idx];
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        int[] array = {1,8,3,7,10,2};
        App app = new App();
        int poe = app.findEquilibrium(array);

        System.out.println(poe);
    }
}
