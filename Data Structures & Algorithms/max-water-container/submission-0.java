class Solution {
    public int maxArea(int[] heights) {
        if (heights.length == 0 || heights.length == 1) return 0;

        int volume = 0;
        int firstIndex = 0;
        int lastIndex = heights.length - 1;

        while (firstIndex < lastIndex) {
            int newVolume = 0;
            if (heights[firstIndex] < heights[lastIndex]) {
                newVolume = (lastIndex - firstIndex) * heights[firstIndex];
                firstIndex++;
            } else {
                newVolume = (lastIndex - firstIndex) * heights[lastIndex];
                lastIndex--;

            }
            volume = Math.max(volume, newVolume);
        }
    
    return volume;

    }
}
