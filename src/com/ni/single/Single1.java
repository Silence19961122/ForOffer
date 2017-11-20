package com.ni.single;

/**
 * Created by losil_000 on 2017/11/17.
 */
public class Single1 {

    private Single1(){}

    private static Single1 instance;

    public static Single1 get(){

        if (instance==null){
            synchronized (Single1.class){
                if (instance==null){
                    instance=new Single1();

                }
            }

        }
        return instance;
    }
}
