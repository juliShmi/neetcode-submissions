class Solution {
    public boolean isValid(String s) {
        if (s.length() <=1) {
            return false;
        }

        Map<Character, Character> map = new HashMap();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        Deque<Character> stack = new LinkedList<>();
        for (char bracket : s.toCharArray()) {
            if (map.containsKey(bracket)) {
                if (!stack.isEmpty() && (map.get(bracket).equals(stack.peek()))) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(bracket);
        }
    }
        return stack.isEmpty();
    }
}
