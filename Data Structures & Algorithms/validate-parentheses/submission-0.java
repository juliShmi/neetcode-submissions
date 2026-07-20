class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return false;
        if (s.length() % 2 == 1) return false;

        Map<Character, Character> charMap = new HashMap();
        charMap.put(')', '(');
        charMap.put(']', '[');
        charMap.put('}', '{');

        Stack<Character> charStack = new Stack();
        for (char character : s.toCharArray()) {
            if (charMap.containsKey(character)) {
                if (!charStack.isEmpty() 
                    && charStack.peek() == charMap.get(character)) {
                        charStack.pop();
                } else {
                    return false;
                }
            } else {
                charStack.push(character);
            } 
        }
        return charStack.isEmpty();       
        
    }
}
