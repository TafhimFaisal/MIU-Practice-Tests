public class App {
    public static int isMeera(int[] args) {
        boolean hasNine = false;
        boolean hasOne = false;
        for (int number : args) {
            if(number == 1){
                hasOne = true;
            }else if(number == 9){
                hasNine = true;
            }
        }
        if((hasNine && hasOne) || (!hasNine && !hasOne)){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) throws Exception {
        int[] arg = {6,10,8};

        System.out.println(isMeera(arg));
    }
}
