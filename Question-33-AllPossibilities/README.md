Is All Possibilities A non-empty array a of length n is called an array of all possiblities if it contains all numbers between 0 and (a.length - 1) inclusive.

Write a method that:

accepts an integer array returns 1 if the array is an array of all possiblities otherwise it returns 0 The function signature is int isAllPossibilities(int[] a)

If the input array is return {1, 2, 0, 3} 1 {3, 2, 1, 0} 1 {1, 2, 4, 3} 0 (because 0 not included and 4 is too big) {0, 2, 3} 0 (because 1 is not included) {0} 1 {} 0 in java