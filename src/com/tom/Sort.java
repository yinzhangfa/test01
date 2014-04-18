package com.tom;

/**
 * Created by tomyin on 4/17/14.
 */
public class Sort
{
    public static void main(String []args)
    {
        int []a={
            21, 15, 48, 2, 95, 100, 25, 84, 15, 6
        } ;
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10 - i; j++) {
                if (a[j] < a[i]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for (int k = 0; k < 10; k++)
        {
            System.out.print("  " + a[k]);
        }
    }
}
