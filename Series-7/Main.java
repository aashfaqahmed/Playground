#include<stdio.h>
int main()
{int n,f=10,sum=10,sum1=5;
 printf("Enter n value\n");
 scanf("%d",&n);
 for(int i=0;i<n;i++)
 {
   if(i%2==0)
   {
     printf("%d ",sum);
     sum=sum+10*5;
   }
   else 
   {
     printf("%d ",sum1);
     sum1=sum1+10;}
 }
  //Fill your code
}