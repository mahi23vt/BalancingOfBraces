import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String str="[()]{}{[()()]()}";
        String str2="[(])";
        if(isBalanced(str))
        {
            System.out.println("The string is balanced");
        }
        else System.out.println("The string is not balanced");
        if(isBalanced(str2))
        {
            System.out.println("The string is balanced");
        }
        else System.out.println("The string is not balanced");

    }
    public static boolean isBalanced(String str)
    {
        LinkedList<Character> openingStack = new LinkedList<Character>();
//        LinkedList<Character> closingStack = new LinkedList<Character>();
        StringBuilder reversedString = new StringBuilder();

        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='['|| ch=='{' || ch=='(')
            {
                openingStack.push(ch);
            }
            if(ch==']'|| ch=='}' || ch==')')
            {
                if(ch=='}' && openingStack.peek().equals('{'))
                {
                    openingStack.pop();
                }
                if(ch==']' && openingStack.peek().equals('['))
                {
                    openingStack.pop();
                }
                if(ch==')' && openingStack.peek().equals('('))
                {
                    openingStack.pop();
                }
            }
        }
        System.out.println(openingStack.isEmpty());
        return openingStack.isEmpty();
    }
}