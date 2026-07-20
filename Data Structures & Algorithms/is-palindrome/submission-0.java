class Solution {
    public boolean isPalindrome(String s) {
        String sWithLetters = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int headIndex = 0;
        int tailIndex = sWithLetters.length() - 1;

        while (headIndex < tailIndex) {
            if (sWithLetters.charAt(headIndex)!= sWithLetters.charAt(tailIndex)) {
                return false;
            } 
            headIndex++;
            tailIndex--;
        }
        return true;
    }
}
