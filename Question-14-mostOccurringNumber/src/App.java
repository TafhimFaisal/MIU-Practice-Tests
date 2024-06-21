public class App {
    public static int mostOccuringNumber(int[] numbs) {
        int[] keys = new int[numbs.length];
        int[] keyCount = new int[numbs.length];
        int totalUniqueKey = 0;

        for (int numb : numbs) {
            boolean found = false;
            
            for (int i = 0; i < totalUniqueKey; i++) {
                if(numb == keys[i]){
                    keyCount[i]++;
                    found = true;
                    break;
                }    
            }
            if(!found){
                keys[totalUniqueKey] = numb;
                keyCount[totalUniqueKey] = 1;
                totalUniqueKey++;
            }
        }

        int maxKey = keys[0];
        int maxKeyCount = keyCount[0];
        for (int i = 1; i < totalUniqueKey; i++) {
            if(keyCount[i] > maxKeyCount ){
                maxKeyCount = keyCount[i];
                maxKey = keys[i];
            }
        }

        return maxKey;
    }
    public static void main(String[] args) throws Exception {
        int[] example1 = {6, 8, 1, 8, 2};
        int[] example2 = {6, 8, 1, 8, 6};
        
        System.out.println(mostOccuringNumber(example1)); // Expected output: 8
        System.out.println(mostOccuringNumber(example2)); // Expected output: 8 or 6
    }
}
