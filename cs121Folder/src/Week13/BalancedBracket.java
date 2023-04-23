package Week13;

import java.util.Stack;

public class BalancedBracket {
    public String checkBalance(String string){

        Stack<Character> stack = new Stack<>();
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < string.length(); i++)
        {
            char c = string.charAt(i);
            if (c == '(') {
                stack.push(c);
                count++;
            }
            else {
                stack.push(c);
                count2++;
            }
        }
        if (count  == count2)
        {
            return "balanced";

        }
          else{
              return "unbalanced";
        }
    }

}
