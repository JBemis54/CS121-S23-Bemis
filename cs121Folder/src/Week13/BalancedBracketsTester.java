package Week13;

public class BalancedBracketsTester {

    public static void main(String[] args)
    {
        BalancedBracket balanced = new BalancedBracket();

        System.out.println(balanced.checkBalance("()"));
        System.out.println(balanced.checkBalance("(()())"));
        System.out.println(balanced.checkBalance("((((()(())))))"));
        System.out.println(balanced.checkBalance("(()"));
        System.out.println(balanced.checkBalance("())"));


    }
}
