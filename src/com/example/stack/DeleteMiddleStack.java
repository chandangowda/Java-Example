package com.example.stack;

import java.util.Stack;

//EX:ip=1 2 3 4 5 6 7,op=7 6 5 3 2 1
public class DeleteMiddleStack {

    public Stack<Integer> deleteMid(Stack<Integer>s, int sizeOfStack, int current)
    {
        // if current is equal to half of size of stack
        if(current==sizeOfStack/2)
        {
            s.pop();
            return s;
        }

        int x=s.peek();
        s.pop();
        current+=1;

        // recursively call deleteMid
        s = deleteMid(s,sizeOfStack,current);
        s.push(x);

        return s;
    }
}
