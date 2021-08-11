fun removeDuplicates(nums: IntArray): Int {
    return if (nums.isEmpty()) {
        0
    } else {
        var i = 0
        for(j in 1 until nums.size){
            if (nums[j] != nums[i]){
                i++
                nums[i] = nums[j]
            }
        }
        return i+1
    }
}


// Shift left an array from a position
fun shiftLeft(arr: IntArray, pos: Int) {
    val temp = arr[pos]
    for (i in pos..arr.size-2) {
        arr[i] = arr[i+1]
    }
    arr[arr.size-1] = temp
}