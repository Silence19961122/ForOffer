package com.ni.datastructure;

/**
 * Created by losil_000 on 2017/11/18.
 */
public class StringTest {

    public static void main(String[] args) {
        String hello="a";
        System.out.println(hello.hashCode());
        hello=hello.toUpperCase();
        System.out.println(hello.hashCode());
    }
}
