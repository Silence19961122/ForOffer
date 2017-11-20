package com.ni.single;

/**
 * Created by losil_000 on 2017/11/17.
 */
public class Single2 {

    private Single2(){}

    private static Single2 instance=new Single2();

    public static Single2 getInstance(){

        return instance;
    }
}
