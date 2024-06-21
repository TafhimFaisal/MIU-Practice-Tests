public class App {
    public static int isFancy(int number) {
        if(number == 1){
            return 1;
        }
        int first = 1;
        int second = 1;

        while (true) {
            int fancy = 3*second + 2*first;
            if(fancy == number){
                return 1;
            }
            if(fancy > number){
                return 0;
            }
            first = second;
            second = fancy;
        }

    }
    public static void main(String[] args) throws Exception {
        System.out.println(isFancy(1));
    }
}
