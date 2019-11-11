package com.hackerrankday5loops.app;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //Variable declartion
        int number = 0;
        //Create object
        Scanner in = new Scanner(System.in);

        //Input
        number = in.nextInt();

        //Process
        for(int i = 1; i <=  10; i++)
        {
            System.out.println(String.format("%d x %d = %d",number,i,(number * i)));
        }
        //Close input
        in.close();
    }
}
