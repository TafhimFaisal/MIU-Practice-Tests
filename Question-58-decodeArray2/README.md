An integer number can be encoded as an array as follows. Each digit n of the number is represented by n 
zeros followed by a 1. So the digit 5 is represented by 0, 0, 0, 0, 0, 1. The encodings of each digit of a 
number are combined to form the encoding of the number. So the number 1234 is encoded as the array {0, 
1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1}. The first 0, 1 is contributed by the digit 1, the next 0, 0, 1 is contributed 
by the digit 2, and so on. 
There is one other encoding rule: if the number is negative, the first element of the encoded array must be 
1, so -201 is encoded as {-1, 0, 0, 1, 1, 0, 1}. Note that the 0 digit is represented by no zeros, i.e. there are 
two consecutive ones! 
Write a method named decodeArray that takes an encoded array and decodes it to return the number. 
You may assume that the input array is a legal encoded array, i.e., that -1 will only appear as the first 
element, all elements are either 0, 1 or -1 and that the last element is 1. 
If you are programming in Java or C#, the function prototype is  
int decodeArray(int[ ] a)  
If you are programming in C or C++, the function prototype is  
int decodeArray(int a[ ], int len);  
Examples 

a is  |then function returns |reason 
------|----------------------|-------
{1} 
0 
because the digit 0 is represented by no zeros followed by a one. 
------|----------------------|-------
{0, 1} 
1
because the digit 1 is represented by 
one zero followed by a one. 
------|----------------------|-------
{-1, 0, 1} 
-1
because the encoding of a negative number begins with a -1
followed by the encoding of the absolute value of the number.
------|----------------------|-------
{0, 1, 1, 1, 1, 1, 0, 1} 
100001
because the encoding of the first 1 is 0, 1, the encoding of each of the four 0s is just a 1 and the encoding of the last 1 is 0, 1.
------|----------------------|-------
{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1} 
999
because each 9 digit is encoded as 0,0,0,0,0,0,0,0,0,1.
------|----------------------|-------


