class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return false;

        String wholeS = s.toLowerCase().trim().replaceAll("[^a-z0-9]", "");
        int headIndex = 0;
        int tailIndex = wholeS.length() - 1;

        while(headIndex <= tailIndex) {
            if (wholeS.charAt(headIndex) != wholeS.charAt(tailIndex)) {
                return false;
            } else {
                headIndex++;
                tailIndex--;
            }
        }
        return true;
    }
}
