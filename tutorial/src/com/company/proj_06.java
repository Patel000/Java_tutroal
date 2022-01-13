package com.company;

public class proj_06 {
    public static void main(String[] args) {
        // proj1
        float[] mark = {35.34f, 34.54f, 98.43f, 86.45f};
        float sum = 0;
        for (float element :
                mark) {
            sum = sum + element;
        }
        System.out.println(sum);

        // proj2
        for (float element :
                mark) {
            if (34.54f == element){
                System.out.println("Yes@");
            }
        }

        //proj3
        // 2-D array add
        int [][] mat1 = {{1,2,3},{4,5,6}};

        int [][] mat2 = {{7,8,9},{10,11,12}};

        int[][] resut= {{0,0,0},{0,0,0}};

            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    System.out.printf("Setting value for i=%d and j=%d ",i,j);
                   // System.out.print(resut[i][j] + " ");
                    resut[i][j] = mat1[i][j] + mat2[i][j];

                    System.out.println(resut[i][j]);
                }
                System.out.println(" ");
            }

            // proj4
        int[] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i = 0; i < n; i++) {
            //swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for (int element :
                arr) {
            System.out.printf(element + " ");
        }


        // proj6
        int [] arr1 = {1,23,44,332,23};
        int max = Integer.MIN_VALUE;
        for (int e :
                arr1) {
            if(e>max){
                max = e;
            }
        }

        System.out.println(max);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);


        //proj7
        boolean isSorted = true;
        int [] arr2 = {1,2,34,556,34,34,23,55};
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] > arr2[i+1]){
                isSorted = false;
                break;
            }
        }

        if (isSorted){
            System.out.println("the array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }



    }
}
