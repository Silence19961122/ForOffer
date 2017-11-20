package com.ni.datastructure.arrays;

/**
 * Created by losil_000 on 2017/11/18.
 */
public class ReplaceBlank {


    String he="hello world , goodbye";
    char[] chars=he.toCharArray();


    public static void main(String[] args) {


        ReplaceBlank replaceBlank=new ReplaceBlank();

        System.out.println(replaceBlank.chars.length);

        System.out.println( replaceBlank.replace());
    }

    public char[] replace(){
        int blankCount=0;

        for (int i=0;i<chars.length;i++){

            if (chars[i]==' '){
                blankCount++;
            }
        }
        int lengthAfter=chars.length+2*blankCount;
        System.out.println("the count of blanks"+lengthAfter);
        char[] newChar=new char[lengthAfter];
        System.arraycopy(chars,0,newChar,0,chars.length);
        int p2=lengthAfter-1;
        for (int i=chars.length-1;i>0;i--){

            //System.out.println("chars[i] "+chars[i]);
            if (chars[i]!=' '){
                newChar[p2--]=chars[i];
               // System.out.println("the point of p2"+p2);
            }
            else {
                newChar[p2--]='0';
               // System.out.println("p2"+p2);
                newChar[p2--]='2';
                newChar[p2--]='%';


            }


        }
        return newChar;

    }
}


