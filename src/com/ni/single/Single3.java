package com.ni.single;

/**
 * Created by losil_000 on 2017/11/17.
 */
public  class Single3 {

    private Single3(){}

    public static Single3  getInstance(){

        return innerClass.instance;
    }

     static class innerClass{

        private static    Single3 instance=new Single3();


    }
}
