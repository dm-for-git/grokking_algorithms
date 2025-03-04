// Given a binary array nums, return the maximum number of consecutive 1's in the array.
// Constraints:
//
// 1 <= nums.length <= 10^5
// nums[i] is either 0 or 1.
/*
Example 1
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
The maximum number of consecutive 1s is 3.
*/

/*
Input: nums = [1,0,1,1,0,1]
Output: 2
* */

class Solution {
    private fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var counting = 0
        var max = 0
        for (i in nums.indices) {
            if (nums[i] == 1) {
                counting ++
            } else {
                if (counting > max)
                    max = counting
                counting = 0
            }
        }
        return if (max > counting) max else counting
    }

    fun testConsecutive() {
        val firstArr = intArrayOf(1,1,0,1,1,1)
        val secondArr = intArrayOf(1,0,1,1,0,1)
        println("Max consecutive of first array is ${findMaxConsecutiveOnes(firstArr)}")
        println("Max consecutive of second array is ${findMaxConsecutiveOnes(secondArr)}")
    }

    /*
    Given an array nums of integers, return how many of them contain an even number of digits.
    Constraints:
        1 <= nums.length <= 500
        1 <= nums[i] <= 10^5
    * */

    /*
    Example 1
    * Input: nums = [12,345,2,6,7896]
        Output: 2
        Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
        Therefore only 12 and 7896 contain an even number of digits.
    * */

    /*
    Input: nums = [555,901,482,1771]
        Output: 1
        Explanation:
        Only 1771 contains an even number of digits.
    * */

    private fun findNumbers(nums: IntArray): Int {
        var totalNums = 0
        for (i in nums.indices) {
            if (nums[i] in 10..99
                || nums[i] in 1000..9999
                || nums[i] == 100000) {
                totalNums ++
            }
        }
        return  totalNums
    }

    fun testFindNumbers() {
        val firstArr = intArrayOf(12,345,2,6,7896)
        val secondArr = intArrayOf(555,901,482,1771)

        println("Total numbers in first array is ${findNumbers(firstArr)}")
        println("Total numbers in second array is ${findNumbers(secondArr)}")
    }
}

Solution().testFindNumbers()

