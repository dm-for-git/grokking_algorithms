/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */

fun sortedSquares(nums: IntArray): IntArray {
    val n = nums.size
    val result = IntArray(n)

    var left = 0
    var right = n - 1
    var pointer = n - 1

    while (left <= right) {
        // Compare absolute values to find the larger square
        if (nums[left].absoluteValue > nums[right].absoluteValue) {
            result[pointer] = nums[left] * nums[left]
            left++
        } else {
            result[pointer] = nums[right] * nums[right]
            right--
        }
        pointer--
    }

    return result
}
/*
1.
Efficiency O(n): With nums.length up to 10,000, a two-pointer approach completes in a single pass,
 which is significantly faster than the O(nlogn) approach of squaring and then sorting.
2.
Memory O(n): We allocate exactly one IntArray of size n for the result.
3.
Data Range: Since the maximum value of nums[i] is 10^4, the squared result is 10^8. A Kotlin Int can hold up to 2,147,483,647,
 so we don't need to worry about integer overflow (no need for Long).
4.
Non-Empty: The constraint 1 <= nums.length ensures nums is never empty, avoiding potential empty-array edge cases.
* */