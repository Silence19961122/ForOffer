package com.ni.datastructure.arrays;

/**
 * Created by losil_000 on 2017/11/18.
 */
public class FindInPartiallySortMatrix {



    int[][] matrix={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};

    public static void main(String[] args) {
        FindInPartiallySortMatrix findInPartiallySortMatrix=new FindInPartiallySortMatrix();
       boolean res= findInPartiallySortMatrix.find(20,4,4);
        System.out.println("the result is "+res);



    }
    public boolean find(int number,int rows,int columns){

        boolean result=false;
        if (matrix!=null&&rows>0&&columns>0){
            int row=0;
            int column=columns-1;
            while (row<rows&&column>=0){
                if (matrix[row][column]==number){
                    result=true;
                    break;
                }
                else if (matrix[row][column]>number){
                    column--;
                }
                else
                    row++;

            }
        }

        return  result;

    }





}
