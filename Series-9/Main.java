#include<stdio.h>
#include<math.h>
int main()
{int n,sum,count=1,count1=2;
 printf("Enter n value");
 scanf("%d",&n);
 for(int i=0;i<n;i++)
 {
   if(i%2==0)
   {
    sum=pow(count,3);
    count+=2;}
   else
   {
     sum=pow(count1,2);
     count1+=2;}
   printf("%d ",sum);
 }
   
   
  //Fill your code
}