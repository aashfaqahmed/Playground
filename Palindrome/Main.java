/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include<stdio.h>
int main()
{long int n,arr[20],flag=0,i=0,num,num2;
 scanf("%ld",&n);
 num=n;
 num2=n;
 while(num>0)
 {
   num=num%10;
   arr[i]=num;
   num2=num2/10;
   num=num2;
   i++;
 }
 for(int j=0,k=i-1;j<=(i-1);j++,k--)
 {
     if(arr[j]==arr[k])
 {
   flag=0;
   
     
 }
  else
  {
    flag=1;
    break;
  }
 }
 if(flag>0)
   printf("Not Same");
 else
   printf("Same");
  //Fill your code
}