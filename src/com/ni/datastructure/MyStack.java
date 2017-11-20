package com.ni.datastructure;

/**
 * Created by losil_000 on 2017/11/20.
 */
public class MyStack {

    private Object[] contents;
    private int top;
    private static int size=20;
    MyStack(){
        contents=new Object[size];
        top=0;
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return (size()==0);
    }
    public void push(Object element)
    {
    contents[top++]=element;
    }

    public Object pop(){
        if (isEmpty())
        {
            return null;
        }
        Object result=contents[top-1];
        contents[top-1]=null;
        top--;
        return result;

    }
}
