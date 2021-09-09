package com.mainpk;


public class Main {

    public static void main(String[] args) {
        int[][] dataset = new  int[][]{{651,23},{762,26},{856,30},{1063,34},{1190,43},{1298,48},{1421,52},{1440,57},{1518,58}};
        double x=0;
        for(int i=0;i<args.length;i++){
            x=Double.parseDouble(args[i]);
        }

        linearRegression slp = new linearRegression(dataset,x);
        slp.printRegressionEquation();
        slp.printYHat();



    }
}
