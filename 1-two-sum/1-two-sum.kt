class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        nums.forEachIndexed { index, n ->
            if (map.containsKey(n)) {
                return intArrayOf(map[n]!!, index)
            }
            map[target - n] = index
        }
        return intArrayOf()
    }
}