An Olympic array is defined to be an array in which every value is greater than or equal to the sum of the values less than it. The sum of the values less than the minimum value in the array is defined to be 0.

For example, {3, 2, 1} is an Olympic array because

1 is the minimum value and by definition the sum of the values less than it is 0. Since 1 is greater than 0, it satisfies the condition.
There is only one value less than 2 and 2 is greater than it, so the value 2 satisfies the condition.
The values 1 and 2 are less than 3 and 3 is equal to their sum, so the value 3 satisfies the condition.
Hence all elements of the array satisfy the conditions and the array is an Olympic array.

{2, 2, 1, 1} is also an Olympic array because the values less than 2 sum to 2.

Write a function named isOlympic that returns 1 if its array argument is an Olympic array, otherwise it returns 0.