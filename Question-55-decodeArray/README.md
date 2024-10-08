3. A number can be encoded as an integer array as follows. The first element of the array is any number and 
if it is negative then the encoded number is negative. Each digit of the number is the absolute value of the 
difference of two adjacent elements of the array. The most significant digit of the number is the absolute 
value of the difference of the first two elements of the array. For example, the array {2, -3, -2, 6, 9, 18} 
encodes the number 51839 because  
• 5 is abs(2 - (-3))  
• 1 is abs(-3 - (-2))  
• 8 is abs(-2 - 6)  
• 3 is abs(6-9)  
• 9 is abs(9-18)  
The number is positive because the first element of the array is >= 0.  
If you are programming in Java or C#, the function prototype is  
int decodeArray(int[ ] a)  
If you are programming in C or C++, the function prototype is  
int decodeArray(int a[ ], int len) where len is the length of array a;  
You may assume that the encoded array is correct, i.e., the absolute value of the difference of any two 
adjacent elements is between 0 and 9 inclusive and the array has at least two elements. 

a is  |then function returns | reason
------|----------------------|--------
{0, -3, 0, -4, 0} 
3344 
because abs(0-(-3))=3, abs(-3-0)=3, abs(0-(-4))=4, abs(-4-0)=4
------|----------------------|--------
{-1, 5, 8, 17, 15} 
-6392 
because abs(-1-5)=6, abs(5-8)=3, abs(8-17)=9, abs(17-15)=2; 
the number is negative because the first element of the array is 
negative 
------|----------------------|--------
{1, 5, 8, 17, 15} 
4392 
because abs(1-5)=4, remaining digits are the same as previous 
example; the number is positive because the first element of the 
array is >=0.
------|----------------------|--------
{111, 115, 118, 127, 125} 
4392 
because abs(111-115)=4, abs(115-118)=3, abs(118-127)=9, 
abs(127-125)=2; the number is positive because the first 
element of the array is >=0.
------|----------------------|--------
{1, 1} 
0 
because abs(1-1) = 0 
------|----------------------|--------
