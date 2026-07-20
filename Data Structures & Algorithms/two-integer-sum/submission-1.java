class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap();
        // key - num; value - array index

        for (int i = 0; i < nums.length; i++) {
            int secNum = target - nums[i];

            if (map.containsKey(secNum)) {
                int secNumIndex = map.get(secNum);
                if (i < secNumIndex) return new int[] {i, secNumIndex};
                else return new int[] {secNumIndex, i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
        
    }
}
