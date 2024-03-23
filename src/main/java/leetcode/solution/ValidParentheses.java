package leetcode.solution;
import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;
public class ValidParentheses {
    public boolean isValid(String s){
        if (Objects.isNull(s))
            throw new NullPointerException("string is null !!");
        if (s.isEmpty())
            throw new IllegalArgumentException("string is empty !!");
        HashMap<String,String> map = new HashMap<>();
        map.put("(",")");
        map.put("[","]");
        map.put("{","}");
        Stack<String> stack = new Stack<>();
        String[] array  = s.split("");
        for (String string : array) {
            if (stack.empty())
                stack.push(string);
            else if (!stack.empty())
                if (Objects.equals(map.get(stack.peek()), string)) stack.pop();
                else stack.push(string);
        }
        return stack.empty();
    }
}
