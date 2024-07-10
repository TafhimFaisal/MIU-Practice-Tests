an array is defined to be paired-N if it contains two distinct elements that sum to N for some specified value of N and the indexes of those elements also sum to N. write a function named isPairedN that returns 1 if its array parameter is paired-N array. the value of N is passed as the second parameter. solve it in java. 

for example if 
1. a = { 1,4,1,4,5,6 } and n = 5, the it will return 1 because a[2]+a[3] = 5 and 2+3 = 5
2. a = { 1,4,1,4,5,6 } and n = 6, the it will return 1 because a[2]+a[4] = 6 and 2+4 = 6
3. a = { 0,1,2,3,4,5,6,7,8 } and n = 6, the it will return 1 because a[1]+a[5] = 6 and 1+5 = 6


1. Once you know the array is paired-N, you should return 1. No wasted loop iterations please. 
 
2. Do not enter the loop unless you have to. You should test the length of the array and the value of n to 
determine whether the array could possibly be a paired-N array. If the tests indicate no, return 0 before 
entering the loop. 
Examples 
if a is                    | and n is | return reason 
---------------------------|----------|---------------------------------
{1, 4, 1, 4, 5, 6}         | 5        | 1 because a[2] + a[3] == 5 and 2+3==5. In other words, the sum of the values is equal to the sum of the corresponding indexes and both are equal to n(5 in this case). 
{1, 4, 1, 4, 5, 6}         | 6        | 1 because a[2] + a[4] == 6 and 2+4==6 
{1, 4, 1}                  | 5        | 0 because although a[0] + a[1] == 5, 0+1 != 5; and although a[1]+a[2]==5, 1+2 != 5 
{8, 8, 8, 8, 7, 7, 7}      | 15       | 0 because there are several ways to get the values to sum to 15 but there is no way to get the corresponding indexes to sum to 15.  
{0, 1, 2, 3, 4, 5, 6, 7, 8}| 6        | 1 because a[1]+a[5]==6 and 1+5==6 
