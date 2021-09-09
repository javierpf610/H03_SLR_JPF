package com.mainpk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] Ma = new  int[][]{{651,23},{762,26},{856,30},{1063,34},{1190,43},{1298,48},{1421,52},{1440,57},{1518,58}};
        System.out.println("Please set a X value to predict Y");
        Scanner read = new Scanner (System.in);
        double x= read.nextDouble();

        linearRegression slp = new linearRegression(Ma,x);
        slp.print();
        System.out.println("Y"+(char) 94+"="+slp.yhat());

    }
}
