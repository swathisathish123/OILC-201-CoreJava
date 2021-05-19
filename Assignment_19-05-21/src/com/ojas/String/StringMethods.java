package com.ojas.String;

public class StringMethods {

	public static void main(String[] args) {

       String values = "12,3-56,7,8,9,10-20";
       values = values.replaceAll("-", ",");
       System.out.println(values);
       
      String nums[] = values.split(",");
      int[] num = new int[nums.length];
      for(int i = 0;i < num.length;i++) {
       num[i] =Integer.parseInt(nums[i]);
      } 
       int big = num[0];
       int small = num[0];
       for(int i = 1;i < num.length;i++) {
          if(num[i] > big) {
        	  big = num[i];
          }
           
       if(num[i] < small) {
    	   small = num[i];
       }
       }
       String res ="";
       for(int i = small;i < big;i++) {
        res += i;
        if(i < big) {
        	res += ",";
        }
     }
       System.out.println(res);
	}
}

