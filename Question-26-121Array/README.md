Define an array to be a 121 array if all elements are either 1 or 2 and it begins with one or more 1s followed by a one or more 2s and then ends with the same number of 1s that it begins with. Write a method named is121 Array that returns 1, if its array argument is a 121 array, otherwise, it returns 0.

There is one additional requirement.
You should return 0 as soon as it is known that the array is not a 121 array; continuing to analyze the array would be a waste of CPU cycles.

If you are programming in Java or C#, the function signature is,
int is121Array(int[ ] a)

If you are programming in C or C++, the function signature is,
int is121Array(int a[ ], int len) where len is the number of elements in the array a