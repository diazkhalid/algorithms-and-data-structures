package com.Modul_1;

class NodeBaru{
    char element;
    NodeBaru next;
    NodeBaru prev;
    NodeBaru(char element){
        this.element = element;
    }
}

class Stack{
    NodeBaru top;
    NodeBaru current;

    void pushElement(char data){
        if (top == null){
            top = new NodeBaru(data);
        }else{
            NodeBaru temp = new NodeBaru(data);;
            temp.next = top;
            top = temp;
        }
    }

    char popElement(){
        char temp = top.element;
        top = top.next;
        return temp;
    }

    void printStack(){
        current = top;
        while (current!=null){
            System.out.println(current.element);
            current = current.next;
        }
    }

    char peekTop(){
        return top.element;
    }

    boolean isEmpty(){
        return top == null;
    }
}

public class Main3{
    static int forPostfix(char ch){
        switch(ch){
            case '+':{
                return 1;
            }
            case '-':{
                return 1;
            }
            case '*':{
                return 2;
            }
            case '/':{
                return 2;
            }
            case '^':{
                return 3;
            }
        }
        return -1;
    }
    static String toPostfix(String infix){
        String result = new String("");
        Stack stack = new Stack();
        
        for(int i=0;i<infix.length();i++){
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)){
                result += c;
            }else if(c == '('){
                stack.pushElement(c);
            }else if(c == ')'){
                while (!stack.isEmpty() && stack.peekTop()!='('){
                    result += stack.popElement();
                    stack.popElement();
                }   
            }else{
                while (!stack.isEmpty() && forPostfix(c) <= forPostfix(stack.peekTop())){
                    result += stack.popElement();
                }
                stack.pushElement(c);
                
            }
            
        }
        while (!stack.isEmpty()){
            if (stack.peekTop() == '('){
                return "Invalid Expression";
            }
            result += stack.popElement();
        }
        return result;
    }

    public static void main(String[] args) {
        String infix = "(A+B)*C-(D-E)*(F+G)";
        System.out.println(toPostfix(infix));
    }

}
