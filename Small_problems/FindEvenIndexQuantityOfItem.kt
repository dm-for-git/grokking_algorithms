
/*
* Given an array nums of integers, return how many of them contain an even number of digits.
* EX 1: Input: nums = [12,345,2,6,7896]
        Output: 2

* EX2: Input: nums = [555,901,482,1771]
       Output: 1
* */

fun findNumbers(nums: IntArray): Int {
    var result = 0
    nums.forEach {
        var count = 0
        var temp = it/10
        while(temp > 0){
            count ++
            temp /= 10
        }
        count ++
        if(count % 2 == 0){
            result ++
        }
    }
    return result
}
val arr3 = intArrayOf(0, 11, 22, 333, 4444) // 2
print("${findNumbers(arr3)}" + "\n")