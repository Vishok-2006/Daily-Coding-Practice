package BOOTCAMP;

import java.util.*;

public class ArrayNumberPermutation {
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int [] arr=new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
     }
     sc.close();
   Arrays.sort(arr);
   int num=arr.length-1;
   for(int j=0;j<num;j++){
      if(j+1 != arr[j]){
      System.out.println("false");
      break;
   }

   }
   if(arr[n]==n) System.out.println("true");;

    }
   }
