package com.ojas.arrays;

import java.util.Scanner;

public class PrimeNumsInArray {


public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter ten values : ");
    int values[] = new int[10];
    for(int i = 0 ; i < values.length ; i++)
    {
        values[i] = sc.nextInt();
    }
    displayNum(values);
    System.out.println("\nand the Prime values is/are : "+ getPrimes(values));
}

static void displayNum(int nums[])
{
    System.out.println("The given values are :");
    for(int i = 0 ; i < nums.length ; i++)
    {
        System.out.print(nums[i]+" ");
    }
    System.out.println("\n");
}

static String getPrimes(int numbers[])
{
    String res ="";
    for(int i = 0; i < numbers.length;i++)
    {
        if(isPrime(numbers[i]))
        {
            res += numbers[i] + "  ";
        }
    }
    return res;
}

static boolean isPrime(int num) 
{
    if (num < 2) 
        return false;
    int i = 2,count = 0;
    while(i < num)
    {
        if(num%i == 0)
        {
            count++;
            break;
        }
        i++;
    }
    if(count == 0)
        return true;
    else
        return false;
}
}
