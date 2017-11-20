package com.ni.datastructure;

/**
 * Created by losil_000 on 2017/11/20.
 */
public class TwoStack {

    private MyStack stack1=new MyStack();
    private MyStack stack2=new MyStack();

    public  void add(Object ele){
        stack1.push(ele);

    }

    public Object remove(){

        if (!stack2.isEmpty()){
            return stack2.pop();
        }

        while (!stack1.isEmpty())
        {
            stack2.push(stack1.pop());

        }

        return stack2.pop();
    }

    public static void main(String[] args) {
        TwoStack twoStack=new TwoStack();
//        twoStack.add(new Integer(1));
//        twoStack.add(new Integer(2));
//        twoStack.add(new Integer(3));
//        for (int i=0;i<2;i++){
//            System.out.println(twoStack.remove());
//        }
//        twoStack.add(new Integer(4));
//        twoStack.add(new Integer(5));
//        for (int i=0;i<2;i++){
//            System.out.println(twoStack.remove());
//        }
        System.out.println(twoStack.remove());
    }

}
