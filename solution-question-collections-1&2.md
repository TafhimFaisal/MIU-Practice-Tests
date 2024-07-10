# 1 largestAdjacentSum
```java
public static int largestAdjacentSum(int[] a){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length-1;i++){
            if(a[i] + a[i+1] > max){
                max = a[i] + a[i+1];
            }
        }      
    return max;
}
```
# 2 checkConcatenatedSum
```java
static int checkConcatenatedSum(int n, int catlen){
        int originalNumber = n;
        int totalSum = 0;
        while(n!=0){
            int digit = n%10;
            int concatSum = 0;
            for(int i=0;i<catlen;i++){
                concatSum = (concatSum *10) + digit;
            }
            totalSum += concatSum;
            n = n/10;
        }
        return  originalNumber == totalSum ? 1 : 0;
}
```   
# 3 equivalenArrays
```java
static int equivalenArrays(int [] a1,int []a2){
        Map<Integer,Integer> mapOne = new HashMap<>();
        Map<Integer,Integer> mapTwo = new HashMap<>();
        
        for(int i =0;i<a1.length;i++){
            if(!mapOne.containsKey(a1[i])) mapOne.put(a1[i], 1);
            else mapOne.put(a1[i], mapOne.get(a1[i]) + 1);
        }
        for(int i =0;i<a2.length;i++){
            if(!mapTwo.containsKey(a2[i])) mapTwo.put(a2[i], 1);
            else mapTwo.put(a2[i], mapTwo.get(a2[i]) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : mapOne.entrySet()){
            if(!mapTwo.containsKey(entry.getKey())) return 0;
        }
        for(Map.Entry<Integer,Integer> entry : mapTwo.entrySet()){
            if(!mapOne.containsKey(entry.getKey())) return 0;
        } 
        return 1;
}
```
# 4 hasSingleMaximum
```java
public static int hasSingleMaximum(int [] arr){
        if(arr.length == 0 ) return 0;
        int max = arr[0];
        boolean duplicated = false;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                duplicated = false;
            }
            else if(arr[i] == max){
                duplicated = true;
            }            
        }
        if(duplicated) return 0;
        return 1;
}
```
# 5 is235Array
```java
public static int is235Array(int [] arr){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0) total += 1;
            if(arr[i] % 3 == 0) total += 1;
            if(arr[i] % 5 == 0) total += 1;
            if(arr[i] % 2 != 0 && arr[i] % 3 != 0 && arr[i] % 5 != 0) total += 1; 
        }
        return total == arr.length ? 1 : 0;
 }
 ```
 # 6 largestPrimeFactor
 ```java
 public static int largestPrimeFactor(int num){
        if (num <=1) return 0;
        int number = num;
        while(number >1){
            if(num % number == 0){
                boolean isPrime = true;
                for(int i=2;i<number;i++){
                    if(number % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) return number;
            }           
            number--;
        }
        return 0;
 }
 ```
 # 7 encodeNumber
 ```java
 public static int[] encodeNumber(int n){
        if(n<=1) return null;
        List<Integer> primeFactors = new ArrayList<>();
        
        for(int i=2;i<n;i++){
            while(n%i == 0){
               primeFactors.add(i);
               n = n/i;
            }
        }
        if(n > 1) primeFactors.add(n);
        int [] arrayToReturn = new int [primeFactors.size()];
        for(int i =0;i<primeFactors.size();i++){
            arrayToReturn[i] = primeFactors.get(i);
        }
        return arrayToReturn;
}
```
# 8 doIntegerBasedRounding
```java
static void doIntegerBasedRounding(int[] a, int n){
        if(n <= 0) return;
        for(int i = 0;i<a.length;i++){
            if(a[i] >= 0){
                int lowerBound = (a[i]/n)*n;
                int upperBound = lowerBound +n;
                int middleElement = n%2==0 ? lowerBound + n/2 : lowerBound + n/2 +1;
                if(a[i] >= middleElement) a[i] = upperBound;
                else a[i] = lowerBound;
            }
        }
}
``` 
# 9 isCubePowerful
```java
static int isCubePowerful(int n){
        if(n<=0) return 0;
        int originalNum = n;
        int totalSum = 0;
        while(n!=0){
            int digit = n%10;
            totalSum += digit * digit * digit;
            n = n/10;
        }
        return originalNum == totalSum ? 1 : 0;
}
```    
# 10 decodeArray
```java
static int decodeArray(int [] array){
        int encodedNum = 0;
        for(int i=0;i<array.length-1;i++){
            int digit = Math.abs(array[i] - array[i+1]);
            encodedNum = encodedNum*10 + digit;
        }
        if(array[0] < 0) return encodedNum * -1;
        return encodedNum;
}    
```   
 
# 12 IsFunnyClass
```java
public class IsFunnyClass {
    static int isFunny(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
                if ( arr[i] == 5 && arr[i + 1] != 13)
                    return 0;
            }
        return 1;
        }

    public static void main(String[] args) {
        int []x={5,13,4,9,5,13};
        int ret=isFunny(x);
        System.out.println(ret);
    }

    }
```

# 13 IsNiceClass
```java
public class IsNiceClass {
    int isNice(int [] arr)
    {
        // Get the total sum of the array elements
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // Check each element to see if it's less than the sum of the other elements
        for (int num : arr) {
            if (num >= (totalSum - num)) {
                return 0; // The array is not Nice
            }
        }

        return 1; // The array is Nice

    }
}
``` 
    
    
