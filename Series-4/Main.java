#include<stdio.h>
int main()
{int n,sum=0,count=3;
 printf("Enter n value\n");
 scanf("%d",&n);
 for(int i=0;i<n;i++)
 {
   printf("%d ",sum);
   sum=sum+count;
   count+=2;
 }
  //Fill your code
}