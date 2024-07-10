Define an array to be a 121 array if all elements are either 1 or 2 and it begins with one or more 1s followed by a one or more 2s and then ends with the same number of 1s that it begins with. Write a method named is121 Array that returns 1, if its array argument is a 121 array, otherwise, it returns 0.

There is one additional requirement.
You should return 0 as soon as it is known that the array is not a 121 array; continuing to analyze the array would be a waste of CPU cycles.

If you are programming in Java or C#, the function signature is,
int is121Array(int[ ] a)

If you are programming in C or C++, the function signature is,
int is121Array(int a[ ], int len) where len is the number of elements in the array a

Examples 
a is                                | then function returns| reason
------------------------------------|----------------------|----------------------------------------------------------------  
{1, 2, 1}                           |1                     |because the same number of 1s are at the beginning and end of the array and there is at least one 2 in between them. 
------------------------------------|----------------------|----------------------------------------------------------------  
{1, 1, 2, 2, 2, 1, 1}               |1                     |because the same number of 1s are at the beginning and end of the array and there is at least one 2 in between them. 
------------------------------------|----------------------|----------------------------------------------------------------  
{1, 1, 2, 2, 2, 1, 1, 1}            |0                     |Because the number of 1s at the end does not equal the number of 1s at the beginning. 
------------------------------------|----------------------|----------------------------------------------------------------  
{1, 1, 1, 2, 2, 2, 1, 1}            |0                     |Because the number of 1s at the end does not equal the number of 1s at the beginning. 
------------------------------------|----------------------|----------------------------------------------------------------  
{1, 1, 1, 1, 1, 1}                  |0                     |Because the array does not contain any 2s 
------------------------------------|----------------------|----------------------------------------------------------------  
{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}      |0                     |Because the array contains a number other than 1 and 2. 
------------------------------------|----------------------|----------------------------------------------------------------  
{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1}|0                     |Because the first element of the array is not a 1. 
------------------------------------|----------------------|----------------------------------------------------------------  
{1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2}   |0                     |Because the last element of the array is not a 1. 
------------------------------------|----------------------|----------------------------------------------------------------  
{2, 2, 2}                           |0                     |Because there are no 1s in the array. 
------------------------------------|----------------------|----------------------------------------------------------------  

Hint: Walk through your solution with all the above test cases! 