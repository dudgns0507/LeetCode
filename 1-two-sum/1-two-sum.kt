class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, n ->
            map[n]?.let {
                return intArrayOf(it, index)
            }?:kotlin.run {
                map[target - n] = index
            }
        }
        return intArrayOf()
    }
}