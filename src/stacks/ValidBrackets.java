package stacks;


import java.util.Stack;

public class ValidBrackets {
    static  boolean isValid(String word){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch=='(') s.push(ch);
            else if(s.isEmpty()==false) s.pop(); // when stack is not empty
            else return false;
        }
        if(s.isEmpty()==true) return true;
        else return  false;
//        return s.isEmpty();
    }

    public static void main(String[] args) {
        String word = "(())";
        System.out.println(isValid(word));


    }
}
